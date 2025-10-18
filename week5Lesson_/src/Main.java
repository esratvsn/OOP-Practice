
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(123, "Kasım");
        Employee employee2 = new Employee(143, "Ahmet");
        Employee employee3 = new Employee(153, "Yunus");

        Employee[] employees1=new Employee[]{employee1,employee2};
        Employee[] employees2=new Employee[]{employee1,employee3};

        Company company1 = new Company(employees1, CompanyName.APPLE);
        Company company2 = new Company(employees2, CompanyName.GOOGLE);
      //  Company company3 = new Company(employees3, CompanyName.MICROSOFT);

        for (Employee employee:company1.getEmployees())

            System.out.println(employee.getName());{
            
        }
    }
}