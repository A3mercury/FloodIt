/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author Mercury
 */
public class BoardCell extends JPanel
{
    public int cellNum;
    
    public BoardCell()
    {
        cellNum = -1;
        setLayout(new GridLayout(1,1));
    }
    
    @Override
    public void paint(Graphics g)
    {
        Rectangle2D shape = new Rectangle2D.Float();
        shape.setFrame(0, 0, 40, 40);
        Graphics2D g2 = (Graphics2D) g;

        if(cellNum == 0)
            g2.setPaint(Color.RED);
        else if(cellNum == 1)
            g2.setPaint(Color.BLUE);
        else if(cellNum == 2)
            g2.setPaint(Color.GREEN);
        else if(cellNum == 3)
            g2.setPaint(Color.ORANGE);
        else if(cellNum == 4)
            g2.setPaint(Color.PINK);
        else
            g2.setPaint(Color.BLACK);
        
        g2.fill(shape);
        g2.draw(shape);
    }
}
