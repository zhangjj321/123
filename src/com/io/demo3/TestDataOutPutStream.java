package com.io.demo3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class TestDataOutPutStream {
	public static void main(String[] args) throws IOException{
		//writeData();
		readData();
	}

	private static void readData() throws IOException {
		DataInputStream dis =
				new DataInputStream(
						new FileInputStream("dataOutput.txt"));
		int num  = dis.readInt();//��ȡint���͵�ֵ
		boolean bool = dis.readBoolean();//��ȡbool���͵�ֵ
		double d = dis.readDouble();
		System.out.println("num="+num+"bool="+bool+"d="+d);
	}

	private static void writeData() throws IOException {
		DataOutputStream dos
			= new DataOutputStream(
				new FileOutputStream("dataOutput.txt"));
		dos.writeInt(123);//4�ֽ�
		dos.writeBoolean(false);//1���ֽ�
		dos.writeDouble(3.14);//8���ֽ�
		dos.close();
	}
}
