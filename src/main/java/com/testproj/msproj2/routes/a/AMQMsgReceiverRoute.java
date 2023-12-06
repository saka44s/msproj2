package com.testproj.msproj2.routes.a;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class AMQMsgReceiverRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("activemq:my-activemq-queue1")
		.to("log:received messages from queue");
		
	}

}
