import java.lang.Runnable;
class X implements Runnable
 {
 public void run()
 {
 for(int i=1;i<10;i++)
 {
 System.out.println("\t Thread X:"+i);
 }
 System.out.println("End of Thread X");
 }
 }
class Runnabletest
 {
 public static void main(String arg[])
 {
 X R=new X();
 Thread T=new Thread(R);
 T.start();
 }
 } 