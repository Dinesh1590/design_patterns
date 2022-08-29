package creational_design_patterns.abstractfactorypattern;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);

    public abstract Loan getLoan(String loan);
}
