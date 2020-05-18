package com.io.demo3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 将在控制台输入的信息，同步写入到文件中
 * @author admin
 *
 */
public class TestSynchrReadWrite {
	public static void main(String[] args) throws IOException {
		final LinkedList<String> buf = 
				new LinkedList<String>();
		/**
		 * 打印流：
		 * 		只操作目的地，不操作数据源。
		 * 		可以操作任意类型的数据。
		 * 		可以直接操作文件
		 */
		final PrintWriter out = 
				new PrintWriter(new FileOutputStream("FileOut.txt"));
		/**
		 * 创建线程一：写入文件线程
		 */
		final Thread writer = new Thread(){
			@Override
			public void run() {
				while (true) {
					if (buf.isEmpty()) {
						try {
							out.flush();
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						continue;
					}
					String str = buf.removeFirst();
					//System.out.println(str);
					out.print(str);
				}
			}
		};
		//将写入线程作为守护线程
		writer.setDaemon(true);
		final Thread reader = new Thread(){
			public void run(){
				Scanner s = new Scanner(System.in);
				while (true) {
					String str = s.nextLine();
					buf.addLast(str);
					if (str.equalsIgnoreCase("Q")) {
						writer.interrupt();//中断写线程
						break;
					}
				}
			}
		};
		reader.start();
		writer.start();
	}
}
