package com.studentmgr.common.dao;

import java.util.List;
import org.springframework.data.mongodb.core.MongoOperations;

import com.studentmgr.common.exception.DataAccessException;

public interface GenericDao<T> {
	/**
	 * This method delete given object from the database.
	 *
	 * @param id
	 *            - Object id to load
	 * @throws DataAccessException
	 *             - throws if an error occurs
	 */
	T getById(Object id) throws DataAccessException;

	/**
	 * This method delete given objects from the database.
	 * 
	 * @param id
	 * @return
	 * @throws DataAccessException
	 */
	List<T> getAllById(Object id) throws DataAccessException;

	/**
	 * This method queries all the objects
	 *
	 * @throws DataAccessException
	 *             - throws if an error occurs
	 */
	List<T> getAll() throws DataAccessException;

	/**
	 * This method delete given object from the database.
	 *
	 * @param object
	 *            - instance of Object class
	 * @throws DataAccessException
	 *             - throws if an error occurs
	 */
	void delete(T object) throws DataAccessException;

	/**
	 * This method insert a given object to the database.
	 *
	 * @param object
	 *            - instance of Object class
	 * @throws DataAccessException
	 *             - throws if an error occurs
	 */
	void add(T object) throws DataAccessException;

	/**
	 * This method update given object in the database.
	 *
	 * @param object
	 *            - instance of Object class
	 * @throws DataAccessException
	 *             - throws if an error occurs
	 */
	void modify(T object) throws DataAccessException;

	MongoOperations getMongoOperations();

}
