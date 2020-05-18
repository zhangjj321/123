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
		int num  = dis.readInt();//读取int类型的值
		boolean bool = dis.readBoolean();//读取bool类型的值
		double d = dis.readDouble();
		System.out.println("num="+num+"bool="+bool+"d="+d);
	}

	private static void writeData() throws IOException {
		DataOutputStream dos
			= new DataOutputStream(
				new FileOutputStream("dataOutput.txt"));
		dos.writeInt(123);//4字节
		dos.writeBoolean(false);//1个字节
		dos.writeDouble(3.14);//8个字节
		dos.close();
	}
}
