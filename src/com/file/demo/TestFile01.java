package com.file.demo;

import java.io.File;

public class TestFile01 {
	public static void main(String[] args) {
		//创建file对象方式1:
		File f = new File("c:\\英格\\data.txt");
		
		File f2 = new File("c:\\英格","data.txt");
		
		File f3 = new File("c:"+File.separator+"英格");
		File f4 = new File(f3,"data.txt");
		System.out.println(f4);
	}
}
