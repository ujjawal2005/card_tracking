package com.org.dius.iteration.to;

import java.io.Serializable;

public class Cards implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private String description;
	private int points;
	private Columns previousColumn;
	private Columns currentColumn;
	
	public Cards(String title,String description,int points){
		this.title=title;
		this.description=description;
		this.points=points;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Columns getPreviousColumn() {
		return previousColumn;
	}

	public void setPreviousColumn(Columns previousColumn) {
		this.previousColumn = previousColumn;
	}

	public Columns getCurrentColumn() {
		return currentColumn;
	}

	public void setCurrentColumn(Columns currentColumn) {
		this.currentColumn = currentColumn;
	}
}
