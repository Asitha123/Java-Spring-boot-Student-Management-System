package com.studentmgr.common.service;

import java.util.List;

import com.studentmgr.common.exception.DataAccessException;
import com.studentmgr.common.exception.ServiceException;

public interface GenericService<T>{

	T getById(Object id) throws ServiceException;

	T add(T obj) throws ServiceException;

	T edit(T obj) throws ServiceException;

	boolean delete(T object) throws ServiceException;

	List<T> getAll() throws ServiceException;
    
    ServiceException translateException(DataAccessException de);
    
}
