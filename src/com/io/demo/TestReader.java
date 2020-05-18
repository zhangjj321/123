package com.io.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * 缓冲输入流
 * @author admin
 *
 */
public class TestReader {
	public static void main(String[] args) {
		try {
			FileReader  fr = new FileReader("demo.txt");
			BufferedReader br = new BufferedReader(fr);
			String strLine = br.readLine();
		/*	//int num = 0;
			//read()一次读一个字符
			char[] buf = new char[1024];
			int num = 0;
			while((num=fr.read(buf))!=-1){
				System.out.print(new String(buf,0,num));
			}*/
			while (strLine!=null) {
				System.out.println(strLine);
				strLine = br.readLine();
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
