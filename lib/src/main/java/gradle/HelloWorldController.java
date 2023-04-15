package gradle;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	Employee emp = new Employee("Lucas vinicius ", "21/01/2004");

	@GetMapping("/employess")
	public ResponseEntity<Employee> getHelloWorld(){
		return ResponseEntity.ok(emp);
	}
}
