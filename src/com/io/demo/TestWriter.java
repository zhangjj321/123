package com.io.demo;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("demo.txt");
			//���ַ���д�뵽����
			fw.write("Hello,World!");
			//ˢ���������еĻ������ݣ�flushˢ��֮�������Լ���ʹ��
			fw.flush();
			//�ر�����Դ���ر�֮ǰ��ˢ��һ���ڲ������е����ݣ�
			//ˢ�µ�Ŀ�ĵ���
			//closeˢ��֮�󣬽��ر���
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
