package com.io.demo3;

import java.io.Serializable;

/**
 * �������л��뷴���л���
 * 		�Ѷ���ת��Ϊ�ֽ����еĹ��̳�Ϊ��������л�
 * 		���ֽ����лָ�Ϊ����Ĺ��̳�Ϊ����ķ����л�
 * 
 * ��;��1.�Ѷ�����ֽ��������õı�����Ӳ�̣�ͨ�������һ���ļ���
 * 	   2.�������ϴ��Ͷ�����ֽ����С�
 * @author admin
 *
 		ֻ��ʵ�������л��ӿڵ���Ķ�����ܹ������л�
 */
public class Person implements Serializable{
	/**
	 * �����������ӿ���������������������
	 */
	//private static final long serialVersionUID = -7643489184650400839L;
	private int age;
	private String name;
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	public void show(){
		System.out.println("��������");
	}
}
