package com.aop;

public interface IMyBean<T> {
    public void setDataObject(T object);
    public T getDataObject();
    public void addData(Object object);
    public String toString();
}
