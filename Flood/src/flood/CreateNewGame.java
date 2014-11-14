/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood;

import javax.swing.JButton;

/**
 *
 * @author Austin
 */
public class CreateNewGame implements ICreateNewGameEventListener
{
    JButton NewGame;
    GameBoard RefBoard;
    
    public CreateNewGame(GameBoard Board)
    {
        RefBoard = Board;
        NewGame = new JButton("New Game");
    }

    @Override
    public void NewGameButtonClick(JButton NewGameButton) 
    {
        int test = RefBoard.BoardCells[0][0].cellNum;
        
        System.out.println(test);
        RefBoard.InitializeGameBoard();
        System.out.println(test);
    }
}
