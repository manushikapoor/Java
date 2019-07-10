import java.util.*;
class EmployeeChainedComparator implements Comparator<Emp> {
	 
    private List<Comparator<Emp>> listComparators;
 
   
    @SafeVarargs
	public EmployeeChainedComparator(Comparator<Emp>... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }
 
    
    public int compare(Emp emp1, Emp emp2) {
        for (Comparator<Emp> comparator : listComparators) {
            int result = comparator.compare(emp1, emp2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}
class Emp
{
	int age;
	String name;
	String dept;
	double salary;
	String id;
	Emp(int a,String n,String d,double s,String i)
	{
		age=a;
		name=n;
		dept=d;
		salary=s;
		id=i;
		
	}
	public String toString() {
		 
        return "name: "+ name +" age: "+ age +" salary: "+salary + " dept:" + dept +" id:" + id;
    }
	int getAge()
	{
		return age;
	}
	String getName()
	{
		return name;
	}
	double getsalary()
	{
		return salary;
	}
	String getdept()
	{
		return dept;
	}
	String getid()
	{
		return id;
	}
	
}
class Deptcomparator implements Comparator<Emp>
{
	public int compare(Emp ar0,Emp ar1)
	{
		return ar0.dept.compareTo(ar1.dept);
	}
	
}
class Agecomparator implements Comparator<Emp>
{
	public int compare(Emp ar0,Emp ar1)
	{
		return ar0.age-ar1.age;
	}
	
}
public class X {
	public static void main(String[] args)
	{
		List<Emp> e= new ArrayList<Emp>();
		e.add(new Emp(19,"manushi","oss",70000,"r1"));
	    e.add(new Emp(20,"jasleen","csf",80000,"r2"));
		e.add(new Emp(18,"stuti","ccvt",75000,"r3"));
		e.add(new Emp(21,"navya","ccvt",90000,"r4"));
		e.add(new Emp(22,"varini","oss",85000,"r5"));
		e.add(new Emp(18,"asha","ccvt",9000,"r6"));
		e.add(new Emp(17,"riya","csf",8000,"r7"));
		e.add(new Emp(19,"sneha","csf",9000,"r8"));
		e.add(new Emp(16,"arav","oss",5000,"r9"));
		e.add(new Emp(21,"ekta","ccvt",3000,"r10"));
		e.add(new Emp(23,"shivani","ogi",3000,"r11"));
		e.add(new Emp(22,"masha","ogi",5000,"r12"));
		e.add(new Emp(23,"shivi","ccvt",13500,"r13"));
		e.add(new Emp(23,"yash","oss",19000,"r14"));
		e.add(new Emp(23,"shivang","oss",3000,"r15"));
		
		Deptcomparator d= new Deptcomparator();
		Agecomparator a=new Agecomparator();
		Collections.sort(e, new EmployeeChainedComparator(
                new Deptcomparator(),new Agecomparator())
        );
		System.out.println("sorting according to dept and then age");
		e.stream().filter(emp->emp.getsalary() > 10000).forEach(System.out::println);
	}

}