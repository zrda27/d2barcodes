package net.netca.bpms.common.d2barcodes;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import com.google.zxing.Binarizer;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.common.HybridBinarizer;

public class D2Decoder {
	public static class D2DecoderConfig {
		private String charset = "utf-8";

		public String getCharset() {
			return charset;
		}

		public void setCharset(String charset) {
			this.charset = charset;
		}
	}
	
	/**
	 * 解析二维码图片
	 * @param is
	 * @return
	 * @throws NotFoundException
	 * @throws IOException
	 */
	public static Result decode(InputStream is) throws NotFoundException, IOException{
		return decode(is, new D2DecoderConfig());
	}
	
	/**
	 * 解析二维码图片
	 * @param is
	 * @param config
	 * @return
	 * @throws NotFoundException
	 * @throws IOException
	 */
	public static Result decode(InputStream is, D2DecoderConfig config) throws NotFoundException, IOException {
		MultiFormatReader formatReader = new MultiFormatReader();
		BufferedImage image = ImageIO.read(is);
		LuminanceSource source = new BufferedImageLuminanceSource(image);
		Binarizer binarizer = new HybridBinarizer(source);
		BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
		Hashtable<DecodeHintType, String> hints = new Hashtable<DecodeHintType, String>();
		hints.put(DecodeHintType.CHARACTER_SET, config.getCharset());
		return formatReader.decode(binaryBitmap, hints);
	}
}
