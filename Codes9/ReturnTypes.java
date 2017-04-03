import java.awt.Graphics2D;

class ITEmployee{
	int id ;
	String name;
	double bonus;
	double salary;
	String design;
}
class Dept{
	String deptNo;
	String name;
	String managerName;
	String timeSlot;
	String location;
}
class Promotion{
	// Passing Ref and Return Ref
	int show(){
		return 20;
	}
	Dept promote(ITEmployee employee){  // employee -77
		employee.bonus+=500;  // bonus = bonus + 500
		employee.salary += 1000;
		employee.design = "Senior "+employee.design;
		Dept dept =new Dept();
		dept.deptNo="1001";
		dept.name="IT";
		dept.location="Noida";
		dept.managerName="John";
		dept.timeSlot="9 Am";
		return dept;
		
	}
}
public class ReturnTypes {

	public static void main(String[] args) {
		ITEmployee emp = new ITEmployee();
		emp.id=1001;
		emp.name="Ram";
		emp.salary = 9000;
		emp.bonus =500;
		emp.design="Soft Eng.";
		Promotion pr = new Promotion();
		Dept dept2 = pr.promote(emp);  //pr.promote(77);  //4 Byte , 8 Byte
		System.out.println(emp.salary);
		System.out.println(emp.bonus);
		System.out.println(emp.design);
		System.out.println(dept2.deptNo+" "+dept2.name+" "+dept2.location);
		//Graphics2D twod;
		//twod.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, observer)
		// TODO Auto-generated method stub

	}

}
