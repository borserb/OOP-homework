package com.gmail.borserb;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class MyFilter implements FileFilter {
	private String[] arr;

	public MyFilter(String... arr) {
		super();
		this.arr = arr;
	}

	private boolean check(String ext) {
		for (String stringExt : arr) {
			if (stringExt.equals(ext)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean accept(File pathname) {
		int pointerIndex = pathname.getName().lastIndexOf(".");
		if (pointerIndex == -1) {
			return false;
		}
		String ext = pathname.getName().substring(pointerIndex + 1);
		return check(ext);
	}

	@Override
	public String toString() {
		return "MyFilter [" + Arrays.toString(arr) + "]";
	}
	
	
}