package com.kh.second; // ��Ű�� �����


// Ŭ���� �����
// �� Ŭ������ �̸� : MethodTest
// �� Ŭ������ Ǯ ���� : com.kh.second.MethodTest
public class MethodTest { // MethodTest Ŭ���� ���� ����

	// �� Ŭ���� ���� �������� �޼ҵ带 ������ �� �� �ִ�.
	// ������ ���� �޼ҵ带 ������ �ʿ䰡 ����.
	// �Ϲ� �޼ҵ�� ������
	// �Ϲ� �޼ҵ� : main �޼ҵ尡 �ƴ� ��� �޼ҵ��
	public void testPrintA() {// testPrintA �޼ҵ� ���� ����
		
		// �� �޼ҵ尡 ����Ǵ� ����
		System.out.println("ù���� �޼ҵ� ����");
		System.out.println("�ι�° �޼ҵ� ����");
		System.out.println("����° �޼ҵ� ����");
		
		testPrintB();
		//testPrintA();
				// ���� testPrintA �޼ҵ带 ȣ���ϰ� �ȴٸ�
				// ���ѹݺ����� A ->B ->C ->A ->B ->C -> ...
				//	ȣ��ɰ�!!
				// >  �� ��� ���ѹݺ����� ����� ����Ǵٰ�
				// StackOverflowError �� �ٷ�
				// (Stack�� �޸� ������ ���� �� �ϳ��ε� Stack�� ũ�⸦ �����)
		
	} // testPrintA �޼ҵ� ���� ��
	public void testPrintB() {// tsetPrintB �޼ҵ� ���� ����
		
		System.out.println("�ι�° �޼ҵ� ����");
		
	}// tsetPrintB �޼ҵ� ���� ��
	public void testPrintC() {// testPrintC �޼ҵ� ���� ����
		System.out.println("����° �޼ҵ� ����");
	}// testPrintC �޼ҵ� ���� ��
	
	
}// MethodTest Ŭ���� ���� ��
/*
 * �ڹ� �ڵ��� �帧
 * 1. �׻� ������ �Ʒ��������� ���پ� �ڵ尡 �����
 * 2. ȣ��� �޼ҵ� ������ ������ �ش� �޼ҵ带 ȣ���ߴ� ���ʸ����� �帧�� 
 * ���ư�
 * 
 * 
 * 
 */
