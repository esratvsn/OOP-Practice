enum CompanyName{
    IBM,
    MICROSOFT,
    APPLE,
    GOOGLE,

}
public class Company {
    private Employee[] employees;
    private CompanyName companyName;
   public Company(Employee[] employees,CompanyName companyName){
        this.employees=employees;
        this.companyName=companyName;
    }
    public Employee[] getEmployees(){
       return employees;
    }
    public CompanyName getCompanyName(){
       return companyName;
    }

}
