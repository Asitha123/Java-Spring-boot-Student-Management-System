package com.studentmgr.common.sse;

public enum ListenerType {
	
	USER,
	ITEM,
	ITEM_TYPES;
	
	public String prepareKey(String id){
		return this.name() + "-" + id;
	}
}
