package com.io.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ͨ���ַ����������������ɶ��ļ��ĸ��ơ�
 * @author admin
 *
 */
public class TestReaderWriter {
	public static void main(String[] args) throws IOException {
		BufferedReader input = null;//����������
		BufferedWriter out = null;//����һ�����������
		input = new BufferedReader(new FileReader("demo.txt"));
		out = new BufferedWriter(new FileWriter("d.txt"));
		String str = null;
		while((str=input.readLine())!=null){
			out.write(str);
		}
		out.close();
		}
}
