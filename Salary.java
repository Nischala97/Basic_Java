import java.util.*;

class EmpDetails
{
	int empid;
	String empname;
	double basic_sal;
	double da,hra;
	double pf,pt,grossSal,deduct;
	public EmpDetails(int e,String s,double sa)
	{
		empid=e;
		empname=s;
		basic_sal=sa;
	}
	double calGrossSalary(double basic_sal)
	{
		da=(15*basic_sal)/100;
		hra=(10*basic_sal)/100;
		return basic_sal+da+hra;
	}
	double CalDeduction(double basic_sal)
	{
		pf=(8*basic_sal)/100;
		pt=(2*basic_sal)/100;
		return basic_sal-pf-pt;
	}
	void genPayslip()
	{
		System.out.println("Employee name:"+empname);
		System.out.println("account no   :"+empid);
		System.out.println("Basic sal    :"+basic_sal);
		System.out.println("gross sal    :"+calGrossSalary(basic_sal));
		System.out.println("deduction    :"+CalDeduction(basic_sal));
		System.out.println("take home    :"+(calGrossSalary(basic_sal)-CalDeduction(basic_sal)));
	}   
	
}

public class Salary
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=s.nextInt();
		System.out.println("Enter name:");
		String na=s.next();//Line();
		System.out.println("Enter salary:");
		double ss=s.nextInt();

		System.out.println();
		EmpDetails e=new EmpDetails(n,na,ss);
		
		System.out.println("details");
		System.out.println("------------------------");
		e.genPayslip();
		
	}
}
