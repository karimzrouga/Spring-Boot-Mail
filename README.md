


<div align="center">
	  <img src="https://github.com/karimzrouga/Spring-Boot-Mail/blob/main/Untitled.png?raw=true" alt="logo" width="300%" >  
  <h1>Spring-Boot-Mail <br>JavaMail API – Sending email via  SMTP example</h1>
  <br>
</div>
-----------------------------------------------------------------

<h2>For Test APi </h2>

https://springmail.onrender.com/mail
-----------------------------------------------------------------

https://springmail.onrender.com/send

<h2>Post Request structure To send Mail </h2>

{

"emailsource": "sender@example.com",


"emaildestination": "receiver@example.com",


"body": "Dear John, I hope this email finds you well. I wanted to touch base regarding our upcoming meeting. Can we reschedule it to next Wednesday at 2 PM? Please let me know if that works for you. Best regards, Jane",


"objet": "Meeting Rescheduling",


"password": "securePassword789"


}

-----------------------------------------------------------------



<h3>To send email, add  javax.mail dependency to pom.xml </h3>


pom.xml
	<dependency>

 
		<groupId>com.sun.mail</groupId>

  
		<artifactId>javax.mail</artifactId>

  
		<version>1.6.2</version>

  
	</dependency>

 
 ----------------------------------------------------------------

 
<h3>To Validate  model Attribut , add spring-boot-starter-Validator  dependency to pom.xml</h3>



	<dependency>

 
            <groupId>org.springframework.boot</groupId>


            <artifactId>spring-boot-starter-validation</artifactId>


	</dependency>