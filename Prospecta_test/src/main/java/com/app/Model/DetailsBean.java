package com.app.Model;

import java.util.List;

public class DetailsBean {
	 
	int count;
	List<EntryBean> entries;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<EntryBean> getEntries() {
		return entries;
	}
	public void setEntries(List<EntryBean> entries) {
		this.entries = entries;
	}
	@Override
	public String toString() {
		return "DetailsBean [count=" + count + ", entries=" + entries + "]";
	}
	
	
	
}
