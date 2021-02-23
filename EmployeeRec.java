import java.util.Scanner;
 
class EmployeePersonal{

 int empid;
 String name;
 float Age;
 
 public void read() {
 
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the empid :: ");
  empid = sc.nextInt();
  System.out.print("Enter the name :: ");
  name = sc.next();
  System.out.print("Enter the Age :: ");
  Age = sc.nextFloat();
 }
 
 public void display() {
  
  System.out.println("Employee id = " + empid);
  System.out.println("Employee name = " + name);
  System.out.println("Employee Age = " + Age);
 }
}

class EmployeeProf extends EmployeePersonal{
    String dept;
    int Salary;
    float bonus;
    float TotalSal;
    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the deppartment  ");
        dept = sc.nextLine();
        System.out.println("Enter the Salary  ");
        Salary = sc.nextInt();
    }

    public void display(){
        System.out.println("Employee Department = " + dept);
        System.out.println("Employee Salary = " + Salary);
        if(Salary>5000){
            bonus = 15;
            System.out.println("Employee Bonus : " + bonus );
            TotalSal = Salary * bonus/100 + Salary; 
            System.out.println("Total Salary of the Employee : " + TotalSal );       
        }
        else if(Salary<5000 && Salary > 400){
            bonus = 10;
            System.out.println("Employee Bonus : " + bonus );
            TotalSal = Salary * bonus/100 + Salary; 
            System.out.println("Total Salary of the Employee : " + TotalSal );       

        }
        else{
            bonus = 5;
            System.out.println("Employee Bonus : " + bonus );
            TotalSal = Salary * bonus/100 + Salary; 
            System.out.println("Total Salary of the Employee : " + TotalSal );       

        }
    }

}

class EmployeeAttend extends EmployeePersonal
{   
    int Totaldays = 223;//total working days in an year
    int attendance;
        public void read(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the total attendance ");
            attendance = sc.nextInt();
        }

        public void display(){
            System.out.println("No of days in attendance "+ attendance );
            int leave = Totaldays - attendance;
            System.out.println("No of days Employee took leave "+leave);
        }
}


public class EmployeeRec{
    public static void main(String args[]) {
        EmployeePersonal Epersonal = new EmployeePersonal();
        EmployeeAttend Eattend = new EmployeeAttend();
        EmployeeProf Eprof = new EmployeeProf();
        Epersonal.read();
        Eattend.read();
        Eprof.read();
        Epersonal.display();
        Eattend.display();
        Eprof.display();
    }
}
