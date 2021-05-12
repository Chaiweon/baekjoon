import java.util.Scanner;
//////
public class May12th {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
//		if (x>0) {
//			if(y>0) {
//				System.out.println(1);
//			}else if (y<0) {
//				System.out.println(4);
//			}
//		}
//		else if(x<0) {
//			if(y>0) {
//				System.out.println(2);
//			}else if (y<0) {
//				System.out.println(3);
//			}
//		}
		
		if(0==h){
			if(m>=45) {
				System.out.println(h+ " "+(m-45));
			}else {
				int dif=45 - m;
				//System.out.println(dif);
				System.out.println( 23 + " " + (60-dif));
			}
		}
		else  {
			if(m>=45) {
				System.out.println(h+ " "+(m-45));
			}else {
				int dif=45 - m;
				//System.out.println(dif);
				System.out.println( (h-1) + " " + (60-dif));
			}
			
		}
		
	
		
}
}