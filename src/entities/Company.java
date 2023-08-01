package entities;

public class Company extends TaxPayer {

    private Integer employeeNumber;

    //construtores

    public Company(){
        super();
    }

    public Company(String name, Double annualIncome, Integer employeeNumber) {
        super(name, annualIncome);
        this.employeeNumber = employeeNumber;
    }

    //getters e setters
    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    //métodos
    @Override
    public final Double tax() {
        if (employeeNumber <= 10)
        {
            return annualIncome * 0.16;
        }
        else
        {
            return annualIncome * 0.14;
        }
    }

    public String toString(){
        return name + ": $ " + String.format("%.2f\n", tax());
    }
}
