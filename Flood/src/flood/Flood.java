/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mercury
 */
public class Flood extends JFrame
{    
    JPanel MainPanel;
    JPanel BoardPanel;
    JPanel ColorSelectorPanel;
    JPanel TotalPanel;
    
    public GameBoard Board = new GameBoard();
    SelectorMenu menu = new SelectorMenu(Board);
    
    JLabel totalLabel;
    int total = 0;
    
    private Flood()
    {
        super("Flood It - Austin Andrews");    
        
        // Total Panel
        TotalPanel = new JPanel();
        TotalPanel.setPreferredSize(new Dimension(100, 100));
        totalLabel = new JLabel("Total Moves:");
        totalLabel.setFont(new Font("San-Serif", Font.BOLD, 14));
        TotalPanel.add(totalLabel);
        totalLabel = new JLabel();
        totalLabel.setFont(new Font("San-Serif", Font.BOLD, 20));
        totalLabel.setText(total + "");
        TotalPanel.add(totalLabel);
        
        // Color Selector Panel
        ColorSelectorPanel = new JPanel();
        ColorSelectorPanel.setPreferredSize(new Dimension(300, 100));
        menu.setPreferredSize(new Dimension(300,100));
        ColorSelectorPanel.add(menu);
        
        // Board Panel
        BoardPanel = new JPanel();
        BoardPanel.setPreferredSize(new Dimension(500, 425));
        Board.setPreferredSize(new Dimension(400, 400));
        BoardPanel.add(Board);
        
        // Main Panel
        MainPanel = new JPanel();
        MainPanel.setSize(new Dimension(500,550));       
        MainPanel.add(BoardPanel, BorderLayout.PAGE_START);
        MainPanel.add(ColorSelectorPanel, BorderLayout.LINE_START);
        MainPanel.add(TotalPanel, BorderLayout.LINE_END);
        
        // Main Window Properties
        setSize(new Dimension(500, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        add(MainPanel);
        setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Flood flood = new Flood();
    }
    
}
