package mod;

import java.util.Scanner;

public class aode {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("궁금한 년도 입력");
		
		int year = scan.nextInt();
		
		System.out.println(year);
		
//		4로 안나눠지면 윤년이 아니라고 확정
		if ( year %4 1= 0) {
			System.out.println("윤년이 아님");
			System.out.println("4로 안나눠짐");
			
		}
		
		else { 
//			100으로 나누고 다시 판단해야함
			System.out.println("윤년이 맞음");
			System.out.println(" 4로는 나눠지지만 100으로는 안댐");
			
		}
	}

}
