/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood.it;

import java.awt.GridLayout;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Austin Andrews
 */
public class GameBoard extends JPanel implements ICellSelectorEventListener
{
    private final int ROWS = 10;
    private final int COLS = 10;
    private int randomNumber;
    private Cell[][] cells = new Cell[ROWS][COLS];
    
    public GameBoard()
    {
        setLayout(new GridLayout(ROWS, COLS));
        InitializeGameBoard();
    }
    
    private void InitializeGameBoard()
    {
        Random random = new Random();
        
        for (int row = 0; row < ROWS; row++)
        {
            for (int col = 0; col < COLS; col++)
            {
                randomNumber = random.nextInt(6);
                
                Cell newCell = new Cell(randomNumber);
                cells[row][col] = newCell;
                add(newCell);
            }
        }
    }
    
    
    
    @Override
    public void SelectorClicked(ColorSelectorCell cell)
    {
        Cell temp = cells[0][0];
        temp.setBackground(cell.getBackground());
            
        System.out.println(cell.getBackground());
 
        
    }
}
