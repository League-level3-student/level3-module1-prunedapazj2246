package _04_Memory_Match;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameBoard extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    static Card firstSelectedCard = null;
    static Card secondSelectedCard = null;
 //   Card c;
    // 1. Initialize TOTAL_CARDS to 2;
    static int TOTAL_CARDS = 12;
    
    ArrayList<Card> cards;
    
    JPanel panel;
    JLabel timeLabel;
    JButton newGameButton;
    
    Timer updateTimer;
    Timer gameClock;
    
    int seconds;
    
 
    
    public void setup() {
        gameClock = new Timer(1000, this);
        updateTimer = new Timer(750, this);
        
        // Can't play the game if there isn't an even number of cards
        if( TOTAL_CARDS % 2 != 0) {
            System.out.println("ERROR: Odd number of total cards, " + TOTAL_CARDS);
            System.exit(1);
        }
        
        // 2. Initialize the ArrayList of Cards declared above
        cards=new ArrayList<Card>();
        
        // 3. Create TOTAL_CARDS number of objects each with a value of 1.
        //    Also, add action listeners to each Card object and then add each
        //    of the Card objects to the ArrayList of Cards.
        for (int i = 0; i <= TOTAL_CARDS; i++) {
 for (int j = 0; j < 4; j++) {
	if(i==0) {
		if(j==0) {
			Card c=new Card(5);
			c.setFaceUpIcon(Card.cardImagesPath + (5) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==1) {
			Card c=new Card(6);
			c.setFaceUpIcon(Card.cardImagesPath + (6) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==2) {
			Card c=new Card(7);
			c.setFaceUpIcon(Card.cardImagesPath + (7) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==3) {
			Card c=new Card(8);
			c.setFaceUpIcon(Card.cardImagesPath + (8) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}
	}
	else if(i==1) {
		if(j==0) {
			Card c=new Card(1);
			c.setFaceUpIcon(Card.cardImagesPath + (1) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==1) {
			Card c=new Card(2);
			c.setFaceUpIcon(Card.cardImagesPath + (2) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==2) {
			Card c=new Card(3);
			c.setFaceUpIcon(Card.cardImagesPath + (3) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==3) {
			Card c=new Card(4);
			c.setFaceUpIcon(Card.cardImagesPath + (4) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}
	}
	else if(i==2) {
		if(j==0) {
			Card c=new Card(49);
			c.setFaceUpIcon(Card.cardImagesPath + (49) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==1) {
			Card c=new Card(50);
			c.setFaceUpIcon(Card.cardImagesPath + (50) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==2) {
			Card c=new Card(51);
			c.setFaceUpIcon(Card.cardImagesPath + (51) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==3) {
			Card c=new Card(52);
			c.setFaceUpIcon(Card.cardImagesPath + (52) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}
	}
	else if(i==3) {
		if(j==0) {
			Card c=new Card(45);
			c.setFaceUpIcon(Card.cardImagesPath + (45) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==1) {
			Card c=new Card(46);
			c.setFaceUpIcon(Card.cardImagesPath + (46) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==2) {
			Card c=new Card(47);
			c.setFaceUpIcon(Card.cardImagesPath + (47) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==3) {
			Card c=new Card(48);
			c.setFaceUpIcon(Card.cardImagesPath + (48) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}
	}
	else if(i==4) {
		if(j==0) {
			Card c=new Card(41);
			c.setFaceUpIcon(Card.cardImagesPath + (41) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==1) {
			Card c=new Card(42);
			c.setFaceUpIcon(Card.cardImagesPath + (42) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==2) {
			Card c=new Card(43);
			c.setFaceUpIcon(Card.cardImagesPath + (43) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==3) {
			Card c=new Card(44);
			c.setFaceUpIcon(Card.cardImagesPath + (44) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}
	}
	else if(i==5) {
		if(j==0) {
			Card c=new Card(37);
			c.setFaceUpIcon(Card.cardImagesPath + (37) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==1) {
			Card c=new Card(38);
			c.setFaceUpIcon(Card.cardImagesPath + (38) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==2) {
			Card c=new Card(39);
			c.setFaceUpIcon(Card.cardImagesPath + (39) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==3) {
			Card c=new Card(40);
			c.setFaceUpIcon(Card.cardImagesPath + (40) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}
	}
	else if(i==6) {
		if(j==0) {
			Card c=new Card(33);
			c.setFaceUpIcon(Card.cardImagesPath + (33) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==1) {
			Card c=new Card(34);
			c.setFaceUpIcon(Card.cardImagesPath + (34) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==2) {
			Card c=new Card(35);
			c.setFaceUpIcon(Card.cardImagesPath + (35) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==3) {
			Card c=new Card(36);
			c.setFaceUpIcon(Card.cardImagesPath + (36) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}
	}
	else if(i==7) {
		if(j==0) {
			Card c=new Card(29);
			c.setFaceUpIcon(Card.cardImagesPath + (29) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==1) {
			Card c=new Card(30);
			c.setFaceUpIcon(Card.cardImagesPath + (30) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==2) {
			Card c=new Card(31);
			c.setFaceUpIcon(Card.cardImagesPath + (31) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==3) {
			Card c=new Card(32);
			c.setFaceUpIcon(Card.cardImagesPath + (32) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}
	}
	else if(i==8) {
		if(j==0) {
			Card c=new Card(25);
			c.setFaceUpIcon(Card.cardImagesPath + (25) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==1) {
			Card c=new Card(26);
			c.setFaceUpIcon(Card.cardImagesPath + (26) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==2) {
			Card c=new Card(27);
			c.setFaceUpIcon(Card.cardImagesPath + (27) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==3) {
			Card c=new Card(28);
			c.setFaceUpIcon(Card.cardImagesPath + (28) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}
	}
	else if(i==9) {
		if(j==0) {
			Card c=new Card(21);
			c.setFaceUpIcon(Card.cardImagesPath + (21) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==1) {
			Card c=new Card(22);
			c.setFaceUpIcon(Card.cardImagesPath + (22) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==2) {
			Card c=new Card(23);
			c.setFaceUpIcon(Card.cardImagesPath + (23) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==3) {
			Card c=new Card(24);
			c.setFaceUpIcon(Card.cardImagesPath + (24) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}
	}
	else if(i==10) {
		if(j==0) {
			Card c=new Card(17);
			c.setFaceUpIcon(Card.cardImagesPath + (17) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==1) {
			Card c=new Card(18);
			c.setFaceUpIcon(Card.cardImagesPath + (18) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==2) {
			Card c=new Card(19);
			c.setFaceUpIcon(Card.cardImagesPath + (19) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==3) {
			Card c=new Card(20);
			c.setFaceUpIcon(Card.cardImagesPath + (20) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}
	}
	else if(i==11) {
		if(j==0) {
			Card c=new Card(13);
			c.setFaceUpIcon(Card.cardImagesPath + (13) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==1) {
			Card c=new Card(13);
			c.setFaceUpIcon(Card.cardImagesPath + (14) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==2) {
			Card c=new Card(13);
			c.setFaceUpIcon(Card.cardImagesPath + (15) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}if(j==3) {
			Card c=new Card(13);
			c.setFaceUpIcon(Card.cardImagesPath + (16) + ".png");
			c.addActionListener(this);
			  cards.add(c);
		}
	}
	else if(i==12) {
		if(j==0) {
			Card c =new Card(10);
			c.setFaceUpIcon(Card.cardImagesPath + (10) + ".png");
		c.addActionListener(this);
		  cards.add(c);
		}if(j==1) {
			Card c=new Card(11);
			c.setFaceUpIcon(Card.cardImagesPath + (11) + ".png");
			c.addActionListener(this);
			  cards.add(c);
			}if(j==2) {
				Card c= new Card(12);
				 c.setFaceUpIcon(Card.cardImagesPath + (12) + ".png");
				c.addActionListener(this);
				  cards.add(c);
				  }if(j==3) {
						Card c=new Card(9);
						c.setFaceUpIcon(Card.cardImagesPath + (9) + ".png");
						c.addActionListener(this);
						  cards.add(c);
					}
	}
	
}
 
		}
        
        // 4. Use Collections.shuffle() method to randomize the order of
        //    the cards in the ArrayList
        Collections.shuffle(cards);
        
        // 5. Initialize the panel variable declared above
        panel=new JPanel();
        
        // 6. Add all of the Card objects to the panel
        for (int i = 0; i < cards.size(); i++) {
			panel.add(cards.get(i));
		}
        
        // 7. Call the setupGui() method to set up the frame
        setupGui(cards);
        
        // 8. Call the startGame() method to start the game
        startGame();
    }

    // 9. Fill in the drawCards method to draw all the cards in the ArrayList.
    //    Run your code and verify 2 cards are displayed and the game works.
    public void drawCards() {
       for (int i = 0; i < cards.size(); i++) {
		cards.get(i).draw();
	} 
    }
    
    // 10. 
    // There are 52 cards in a normal sized deck of cards (not counting
    // jokers). There are 4 card suits, each with the numbers 2 to 10 and
    // the Jack, Queen, King, and Ace for a total of 13.
    // 
    // Go back and modify the code to have a total of 52 cards and 4 copies
    // of each card, meaning x4 2s, x4 3s, x4 Jacks, ... one of each suit.
    // You can use Jacks=11, Queens=12, Kings=12, Aces=13
    // 
    // EXTRA: You can use real card faces images instead of numbers by using
    // the images in the CardImages folder and the setFaceUpIcon() method.
    // Example:
    // card.setFaceUpIcon(Card.cardImagesPath + (i+1) + ".png");
    
    
    public void setupGui(ArrayList<Card> cards) {
        setTitle("League Memory Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setPreferredSize(new Dimension(1090, 500));
        add(panel);
        
        newGameButton = new JButton("New Game");
        newGameButton.addActionListener(this);
        timeLabel = new JLabel("current time: " + (seconds / 60) + ":" + (seconds % 60));
        
        panel.add(newGameButton);
        panel.add(timeLabel);
        
        pack();
    }
    
    public void checkCards() {
        
        if( firstSelectedCard != null && secondSelectedCard != null ) {
            
            if( firstSelectedCard.isSame(secondSelectedCard) ) {
                firstSelectedCard.remove();
                secondSelectedCard.remove();
            } else {
                firstSelectedCard.setFaceUp(false);
                secondSelectedCard.setFaceUp(false);
            }
            
            firstSelectedCard = null;
            secondSelectedCard = null;
        }
    }
    
    public void startGame() {
        this.seconds = 0;
        gameClock.start();
        updateTimer.start();
    }
    
    public void endGame(boolean gameWon) {
        gameClock.stop();
        updateTimer.stop();
        
        if(gameWon) {
            // Matched all the cards
            
            int response = JOptionPane.showConfirmDialog(null, "You win !! "
                    + "\nPlaying time " + (seconds / 60) + ":" + (seconds % 60)
                    + "\nAgain ?", "You win",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                getContentPane().removeAll();
                this.setup();
                this.startGame();
            } else if (response == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
        } else {
            // New game button pressed
            
            getContentPane().removeAll();
            this.setup();
            this.startGame();
        }
    }
    
    private boolean allCardsMatched() {
        if(this.cards == null) {
           return false; 
        }
        
        for(Card eachCard : cards ) {
            if( !eachCard.isMatched() ) {
                return false;
            }
        }
        
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if( e.getSource() == this.updateTimer ) {
            checkCards();
            drawCards();
            
            if( allCardsMatched() ) {
                endGame(true);
            }
            
        } else if( e.getSource() == this.gameClock ) {
            this.seconds++;
            timeLabel.setText("current time: " + (seconds / 60) + ":" + (seconds % 60));
        } else if( e.getSource() == this.newGameButton ){
            endGame(false);
        } else {
            // Card selected
            
            Card newCard = (Card)e.getSource();
            
            if( firstSelectedCard == null ) {
                // First of 2 cards selected
                
                firstSelectedCard = newCard;
                firstSelectedCard.setFaceUp(true);
                drawCards();
                updateTimer.stop();
            } else if( secondSelectedCard == null && newCard != firstSelectedCard ) {
                // Second of 2 cards selected
                
                secondSelectedCard = newCard;
                secondSelectedCard.setFaceUp(true);
                drawCards();
                updateTimer.restart();
            }
        }
        
    }
}
