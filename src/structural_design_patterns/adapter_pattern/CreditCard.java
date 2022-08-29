package structural_design_patterns.adapter_pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public interface CreditCard {
    public void giveBankDetails();
    public String getCreditCard();
}

