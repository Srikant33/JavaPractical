import java.util.*;
class ArithmeticOperations
{
public static void main (String []args)
{
int a , b;
Scanner s = new Scanner (system.in);
a=s.nextInt();
b=s.nextInt();
System.out.println(“press 1 for addition”);
System.out.println(“press 2 for subtraction”);
System.out.println(“press 3 for multiplication”);
System.out.println(“press 4 for division”);
int ch = s.nextInt();
Switch(ch)
{
Case 1:
System.out.println(“addition=” +(a+b));
Case 2:
System.out.println(“subtraction=” +(a-b)); 
Case 3:
System.out.println(“multiplication=” +(a*b));
Case 4:
System.out.println(“division=” +(a/b));
Break;
Default:
System.out.println(“invalid input”);
}
}
}
