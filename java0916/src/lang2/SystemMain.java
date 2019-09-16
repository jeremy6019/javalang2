package lang2;

import java.util.GregorianCalendar;

public class SystemMain {

	public static void main(String[] args) {
		// System클래스의 static String getProperty(String key)
		//위의 메소드는 프로퍼티를 가져오는 메소드 입니다. 
		//os.name, java.version 
		String osname = System.getProperty("os.name");
		String javaversion = System.getProperty("java.version");
		
		System.out.printf("운영체제:%s\n", osname);
		System.out.printf("자바버전:%s\n", javaversion);
		
		//Hello world 10만번 출력하는데 걸리는 시간 측정 
		
		long start = System.currentTimeMillis();
	   for(int i=0; i<100000; i++) {
		   System.out.printf("Hello World\n");
	   }
		long end = System.currentTimeMillis();
		//소수까지 구해서 초단위로 출력 
		//정수끼리 연산을 하면 결과는 정수 
		//데이터 중 하나를 실수로 변경해서 연산 
		//실수를 출력할떄는 %f 
		System.out.printf("걸린 시간: %f초 \n", ((double)end-start)/1000);
	     
		//2002년 9월 5일 에서 지나온 날짜 계산하기 
		//년월일을 가지고 날짜 객체를 생성 
		//이 객체가 getTimeMillis()를 호출하면 1970년 1월 1일 자정부터 지나온 시간을 
		//1/1000초 단위로 리턴 
		//2002년 9월 5일을 날짜 객체로 변환 
		// 자바에서 월은 0부터 시작합니다. 
		GregorianCalendar meetday = 
				new GregorianCalendar(2002, 8, 5); 
		//현재 시간을 1/1000초 단위로 만들기 
		long time = System.currentTimeMillis(); 
		// time 은 밀리초 단위로 되어있는데 일단위로 변경 - 소수점 절삭
		// 현재시간에서 앞에서 만든 날짜를 빼고 하루로 나누어서 계산 
		long day =( time - meetday.getTimeInMillis()) / 86400 / 1000;
	    System.out.printf("지나온 날 수: %d일\n", day);
		
	    
	}
}
