import java.io.*;
public class EmployeeTest{

   public static void main(String args[]){
      /* 使用构造器创建两个对象 */
      Employee empOne = new Employee("Li tianlong");
      Employee empTwo = new Employee("Ya ya");

      // 调用这两个对象的成员方法
      empOne.empAge(24);
      empOne.empDesignation("Google Engineer");
      empOne.empSalary(6000);
      empOne.printEmployee();

      empTwo.empAge(22);
      empTwo.empDesignation("Software Engineer");
      empTwo.empSalary(5000);
      empTwo.printEmployee();
   }
}
