package com.hnair.iot.dataserver.util;

import java.util.Map;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class ClientUtil {

	public static <T> T get(String apiUrl, String path, Map<String, Object> pathParam, Map<String, Object> queryParam,
			Class<T> c) {
		WebTarget webTarget = ClientBuilder.newBuilder().build().target(apiUrl).path(path);
		if (queryParam != null) {
			for (String key : queryParam.keySet()) {
				webTarget = webTarget.queryParam(key, queryParam.get(key));
			}
		}
		if (!"".equals(path)) {
			for (String key : pathParam.keySet()) {
				webTarget = webTarget.resolveTemplate(key, pathParam.get(key));
			}
		}
		T invoke = webTarget.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).buildGet()
				.invoke(c);
		return invoke;
	}

	public static <T> T post(String apiUrl, String path, Map<String, Object> pathParam, Object obj, Class<T> c) {
		WebTarget webTarget = ClientBuilder.newBuilder().build().target(apiUrl).path(path);
		if (!"".equals(path)) {
			for (String key : pathParam.keySet()) {
				webTarget = webTarget.resolveTemplate(key, pathParam.get(key));
			}
		}
		T invoke = webTarget.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
				.buildPost(Entity.entity(obj, MediaType.APPLICATION_JSON)).invoke(c);
		return invoke;
	}

	public static <T> T put(String apiUrl, String path, Map<String, Object> pathParam, Object obj, Class<T> c) {
		WebTarget webTarget = ClientBuilder.newBuilder().build().target(apiUrl).path(path);
		if (!"".equals(path)) {
			for (String key : pathParam.keySet()) {
				webTarget = webTarget.resolveTemplate(key, pathParam.get(key));
			}
		}
		T invoke = webTarget.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
				.buildPut(Entity.entity(obj, MediaType.APPLICATION_JSON)).invoke(c);
		return invoke;
	}

	public static <T> T delete(String apiUrl, String path, Map<String, Object> pathParam, Class<T> c) {
		WebTarget webTarget = ClientBuilder.newBuilder().build().target(apiUrl).path(path);
		if (!"".equals(path)) {
			for (String key : pathParam.keySet()) {
				webTarget = webTarget.resolveTemplate(key, pathParam.get(key));
			}
		}
		T invoke = webTarget.request().delete(c);
		return invoke;
	}
}
