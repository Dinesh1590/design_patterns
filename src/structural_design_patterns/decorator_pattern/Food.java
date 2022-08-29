package structural_design_patterns.decorator_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface Food {
    public String prepareFood();
    public double foodPrice();
}

