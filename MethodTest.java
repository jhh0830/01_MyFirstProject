package com.kh.second; // 패키지 선언부


// 클래스 선언부
// 이 클래스의 이름 : MethodTest
// 이 클래스의 풀 네임 : com.kh.second.MethodTest
public class MethodTest { // MethodTest 클래스 영역 시작

	// 한 클래스 내에 여러개의 메소드를 정의해 둘 수 있다.
	// 무조건 메인 메소드를 포함할 필요가 없다.
	// 일반 메소드들 만들어보기
	// 일반 메소드 : main 메소드가 아닌 모든 메소드들
	public void testPrintA() {// testPrintA 메소드 영역 시작
		
		// 이 메소드가 실행되는 순간
		System.out.println("첫번쨰 메소드 실행");
		System.out.println("두번째 메소드 실행");
		System.out.println("세번째 메소드 실행");
		
		testPrintB();
		//testPrintA();
				// 만약 testPrintA 메소드를 호출하게 된다면
				// 무한반복으로 A ->B ->C ->A ->B ->C -> ...
				//	호출될것!!
				// >  이 경우 무한반복으로 결과가 실행되다가
				// StackOverflowError 가 바랭
				// (Stack은 메모리 공간의 유형 중 하나인데 Stack의 크기를 벗어나면)
		
	} // testPrintA 메소드 영역 끝
	public void testPrintB() {// tsetPrintB 메소드 영역 시작
		
		System.out.println("두번째 메소드 실행");
		
	}// tsetPrintB 메소드 영역 끝
	public void testPrintC() {// testPrintC 메소드 영역 시작
		System.out.println("세번째 메소드 실행");
	}// testPrintC 메소드 영역 끝
	
	
}// MethodTest 클래스 영역 끝
/*
 * 자바 코드의 흐름
 * 1. 항상 위에서 아래방향으로 한줄씩 코드가 실행됨
 * 2. 호출된 메소드 영역이 끝나면 해당 메소드를 호출했던 태초마을로 흐름이 
 * 돌아감
 * 
 * 
 * 
 */
