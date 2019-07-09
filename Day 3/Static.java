class Employee
{
int Id;
String name;
static String Company_name="ABC"; //same for all employee
}
class Static
{
public static void main(String args[]) //main method is static because object is not required to call static method 
{
Employee s1=new Employee();
s1.Id=6483;
s1.name="abcd";
System.out.println(s1.Id);
System.out.println(s1.name);
System.out.println(Employee.Company_name); // static variable accessed directly with class name,no need of reference 
}
}