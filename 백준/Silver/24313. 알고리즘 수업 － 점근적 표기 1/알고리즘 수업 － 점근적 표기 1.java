import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    		int a0 = sc.nextInt();
    		int a1 = sc.nextInt();
    		int c = sc.nextInt();
    		int n0 = sc.nextInt();
    		
    		
    	if (((a0*n0)+a1)<=c*n0 && c>=a0) {
			System.out.println(1);
			
		}
    	else {
			System.out.println(0);
		}
    		sc.close();	
}
}