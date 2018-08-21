package com.gmail.borserb;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class SerializableFileWork {
	public static void saveObj(Object obj, File file) throws IOException {
		if (obj == null) {
			throw new IllegalArgumentException();
		}
		try(ObjectOutput oos =new ObjectOutputStream(new FileOutputStream(file))) {
			
		}
	} 

}
