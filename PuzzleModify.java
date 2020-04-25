import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PuzzleModify extends JFrame implements ActionListener
{
	JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,starB;
	JLabel label2;
	private JButton sub;
	Icon cloud;
	Icon ic0=new ImageIcon("D://23.jpg");	
	Icon ic1=new ImageIcon("D://21.jpg");
	Icon ic2=new ImageIcon("D://25.jpg");
	Icon ic3=new ImageIcon("D://22.jpg");
	Icon ic4=new ImageIcon("D://27.jpg");
	Icon ic5=new ImageIcon("D://24.jpg");
	Icon ic6=new ImageIcon("D://26.jpg");
	Icon ic7=new ImageIcon("D://28.jpg");
	Icon ic8=new ImageIcon("D://29.jpg");
	Icon ic9=new ImageIcon("D://23.jpg");
	
	PuzzleModify()
	{
		button1=new JButton(ic1);
		button1.setBounds(10, 80, 100, 100);
		
		button2=new JButton(ic2);
		button2.setBounds(110, 80, 100, 100);
		
		button3=new JButton(ic3);
		button3.setBounds(210, 80, 100, 100);
		
		button4=new JButton(ic4);
		button4.setBounds(10, 180, 100, 100);
		
		button5=new JButton(ic5);
		button5.setBounds(110, 180, 100, 100);
		
		button6=new JButton(ic6);
		button6.setBounds(210, 180, 100, 100);
		
		button7=new JButton(ic7);
		button7.setBounds(10, 280, 100, 100);
		
		button8=new JButton(ic8);
		button8.setBounds(110, 280, 100, 100);
		
		button9=new JButton(ic9);
		button9.setBounds(210, 280, 100, 100);
		
		label2=new JLabel("NOTE : icon has power to swap with neighbour icon = ");
		label2.setBounds(5, 15, 500, 20);
		
		starB=new JButton(ic0);
		starB.setBounds(330, 5, 50, 50);
		
		cloud=button9.getIcon();
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		add(label2);
		add(starB);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		
		setLayout(null);
		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		sub=new JButton("Submit ");
		sub.setSize(100,20);
		sub.setLocation(270,550);
		sub.addActionListener(this);
		add(sub);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==button1)
		{
			Icon s1=button1.getIcon();
			if(button2.getIcon()==cloud)
			{
				button2.setIcon(s1);
				button1.setIcon(cloud);
			}
			else if(button4.getIcon()==cloud)
			{
				button4.setIcon(s1);
				button1.setIcon(cloud);
			}
		}
		
		if(e.getSource()==button2)
		{
			Icon s1=button2.getIcon();
			if(button1.getIcon()==cloud)
			{
				button1.setIcon(s1);
				button2.setIcon(cloud);
			}
			else if(button5.getIcon()==cloud)
			{
				button5.setIcon(s1);
				button2.setIcon(cloud);
			}
			else if(button3.getIcon()==cloud)
			{
				button3.setIcon(s1);
				button2.setIcon(cloud);
			}
		}
		
		if(e.getSource()==button3)
		{
			Icon s1=button3.getIcon();
			if(button2.getIcon()==cloud)
			{
				button2.setIcon(s1);
				button3.setIcon(cloud);
			}
			else if(button6.getIcon()==cloud)
			{
				button6.setIcon(s1);
				button3.setIcon(cloud);
			}
		}
		
		if(e.getSource()==button4)
		{
			Icon s1=button4.getIcon();
			if(button1.getIcon()==cloud)
			{
				button1.setIcon(s1);
				button4.setIcon(cloud);
			}
			else if(button5.getIcon()==cloud)
			{
				button5.setIcon(s1);
				button4.setIcon(cloud);
			}
			else if(button7.getIcon()==cloud)
			{
				button7.setIcon(s1);
				button4.setIcon(cloud);
			}
		}
		if(e.getSource()==button5)
		{
			Icon s1=button5.getIcon();
			if(button2.getIcon()==cloud)
			{
				button2.setIcon(s1);
				button5.setIcon(cloud);
			}
			else if(button4.getIcon()==cloud)
			{
				button4.setIcon(s1);
				button5.setIcon(cloud);
			}
			else if(button6.getIcon()==cloud)
			{
				button6.setIcon(s1);
				button5.setIcon(cloud);
			}
			else if(button8.getIcon()==cloud)
			{
				button8.setIcon(s1);
				button5.setIcon(cloud);
			}
		}
		
		if(e.getSource()==button6)
		{
			Icon s1=button6.getIcon();
			if(button3.getIcon()==cloud)
			{
				button3.setIcon(s1);
				button6.setIcon(cloud);
			}
			else if(button5.getIcon()==cloud)
			{
				button5.setIcon(s1);
				button6.setIcon(cloud);
			}
			else if(button9.getIcon()==cloud)
			{
				button9.setIcon(s1);
				button6.setIcon(cloud);
			}
		}
		
		if(e.getSource()==button7)
		{
			Icon s1=button7.getIcon();
			if(button4.getIcon()==cloud)
			{
				button4.setIcon(s1);
				button7.setIcon(cloud);
			}
			else if(button8.getIcon()==cloud)
			{
				button8.setIcon(s1);
				button7.setIcon(cloud);
			}
		}
		
		if(e.getSource()==button8)
		{
			Icon s1=button8.getIcon();
			if(button7.getIcon()==cloud)
			{
				button7.setIcon(s1);
				button8.setIcon(cloud);
			}
			else if(button5.getIcon()==cloud)
			{
				button5.setIcon(s1);
				button8.setIcon(cloud);
			}
			else if(button9.getIcon()==cloud)
			{
				button9.setIcon(s1);
				button8.setIcon(cloud);
			}
		}
		
		if(e.getSource()==button9)
		{
			Icon s1=button9.getIcon();
			if(button8.getIcon()==cloud)
			{
				button8.setIcon(s1);
				button9.setIcon(cloud);
			}
			else if(button6.getIcon()==cloud)
			{
				button6.setIcon(s1);
				button9.setIcon(cloud);
			}
		}
		JOptionPane.showMessageDialog(sub, "Submit successfully");
		System.exit(ABORT);
	}
	public static void main(String[] args) {
		new PuzzleModify();
		
	}
}

