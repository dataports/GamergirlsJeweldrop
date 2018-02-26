

import java.awt.EventQueue;
import javax.swing.JFrame;


public class GamergirlsJeweldrop extends JFrame{
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
		  EventQueue.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	            	GamergirlsJeweldrop ex = new GamergirlsJeweldrop();
	            ex.setVisible(true);
	            }
	        });

	}

}

