import java.util.Arrays;
import java.util.Scanner;

public class April30th {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int Times = Integer.parseInt(sc.nextLine());
//		String inputStr = sc.nextLine();
//
//		int sum=0;
//		for (int i = 0; i < Times; i++) {
//			sum +=Integer.parseInt(inputStr.substring(i,i+1));
//		}
//		
//		
//		
//
//		System.out.println(sum);
		
		
		// 문자를 아스키로
		int ascii='3';
		System.out.println(ascii);

		//숫자를 아스키로
		char ch1 = (char)33;
		System.out.println(ch1);
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.next().charAt(0); //0은 인덱싱할 위치
		// "3" -> string 3을 char로 가지고 와서 int로 변환
		//"r" -> string "r"을  char로 가지고 와서 int로 변환
		System.out.println(ch);
		
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
		
		
	}
}


