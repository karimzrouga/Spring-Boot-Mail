package zrouga.example.demo;

import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {
	private String destiation, Source, password;
	@SuppressWarnings("unused")
	private String code;

	public Mail(String dest, String admin, String pass) {
		this.destiation = dest;
		this.password = pass;
		this.Source = admin;
	}

	public void sendMail(String type) throws MessagingException {
		Properties prop = new Properties();
		prop.put("mail.smtp.auth", true);
		prop.put("mail.smtp.starttls.enable", true);
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");

		String myaccout = Source;
		String pass = password;
		Session session = Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(myaccout, pass);
			}
		});
		String Recipient = destiation;
		Message message = prepareMessage(session, myaccout, Recipient, type);
		Transport.send(message);
		System.out.println("Done");

	}

	private Message prepareMessage(Session session, String mycount, String Recipient, String type) {
		Message msg = new MimeMessage(session);
		try {
			msg.setFrom(new InternetAddress(mycount));
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(Recipient));

			Integer[] index = new Random().ints(0, 100).distinct().limit(100).boxed().toArray(Integer[]::new);
			code = index[0] + "" + index[50] + "" + index[10] + "" + index[20] + "" + index[5];

			return msg;
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void setCode(String code) {
		this.code = code;
	}

}