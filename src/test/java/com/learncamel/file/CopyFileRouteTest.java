/**
 * 
 */
package com.learncamel.file;

import java.io.File;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

/**
 * @author ussainaslee
 *
 */
public class CopyFileRouteTest extends CamelTestSupport {

	/**
	 * Factory method which derived classes can use to create a {@link RouteBuilder}
	 * to define the routes for testing
	 */
	@Override
	protected RoutesBuilder createRouteBuilder() throws Exception {

		return new CopyFileRoute();
	}
	
	@Test
	public void checkFileInputOutExisting() throws InterruptedException {
		Thread.sleep(50000);
		File file = new File("data/output");
		assertTrue(file.isDirectory());
		assertEquals(2, file.listFiles().length);
	}

}
