package com.io.demo3;

import java.io.Serializable;

/**
 * 对象序列化与反序列化：
 * 		把对象转换为字节序列的过程称为对象的序列化
 * 		把字节序列恢复为对象的过程称为对象的反序列化
 * 
 * 用途：1.把对象的字节序列永久的保存在硬盘，通常存放在一个文件中
 * 	   2.在网络上传送对象的字节序列。
 * @author admin
 *
 		只有实现了序列化接口的类的对象才能够被序列化
 */
public class Person implements Serializable{
	/**
	 * 根据类名，接口名，方法和属性来生成
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
		System.out.println("新增方法");
	}
}
