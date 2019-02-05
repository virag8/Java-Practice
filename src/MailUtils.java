
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

public class MailUtils {

	public static void read() {

		Properties props = new Properties();

		try {
			//props.load(new FileInputStream(new File("C:\\smtp.properties")));
			props.setProperty("mail.smtp.host", "smtp.gmail.com");
			props.setProperty("mail.smtp.socketFactory.port", "465");
			props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.setProperty("mail.smtp.auth", "true");
			props.setProperty("mmail.smtp.port", "465");
			Session session = Session.getDefaultInstance(props, null);

			Properties gmailAccount = new Properties();
			gmailAccount.load(new FileInputStream(new File("/Users/virag/eclipse-workspace/LearnJava/src/GmailAccount.properties")));
			System.out.println("gmail:- " + gmailAccount.getProperty("user"));
			
			Store store = session.getStore("imaps");
			store.connect("smtp.gmail.com", gmailAccount.getProperty("user"), gmailAccount.getProperty("password"));

			Folder inbox = store.getFolder("inbox");
			inbox.open(Folder.READ_ONLY);
			int messageCount = inbox.getMessageCount();
			int newmsg = inbox.getUnreadMessageCount();
			
			System.out.println("Total Messages:- " + messageCount);
			System.out.println("New Messages:- " + newmsg);

			
			Message[] messages = inbox.getMessages();
			System.out.println("------------------------------");

			for (int i = messageCount - 1; i >= 0 ; i--) {
				System.out.println("Mail Subject:- " + messages[i].getSubject());
			}
			inbox.close(true);
			store.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void check(String host, String storeType, String user, String password) {
		try {

			// create properties field
			Properties properties = new Properties();

			properties.put("mail.pop3.host", host);
			properties.put("mail.pop3.port", "995");
			properties.put("mail.pop3.starttls.enable", "true");
			Session emailSession = Session.getDefaultInstance(properties);

			// create the POP3 store object and connect with the pop server
			Store store = emailSession.getStore("pop3s");

			store.connect(host, user, password);

			// create the folder object and open it
			Folder emailFolder = store.getFolder("INBOX");
			emailFolder.open(Folder.READ_ONLY);

			// retrieve the messages from the folder in an array and print it
			Message[] messages = emailFolder.getMessages();
			System.out.println("messages.length---" + messages.length);

			for (int i = 0, n = messages.length; i < n; i++) {
				Message message = messages[i];
				System.out.println("---------------------------------");
				System.out.println("Email Number " + (i + 1));
				System.out.println("Subject: " + message.getSubject());
				System.out.println("From: " + message.getFrom()[0]);
				System.out.println("Text: " + message.getContent().toString());

			}

			// close the store and folder objects
			emailFolder.close(false);
			store.close();

		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		String host = "pop.gmail.com";// change accordingly
		String mailStoreType = "pop3";
		String username = "meetkv8@gmail.com";// change accordingly
		String password = "East!234";// change accordingly

		 check(host, mailStoreType, username, password);
//		read();

	}

}
