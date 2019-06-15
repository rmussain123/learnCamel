package com.learncamel.direct;

import org.apache.camel.builder.RouteBuilder;

public class SampleDirectRoot extends RouteBuilder {

	public void configure() throws Exception{
		from("direct:sampleInput")
        .to("Received Message is and Headers ")
        .to("C:\\UssainWorkSpace\\learnCamel\\data\\sampleOutput?fileName=output.txt");
	}
}
