/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood.it;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

/**
 *
 * @author Austin Andrews
 */
public class ColorSelectorCell extends Cell
{
    JPanel newCell = new JPanel();
    private ICellSelectorEventListener cellEventListener;
        
    public ColorSelectorCell(int colorNumber, ICellSelectorEventListener parent)
    {
        super(colorNumber);
        
        if(colorNumber == 0)
            newCell.setBackground(Color.ORANGE);
        else if(colorNumber == 1)
            newCell.setBackground(Color.BLUE);
        else if(colorNumber == 2)
            newCell.setBackground(Color.PINK);
        else if(colorNumber == 3)
            newCell.setBackground(Color.GREEN);
        else if(colorNumber == 4)
            newCell.setBackground(Color.RED);
        else if(colorNumber == 5)
            newCell.setBackground(Color.WHITE);
        
        newCell.setOpaque(true);
        newCell.setPreferredSize(new Dimension(25, 25));
        //newCell.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setLayout(new GridLayout(1,1));
        add(newCell);
        
        
        // Event Listener
        cellEventListener = parent;
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                buttonClicked(e);
            }
        });       
    }
    
    private void buttonClicked(MouseEvent e)
    {
        //System.out.print(e.toString());
        
        // get top left cell (and any cells of the same color next to it)
        
        
        
        // change the color to the selected color
        
        // count moves
        
        cellEventListener.SelectorClicked(this);
    }
}
