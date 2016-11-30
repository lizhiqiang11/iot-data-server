package com.hnair.iot.dataserver.repository;

import java.util.Map;



public interface EquipmentService {

	void createCollection(String collectionName);
	
	void save (String json,String DbName,String CollectionName);
	
	void find(Map<String,Object> map);
	
	void removeAll(String collectionName);

}
