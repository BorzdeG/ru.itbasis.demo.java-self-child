package ru.itbasis.demo.java.self.child;

public class ChildClass extends BaseClass<ChildClass>  {
    private int childParam;

    public int getChildParam() {
        return childParam;
    }

    public ChildClass setChildParam(int i) {
        this.childParam = i;
        return this;
    }
}
