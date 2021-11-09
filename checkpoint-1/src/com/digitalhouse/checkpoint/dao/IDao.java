package com.digitalhouse.checkpoint.dao;

public interface IDao <T>{

    public T insert (T t);
    public void selectAll();
}
