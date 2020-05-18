package com.io.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriter01 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("demo.txt",true);
		BufferedWriter br  = new BufferedWriter(fw);
		br.write("你好");
		br.newLine();//换到下一行
		br.write("世界");
		br.close();
	}
}
