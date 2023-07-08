package zrouga.example.demo;

import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class MailControllor {

	@PostMapping("/send")
	public String Send(@Valid @RequestBody Meessage data) {

		Mail mail = new Mail(data.getEmaildestination(), data.getEmailsource(), data.getPassword());

		try {
			mail.sendMail("hello");
			return "Envoyé avec succès";
		} catch (MessagingException e) {
			return "Une erreur de messagerie s'est produite : " + e.getMessage();
		} catch (Exception e) {
			return "Une erreur s'est produite : " + e.getMessage();
		}

	}

	@GetMapping("/mail")
	public String Welcome() {
		return "welcome to Spring mail https://github.com/karimzrouga/Spring-Boot-Mail ";
	}

	// @ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String errorMessage = error.getDefaultMessage();
			errors.put(fieldName, errorMessage);
		});
		return errors;
	}
}
