package entities;

public abstract class TaxPayer {
    protected String name;
    protected Double annualIncome;

    //construtores

    public TaxPayer(){
    }

    public TaxPayer(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    //getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    //métodos

    public abstract Double tax();
}
