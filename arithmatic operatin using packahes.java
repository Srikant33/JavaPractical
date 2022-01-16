import java.io.*;
import ARI.*;
class clsmain
{
public static void main(String args[])throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); int a,b;
System.out.println("Enter the numbers:");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
clspackage r = new clspackage();
System.out.println(a + " + " + b + " = " +r.add(a,b));
System.out.println(a + " - " + b + " = " +r.sub(a,b));
System.out.println(a + " * " + b + " = " +r.mul(a,b));
System.out.println(a + " / " + b + " = " +r.div(a,b)); }
} 