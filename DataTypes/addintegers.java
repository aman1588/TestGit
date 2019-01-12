import java.util.Scanner;
class numbers 
{
public static void main(String arg[]) 
{
int num1, num2, sum;
Scanner s = new Scanner(System.in);
System.out.println("Enter First Number: ");
num1 = s.nextInt();   
System.out.println("Enter Second Number: ");
num2 = s.nextInt();      
s.close();
sum = num1 + num2;
System.out.println("Sum of these numbers: "+sum);
}
}