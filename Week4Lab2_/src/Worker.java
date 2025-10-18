public class Worker {
    private String name;
    private int salary;
    private static int counter=0;
    public Worker(String name,int salary) throws Exception{
        setName(name);
        setSalary(salary);
        counter++;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setSalary(int salary) throws Exception {
        if(salary<=0){
            throw new Exception("Salary amount must be greater than zero");
        }
        this.salary = salary;
    }
    public static int getTotalWorkers(){
        return counter;
    }
    public String getName(){return name;}
    public int getSalary(){return salary;}


}
