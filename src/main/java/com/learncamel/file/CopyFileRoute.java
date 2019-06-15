package com.learncamel.file;

import org.apache.camel.builder.RouteBuilder;

public class CopyFileRoute extends RouteBuilder{
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("file:C:\\UssainWorkSpace\\learnCamel\\input?noop=true")
        .to("log:?level=INFO&showBody=true&showHeaders=true")
        //.log("Received Message is ${body} and Headers are ${headers}")
        .to("file:data/output")
        .to("file:data/outputSecond");

	}

}
