package com.learncamell;

import java.io.File;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import com.learncamel.direct.SampleDirectRoot;

public class SampleDirectRouteTest extends CamelTestSupport{
	
	public RouteBuilder createRouteBuilder() {
		return new SampleDirectRoot();
	}

	
	@Test
	public void RouteTest() throws InterruptedException {
		template.sendBody("direct:sampleInput","1234,Ussain,Udemy Instructor");
		Thread.sleep(520000);
		File file = new File("C:\\UssainWorkSpace\\learnCamel\\data\\sampleOutput");
		assertTrue(file.isDirectory());
	}
	
}
