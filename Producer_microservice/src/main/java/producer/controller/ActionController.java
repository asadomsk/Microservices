package producer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import producer.model.Action;
import producer.service.ActionService;

@RestController
@RequestMapping(value = "/action")
public class ActionController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ActionService actionService;

	@PostMapping(value = "/create")
	public ResponseEntity<String> createNewStudent(@RequestBody Action action) {
		logger.info("Getting a new action= " + action.toString());
		String response = actionService.createAction(action);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
