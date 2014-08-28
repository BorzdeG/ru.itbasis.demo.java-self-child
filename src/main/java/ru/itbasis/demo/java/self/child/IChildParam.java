package ru.itbasis.demo.java.self.child;

public interface IChildParam {
    int getBaseParam();

    int getChildParam();

    <T> T setBaseParam(int i);

    <T> T setChildParam(int i);
}
