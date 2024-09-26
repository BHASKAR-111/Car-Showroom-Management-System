package Prac_code;
import java.util.Scanner;
public class reverse_string {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string: ");
    String s=sc.nextLine();
    String rev="";
//using concatination/ for loop
    /*   
    for(int i=s.length()-1;i>=0;i--){
        // System.out.print(s.charAt(i));
        rev+=s.charAt(i);
             }
    */

//using character array
    char[] arr=s.toCharArray();
    for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i]);
    }
    System.out.println(rev);
}
}
