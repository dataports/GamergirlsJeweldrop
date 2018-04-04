

import java.awt.EventQueue;
import javax.swing.JFrame;


public class GamergirlsJeweldrop extends JFrame{
	 //constructor  
	public GamergirlsJeweldrop() {

	        initUI();
	    }

	    private void initUI() {

	        add(new Board());

	        setSize(500, 500);
	        setResizable(false);
	        setTitle("GamergirlsJeweldrop");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	    }    
	    
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  EventQueue.invokeLater(new Runnable() { //new thread of the program
	            @Override
	            public void run() { //this is running inside of the thread
	            	GamergirlsJeweldrop ex = new GamergirlsJeweldrop(); //create a new instance of the game board
	            ex.setVisible(true);
	            }
	        });

	}

}

