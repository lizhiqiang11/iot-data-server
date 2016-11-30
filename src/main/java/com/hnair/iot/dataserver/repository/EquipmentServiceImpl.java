package com.hnair.iot.dataserver.repository;

import java.util.Map;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.client.MongoCollection;
import com.mongodb.util.JSON;

@Service
public class EquipmentServiceImpl implements EquipmentService {

	private static final Logger LOG = LoggerFactory.getLogger(EquipmentServiceImpl.class);

	@Autowired
	private MongoTemplate mongoTemplate;
	@SuppressWarnings({ "all" })
	private MongoCollection mongoCollection;

	public void createCollection(String collectionName) {
		try {
			if (!mongoTemplate.collectionExists(collectionName)) {
				mongoTemplate.createCollection(collectionName);
			}
		}
		catch (Exception e) {
			LOG.warn("Failed to create collection {} due to", collectionName, e);
		}
	}

	@Override
	public void find(Map<String, Object> map) {

	}

	@Override
	public void removeAll(String collectionName) {
		LOG.debug("Remove all documents from [{}] collection.", collectionName);
		mongoTemplate.dropCollection(collectionName);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void save(String json, String DbName, String CollectionName) {
		Mongo mongo = new Mongo();
		DB db = mongo.getDB(DbName);
		DBCollection collection = db.getCollection(CollectionName);
		DBObject parse = (BasicDBObject) JSON.parse(json);
		collection.insert(parse);
	}

}
