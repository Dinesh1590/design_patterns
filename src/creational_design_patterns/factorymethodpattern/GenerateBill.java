package creational_design_patterns.factorymethodpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*

A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object
but let the subclasses decide which class to instantiate.
In other words, subclasses are responsible to create the instance of the class.

        The Factory Method Pattern is also known as Virtual Constructor.

        Advantage of Factory Design Pattern:-
        1.Factory Method Pattern allows the sub-classes to choose the type of objects to create.
        2.It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code.
        3.That means the code interacts solely with the resultant interface or abstract class, so that it will work with
        4.any classes that implement that interface or that extends that abstract class.


        Usage of Factory Design Pattern:-
       1. When a class doesn't know what sub-classes will be required to create
       2. When a class wants that its sub-classes specify the objects to be created.
       3.When the parent classes choose the creation of objects to its sub-classes.


*/


public class GenerateBill {
    public static void main(String args[]) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);

        System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}
