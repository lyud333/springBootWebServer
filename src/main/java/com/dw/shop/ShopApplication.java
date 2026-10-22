package com.dw.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {

	/*
	코드재사용을 위한 함수작성

	타입 함수이름(){
		코드~~
		코드~~
		코드~~
		return "ㅇ"(타입에 적을 타입);
	}
	 */


	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
		//변수저장
		final var wifeCount = 1;

		System.out.println(wifeCount);

		// if 조건문
		if (3>1){
			//실행할 코드~~
		}
		// for 반복문
		for (int i = 0; i < 3; i++) {
			//실행할 코드~~
		}

		Test test = new Test();
		System.out.println(test.name);
		test.hello();


		var test1 = new Friend("lee");
		System.out.println(test1.name);

	}

}

//클래스
class Test {
	String name = "kim";
	void hello() {
		System.out.println("안녕");
	}
}

//constructor 문법
class Friend {
	String name = "kim";
	int age = 20;
	//constructor
	Friend(String 구멍/*여러개 가능*/){
		this.name = 구멍;
	}
}

