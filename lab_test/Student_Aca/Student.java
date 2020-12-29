package Student_Aca;
import java.util.Scanner;

public class Student
{
 int usn;
 String name;
 int age;
double cgpa=0.0;
float procid;
Scanner in=new Scanner(System.in);

public void getdata()
{
System.out.println("usn");
usn=in.nextInt();
System.out.println("name");
name=in.next();
System.out.println("age");
age=in.nextInt();
System.out.println("procid");
procid=in.nextFloat();
System.out.println("cgpa");
cgpa=in.nextDouble();
}

public void display()
{
System.out.println("Usn:\t"+usn +"\n name: \t"+name +"\n age: \t"+ age+"\n cgpa \t " + cgpa);
}
}
