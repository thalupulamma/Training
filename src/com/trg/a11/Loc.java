package com.trg.a11;


 import java.util.List;
public class Loc {

	  private Integer locId;
	  private String locName;
	  private List<Loc> locList;
	  
	public Integer getLocId() {
		return locId;
	}
	public void setLocId(Integer locId) {
		this.locId = locId;
	}
	public String getLocName() {
		return locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}
	public List<Loc> getLocList() {
		return locList;
	}
	public void setLocList(List<Loc> locList) {
		this.locList = locList;
	}
	  
	 
}
