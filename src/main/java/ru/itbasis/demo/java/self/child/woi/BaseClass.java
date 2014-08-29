package ru.itbasis.demo.java.self.child.woi;

public abstract class BaseClass<T extends BaseClass> {
    private int baseParam;

    public int getBaseParam() {
        return baseParam;
    }

    public T setBaseParam(int baseParam) {
        this.baseParam = baseParam;
        return (T) this;
    }
}
