package com.studentmgr.common.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.studentmgr.common.dao.SequenceDao;
import com.studentmgr.common.exception.DataAccessException;
import com.studentmgr.common.model.Sequence;

@Repository
public class SequenceDaoImpl extends GenericDaoImpl<Sequence>implements SequenceDao {

	private static final Logger logger = LoggerFactory.getLogger(SequenceDaoImpl.class);

	public SequenceDaoImpl() {
		super(Sequence.class);
	}

	@Override
	public Integer getNextSequenceId(String key) throws DataAccessException {
		return getNextSequenceId(key, 1);
	}

	@Override
	public Integer getNextSequenceId(String key, Integer start) throws DataAccessException {
		
		if (logger.isDebugEnabled())
			logger.debug("getNextSequenceId {}", key);

		try {
			// get sequence id
			Query query = new Query(Criteria.where("id").is(key));

			// increase sequence id by 1
			Update update = new Update();
			update.inc("seq", 1);

			// return new increased id
			FindAndModifyOptions options = new FindAndModifyOptions();
			options.returnNew(true);

			// this is the magic happened.
			Sequence seqId = mongoOperations.findAndModify(query, update, options, Sequence.class);

			// if no id, throws SequenceException
			// optional, just a way to tell user when the sequence id is failed
			// to
			// generate.
			if (seqId == null) {
				seqId = new Sequence();
				seqId.setId(key);
				seqId.setSeq(start);
				mongoOperations.insert(seqId);
				return start;
			} else {
				return seqId.getSeq();
			}

		} catch (Exception e) {
			throw new DataAccessException(e);
		}
	}

}
