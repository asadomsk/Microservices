package consumer.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import consumer.model.ActionEventDto;

@Component
public class ConsumerClientImpl implements ConsumerClient {
	private static final Logger logger = LogManager.getLogger("ConsumerClientImpl");

	@Autowired
	RestTemplate restTemplate;

	@Override
	public void save(ActionEventDto actionEventDto) {

		/**
		 * call Service SaveToTable to run it's business logic
		 */
		String serviceUrl = "http://localhost:8080/actions";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<ActionEventDto> request = new HttpEntity<>(actionEventDto, headers);

		try {
		restTemplate.postForObject(serviceUrl, request, Void.class);
		logger.info("The row was inserted successfully!"); 
		
		} catch (RestClientException e) {
			logger.info("Internal error. There was a problem to insert to the table " + e.getMessage());
		}
		
		

	}

}
