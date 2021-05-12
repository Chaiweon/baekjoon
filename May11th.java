import java.util.Scanner;
//hf
public class May11th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstNum = sc.nextInt();
		int secNum =  sc.nextInt();
		
		int x= secNum/100;
		int y = (secNum%100)/10;
		int z = (secNum%100)%10;
		
		System.out.println(firstNum*z);
		System.out.println(firstNum*y);
		System.out.println(firstNum*x);
		System.out.println(firstNum*secNum);
		
		
		if (firstNum < secNum) {
			System.out.println("<");
		}else if (firstNum>secNum) {
			System.out.println(">");
		}else System.out.println("==");
		
		
		if (firstNum<=100 && firstNum >=90) {
			System.out.println("A");
		}else if (firstNum<=89 && firstNum >=80) {
			System.out.println("B");
		}else if (firstNum<=79 && firstNum >=70) {
			System.out.println("C");
		}else if (firstNum<=69 && firstNum >=60) {
			System.out.println("D");
		}else System.out.println("F");
		
		
		if( (0== firstNum%4 && 0!=firstNum%100) || 0== firstNum%400 ) {
			System.out.println("1");
	} else System.out.println("0");

	}

}
