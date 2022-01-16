//Program : hierarchial inheritance
Class A
{
Public void method()
{
System.out.println(“method of class A”);
}
}
Class B extends A
{
Public void methodB()
{
System.out.println(“method of class B”);
}
}
Class C extends A
{
Public void methodC()
{
System.out.println(“method of class C”)
}
}
Class D extends A
{
Public void methodD()
{
System.out.println(“method of class D”)
}
}
Class MyClass
{
Public void method()
{
System.out.println(“method of class B”);
}
Public static void main(String args[])
{
B obj1 = new B();
C obj1 = new C();
D obj1 = new D();
Obj1.methodA();
Obj2.methodA();
Obj3.methodA();
}
}