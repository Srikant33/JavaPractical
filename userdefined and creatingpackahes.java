package p1;
public class
Student
{
 int regno;
 String name;

 public void getdata(int r,String s)
 {
 name=s;
regno=r;
 }
 public void putdata()
 {
 System.out.println("regno = " +regno);
 System.out.println("name = " + name);
 }
}
/* Source code of the main function under C:\jdk1.6.0_26\bin>edit StudentTest.java */
import p1.*;
class StudentTest
{
 public static void main(String arg[])
 {
 student s=new student();
s.getdata(123,"xyz");

s.putdata();
}
} 