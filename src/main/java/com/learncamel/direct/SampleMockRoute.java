/**
 * 
 */
package com.learncamel.direct;

import org.apache.camel.builder.RouteBuilder;

/**
 * @author ussainaslee
 *
 */
public class SampleMockRoute extends RouteBuilder {


	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("direct:sampleInpuit").log("Rceieved Message is ${body} and Headers are ${headers}")
		.to("mock:output");
	}

}
