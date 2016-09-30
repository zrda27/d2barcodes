package test.net.netca.bpms.common.d2barcodes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.google.zxing.NotFoundException;
import com.google.zxing.Result;

import net.netca.bpms.common.d2barcodes.D2Decoder;

public class TestD2Decoder {
	@Test
	public void testDecode() throws FileNotFoundException, IOException, NotFoundException{
		try(InputStream is = new FileInputStream("src/test/resources/1475141701.png");){
			Result result = D2Decoder.decode(is);
			System.out.println(result);
		}
	}
}
