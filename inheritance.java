class A
{
int i , j;
void showij()
{
System.out.println(“i and j :” +i+ “” +j);
}
}
Class B extends A
{
int k ;
void showk()
{
System.out.println(“k:” +k);
}
void sum()
{
System.out.println (“i+j+k:” +(i+j+k));
}
}
Class SimpleInheritance
{
public static void main (String []args)
{
A superob = new a();
B subob = new b();
Superob.i = 10;
Superob.j = 20;
System.out.println(“contents of superob : “);
Superob.showij();
System.out.println();
Subob.i=7;
Subob.j=8;
Subob.k=9;
System.out.println(“contents of subob:”);
Subob.showij();
Subob.showk();
System.out.println();
System.out.println(“sum of I , j and k in subob:”);
Subob.sum();
}
}