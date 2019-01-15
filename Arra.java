import java.util.*;
class Arra
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int a=-1;
		int marks[];
		int search;
		marks = new int[10];
        for(int i=0; i<marks.length;i++)
        {
        	marks[i]=scan.nextInt();
        }
        System.out.println("Enter the elements to search");
        search=scan.nextInt();
        for(int i=0; i<marks.length;i++)
        {
        	if(marks[i]==search)
        	{
        	System.out.println("Element FOUND");
        	a=i+1;
        	System.out.println("ELEMENT FOUND AT"+a);	
        	}
        	else
        	{
        		System.out.print(" ");
        	}
        }
        if(a<0||a>10)
        System.out.println("ELEMENT NOT FOUND")
	}
}