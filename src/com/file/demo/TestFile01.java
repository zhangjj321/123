package com.file.demo;

import java.io.File;

public class TestFile01 {
	public static void main(String[] args) {
		//����file����ʽ1:
		File f = new File("c:\\Ӣ��\\data.txt");
		
		File f2 = new File("c:\\Ӣ��","data.txt");
		
		File f3 = new File("c:"+File.separator+"Ӣ��");
		File f4 = new File(f3,"data.txt");
		System.out.println(f4);
	}
}
