package entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    // construtores

    public Individual(){
        super();
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    //getters e setters

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    //métodos

    @Override
    public final Double tax() {

        if (annualIncome < 20000)
        {
            return (annualIncome * 0.15) - (healthExpenditures * 0.50);
        }
        else
        {
            return (annualIncome * 0.25) - (healthExpenditures * 0.50);
        }
    }

    public String toString(){
        return name + ": $ " + String.format("%.2f\n", tax());
    }

}
