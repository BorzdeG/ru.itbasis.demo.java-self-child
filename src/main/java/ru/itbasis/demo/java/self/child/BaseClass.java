package ru.itbasis.demo.java.self.child;

public abstract class BaseClass<T extends BaseClass> implements IChildParam<T> {
    private int baseParam;

    public int getBaseParam() {
        return baseParam;
    }

    public T setBaseParam(int i) {
        this.baseParam = i;
        return (T) this;
    }
}
