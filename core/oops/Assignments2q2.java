import java.util.ArrayList;
import java.util.List;
class Manager extends Assignments2q2 {
Manager(int id, int salary) {
super(id, salary);
}

@Override
public int getSalary(int salary ) {
int incentive = 5000;
salary += incentive;
salaryEarned += salary;
employeeSalaries.add(salaryEarned);
return (salary);
}
}

class Labour extends Assignments2q2 {
Labour(int id, int salary) {
super(id, salary);
}

@Override
public int getSalary(int salary) {
int overtime = 500 ;
int salaryForHours = (salary/365)/9;
salary += (salaryForHours*1.5)*overtime;
return salary;
}

}

public class Assignments2q2 {
// Assignment2Qs -Employee class
int salary=10000;
int salaryEarned = 0 ;
int id;
static int total;
static List<Integer> employeeSalaries;
Assignments2q2(int id ,int salary){
this.id = id ;
this.salary = salary;
salaryEarned = 0;
}
public int getSalary(int salary){
return salary;
}
public int reciveSalary() {
salary = getSalary(salary);
salaryEarned += salary;
return salaryEarned;
}
public static int totalEmployeesSalary(List<Integer> employeeSalaries){
for(int i =0;i<employeeSalaries.size();i++)
		{
		total += employeeSalaries.get(i);
		}
return total;
		}
public static void main(String[] args)
{
	employeeSalaries=new ArrayList<>();
	Assignments2q2 emp1=new Assignments2q2(1,10000);
	Assignments2q2 emp2=new Assignments2q2(2,40000);
	Manager emp3=new Manager(2,40000);
	Labour emp4=new Labour(2,20000);
	employeeSalaries.add(emp1.reciveSalary());
	employeeSalaries.add(emp2.reciveSalary());
	employeeSalaries.add(emp3.reciveSalary());
	employeeSalaries.add(emp4.reciveSalary());
	System.out.println(totalEmployeesSalary(employeeSalaries));
}

}