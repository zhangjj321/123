package com.io.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriter01 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("demo.txt",true);
		BufferedWriter br  = new BufferedWriter(fw);
		br.write("���");
		br.newLine();//������һ��
		br.write("����");
		br.close();
	}
}
