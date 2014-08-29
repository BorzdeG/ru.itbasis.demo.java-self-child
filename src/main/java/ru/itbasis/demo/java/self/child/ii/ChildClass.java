package ru.itbasis.demo.java.self.child.ii;

public class ChildClass extends BaseClass<ChildClass> {
    private int childParam;
    private int anotherChildParam;

    public int getChildParam() {
        return childParam;
    }

    public ChildClass setChildParam(int i) {
        this.childParam = i;
        return this;
    }

    public int getAnotherChildParam() {
        return anotherChildParam;
    }

    public ChildClass setAnotherChildParam(int i) {
        this.anotherChildParam = i;
        return this;
    }
}
