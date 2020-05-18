package com.io.demo3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestByteArrayStream {
	public static void main(String[] args) throws IOException, IOException {
		//创建一个数据源
		ByteArrayInputStream bis
			= new ByteArrayInputStream("ABCD".getBytes());
		/*
		 *创建数据目的：
		 *	在构造的时候，不用定义数据目的，该对象中已经内部封装了可变长度的字节数据
		 *这就是数据目的地
		 */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		int len = 0;
		while((len=bis.read())!=-1){
			bos.write(len);
		}
		//两个流对象都操作的数组，并没有使用系统资源
		//不需要进行clos关闭。
		bos.writeTo(new FileOutputStream(new File("d.txt")));
		System.out.println(bos.toString());
	}
}
