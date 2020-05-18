package com.io.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 通过字符缓冲输入输出流完成对文件的复制。
 * @author admin
 *
 */
public class TestReaderWriter {
	public static void main(String[] args) throws IOException {
		BufferedReader input = null;//缓冲输入流
		BufferedWriter out = null;//创建一个缓冲输出流
		input = new BufferedReader(new FileReader("demo.txt"));
		out = new BufferedWriter(new FileWriter("d.txt"));
		String str = null;
		while((str=input.readLine())!=null){
			out.write(str);
		}
		out.close();
		}
}
