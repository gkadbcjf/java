package com.kh.Movieplay;

public class MyObject {
	private int[][] twoDArray;

    public MyObject() {
        twoDArray = new int[3][7]; // 예시로 3x3 크기의 이차원 배열 생성
        initializeArray(); // 배열 초기화 메소드 호출
    }

    private void initializeArray() {
        // 예시로 간단하게 배열을 1부터 채워넣는 코드
        int value = 1;
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = value++;
            }
        }
    }

    public int[][] getTwoDArray() {
        return twoDArray;
    }
}
