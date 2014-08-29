package ru.itbasis.demo.java.self.child.ii;

public interface IChildParam<T> {
    int getBaseParam();

    int getChildParam();

    T setBaseParam(int i);

    T setChildParam(int i);
}
