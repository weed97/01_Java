package com.ohgiraffers.api.split;

import com.ohgiraffers.api.string.StringProcess;

public class SplitTest {
    public static void main(String[] args) {

        StringProcess sp = new StringProcess();
        String result = sp.preChar("hello world");
        System.out.println(result);

        int num = sp.charSu("application car cable", 'c');
        System.out.println(num);

    }
}
