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
    
    //public GameBoard Board = new GameBoard();
    //SelectorMenu menu = new SelectorMenu();
    
    private Game game = new Game();
    
    JLabel totalLabel;
    int total = 0;
    
    private Flood()
    {
        super("Flood It - Austin Andrews");    
        
        // Main Window Properties
        setSize(new Dimension(500, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        add(game);
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
