class A
{
int i , j ;
A(int a , int b)
{
i= a;
j= b;
}
void show()
{
System.out.println(“i and j:” +i+ “” +j);
} }
Class B extends A
{
int k;
B(int a , int b , int c)
{

super (a,b);
k=c;
}
void show()
{
Super.show()
{
System.out.println(“k:” +k);
}
}
class Override
{
public static void main (String []args)
{
B subob = new b(1,2,3);
Subob.show(“this is k:”);
Subob.show();
}
}