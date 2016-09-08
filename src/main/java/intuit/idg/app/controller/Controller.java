package intuit.idg.app.controller;

/**
 * Project: IDG 
 * Class: Controller
 * Creator: awang3 - Anthony Wang
 */

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableAsync 
@RestController
public class Controller {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String sendMoneyApproval(HttpServletRequest request) {
		return "Hello from Spring Boot!";
	}
	
}
