package com.aglistech.qrsignature.generators;

import java.awt.image.BufferedImage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class ImageGenerator {
	/**
	 * reference : https://www.baeldung.com/java-generating-barcodes-qr-codes
	 * @param message
	 * @return
	 * @throws Exception
	 */
	public static BufferedImage generateQRCodeImage(String message) throws Exception{
		QRCodeWriter barCodeWriter = new QRCodeWriter();
		BitMatrix bitMatrix = barCodeWriter.encode(message, BarcodeFormat.QR_CODE, 200, 200);
		return MatrixToImageWriter.toBufferedImage(bitMatrix);
	}
}
