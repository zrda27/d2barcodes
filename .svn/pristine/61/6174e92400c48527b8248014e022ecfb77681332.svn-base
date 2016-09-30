package net.netca.bpms.common.d2barcodes;

import java.io.OutputStream;
import java.util.Hashtable;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

public class D2Creator {
	public static class D2CreatorConfig{
		private BarcodeFormat codeFormat = BarcodeFormat.QR_CODE;
		private String imgFormat = "png";
		private String charset = "UTF-8";
		private int width = 300;
		private int height = 300;
		
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public BarcodeFormat getCodeFormat() {
			return codeFormat;
		}
		public void setCodeFormat(BarcodeFormat codeFormat) {
			this.codeFormat = codeFormat;
		}
		public String getCharset() {
			return charset;
		}
		public void setCharset(String charset) {
			this.charset = charset;
		}
		public String getImgFormat() {
			return imgFormat;
		}
		public void setImgFormat(String imgFormat) {
			this.imgFormat = imgFormat;
		}
	}
	/**
	 * @param content
	 * @param imgFormat png、jpg等
	 * @param os
	 */
	public static void create(String content, OutputStream os){
		create(content, os, new D2CreatorConfig());
	}
	
	/**
	 * @param content
	 * @param imgFormat png、jpg等
	 * @param os
	 */
	public static void create(String content, OutputStream os, D2CreatorConfig config){
		if(config == null){
			throw new IllegalArgumentException("config 不能为null");
		}
		Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>();
		hints.put(EncodeHintType.CHARACTER_SET, config.getCharset());
		try{
			BitMatrix matrix =  new MultiFormatWriter().encode(content, config.getCodeFormat(), config.getWidth(), config.getHeight(), hints);
			MatrixToImageWriter.writeToStream(matrix, config.getImgFormat(), os);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
