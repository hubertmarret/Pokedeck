package ui;

import java.awt.CardLayout;

import javax.swing.*;

public class GraphicUserInterface extends JFrame {

	private static final long serialVersionUID = 25L;
	
	private CardLayout cLayout = new CardLayout();
	private JPanel content = new JPanel();
	private JButton button = new JButton("my button");
	
	public GraphicUserInterface()
	{
		this.setTitle("Pokedeck");
	    this.setSize(300, 150);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    content.add(button);
	    this.setContentPane(content);
	    this.setVisible(true);
	}
	
	
}
