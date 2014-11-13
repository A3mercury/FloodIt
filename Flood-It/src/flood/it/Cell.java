/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood.it;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author Austin Andrews
 */
public class Cell extends JPanel
{
    JPanel newCell = new JPanel();
    
    public Cell(int randomNumber)
    {
        if(randomNumber == 0)
            newCell.setBackground(Color.ORANGE);
        else if(randomNumber == 1)
            newCell.setBackground(Color.BLUE);
        else if(randomNumber == 2)
            newCell.setBackground(Color.PINK);
        else if(randomNumber == 3)
            newCell.setBackground(Color.GREEN);
        else if(randomNumber == 4)
            newCell.setBackground(Color.RED);
        else if(randomNumber == 5)
            newCell.setBackground(Color.WHITE);
        
        newCell.setOpaque(true);
        newCell.setPreferredSize(new Dimension(25, 25));
        //newCell.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setLayout(new GridLayout(1,1));
        add(newCell);
    }
}
