package lang2;

public class MathMain {

	public static void main(String[] args) {
		
		int[] ar = { 1, 2, 3, 4, 5, 6, 2, 3, 4, 5, 6}; 
		// 0.0 ~ 1.0사이의 랜덤한 실수를 만들어서 저장 
		double r = Math.random();
        // ar배열의 인덱스 범위내의 숫자로 변경하기 
		int idx = (int)(r * 100) % ar.length;
		System.out.printf("%d\n", ar[idx]);
     	
		
		
	}

}
