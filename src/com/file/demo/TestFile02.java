package com.file.demo;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class TestFile02 {
	public static void main(String[] args) throws IOException {
		//1.�����ļ�
		//createFile();
		//2.�����ļ���
		//createFiles();
		//3.�г��ƶ�Ŀ¼��ȫ���ļ�
		//listFile();
		//listFile2();
		//4.���ָ���ļ��������е��ļ�
		//print(new File("C:"+File.separator+"Ӣ��"));
		//5.�г������еĸ�Ŀ¼
		//listRoots();
		//6.�г������µ��ļ����ļ���
		//listRootFiles();
		//7.�г��ļ�����ָ�����ļ�
		//selectFiles();
		//8ɾ���ļ��������е��ļ�
		//deleteFiles("C:"+File.separator+"Ӣ��");
		//9�޸��ļ�������
		TestRenameTo("C:\\Ӣ��\\����.txt","C:\\Ӣ��\\����.txt");
	}

	private static void TestRenameTo(String file, String toFile) {
		File toName = new File(file);
		if(!toName.exists()||toName.isDirectory()){
			System.out.println("�ļ�������"+file);
			return;
		}
		File newFile = new File(toFile);//�޸�֮����ļ�����
		if(toName.renameTo(newFile)){
			System.out.println("�ļ��Ѿ��޸�");
		}else{
			System.out.println("�ļ��޸Ĵ���");
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
		File dir = new File("C:"+File.separator+"Ӣ��");
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
		File[] file = File.listRoots(); //�õ�������
		for (File file2 : file) { //����������
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
		paths = File.listRoots();//���ص�ǰ�����еĸ�Ŀ¼
		for (File file : paths) {
			System.out.println(file);
		}
	}

	private static void print(File file) {
		//�ݹ��������ļ��������е��ļ�
		if(file !=null){
			if(file.isDirectory()){//�����Ŀ¼
				File[] files = file.listFiles();
				if(files !=null){
					for (File file2 : files) {
						print(file2);
					}
				}
			}else{
				//����Ŀ¼�����ӡ
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
		File file = new File("C:\\Ӣ��2\\file");
		if(!file.exists()){
			//file.mkdir();�ڴ��ڵ�·�����ٴ���һ���ļ���
			file.mkdirs();//��ͬ·��һ�𴴽���Ӧ���ļ���
		}
	}

	private static void createFile() throws IOException {
		File file = new File("C:\\Ӣ��\\file.txt");
		if(!file.exists()){
			file.createNewFile();//�����ļ�
		}
	}
}
