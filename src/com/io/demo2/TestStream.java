package com.io.demo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * �ֽ���
 * @author admin
 *
 */
public class TestStream {
	public static void main(String[] args) throws Exception {
		/**
		 * �ֽ������
		 */
		//out();
		/**
		 * �ֽ�������
		 */
		in();
	}
	private static void in() throws IOException {
		InputStream fi = new FileInputStream("out.txt");
		int size = fi.available();
		//�Ӵ���������ȡ�����������Ĺ����ֽ�����
		char text[] = new char[size];
		for(int i =0;i<size;i++){
			text[i]=(char) fi.read();
		}
		fi.close();
		for (int i = 0; i < text.length; i++) {
			System.out.println(text[i]);
		}
	}
	private static void out() throws IOException {
		OutputStream os = 
			new FileOutputStream(
				new File("out.txt"));
		String str = "hi";
		byte[] b = str.getBytes();
		os.write(b);//д�ֽ����ݵ��ļ���
		os.close();
		}
}
