package taxCal;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxCalcController {
	@GetMapping("/get taxes")
	float calculatetax(@PathParam ("price")float price){
		return price * 0.5F;
	}
}
