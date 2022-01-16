interface Animal
{
public void eat();
public void travel();
}
public class MammalInt implements Animal
{
public void eat()
{
System.out.println(“mammals eats”);
}
public void travel()
{
System.out.println(“mammals travel”);
}
public static void main (String []args)
{
Mammalint m = new mammalint();
m.eat();
m.travel();
}
}