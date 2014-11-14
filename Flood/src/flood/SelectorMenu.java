/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood;

import java.awt.GridLayout;
import java.util.Arrays;
import javax.swing.JPanel;

/**
 *
 * @author Mercury
 */
public class SelectorMenu extends GameBoard implements ISelectorCellEventListener
{
    SelectorCell newSelector;
    GameBoard CopyBoard;
    
    public SelectorMenu(GameBoard Board)
    {
        setLayout(new GridLayout(1,1));
        CopyBoard = Board;
        InitializeMenu();
    }
    
    private void InitializeMenu()
    {
        for(int i = 0; i < 6; i++)
        {
            newSelector = new SelectorCell(this);
            //newSelector.setSize(new Dimension(50,50));
            newSelector.cellNum = i;
            add(newSelector);
        }
    }
    
    @Override
    public void SelectorCellClicked(SelectorCell selectorCell)
    {   
        
    }
}
