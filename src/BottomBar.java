import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;


public class BottomBar {
	 
	//directional variables and image class
	 private int dx;
	 private int x;
	 private int dy;
	 private int y;
	 private Image image;

	 public BottomBar() { 
		 
		 initBottomBar();
	 }
	 
	 private void initBottomBar() {
		 
		 ImageIcon ii = new ImageIcon("bottombar.png");
		 image = ii.getImage();
		 //set initial position
		 x = 40;
		 y = 450;
		 
	 }
	 
	 public void move() {
		 x += dx;
	 }
	 
	 public int getX() {
		 return x;
	 }
	 public int getY() {
		 return y;
	 }
	 
	 public Image getImage() {
		 return image;
	 }
	 
	 public void keyPressed(KeyEvent e) {
		 int key = e.getKeyCode(); //wait for left or right input
		 
		 if (key == KeyEvent.VK_LEFT) {
			 dx = -1;
		 }
		 
		 if (key == KeyEvent.VK_RIGHT) {
			 dx = 1;
		 }
	 }
	 
	 public void keyReleased(KeyEvent e) {
		 int key = e.getKeyCode();
		 
		 if (key == KeyEvent.VK_LEFT) {
			 dx = 0;
		 }
		 
		 if (key == KeyEvent.VK_RIGHT) {
			 dx = 0;
		 }
		 
	 }
}
