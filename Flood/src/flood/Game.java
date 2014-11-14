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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Austin
 */
public class Game extends JPanel
{
    GameBoard Board = new GameBoard();
    SelectorMenu Menu;
    
    JPanel MainPanel;
    JPanel BoardPanel;
    JPanel ColorSelectorPanel;
    JPanel TotalPanel;
    JPanel ButtonsPanel;
    
    JLabel totalLabel;
    TotalMoves total = new TotalMoves();
    
    JButton NewGameButton = new JButton("New Game");
    JButton HighScoreButton = new JButton("High Scores");
    
    CreateNewGame NewGame;
    
    public Game()
    {
        // Total Panel
        TotalPanel = new JPanel();
        TotalPanel.setPreferredSize(new Dimension(100, 100));
        totalLabel = new JLabel("Total Moves:");
        totalLabel.setFont(new Font("San-Serif", Font.BOLD, 14));
        TotalPanel.add(totalLabel);
        totalLabel = new JLabel();
        totalLabel.setFont(new Font("San-Serif", Font.BOLD, 20));
        totalLabel.setText(total.total + "");
        TotalPanel.add(totalLabel);

        // Board Panel
        BoardPanel = new JPanel();
        BoardPanel.setPreferredSize(new Dimension(500, 425));
        Board.setPreferredSize(new Dimension(400, 400));
        BoardPanel.add(Board);
        
        // Color Selector Panel
        ColorSelectorPanel = new JPanel();
        ColorSelectorPanel.setPreferredSize(new Dimension(300, 100));
        Menu = new SelectorMenu(Board, Board.BoardCells, total, totalLabel);
        Menu.setPreferredSize(new Dimension(300,100));
        ColorSelectorPanel.add(Menu);
        
        // Buttons Panel
        ButtonsPanel = new JPanel();
        ButtonsPanel.setPreferredSize(new Dimension(300, 150));
        NewGame = new CreateNewGame(Board);
        ButtonsPanel.add(NewGame, BorderLayout.LINE_START);
        ButtonsPanel.add(HighScoreButton, BorderLayout.LINE_END);
        
        // Game Panel   
        add(BoardPanel, BorderLayout.PAGE_START);
        add(ColorSelectorPanel, BorderLayout.LINE_START);
        add(TotalPanel, BorderLayout.LINE_END);
        add(ButtonsPanel, BorderLayout.PAGE_END);
    }
}
