package com.learncamel.file;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CopyFileCamel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CamelContext context = new DefaultCamelContext();

        try {
      
        	
            context.addRoutes(new RouteBuilder() {
                @Override
                public void configure() throws Exception {
                    from("file:C:\\UssainWorkSpace\\learnCamel\\input").to("file:data/output");
                }
            });

            context.start();

            Thread.sleep(5000);

            context.stop();
        } catch (Exception e) {
            System.out.println("Exception e::"+e);
            e.printStackTrace();
        }

	}

}
