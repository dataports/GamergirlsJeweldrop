
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener{

	 private final int DELAY = 10;
	 private Timer timer;
	 private BottomBar bottombar;
	
	public Board() {
		initBoard();
	}
	

    private void initBoard() {

        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.BLACK);

        bottombar = new BottomBar();

        timer = new Timer(DELAY, this);
        timer.start();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(bottombar.getImage(), bottombar.getX(), bottombar.getY(), this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	
        bottombar.move();
        repaint();
    }
    
    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
        	bottombar.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
        	bottombar.keyPressed(e);
        }
    }
}
