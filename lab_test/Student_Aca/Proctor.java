package Student_Aca;

import java.util.Scanner;

public class Proctor 
{
float procid;
String name;
Scanner in=new Scanner(System.in);
public void getproc()
{
System.out.println("Enter proctor id:");
procid=in.nextFloat();
System.out.println("name:");
name=in.next();
}

public void displayproc()
{
System.out.println("procid:"+procid+"\n name:>"+name);
}
}
