package com.studentmgr.common.dao;

import com.studentmgr.common.exception.DataAccessException;
import com.studentmgr.common.model.Sequence;

public interface SequenceDao  extends GenericDao<Sequence>{

	Integer getNextSequenceId(String key) throws DataAccessException;
	Integer getNextSequenceId(String key, Integer start) throws DataAccessException;
	
}
