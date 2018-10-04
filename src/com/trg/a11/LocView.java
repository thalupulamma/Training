package com.trg.a11;

import java.util.List;

public class LocView {

	private Loc loc;
	List<Dept> deptList;
	List<LocView> locViewList;
	public Loc getLoc() {
		return loc;
	}
	public void setLoc(Loc loc) {
		this.loc = loc;
	}
	public List<Dept> getDeptList() {
		return deptList;
	}
	public void setDeptList(List<Dept> deptList) {
		this.deptList = deptList;
	}
	public List<LocView> getLocViewList() {
		return locViewList;
	}
	public void setLocViewList(List<LocView> locViewList) {
		this.locViewList = locViewList;
	}
	
	
}
