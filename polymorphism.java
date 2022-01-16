class A
{
void callme()
{
System.out.println(“inside a‟s callme method”);
}
}
Class B extends A
{
void callme()
{
System.out.println(“inside b‟s callme method”);
}
}
Class C extends A
{
void callme()
{
System.out.println(“inside c‟s callme method”);
} }
class Dispatch
{
 26
pubic static void main (String args[])
{
A a = new A();
B b = new B();
C c = new C();
A r;
r=a;
r.callme();
r=b;
r.callme();
r=c;
r.callme();
}
}
