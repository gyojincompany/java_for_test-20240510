
public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for str in [1,2,3,4,5]:
		// for i in range(1,11): # 1~10 10번 for문이 반복
		
		//int i;
		for(int i=1;i<=10;i=i+1) { //초 조 증
			System.out.println(i);
		}
		
		for(int j=1;j<=100;j=j+2) {			
			System.out.println(j);
		}
		
		for(int k=100;k>=0;k--) { //k-- -> k=k-1
			System.out.println(k);
		}
		
		// 1~100까지 합을 출력하는 반복문을 작성하시오.
		int sum = 0; //sum 정수 변수를 선언과 동시에 0으로 초기화
		for(int i=1;i<=100;i++) {
			sum = sum + i;
		}
		
		System.out.println("sum의 값:" + sum);
		
		// for 문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하시오.
		
		int sum2 = 0;
		for(int i=3;i<=100;i=i+3) {
			System.out.println(i);
			sum2 = sum2 + i;
		}
		System.out.println("1~100사이의 3의 배수의 총합:" + sum2);
		
		int sum3 = 0;
		for(int i=1;i<=100;i++) {
			if (i % 3 == 0) { // 3으로 나누어서 나머지가 0인 i 값들만 sum3에 누적합으로 실행됨
				sum3 = sum3 + i;
			}
		}
		System.out.println(sum3);
		
		
		
	}

}
