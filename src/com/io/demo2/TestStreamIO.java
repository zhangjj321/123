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
		// �����ļ��ֽ�������
		FileInputStream fs;

		fs = new FileInputStream(new File("D://picture//����.png"));
		BufferedInputStream bufIn = new BufferedInputStream(fs);

		// �����ļ��ֽ������
		FileOutputStream fos;
		BufferedOutputStream bufOut;

		fos = new FileOutputStream(new File("D://Picture//����2.png"));

		bufOut = new BufferedOutputStream(fos);

		int i = 0;
		// ��ȡ��ʼʱ��
		long start = System.currentTimeMillis();
		byte[] buff = new byte[512];
		while (true) {
			if (bufIn.available() < 512) {// �ж��������е������Ƿ�С��512�ֽ�
				while (i != -1) {
					i = bufIn.read();// ��ȡ���е�����
					bufOut.write(i);
				}
				break;
			} else {
				bufIn.read(buff);// ���������ж�ȡ512�ֽڵ����ݷ��뻺��������
				bufOut.write(buff);// ���ֽڴ�ָ����byte����д���������
			}
		}
		long end = System.currentTimeMillis();
		long time = end - start;
		fs.close();
		fos.close();
		System.out.println("�����ֽ�����ʱ" + time);
	}
}
