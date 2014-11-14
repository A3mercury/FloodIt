/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood;

import java.awt.GridLayout;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mercury
 */
public class SelectorMenu extends JPanel implements ISelectorCellEventListener
{
    SelectorCell newSelector;
    BoardCell[][] RefCells;
    GameBoard RefBoard;
    TotalMoves addTotal;
    JLabel totalLabelLabel;
    
    public SelectorMenu(GameBoard Board, BoardCell[][] BoardCells, TotalMoves total, JLabel totalLabel)
    {
        setLayout(new GridLayout(1,1));
        InitializeMenu();
        RefCells = BoardCells;
        RefBoard = Board;
        addTotal = total;
        totalLabelLabel = totalLabel;
    }
    
    private void InitializeMenu()
    {
        for(int i = 0; i < 6; i++)
        {
            newSelector = new SelectorCell(this);
            newSelector.cellNum = i;
            add(newSelector);
        }
    }
    
    @Override
    public void SelectorCellClicked(SelectorCell selectorCell)
    {   
        int row = 0; 
        int col = 0;
        int size = 10;
        int colorCellNum = RefCells[row][col].cellNum;
        
        Coordinate newCoordinate = new Coordinate(row, col);
        
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(newCoordinate);
                
        while(!queue.isEmpty())
        {
            newCoordinate = queue.peek();
            row = newCoordinate.x;
            col = newCoordinate.y;
            
            queue.remove();
            RefCells[row][col].cellNum = selectorCell.cellNum;
            
            for(int i = -1; i <= 1; i++)
            {
                for(int j = -1; j <= 1; j++)
                {
                    if(i == -1 && j == 0 || i == 1 && j == 0 || i == 0 && j == -1 || i == 0 && j == 1)
                    {
                        int NewRow = row + i;
                        int NewCol = col + j;
                        if(NewRow >= 0 && NewRow < size && NewCol >= 0 && NewCol < size)
                        {
                            if(RefCells[NewRow][NewCol].cellNum == colorCellNum)
                            {
                                queue.add(new Coordinate(NewRow, NewCol));
                            }
                        }
                    }
                }
            }
        }

        RefBoard.repaint();
        System.out.println("change to color " + selectorCell.cellNum);
        addTotal.total += 1;
        totalLabelLabel.setText(addTotal.total + "");
        
        // Check if game over
        if(GameOver())
        {
            System.out.println("Game Over!");
        }
    }
    
    private boolean GameOver()
    {
        boolean result = true;
        int cellNumToCheck = RefCells[0][0].cellNum;
        for(int row = 0; row < 10; row++)
        {
            for(int col = 0; col < 10; col++)
            {
                if(RefCells[row][col].cellNum != cellNumToCheck)
                    result = false;
            }
        }
        return result;
    }
}
