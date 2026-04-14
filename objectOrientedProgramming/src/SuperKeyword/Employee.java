class Employee extends Person{
    double salary;

    Employee(String first, String last, double salary){

        super(first, last);

        this.salary = salary;
    }

    void showSalary(){
        System.out.printf("Salary: %.2f\n", this.salary);
    }
}