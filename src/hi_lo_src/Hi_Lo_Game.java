package hi_lo_src;
import javax.swing.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Hi_Lo_Game extends JFrame{
	//************GUI*****************
	
	private JLabel chatWindow;
	private JLabel scoreLabel;
	private JLabel highScoreLabel;
	private JLabel actualNumberLabel; 
	
	private JButton higherButton;
	private JButton lowerButton;
	
	//*********statics****************
	private static int scoreCount=0;
	private static int highScore=0;
	private static int currentNumber;
	
	public Hi_Lo_Game(){
		super("Higher or Lower than Bear");
		this.setLayout(null);
		this.setBackground(Color.CYAN);
		setChatWindow();
		setScoreLabel();
		setHighScoreLabel();
		setActualNumberLabel();
		setButtons();
		
		
		
	}
	
	public void setChatWindow(){
		chatWindow = new JLabel();
		chatWindow.setText("Higher or Lower than Bear");
		chatWindow.setLocation(70, 90);
		chatWindow.setFont(new Font("Courier", Font.BOLD,14));
		chatWindow.setSize(400,20);
		add(chatWindow);
	}
	
	public void setScoreLabel(){
		scoreLabel = new JLabel("Score: 0");
		scoreLabel.setLocation(200,10);
		scoreLabel.setForeground(Color.BLUE);
		scoreLabel.setFont(new Font(null, Font.BOLD, 20));
		scoreLabel.setSize(200,40);
		add(scoreLabel);
	}
	
	public void setHighScoreLabel(){
		highScoreLabel = new JLabel("HighScore: 0");
		highScoreLabel.setLocation(200,10);
		highScoreLabel.setForeground(Color.MAGENTA);
		highScoreLabel.setFont(new Font(null, Font.BOLD, 16));
		highScoreLabel.setSize(200,85);
		add(highScoreLabel);
	}
	
	public void setActualNumberLabel(){
		
		currentNumber = new Random().nextInt(9) + 1;
		actualNumberLabel = new JLabel(String.valueOf(5));
		actualNumberLabel.setLocation(150,175);
		actualNumberLabel.setForeground(Color.BLACK);
		actualNumberLabel.setFont(new Font(null, Font.BOLD, 60));
		actualNumberLabel.setSize(200,85);
		add(actualNumberLabel);
	}
	
	public void setButtons(){
		higherButton = new JButton("HI");
		higherButton.setBounds(205, 250, 100, 100);
		higherButton.setEnabled(true);
		higherButton.setFont(new Font(null, Font.BOLD, 50));
		higherButton.addActionListener(new ActionListener(){
		
			public void actionPerformed(ActionEvent arg0) {
				int newNumber;
				do{
					newNumber = new Random().nextInt(9) + 1;
				}while(newNumber == 5);
				
				if(newNumber > 5){
					scoreCount++;
					chatWindow.setText("you guessed it right");
					chatWindow.setForeground(Color.GREEN);
				} else {
					if(scoreCount > highScore)
						highScore = scoreCount;
					scoreCount = 0;
					chatWindow.setText("oh...you were wrong. Try again");
					chatWindow.setForeground(Color.RED);
				}
				currentNumber = newNumber;
				scoreLabel.setText("Score: " + String.valueOf(scoreCount));
				highScoreLabel.setText("HighScore: " + String.valueOf(highScore));
				actualNumberLabel.setText(String.valueOf(currentNumber));
				
			
		}});
		add(higherButton);
		
		
		lowerButton = new JButton("Lo");
		lowerButton.setBounds(30, 250, 100, 100);
		lowerButton.setEnabled(true);
		lowerButton.setFont(new Font(null, Font.BOLD, 50));
		lowerButton.addActionListener(new ActionListener(){
		
			public void actionPerformed(ActionEvent arg0) {
				int newNumber;
				do{
					newNumber = new Random().nextInt(9) + 1;
				}while(newNumber == 5);
				
				if(newNumber < 5){
					scoreCount++;
					chatWindow.setText("you guessed it right");
					chatWindow.setForeground(Color.GREEN);
				} else {
					if(scoreCount > highScore)
						highScore = scoreCount;
					scoreCount = 0;
					chatWindow.setText("oh...you were wrong. Try again");
					chatWindow.setForeground(Color.RED);
				}
				currentNumber = newNumber;
				scoreLabel.setText("Score: " + String.valueOf(scoreCount));
				highScoreLabel.setText("HighScore: " + String.valueOf(highScore));
				actualNumberLabel.setText(String.valueOf(currentNumber));
			
		}});
		add(lowerButton);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
