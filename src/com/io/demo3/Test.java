package com.io.demo3;
/**
 * 23种设计模式之装饰者模式：
 * 		对已有对象进行功能增强，可以定义一个类，将已有对象传入，基于已有的功能提供加强功能
 * 自定义的类称为装饰类。
 * @author admin
 *
 */
public class Test {
	public void eat(){
		System.out.println("吃米饭");
	}
	public static void main(String[] args) {
		BuffTest bu  = new BuffTest(new Test());
		bu.buffEat();
	}
}
//定义一个装饰类
class BuffTest{
	private Test t;
	BuffTest(Test t){
		this.t = t;
	}
	public void buffEat(){
		System.out.println("吃饭");
		System.out.println("唱K");
		System.out.println("足浴");
	}
	
}
