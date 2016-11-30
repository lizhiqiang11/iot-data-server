//package com.hnair.iot.dataserver.model;
//
//import java.io.Serializable;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import com.hnair.iot.bee.server.datacollect.model.ProfileInfo;
//import com.hnair.iot.bee.server.model.plugin.datacollect.DataRecordEvent;
//import com.mongodb.DBObject;
//import com.mongodb.util.JSON;
//
//@Document
//public final class MongoDataEventModel implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	private String id;
//	private DBObject header;
//	private DBObject event;
//	private DBObject clientProfile;
//	private DBObject serverProfile;
//
//	public MongoDataEventModel() {
//	}
//
//	public MongoDataEventModel(DataRecordEvent dto, ProfileInfo clientProfile, ProfileInfo serverProfile) {
//		this.id = dto.getId();
//		this.header = (DBObject) JSON.parse(dto.getHeader());
//		this.event = (DBObject) JSON.parse(dto.getEvent());
//		this.clientProfile = (clientProfile != null) ? (DBObject) JSON.parse(clientProfile.getBody()) : null;
//		this.serverProfile = (serverProfile != null) ? (DBObject) JSON.parse(serverProfile.getBody()) : null;
//	}
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public DBObject getEvent() {
//		return event;
//	}
//
//	public void setEvent(DBObject event) {
//		this.event = event;
//	}
//
//	public DBObject getHeader() {
//		return header;
//	}
//
//	public void setHeader(DBObject header) {
//		this.header = header;
//	}
//
//	public DBObject getClientProfile() {
//		return clientProfile;
//	}
//
//	public void setClientProfile(DBObject clientProfile) {
//		this.clientProfile = clientProfile;
//	}
//
//	public DBObject getServerProfile() {
//		return serverProfile;
//	}
//
//	public void setServerProfile(DBObject serverProfile) {
//		this.serverProfile = serverProfile;
//	}
//
//	@Override
//	public String toString() {
//		return "DataEventModel [id=" + id + ", header=" + header + ", event=" + event + ", clientProfile="
//				+ clientProfile + ", serverProfile=" + serverProfile + "]";
//	}
//
//}
