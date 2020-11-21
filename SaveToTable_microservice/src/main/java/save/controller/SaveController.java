package save.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import save.POJO.Action;
import save.service.SaveService;
 
@RestController
public class SaveController {
	
	@Autowired
    private SaveService service;
	
	// RESTful API method for Create operation
	
	//http://localhost:10093/actions
	@PostMapping("/actions")
	public void add(@RequestBody Action action) {
	    service.save(action);
	}

}
