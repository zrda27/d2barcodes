package test.net.netca.bpms.common.d2barcodes;

import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import net.netca.bpms.common.d2barcodes.D2Decoder;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestD2Decoder {
	@Test
	public void testDecode() throws FileNotFoundException, IOException, NotFoundException{
		try(InputStream is = new FileInputStream(this.getClass().getResource("").getPath() + "/d2.png");){
			Result result = D2Decoder.decode(is);
			System.out.println(result);
		}
	}
}
