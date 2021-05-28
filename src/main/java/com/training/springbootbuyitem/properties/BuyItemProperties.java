package com.training.springbootbuyitem.properties;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BuyItemProperties {

	@Value("${notification.email.send:false}")
	private boolean sendNotificationEmail;

	@Value("${notification.email.uri}")
	private String sendNotificationEmailUri;

	@Value("notification.email.recipient")
	private String sendNotificationEmailRecipient;

	@Value("notification.email.subject.restock")
	private String sendNotificationEmailSubject;

	@Value("notification.email.subject.message")
	private String sendNotificationEmailMessage;

}
