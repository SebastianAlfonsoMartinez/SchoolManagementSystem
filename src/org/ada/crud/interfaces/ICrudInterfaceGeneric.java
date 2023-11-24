package org.ada.crud.interfaces;

public interface ICrudInterfaceGeneric<T> {

    void add(T entity);
    void edit(T entity);
    void remove(T entity);
}
