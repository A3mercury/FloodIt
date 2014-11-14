/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood.it;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Austin Andrews
 */
public class FloodIt extends JFrame
{
    private JPanel NewPanel;
    private JPanel ContainerPanel;
    
    private final GameBoard gameBoard = new GameBoard();
    private ColorSelectorMenu colorSelector = new ColorSelectorMenu();
    
    public static int total = 0;
    
    private FloodIt()
    {
        // Window Properties
        super("Flood It - By Austin Andrews");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new Dimension(300, 375));
        setLayout(new BorderLayout());
        
        // Top Panel
        NewPanel = new JPanel();
        NewPanel.setPreferredSize(new Dimension(300, 10));
        NewPanel.setBackground(Color.GRAY);
        add(NewPanel, BorderLayout.NORTH);
        
        // Board Panel
        NewPanel = new JPanel();
        NewPanel.setBackground(Color.GRAY);
        NewPanel.add(gameBoard);
        add(NewPanel, BorderLayout.CENTER);
        
        // Container Panel
        ContainerPanel = new JPanel();
        ContainerPanel.setPreferredSize(new Dimension(300, 75));
        ContainerPanel.setBackground(Color.GRAY);
        
        // ColorSelector Panel
        NewPanel = new JPanel();
        NewPanel.setPreferredSize(new Dimension(200, 50));
        NewPanel.setBackground(Color.GRAY);
        NewPanel.add(colorSelector);
        ContainerPanel.add(NewPanel, BorderLayout.WEST);
        
        // Move Total panel
        JLabel totalLabel = new JLabel("Total");

        NewPanel = new JPanel();
        NewPanel.setPreferredSize(new Dimension(50, 50));
        NewPanel.setBackground(Color.GRAY);
        NewPanel.add(totalLabel);

        ContainerPanel.add(NewPanel, BorderLayout.EAST);
                
        add(ContainerPanel, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        FloodIt floodIt = new FloodIt();
        
    }
    
}
