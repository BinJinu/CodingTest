import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	char arr[][] = new char[5][15];
	int max=0;
	for (int i = 0; i < arr.length; i++) {
		String str  = sc.next();
		if(str.length() > max) max =str.length();
		
		for (int j = 0; j < str.length(); j++) {
			arr[i][j]=str.charAt(j);
		}		
	}
	String answer="";
	
	for (int i = 0; i <max; i++) {
		for (int j = 0; j < 5; j++) {
			if(arr[j][i] ==0) continue;
			answer += arr[j][i];
		}
	}
	System.out.print(answer);
	}
}

