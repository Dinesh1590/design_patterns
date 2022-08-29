package creational_design_patterns.singletondesignpattern;

class A {
    private static A obj;

    private A() {
    }

    public static A getA() {
        if (obj == null) {
            obj = new A();
        }
        return obj;
    }
}