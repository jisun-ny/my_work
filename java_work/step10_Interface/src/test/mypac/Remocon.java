package test.mypac;

/*
 *  [interface ]
 *  -생성자가 없다 (단독 객체 생성 불가)
 *  - 구현된 메소드는 가질 수 없다 (추상 메소드만 가질 수 있따
 *  -필드는 static final 상수만 가질 수 있따
 *  -data type의 역할을 할 수 있따. --> Remocon type의 변수를 지정하는 것이 가능하다
 *  -interface type.의 참조값이 필요하면 구현(implements) 클래스를 만ㄷㄹ어서 
 *  객체를 생성해야 한다
 *  -클래스 상속은 단일 상속이지만, 인터페이스는 다중 구현이 가능하다.
 */

public interface Remocon {
	//필드는 static final필드만 가질 수 있다. (static final은 생략가능)
	public static final String COMPANY="LG";
	public void up();
	public void down();
}