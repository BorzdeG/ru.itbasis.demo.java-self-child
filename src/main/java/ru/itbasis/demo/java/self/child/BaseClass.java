package ru.itbasis.demo.java.self.child;

public abstract class BaseClass implements IChildParam {
    private int baseParam;

    public int getBaseParam() {
        return baseParam;
    }

    public BaseClass setBaseParam(int i) {
        this.baseParam = i;
        return this;
    }
}
