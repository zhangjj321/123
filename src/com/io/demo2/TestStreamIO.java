package com.io.demo2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStreamIO {
	public static void main(String[] args) throws IOException {
		// 创建文件字节输入流
		FileInputStream fs;

		fs = new FileInputStream(new File("D://picture//集合.png"));
		BufferedInputStream bufIn = new BufferedInputStream(fs);

		// 创建文件字节输出流
		FileOutputStream fos;
		BufferedOutputStream bufOut;

		fos = new FileOutputStream(new File("D://Picture//集合2.png"));

		bufOut = new BufferedOutputStream(fos);

		int i = 0;
		// 获取开始时间
		long start = System.currentTimeMillis();
		byte[] buff = new byte[512];
		while (true) {
			if (bufIn.available() < 512) {// 判断输入流中的数据是否小于512字节
				while (i != -1) {
					i = bufIn.read();// 读取流中的数据
					bufOut.write(i);
				}
				break;
			} else {
				bufIn.read(buff);// 从输入流中读取512字节的数据放入缓冲数组中
				bufOut.write(buff);// 将字节从指定的byte数组写入输出流中
			}
		}
		long end = System.currentTimeMillis();
		long time = end - start;
		fs.close();
		fos.close();
		System.out.println("缓冲字节流耗时" + time);
	}
}
