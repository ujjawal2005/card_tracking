package com.org.dius.iteration.to;

public class Columns {
	private String columnName;
	private String columnDescription;
	private String columnType;
	private int workInProgressLimit;
	
	public Columns(String columnName,String columnDescription,String columnType,int workInProgressLimit){
		this.columnName=columnName;
		this.columnDescription=columnDescription;
		this.columnType=columnType;
		this.workInProgressLimit=workInProgressLimit;
	}
	
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getColumnDescription() {
		return columnDescription;
	}
	public void setColumnDescription(String columnDescription) {
		this.columnDescription = columnDescription;
	}
	public String getColumnType() {
		return columnType;
	}
	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	public int getWorkInProgressLimit() {
		return workInProgressLimit;
	}

	public void setWorkInProgressLimit(int workInProgressLimit) {
		this.workInProgressLimit = workInProgressLimit;
	}
	
	
}
