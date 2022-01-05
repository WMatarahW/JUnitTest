package test01;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class BufferedWriterDemoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWrite() throws IOException {
		BufferedWriterDemo.write(null);
	}

}
