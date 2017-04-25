package com.org.dius.iteration.service;

import com.org.dius.iteration.exception.ExceedProgressLimitException;
import com.org.dius.iteration.to.Cards;
import com.org.dius.iteration.to.Columns;
import com.org.dius.iteration.to.Iteration;

public class IterationService {
	
	/**
	 * To add a card in a iteration 
	 * @param iteration
	 * @param card
	 */
	public void add(Iteration iteration,Cards card) {
		iteration.getCard().add(card);
	}

	/**
	 * To calculate velocity(Total Points)
	 * @param iteration
	 * @return
	 */
	public int velocity(Iteration iteration){
		int result=0;
		result= iteration.getCard().stream()
				.filter(o -> o.getPoints() >= 0)
				.mapToInt(o -> o.getPoints()).sum();
		return result;
	}

	/**
	 * method to move card to a new column
	 * @param card
	 * @param column
	 */
	public void moveCard(Iteration iteration,Cards card, Columns column) throws ExceedProgressLimitException{
		if(column.getWorkInProgressLimit()>card.getPoints()){
		card.setPreviousColumn(card.getCurrentColumn());
		card.setCurrentColumn(column);
		column.setWorkInProgressLimit(column.getWorkInProgressLimit()-card.getPoints());
		} else {
			throw new ExceedProgressLimitException("Cannot move the card "+card.getTitle()+" to the given column " +column.getColumnName() +".Work in progress limit exceeded.");
		}
	}

	/**
	 * method to undo last move
	 * @param card
	 */
	public void undoLastMove(Cards card) {
		card.getCurrentColumn().setWorkInProgressLimit(card.getCurrentColumn().getWorkInProgressLimit()+card.getPoints());
		card.setCurrentColumn(card.getPreviousColumn());
	}
}
