import java.util.*;
public class palindrome{
public static void main(String[] args){
int num;
System.out.println("enter number or string:");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
if(num==Integer.reverse(num))
{
System.out.println("given number is a palindrome");
}
else
{
System.out.println("given number is not palindrome");
}
}
}