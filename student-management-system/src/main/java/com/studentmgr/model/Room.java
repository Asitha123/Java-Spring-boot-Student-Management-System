package com.studentmgr.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.studentmgr.common.model.EntityBase;

@Document(collection = "Room")
public class Room extends EntityBase{

}
