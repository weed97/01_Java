package com.ohgiraffers.sectiont02.demensinal;

public class Application4 {
    public static void main(String[] args) {

        /*
        * 가별배열
        *
        * 할당과 동시에 블록을 이용해서 초기화가 가능하다.
        * */

        // 정변배열
        int[][] iarr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        // 반복문을 이용한 출력
        System.out.println(" =========== 정변 배열 ===========");
        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                System.out.println(iarr[i][j] + " ");

            }
            System.out.println();

        }


    }
}
