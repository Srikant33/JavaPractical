class A
{
int i ;
}
Class B extends A
{
int i ;
B(int a , int b)
{
Super.i=a;
i=b;
}
void show()
{
System.out.println(“I in superclass:” +super.i);
System.out.println(“I in subclass:” +i);
}
}
Class UseSuper
{
public static void main(String []args)
{
B subob = new b(1,2);
Subob.show();
}
}