package com.kh.third.run;

import com.kh.third.MyName;//�Ʒ� ������ com.kh.third.MyName Ŭ������ �����Ѵ�
// import�� Run Ŭ������ �����Ѵٶ�� ������

public class Run {
	public static void main(String[] args) {//���� �Լ� ������

		System.out.println("���α׷� ����");
		MyName mn = new MyName(); //com.kh.third.MyName Ŭ���� �ִ°� ����ϱ����ؼ� ����
		// �뺯���̸��� mn�̶�°� �˼��ִ�~
		
		mn.callMyName();// ȣ���ؼ� �ҷ���
		System.out.println("���α׷� ����");
	}//���� �Լ� ��
}
