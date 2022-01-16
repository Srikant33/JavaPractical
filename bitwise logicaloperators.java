class operation
{
public static void main (String []args)
{
int a =3 , b=6;
System.out.println(“a|b” +(a|b));
System.out.println(“a&b” +(a&b));
System.out.println(“a^b” +(a^b));
System.out.println(“(~a&b)|(a&~b)” +((~a&b)|(a&~b)));
System.out.println(“(~a&0x0f)” +(~a&0x0f));
}
}