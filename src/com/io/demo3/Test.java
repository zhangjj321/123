package com.io.demo3;
/**
 * 23�����ģʽ֮װ����ģʽ��
 * 		�����ж�����й�����ǿ�����Զ���һ���࣬�����ж����룬�������еĹ����ṩ��ǿ����
 * �Զ�������Ϊװ���ࡣ
 * @author admin
 *
 */
public class Test {
	public void eat(){
		System.out.println("���׷�");
	}
	public static void main(String[] args) {
		BuffTest bu  = new BuffTest(new Test());
		bu.buffEat();
	}
}
//����һ��װ����
class BuffTest{
	private Test t;
	BuffTest(Test t){
		this.t = t;
	}
	public void buffEat(){
		System.out.println("�Է�");
		System.out.println("��K");
		System.out.println("��ԡ");
	}
	
}
