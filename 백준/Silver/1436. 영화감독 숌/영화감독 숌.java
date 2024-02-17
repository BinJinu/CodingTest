import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = 666;
        int cnt = 1;
        while(cnt != a) {
        	num++;
        	if(Integer.toString(num).contains("666")) {
        		cnt+=1;
        	}
        }
        System.out.println(num);
    }
}
