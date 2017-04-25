package com.org.dius.iteration.to;

import java.util.ArrayList;
import java.util.List;

public class Iteration {
	private List<Cards> card=new ArrayList<>();
	private List<Columns> columnList=new ArrayList<>();

	public List<Columns> getColumnList() {
		return columnList;
	}

	public void setColumnList(List<Columns> columnList) {
		this.columnList = columnList;
	}

	public List<Cards> getCard() {
		return card;
	}

	public void setCard(List<Cards> card) {
		this.card = card;
	}

}
