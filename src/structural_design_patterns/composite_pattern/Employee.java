package structural_design_patterns.composite_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface Employee {
    public  int getId();
    public String getName();
    public double getSalary();
    public void print();
    public void add(Employee employee);
    public void remove(Employee employee);
    public Employee getChild(int i);
}

