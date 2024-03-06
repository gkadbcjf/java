package Test6;



public class Calculator  {


	public double getSum(int data)   {
		double sum=0;
		if(data>1 && data<=5) {
			for(int i=1; i<=data; i++) {
				sum+=i;	
			}
		}
		else {
			//throw new InvalidException("입력 값에 오류가 있습니다.");
			return -1;
		}
		return sum;
	}
}
