package com.io.demo3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * ���ڿ���̨�������Ϣ��ͬ��д�뵽�ļ���
 * @author admin
 *
 */
public class TestSynchrReadWrite {
	public static void main(String[] args) throws IOException {
		final LinkedList<String> buf = 
				new LinkedList<String>();
		/**
		 * ��ӡ����
		 * 		ֻ����Ŀ�ĵأ�����������Դ��
		 * 		���Բ����������͵����ݡ�
		 * 		����ֱ�Ӳ����ļ�
		 */
		final PrintWriter out = 
				new PrintWriter(new FileOutputStream("FileOut.txt"));
		/**
		 * �����߳�һ��д���ļ��߳�
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
		//��д���߳���Ϊ�ػ��߳�
		writer.setDaemon(true);
		final Thread reader = new Thread(){
			public void run(){
				Scanner s = new Scanner(System.in);
				while (true) {
					String str = s.nextLine();
					buf.addLast(str);
					if (str.equalsIgnoreCase("Q")) {
						writer.interrupt();//�ж�д�߳�
						break;
					}
				}
			}
		};
		reader.start();
		writer.start();
	}
}
