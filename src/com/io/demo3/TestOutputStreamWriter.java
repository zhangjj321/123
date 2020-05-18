package com.io.demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * 将字节输出流转换为字符输出流
 */
public class TestOutputStreamWriter {
	public static void main(String[] args) throws IOException {
		File file = new File("d.txt");
	Writer out = new OutputStreamWriter(new FileOutputStream(file));
	out.write("将字节输出流转换为字符输出流");
	out.close();
	}
}
