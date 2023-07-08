


<div align="center">
	  <img src="https://github.com/karimzrouga/Spring-Boot-Mail/blob/master/Untitled.png?raw=true" alt="logo" width="300%" >  
  <h1>Spring-Boot-Mail <br>JavaMail API – Sending email via  SMTP example</h1>
  <br>
</div>
<h2>For Test APi </h2>

https://javamail.onrender.com/mail

-----------------------------------------------------------------

https://javamail.onrender.com/send

<h2>Post Request structure To send Mail </h2>

{

"emailsource": "sender@example.com",

"emaildestination": "receiver@example.com",

"body": "Dear John, I hope this email finds you well. I wanted to touch base regarding our upcoming meeting. Can we reschedule it to next Wednesday at 2 PM? Please let me know if that works for you. Best regards, Jane",

"objet": "Meeting Rescheduling",

"password": "securePassword789"

}
<h3> Using Postman For test https://www.postman.com/ </h3>
<img  src="https://github.com/karimzrouga/Spring-Boot-Mail/blob/master/postman.png" alt="postman">
-----------------------------------------------------------------



<h3>To send email, add  javax.mail dependency to pom.xml </h3>


pom.xml

	<dependency>
		<groupId>com.sun.mail</groupId>
		<artifactId>javax.mail</artifactId>  
		<version>1.6.2</version>
         </dependency>
 ----------------------------------------------------------------
<h4>To Validate  model Attribut , add spring-boot-starter-Validator  dependency to pom.xml</h3>

	<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
	</dependency>

 ----------------------------------------------------------------------------

<h2>Errur BadCredentials </h2> 
Une erreur de messagerie s'est produite : 535-5.7.8 Username and Password not accepted. Learn more at
535 5.7.8  https://support.google.com/mail/?p=BadCredentials j13-20020a62b60d000000b00682ad3613eesm4600763pff.51 - gsmtp

To fix it, follow this guide to :

<a href="https://support.google.com/accounts/answer/185833?p=InvalidSecondFactor"> create an App  Gmail  Password</a>

<a href="https://www.codeproject.com/Articles/5266074/Send-Email-with-Java-and-Yahoo-Mail"> create an App YAhoo Password</a>


