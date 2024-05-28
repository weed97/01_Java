package com.ohgiraffers.section02.abstractclass;

// java에서는 단일 상속만 가능하다.
public class SmartPhone extends Product/*,java.util.Scanner*/ {

    public SmartPhone() {}

    @Override
    public void absMethod() {

        System.out.println("Product 클래스의 abstMethod를 오버라이딩한 메소드 호출함...");
    }

    // 다형성을 적용해서 추상클래스 레퍼런스 타입으로 활용 가능
    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone 메서드 호출함...");
    }

    // 동적 바인딩에 의해 SmartPhone 메소드가 호출된다.

}
