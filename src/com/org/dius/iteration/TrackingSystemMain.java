package com.org.dius.iteration;

import com.org.dius.iteration.service.IterationService;
import com.org.dius.iteration.to.Board;
import com.org.dius.iteration.to.Cards;
import com.org.dius.iteration.to.Columns;
import com.org.dius.iteration.to.Iteration;


public class TrackingSystemMain {
	public static void main(String [] args){
		Cards card1=new Cards("myTitle1","myDescription1",3);
		Cards card2=new Cards("myTitle2","myDescription2",15);
		Cards card3=new Cards("myTitle3","myDescription3",5);
		Cards card4=new Cards("myTitle4","myDescription4",8);
		Columns column1=new Columns("starting","starting","String",5);
		Columns column2=new Columns("inProgress","inProgress","String",4);
		Columns column3=new Columns("done","done","String",20);
		Board board=new Board();
		Iteration iteration= new Iteration();
		iteration.getColumnList().add(column1);
		iteration.getColumnList().add(column2);
		iteration.getColumnList().add(column3);
		IterationService iterationService = new IterationService();
		iterationService.add(iteration, card1);
		iterationService.add(iteration, card2);
		iterationService.add(iteration, card3);
		iterationService.add(iteration, card4);
		moveCard(iterationService,iteration,card1, column1);
		moveCard(iterationService,iteration,card3, column1);
		moveCard(iterationService,iteration,card3, column2);
		board.setIteration(iteration);
		System.out.println(iterationService.velocity(iteration));
	}
	
	private static void moveCard(IterationService iterationService,Iteration iteration,Cards card, Columns column){
		try{
			iterationService.moveCard(iteration,card, column);
		} catch(Exception e){
			System.out.println("Fail to move the card."+e.getMessage());
		}
	}
}
