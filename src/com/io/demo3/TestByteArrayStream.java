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
		//����һ������Դ
		ByteArrayInputStream bis
			= new ByteArrayInputStream("ABCD".getBytes());
		/*
		 *��������Ŀ�ģ�
		 *	�ڹ����ʱ�򣬲��ö�������Ŀ�ģ��ö������Ѿ��ڲ���װ�˿ɱ䳤�ȵ��ֽ�����
		 *���������Ŀ�ĵ�
		 */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		int len = 0;
		while((len=bis.read())!=-1){
			bos.write(len);
		}
		//���������󶼲��������飬��û��ʹ��ϵͳ��Դ
		//����Ҫ����clos�رա�
		bos.writeTo(new FileOutputStream(new File("d.txt")));
		System.out.println(bos.toString());
	}
}
