/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Mercury
 */
public final class GameBoard extends JPanel
{
    private final int ROWS = 10;
    private final int COLS = 10;
    
    Random random;
    private int randomNumber;
    
    public BoardCell[][] BoardCells = new BoardCell[ROWS][COLS];
    BoardCell newCell;
    
    public GameBoard()
    {
        setLayout(new GridLayout(ROWS, COLS));
        InitializeGameBoard();
    }
    
    public void InitializeGameBoard()
    {        
        random = new Random();
        
        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                randomNumber = random.nextInt(6);
                
                newCell = new BoardCell();
                newCell.cellNum = randomNumber;
                BoardCells[row][col] = newCell;
                add(newCell);
            }
        }
    }
}
