package com.io.demo4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;

public class TestSeq {
	public static void main(String[] args) throws IOException {
		File f1 = new File("demo.txt");
		File f2 = new File("FileOut.txt");
		InputStream input1 = new FileInputStream(f1);
		InputStream input2 = new FileInputStream(f2);
		File f3 = new File("Test_seq");
		//创建一个输出流
		OutputStream output = new FileOutputStream(f3);
		//创建合并流
		SequenceInputStream sis = new SequenceInputStream(input1,input2);
		int temp = 0;
		while((temp=sis.read())!=-1){ //合并流中有内容的时候，一直读
			output.write(temp); //输出流写出
		}
		input1.close();
		input2.close();
		sis.close();//关闭合并流
	}
}
