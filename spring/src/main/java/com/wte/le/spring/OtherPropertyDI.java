package com.wte.le.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.core.convert.Property;

public class OtherPropertyDI {
	
	private Property properties;
	private Map<String,String> map;
	private List<String> list;
	private Set<String> set;
	public Property getProperties() {
		return properties;
	}
	public void setProperties(Property properties) {
		this.properties = properties;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
}
