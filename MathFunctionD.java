import java.util.*;
class MathFunction
{
float z;
void multiply(int x,int y)
{
z=x*y;
System.out.println("z="+z);
}
void multiply(float x,float y)
{
z=x*y;
System.out.println("z="+z);
}
void multiply(int x,float y)
{
z=x*y;
System.out.println("z="+z);
}
}
class MathFunctionD
{
public static void main(String args[])
{
MathFunction f=new MathFunction();
f.multiply(2,9);
f.multiply((float)5.1,(float)8.2);
f.multiply(3,(float)8.2);
}
}