import Student_Aca.*;
import java.util.Scanner;
class main{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter no of Student:>");
int n=in.nextInt();

System.out.println("Enter no of proctors:>");
int m=in.nextInt();
Student_Aca.Student s[]=new Student_Aca.Student[n];
Student_Aca.Proctor p[]=new Student_Aca.Proctor[m];
	for  (int i=0;i<n;i++)
	   {
	   s[i]=new Student_Aca.Student();
	   System.out.println("\n Enter the details of Student "+(i+1));
	   s[i].getdata();
	   }

	   
	   for  (int i=0;i<m;i++)
	   {
	   p[i]=new Student_Aca.Proctor();
	   System.out.println("\n Enter the details of Proctor "+(i+1));
	   p[i].getproc();
	   }
			for  (int i=0;i<n;i++)
			   {
			   System.out.println("\n Displaying  details of Student "+(i+1));
			   s[i].display();
			   }   
			   
			   for  (int i=0;i<m;i++)
			   {
			   System.out.println("\n Displaying  details of Proctor "+(i+1));
			   p[i].displayproc();
			   }  
   }
   }
