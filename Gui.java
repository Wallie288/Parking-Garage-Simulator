import java.awt.FlowLayout;

import javax.swing.*;





public class Main extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main (String[] args)
	
	{
		
		new Main().setVisible (true);
		
	}

public Main()

{
	
	super("Project Parkeergarage");
	setSize(500,500);
	setResizable(false);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new FlowLayout());
	
	JButton button = new JButton ("1 Stap");
	JButton button2 = new JButton ("1000 Stappen");
	add(button);
	add(button2);
	
	
}


}




