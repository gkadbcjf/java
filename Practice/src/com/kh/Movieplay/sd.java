package com.kh.Movieplay;

public class sd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyObject[] objectArray = new MyObject[5];
	        for (int i = 0; i < objectArray.length; i++) {
	            objectArray[i] = new MyObject();
	        }

	        // 배열에 있는 객체들의 이차원 배열 출력
	        for (MyObject obj : objectArray) {
	            int[][] array = obj.getTwoDArray();

	            // 이차원 배열 출력
	            for (int i = 0; i < array.length; i++) {
	                for (int j = 0; j < array[i].length; j++) {
	                    System.out.print(array[i][j] + " ");
	                }
	                System.out.println(); // 행이 바뀔 때마다 줄 바꿈
	            }
	            System.out.println(); // 객체 사이에 빈 줄 추가
	        }
	}
	

}
