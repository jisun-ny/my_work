package test.main;

import test.auto.Bus;
import test.auto.Engine;

public class MainClass08 {
	public static void main(String[] args) {
		
		//Bus 클래스로 객체 생성해서 테스트 하기
		Bus b1 = new Bus(new Engine());
		b1.drive();
		b1.powerDrive();
		
		
		// 생성자의 인자로 필요한 값을 전달하지 안고 null을 전달해도 문법은 성립한다.
		// but) engine을 사용하는 기능은 사용 못함
		// engine을 사용하지 않는 기능은 사용 간ㅇ
		Bus b2 = new Bus(null);
		b2.drive();
		
		b2.powerDrive();
		
	}
}
