//Program : multilevel inheritance
class Car
{
public car()
{
System.out.println(“class car”);
}
public void vehicletype()
{
System.out.println(“vehicle type : car”);
}
}
Class Maruthi extends Car
{
public maruthi()
{
System.out.println(“class maruthi”);
}
public void brand()
{
System.out.println(“brand : maruthi”);
}
public void speed()
{
System.out.println(“max : 90kmph”);
}
}
 
public class maruthi800 extends maruthi
{
public maruthi800()
{
System.out.println(“maruthi model : 800”);
}
public void speed()
{
System.out.println(“max : 80kmph”)
}
public static void main(String args[])
{
Maruthi800 obj=new maruthi800();
Obj.vehicletype();
Obj.brand();
Obj.speed();
}
}
