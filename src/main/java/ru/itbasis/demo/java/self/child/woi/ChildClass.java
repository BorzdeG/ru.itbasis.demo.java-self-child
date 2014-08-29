package ru.itbasis.demo.java.self.child.woi;

public class ChildClass extends BaseClass<ChildClass> {
    private int childParam;

    public int getChildParam() {
        return childParam;
    }

    public ChildClass setChildParam(int childParam) {
        this.childParam = childParam;
        return this;
    }
}
