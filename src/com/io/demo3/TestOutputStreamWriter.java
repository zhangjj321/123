package com.io.demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * ���ֽ������ת��Ϊ�ַ������
 */
public class TestOutputStreamWriter {
	public static void main(String[] args) throws IOException {
		File file = new File("d.txt");
	Writer out = new OutputStreamWriter(new FileOutputStream(file));
	out.write("���ֽ������ת��Ϊ�ַ������");
	out.close();
	}
}
