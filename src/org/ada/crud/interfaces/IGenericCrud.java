package org.ada.crud.interfaces;

public interface IGenericCrud<T> {

    void add(T entity);
    void remove(T entity);
    T findById(Integer id);

    void findAll();
}
