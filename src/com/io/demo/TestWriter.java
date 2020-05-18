package com.io.demo;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("demo.txt");
			//将字符串写入到流中
			fw.write("Hello,World!");
			//刷新流对象中的缓冲数据，flush刷新之后流可以继续使用
			fw.flush();
			//关闭流资源，关闭之前会刷新一次内部缓冲中的数据，
			//刷新到目的地中
			//close刷新之后，将关闭流
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
