package producer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import producer.model.Action;
import producer.model.ActionEventDto;


@Service
public class ActionService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// Getting the rabbitMqTemplate object for sending the action object to the queue where a consumer
	// is listening and will process the action object further.
	@Autowired
	RabbitTemplate rabbitTemplate;
	@Value("${action.create.queue}")
	String actionCreateQueue;

	public String createAction( Action action) {
		// Passing the student email to the queue where the designated consumer will listen to this event 
		// & process further (i.e. something like db processing and triggering an email etc.
		publishEventToRabbitMq(action);
		String response = "[" + action.getAction() + "] created successfully.";
		return response;
	}

	// @Async annotation ensures that the method is executed in a different background thread 
	// but not consume the main thread.
	@Async
	private void publishEventToRabbitMq(Action action) {
		ActionEventDto eventDto = ActionEventDto.create(action);
		logger.info("Sending the following event object to the queue: " + eventDto);
		// Sending the new action object to the rabbitmq queue where a designated consumer will listen to the event
		// coming on this queue and process the further activities.
	    rabbitTemplate.convertAndSend(actionCreateQueue, eventDto);
		logger.info("Message successfully sent to the rabbitMq.");
	}

}
