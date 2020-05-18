package com.file.demo;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class TestFile02 {
	public static void main(String[] args) throws IOException {
		//1.创建文件
		//createFile();
		//2.创建文件夹
		//createFiles();
		//3.列出制定目录的全部文件
		//listFile();
		//listFile2();
		//4.输出指定文件夹下所有的文件
		//print(new File("C:"+File.separator+"英格"));
		//5.列出磁盘中的根目录
		//listRoots();
		//6.列出磁盘下的文件和文件夹
		//listRootFiles();
		//7.列出文件夹下指定的文件
		//selectFiles();
		//8删除文件夹下所有的文件
		//deleteFiles("C:"+File.separator+"英格");
		//9修改文件的名称
		TestRenameTo("C:\\英格\\张三.txt","C:\\英格\\李四.txt");
	}

	private static void TestRenameTo(String file, String toFile) {
		File toName = new File(file);
		if(!toName.exists()||toName.isDirectory()){
			System.out.println("文件不存在"+file);
			return;
		}
		File newFile = new File(toFile);//修改之后的文件对象
		if(toName.renameTo(newFile)){
			System.out.println("文件已经修改");
		}else{
			System.out.println("文件修改错误");
		}
	}

	private static void deleteFiles(String string) {
		File delFile = new File(string);
		File[] files = delFile.listFiles();
		for(int i = 0;i<files.length;i++){
			if(!files[i].isDirectory()){
				files[i].delete();
			}
		}
	}

	private static void selectFiles() {
		File dir = new File("C:"+File.separator+"英格");
		File[] files = dir.listFiles(
					new FilenameFilter() {
						@Override
						public boolean accept(File dir, String name) {
							if(name !=null && " ".equals(" ")){
								if(name.toLowerCase().endsWith(".java")){
									return true;
								}
							}
							return false;
						}
					});
		for (File file : files) {
			System.out.println(file);
		}
	}

	private static void listRootFiles() {
		File[] file = File.listRoots(); //得到跟数组
		for (File file2 : file) { //迭代根数组
			System.out.println(file2);
			if(file2.length()>0){
				String[] filenames = file2.list();
				for (String string : filenames) {
					System.out.println(string);
				}
			}
		}
	}

	private static void listRoots() {
		File[] paths;
		paths = File.listRoots();//返回当前磁盘中的根目录
		for (File file : paths) {
			System.out.println(file);
		}
	}

	private static void print(File file) {
		//递归调用输出文件夹下所有的文件
		if(file !=null){
			if(file.isDirectory()){//如果是目录
				File[] files = file.listFiles();
				if(files !=null){
					for (File file2 : files) {
						print(file2);
					}
				}
			}else{
				//不是目录输出打印
				System.out.println(file);
			}
		}
	}

	private static void listFile2() {
		File f = new File("C:"+File.separator);
		String[] str = f.list();
		for(String string : str){
			System.out.println(string);
		}
	}

	private static void listFile() {
		File f = new File("C:"+File.separator);
		File[] files = f.listFiles();
		for (File file : files) {
			System.out.println(file);
		}
	}

	private static void createFiles() {
		File file = new File("C:\\英格2\\file");
		if(!file.exists()){
			//file.mkdir();在存在的路径下再创建一个文件夹
			file.mkdirs();//连同路径一起创建对应的文件夹
		}
	}

	private static void createFile() throws IOException {
		File file = new File("C:\\英格\\file.txt");
		if(!file.exists()){
			file.createNewFile();//创建文件
		}
	}
}
