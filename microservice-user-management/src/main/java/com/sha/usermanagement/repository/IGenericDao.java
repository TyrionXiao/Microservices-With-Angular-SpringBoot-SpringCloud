package com.sha.usermanagement.repository;

import com.sha.usermanagement.model.IModel;
import org.hibernate.Session;

import java.util.List;

public interface IGenericDao<T extends IModel> {

    T find(final Long id);
    List<T> findAll();
    void save(final T entity);
    T update(final T entity);
    void delete(final Long id);
    T findReference(final Long id);
    Session getSession();
}
