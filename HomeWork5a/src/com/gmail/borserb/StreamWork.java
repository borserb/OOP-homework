package com.gmail.borserb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamWork {
	public static void streamCopy(InputStream is, OutputStream os) throws IOException {
		byte[] buffer = new byte[1024 * 1024];
		int readByte = 0;
		for (; (readByte = is.read(buffer)) > 0;) {
			os.write(buffer, 0, readByte);

		}

	}

	public static void copyFile(File in, File out) throws IOException {
		if (in == null || out == null) {
			throw new IllegalArgumentException();
		}
		try (InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {
			streamCopy(is, os);

		} catch (IOException e) {
			throw e;

		}

	}

	public static void copyFilesToFolder(File folder1, File folder2, MyFilter ff) throws IOException {

		File[] arrCopy = folder1.listFiles(ff);
		System.out.println(ff.toString());

		for (File in : arrCopy) {
			File out = new File(folder2.getName() + "/" + in.getName());

			try (InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {
				streamCopy(is, os);

				System.out.println(
						"File " + in.getAbsolutePath() + "    Copy to     " + folder2.getName() + "/" + in.getName());
			} catch (IOException e) {
				throw e;

			}
		}
	}

}
