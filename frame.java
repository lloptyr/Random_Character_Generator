package randCharGen;


import javax.swing.*;



public class frame extends JFrame
	{
		public frame()
			{
				setTitle("Character Generator");
				setSize(1000, 1000);
				setResizable(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				background bg = new background();
				add(bg); 
		}
	}
