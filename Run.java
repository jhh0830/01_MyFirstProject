package com.kh.third.run;

import com.kh.third.MyName;//아래 선언한 com.kh.third.MyName 클래스를 참조한다
// import로 Run 클래스에 참조한다라고 선언함

public class Run {
	public static void main(String[] args) {//메인 함수 시작점

		System.out.println("프로그램 시작");
		MyName mn = new MyName(); //com.kh.third.MyName 클래스 있는걸 사용하기위해서 선언
		// 대변할이름이 mn이라는걸 알수있다~
		
		mn.callMyName();// 호출해서 불러옴
		System.out.println("프로그램 종료");
	}//메인 함수 끝
}
