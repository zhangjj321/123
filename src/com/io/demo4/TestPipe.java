package com.io.demo4;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class TestPipe {
	//ʵ��2���߳�֮���ͨ�ţ�
	//�ܵ��������ڲ�ͬ���߳�֮�䴫�����ݡ� 
	//һ���̷߳��͵�����ܵ���
	//��һ���̴߳�����ܵ��ж�ȡ����
	//ͨ��ʹ�ùܵ���ʵ�ֲ�ͬ�߳�֮���ͨѶ��������ʱ�ļ���
	public static void main(String[] args) {
		Send send = new Send();  		//PipedOutputStream
		Recive recive = new Recive();   //PipedInputStream
		try {
			send.getOut().connect(recive.getInput());
		} catch (IOException e) {
			e.printStackTrace();
		}//����2���ܵ�
		new Thread(send).start();
		new Thread(recive).start();
	}
}
class Send implements Runnable{ 
	//�ܵ����������
	private PipedOutputStream out = null;
	
	public Send(){
		out = new  PipedOutputStream();
	}
	public PipedOutputStream getOut(){
		return this.out;
	}
	@Override
	public void run() {
		String message = "hello";
		try {
			out.write(message.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
class Recive implements Runnable{
	//�ܵ�����������
	private PipedInputStream input = null;
	public Recive(){
		this.input = new PipedInputStream();
	}
	public PipedInputStream getInput(){
		return this.input;
	}
	@Override
	public void run() {
		byte[] b = new byte[1024];
		int len = 0;
		try {
			len = this.input.read(b);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���ܵ�����Ϊ"+(new String(b,0,len)));
	}
	
}