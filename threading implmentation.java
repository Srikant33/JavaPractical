package Mthread;
import java.util.Random;
public class Mthread
{
public static void main(String args[])
{
A a=new A("one");
a.start();
}
}
class A extends Thread
{
 String tname;
 Random r;
 Thread t1,t2;
 A(String x)
 {
 this.tname=x;
 }
 public void run()
 {
try
{
 int num=0;
 r=new Random();
 num=r.nextInt(100);
 for(int i=0;i<10;i++)
 {
 if(num%2==0)
 {
 t1=new Thread(new even(num));
 t1.start();
}
else
 {
 t2=new Thread(new odd(num));
 t2.start();
 } 

 Thread.sleep(1000);
}

}
catch(InterruptedException e)
{
System.out.println("Exception is"+e);
}
Catch(Exception a)
{
System.out.println("Exception is"+a);
} } }
class even implements Runnable
{
int x;
even(int x)
{
this.x=x;
}
public void run()
{
System.out.println(“num is even”+x+”its square is”+(x*x));
}
}
class odd implements Runnable
{
 int x;
odd(int x)
{
this.x=x;
}
public void run()
{
System.out.println(“num is odd”+x+”its cube is”+(x*x*x));
}
} 
