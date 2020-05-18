package com.io.demo3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * 将字节输入流变为字符输入流
 * @author admin
 *
 */
public class TestInputStreamReader {
	public static void main(String[] args) throws IOException {
		File f = new File("d.txt");
		Reader reader = new InputStreamReader(new FileInputStream(f));
		char[] b = new char[100];
		int len = reader.read(b);
		System.out.println(new String(b,0,len));
		reader.close();
	}
}
