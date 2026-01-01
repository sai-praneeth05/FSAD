import java.util.Scanner;
class Subtraction{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the first number:");
int val1 = sc.nextInt();
System.out.print("enter the second number:");
int val2 = sc.nextInt();

int res = val1 - val2;
System.out.println("Subtraction is: " +res);
}
}