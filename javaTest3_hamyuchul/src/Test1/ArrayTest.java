package Test1;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = {{12, 41, 36, 56, 21}, {82, 10, 12, 61, 45}, {14, 16, 18, 78, 65}, {45, 26, 72, 23, 34}};
		double sum=0, avg; 
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum+=array[i][j];
			}
		}
		avg = sum/20;
		System.out.println("합계 : "+sum);
		System.out.printf("평균 : %.2f",avg);
	}

}
