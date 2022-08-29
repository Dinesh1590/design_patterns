package creational_design_patterns.singletondesignpattern;

public class Practise {

    public static void main(String[] args) {

        A s = A.getA();
        System.out.println(s.hashCode());
        System.out.println(s.hashCode());
        System.out.println(s.hashCode());
        System.out.println(A.getA().hashCode());
        System.out.println(A1.getA().hashCode());
        System.out.println(A1.getA().hashCode());


    }

}
