package zrouga.example.demo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Meessage {
	@NotNull(message = "emailsource NotNull")
	@NotEmpty(message = "emailsource NotEmpty")
	@NotBlank(message = "emailsource NotBlank")
	@Email(message = "Email Format invalide abc@xyz.abc")
	private String emailsource;
	@Email(message = "Email Format invalide abc@xyz.abc")
	@NotNull(message = "emaildestination NotNull")
	@NotEmpty(message = "emaildestination NotEmpty")
	@NotBlank(message = "emaildestination NotBlank")
	private String emaildestination;

	private String body;

	private String objet;
	@NotNull(message = "password NotNull")
	@NotEmpty(message = "password NotEmpty")
	@NotBlank(message = "password NotBlank")
	private String password;

	public Meessage(String emailsource, String emaildestination, String body, String objet, String password) {

		this.emailsource = emailsource;
		this.emaildestination = emaildestination;
		this.body = body;
		this.objet = objet;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Meessage [emailsource=" + emailsource + ", emaildestination=" + emaildestination + ", body=" + body
				+ ", objet=" + objet + ", password=" + password + "]";
	}

	public String getEmailsource() {
		return emailsource;
	}

	public void setEmailsource(String emailsource) {
		this.emailsource = emailsource;
	}

	public String getEmaildestination() {
		return emaildestination;
	}

	public void setEmaildestination(String emaildestination) {
		this.emaildestination = emaildestination;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
