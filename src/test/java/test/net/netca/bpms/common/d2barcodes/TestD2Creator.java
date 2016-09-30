package test.net.netca.bpms.common.d2barcodes;

import net.netca.bpms.common.d2barcodes.D2Creator;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestD2Creator {
	@Test
	public void testCreate() throws FileNotFoundException, IOException{
		try(OutputStream os = new FileOutputStream(this.getClass().getResource("").getPath() + "/d2.png");){
			D2Creator.create("hello world233", os);
		}
	}
}
