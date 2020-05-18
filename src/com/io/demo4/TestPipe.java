package com.io.demo4;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class TestPipe {
	//实现2个线程之间的通信，
	//管道流用于在不同的线程之间传输数据。 
	//一个线程发送到输出管道，
	//另一个线程从输入管道中读取数。
	//通过使用管道，实现不同线程之间的通讯，无须临时文件。
	public static void main(String[] args) {
		Send send = new Send();  		//PipedOutputStream
		Recive recive = new Recive();   //PipedInputStream
		try {
			send.getOut().connect(recive.getInput());
		} catch (IOException e) {
			e.printStackTrace();
		}//连接2根管道
		new Thread(send).start();
		new Thread(recive).start();
	}
}
class Send implements Runnable{ 
	//管道输出流对象
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
	//管道输入流对象
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
		System.out.println("接受的内容为"+(new String(b,0,len)));
	}
	
}