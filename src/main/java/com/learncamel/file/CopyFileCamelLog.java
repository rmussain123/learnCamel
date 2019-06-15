/**
 * 
 */
package com.learncamel.file;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * @author ussainaslee
 *
 */
public class CopyFileCamelLog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CamelContext context= new DefaultCamelContext();

        try{
            context.addRoutes(new RouteBuilder() {
                @Override
                public void configure() throws Exception {
                    from("file:data/input?noop=true")
                            .to("log:?level=INFO&showBody=true&showHeaders=true")
                            //.log("Received Message is ${body} and Headers are ${headers}")
                            .to("file:data/output")
                            .to("file:data/outputSecond");

                    from("file:data/input1?noop=true")
                    .to("log:?level=INFO&showBody=true&showHeaders=true")
                    //.log("Received Message is ${body} and Headers are ${headers}")
                    .to("file:data/output1")
                    .to("file:data/outputSecond1").to("file:data/outputSecond2");


                }
            });

            context.start();
            Thread.sleep(5000);
            context.stop();

        }catch(Exception e){
            System.out.println("Inside Exception : " + e);
        }
	}

	}

