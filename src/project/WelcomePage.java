/**
 * 
 */
package project;

import java.awt.event.*;
import javax.swing.*;

/**
 * @author potluri.priyatham
 *
 */
public class WelcomePage
{
	public WelcomePage()
	{
		JFrame jf = new JFrame("Optimus Prime Motors");
		JLabel jl1,jl2,jl3;
		jl1 = new JLabel("Welcome to our Showroom");
		jl1.setBounds(50, 50, 200, 30);
		jl2 = new JLabel("Choose your dream car");
		jl2.setBounds(50, 100, 300, 30);
		jl3 = new JLabel("Proceed >>");
		jl3.setBounds(50, 150, 300, 30);
		JButton jb = new JButton("NEXT");
		jb.setBounds(100, 200, 100, 30);
		jf.add(jl1);
		jf.add(jl2);
		jf.add(jl3);
		jf.add(jb);
		jf.setSize(500, 500);
		jf.setLayout(null);
		jf.setVisible(true);
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				new SecondPage();
				jf.dispose();
			}
		});
	}
}
