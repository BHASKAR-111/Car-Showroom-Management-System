package Prac_code;
import java.util.Scanner;
public class reverse_num {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int a=sc.nextInt();

    //2.using string buffer class
    StringBuffer sb=new StringBuffer(String.valueOf(a));
    StringBuffer rev=sb.reverse();
    
    //String Builder class
    StringBuilder sbl=new StringBuilder();
    sbl.append(a);
    StringBuilder reverse=sbl.reverse();
    System.out.println("The reversed num is :"+reverse);

}



//1. using algorithm
public static int  reverse_number(int x){
    int reverse=0;
    while(x>0){
        reverse=reverse*10+x%10;
        x/=10;
    }
return reverse;
}
}
