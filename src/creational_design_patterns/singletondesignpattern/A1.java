package creational_design_patterns.singletondesignpattern;

class A1{
    private static A1 obj=new A1();//Early, instance will be created at load time
    private A1(){}

    public static A1 getA(){
        return obj;
    }
}
