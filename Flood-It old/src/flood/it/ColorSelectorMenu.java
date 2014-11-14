/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood.it;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author Austin Andrews
 */
public class ColorSelectorMenu extends JPanel implements ICellSelectorEventListener
{
    ColorSelectorCell newSelector;
    
    public ColorSelectorMenu()
    {
        setBackground(Color.GRAY);
        for(int i = 0; i < 6; i++)
        {
            newSelector = new ColorSelectorCell(i, this);
            newSelector.setPreferredSize(new Dimension(26, 26));
            add(newSelector);
        }
    }

    @Override
    public void SelectorClicked(ColorSelectorCell cell)
    {
        
    }
}
