package test.net.netca.bpms.common.d2barcodes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.junit.Test;

import net.netca.bpms.common.d2barcodes.D2Creator;

public class TestD2Creator {
	@Test
	public void testCreate() throws FileNotFoundException, IOException{
		try(OutputStream os = new FileOutputStream("src/test/resources/d2.png");){
			D2Creator.create("hello world233", os);
		}
	}
}
