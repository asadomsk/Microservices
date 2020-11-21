package consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import consumer.client.ConsumerClient;
import consumer.model.ActionEventDto;

@Service
public class ConsumeEvents {
	

    @Autowired
    private ConsumerClient consumerClient;

	// Annotation allows the message to be listened at the given queue.
	@RabbitListener(queues = "${action.create.queue}")
	public void recievedMessage(ActionEventDto actionEventDto) {
		System.out.println("Received following message from rabbitmq= " + actionEventDto);

		
		consumerClient.save(actionEventDto);
       
 
	}
}
