class Employee
{
String name;
int emp_id;
float result;
float ass1,ass2,ass3;

Employee()
{
name="Aaron";
emp_id=510;
ass1=80;
ass2=85;
ass3=90;
}
void result()
{
if(ass1>75 && ass3>=75 && ass3>=75)
{
System.out.println("Promoted");
}
else
{
System.out.println("Demoted");
}
}

void calculate()
{
float total = ass1+ass2+ass3;
System.out.println("Total = " +total);

float percentage = (total/300) * 100;
System.out.println("percentage = " +percentage);
}
}

public class Emp1
{
public static void main(String[] args)
{
Employee e1 = new Employee();
e1.result();
e1.calculate();
}
}
