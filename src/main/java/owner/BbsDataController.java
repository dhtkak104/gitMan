package owner;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BbsDataController {

	@GetMapping("test")
	public ResponseEntity<?> test(@RequestParam Map<String, Object> param) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("test", "good");
		return new ResponseEntity<>(result, HttpStatus.valueOf(200));
	}
}
