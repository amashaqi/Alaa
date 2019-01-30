
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
class a extends JPanel{
	int ha ;
	boolean ggg=false;
	private JButton a;
    JButton JB ;
    JButton JB1 ;
    JButton JB2 ;
    JButton JB3 ;
    boolean z=false;
    boolean z1=false;
	Object k = new Object();
	th1 alaa;
	th2 alaa1;
	th2 alaa2;
	//شسمنسشيشسب
	int x ;
	boolean t = false;
	int y;
	//alaa
	//acxzcvasv
	int x1;
	int y1;
	Rectangle Z ;
	public a() {
		alaa =  new  th1();
		alaa1 =  new  th2();	
		alaa2 = new th2();
		 x= 10;
		 y = 200;
		x1=10;
		y1= 400;
		JB= new JButton("Start");
				JB1= new JButton("wait");
				JB2= new JButton("continue");
				add(JB,BorderLayout.NORTH);
				JB.addActionListener(new ActionListener() {				
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(e.getSource()==JB) {
	JOptionPane.showMessageDialog(null,"Raeady");
	JOptionPane.showMessageDialog(null,"Steady");
	JOptionPane.showMessageDialog(null,"GO");
							alaa.start();
						alaa1.start();
						}
					}
				});
				add(JB1,BorderLayout.NORTH);
				JB1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(e.getSource()==JB1) {
							try {
								z=true;
							} catch (Exception e2) {
								// TODO: handle exception
							}						
						}
					}
					});
				add(JB2,BorderLayout.NORTH);
				JB2.addActionListener(new ActionListener() {		
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(e.getSource()==JB2) {			
						try {
							z=false;
							z1=true;
						
						} catch (Exception e2) {
							// TODO: handle exception 
	
						}
						
						}
						
					}
				});
		 
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	
		ha =getWidth()/2;
			Color z = new Color((int)(Math.random()*250),(int)(Math.random()*250),(int)(Math.random()*250));
			g.setColor(Color.RED);
		g.fillRect(x, y, 70, 70);
		g.fillRect(x1, y1, 70, 70);
		g.setColor(Color.WHITE);
		g.drawString("الصيفي", x+20, y+40);
		g.drawString("انا", x1+35, y1+35);
		g.setColor(Color.BLACK);
		g.drawString(" The winar ", 1250,400);
		g.drawLine(1200, 0, 1200, getHeight());
		g.drawLine(1210, 0, 1210, getHeight());		
	}
	
	public class th1 extends Thread{

		@Override
		public void run() {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		
			while(true) {
			try {
				
				
				Thread.sleep(30);
				t= true;
				x+=2;
				if(z) 
					wait();
				 if(z1) 
					notify();	

				repaint();

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
			
		}
	}
	public class th2 extends Thread{
		@Override
		public void run() {
			while(true) {
			try {
				Thread.sleep(20);
				
				t= true;
				x1 +=2;
				if(x1>1200) {
					JOptionPane.showMessageDialog(null,"the winner is you Alaa ");
				System.exit(0);
				}

				if(z) 
					wait();
		
				//if(x>1200)
				//	JOptionPane.showMessageDialog(null,"the winner is you Alaa");
				repaint();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
			
		}
		
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame z = new JFrame();
		a A = new a();
		z.add(A);
		z.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		z.setSize(800,800);
		z.setTitle("hellow its me");
		z.setVisible(true);

	}

}
