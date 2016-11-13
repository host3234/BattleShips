package com.battleships.game;


import java.util.ArrayList;
import java.util.Arrays;


public class Game {

    private int pointsLeft;
    private int pointsRight;

    private ArrayList<Ship> boardLeft;
    private ArrayList<Ship> boardRight;

    public Game(){
        pointsLeft  = 0;
        pointsRight = 0;

        boardLeft  = new ArrayList<>();
        boardRight = new ArrayList<>();
    }

    /**
	 * board - If boardLeft -0 else boardRight -1
     * direction - 0 left, 1 up, 2 right, 3 down
     */
    public Boolean setNewShipInGame(Boolean board,Integer length,Integer row,Integer col,Integer direction){
        Ship ship = new Ship();
        ship.setShip(board, length, row, col, direction);

        if(board){
            for(Ship s: boardLeft){
                if(s.isCollision(ship)){
                    return false;
                }
            }
            boardLeft.add(ship);
        } else {
            for(Ship s: boardRight){
                if(s.isCollision(ship)){
                    return false;
                }
            }
            boardRight.add(ship);
        }
        return true;
    }

    
    
    /**
	 * board - If boardLeft -0 else boardRight -1
     * direction - 0 left, 1 up, 2 right, 3 down
     */
    
    public Boolean makeTurn(Boolean board, Integer row, Integer col){
        if(board){
            for(Ship ship : boardRight){
                if(ship.isHit(row, col)){
                    pointsLeft++;
                    return true;
                }
            }
        } else {
            for(Ship ship : boardLeft){
                if(ship.isHit(row, col)){
                    pointsRight++;
                    return true;
                }
            }
        }
        return false;
    }

    /**
	 * board - If boardLeft -0 else boardRight -1
     * direction - 0 left, 1 up, 2 right, 3 down
     */
    
    public Boolean isGameOver(Boolean board){
        if(board){
            for(Ship ship : boardRight){
                if(!ship.isSank()){
                    return false;
                }
            }
        } else {
            for(Ship ship : boardLeft){
                if(!ship.isSank()){
                    return false;
                }
            }
        }
        return true;
    }

    public int getPointsLeft() {
        return pointsLeft;
    }

    public int getPointsRight() {
        return pointsRight;
    }
}