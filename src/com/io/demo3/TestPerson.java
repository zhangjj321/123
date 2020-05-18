package com.io.demo3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestPerson {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	//serializPersonn();
	deserializPerson();
	}



	private static void deserializPerson() throws IOException, IOException, ClassNotFoundException {
		ObjectInputStream obi 
				= new ObjectInputStream(
						new FileInputStream(
								new File("Person.txt")));
		Person person = (Person)obi.readObject();
		obi.close();
		System.out.println(person);
		person.show();
	}



	private static void serializPersonn()
			throws FileNotFoundException, IOException {
		Person p = new Person(23, "����");
		//1.����һ��file����
		File f = new File("Person.txt");
		//2.�������������
		ObjectOutputStream op 
				= new ObjectOutputStream(
						new FileOutputStream(f));
		op.writeObject(p);//����Ҫ���л��Ķ�����Ϊ����
		op.close();
		System.out.println("�������л��ɹ�");
		
	}
}
