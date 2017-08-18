package com.studentmgr.common.service.impl;

import java.util.List;

import com.studentmgr.common.dao.GenericDao;
import com.studentmgr.common.exception.DataAccessException;
import com.studentmgr.common.exception.ServiceException;
import com.studentmgr.common.service.GenericService;

public class GenericServiceImpl<T> implements GenericService<T> {
	
	@SuppressWarnings("unused")
	private Class<? extends T> type;
	protected GenericDao<T> genericDao;
	
	protected void init(Class<? extends T> type, GenericDao<T> dao) {
        this.type = type;
        this.genericDao = dao;
    }
	
	@Override
	public T getById(Object id) throws ServiceException{
		try{
			return genericDao.getById(id);
		}catch(DataAccessException de){
			throw translateException(de);
		}
	}
	
	@Override
	public List<T> getAll() throws ServiceException{
		try{
			return genericDao.getAll();
		}catch(DataAccessException de){
			throw translateException(de);
		}
	}

	@Override
	public T add(T obj) throws ServiceException{
		try{
			genericDao.add(obj);
			return obj;
		}catch(DataAccessException de){
			throw translateException(de);
		}
	}

	@Override
	public T edit(T obj) throws ServiceException{
		try{
			genericDao.modify(obj);
			return obj;
		}catch(DataAccessException de){
			throw translateException(de);
		}
	}

	@Override
	public boolean delete(T object) throws ServiceException{
		try{
			genericDao.delete(object);
			return true;
		}catch(DataAccessException de){
			throw translateException(de);
		}
	}

	@Override
	public ServiceException translateException(DataAccessException de) {
		return new ServiceException(de);
	}

}
