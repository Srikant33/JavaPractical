class Student
{
int rollnumber;
void getnumber(int n)
{
rollnumber = n;
}
void putnumber()
{
System.out.println (“roll no. :” +rollnumber);
}
}
class Test extends Student
{
float part1, part2;
void getmarks(float m1. Float m2)
{
part1 = m1;
part2 = m2;
}
void putmarks()
{
System.out.println(“marks obtained”);
System.out.println(“part 1 =” +part1);
System.out.println(“part 2 =” +part2);
}
}
interface Sports
{
float sportWt = 6.0F;
void putWt();
}
class Results extends Tests implements Sports
{
float total;
public void putWt()
{
System.out.println(“sports Wt =” +sportWt);
}
void display()
{
total = part1+part2+sportWt;
putnumber();
putmarks();
putWt();
System.out.println(“total score=” +total);
}
}
class Hybrid
{
public statsic void main(String []args)
{
 
results student1 = new results();
student1.geetnumber(1234);
student1.getmarks(27.5f , 33.0f);
student1.display();
}
}
