import java.io.*;
import java.util.*;
public class Switchboard
{
    public static ArrayList<String> Objects=new ArrayList<String>(3);
    public static  ArrayList<Integer> Contents=new ArrayList<Integer>();
    public static ArrayList<String> State=new ArrayList<String>();
    public static ArrayList<String> Appliances=new ArrayList<String>();
    public static void main(String args[])
    {
      
     System.out.println("Console Application");
     input.Inputs();
     Menu.Displayed();
     Appliance.Objectives();
     Checking.checks();
    }
}
class input
{
static int i,j;
static String k="3";
static int h=Integer.parseInt(k);
static int A;
static Scanner s=new Scanner(System.in);
public static void Inputs()
{
    for(A=0;A<h;A++)
    {
      Switchboard.Objects.add(s.next());
    }
for(i=0;i<3;i++)
{
 System.out.println("enter no of "+Switchboard.Objects.get(i)+"s:");
 Switchboard.Contents.add(s.nextInt());
 for(j=0;j<Switchboard.Contents.get(i);j++)
 {
  Switchboard.State.add("off");
 }
}
}
}
class Menu
{
static int B=0;
static int i,j;
public static void Displayed()
{
for(i=0;i<3;i++)
{
 for(j=0;j<Switchboard.Contents.get(i);j++)
 {
  System.out.println((B+1)+"."+Switchboard.Objects.get(i)+(j+1)+" "+"is "+Switchboard.State.get(B));
  Menu.B++;
 }
}
System.out.println((B+1)+"."+"Exit");
}
}
class Appliance
{
 static int i;
 static int j;
 public static void Objectives()
 {
 for(i=0;i<Switchboard.Objects.size();i++)
 {
  for(j=1;j<=Switchboard.Contents.get(i);j++)
  {
   Switchboard.Appliances.add(Switchboard.Objects.get(i)+j);
  }
 }
 }
}
class Checking
{
 static int i,check,choice;
 static Scanner s=new Scanner(System.in);
 public static void checks()
 {
  System.out.println("enter the checking value:");
  check=s.nextInt();
  for(i=0;i<=Switchboard.Appliances.size();i++)
  {
   if(check==i+1)
   { 
    if(Switchboard.State.get(i)=="off")
    {
     System.out.println("1.Switch"+" "+Switchboard.Appliances.get(i)+" "+"is on");
     System.out.println("2.Back");
     choice=s.nextInt();
    }
    else if(Switchboard.State.get(i)=="on")
    {
     System.out.println("1.Switch"+" "+Switchboard.Appliances.get(i)+" "+"is off");
     System.out.println("2.Back");
     choice=s.nextInt();
    }
   }
  }
 }
}
     
   
