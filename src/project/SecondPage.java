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
public class SecondPage
{
	/**
	 * 
	 */
	JFrame jf2;
	int cost;
	String msg="";
	public SecondPage()
	{
		jf2=new JFrame("Optimus Prime Motors");
		final JLabel jl1= new JLabel();
		jl1.setBounds(150,30,150,50);
		jl1.setText("Select Body Type");
		JButton jb1=new JButton("CHECKOUT");
		jb1.setBounds(180,390,150,20);
		String vehicle_body_shape[]={"HATCHBACK @1,50,000rs","SEDAN @2,00,000rs","SUV @2,25,000rs",
				"OFFROAD SUV @2,75,000rs"};
		String vehicle_body_colour[]={"RED @25,000rs","BLUE @25,000rs","WHITE @30,000rs",
				"GRAY @25,000rs","MIRROR BLACK @35,000rs","MATT BLACK @40,000rs"};
		String vehicle_wheel_material[]={"STEEL @30,000rs","ALLOY @50,000rs",
				"CARBON FIBRE @75,000rs"};
		String vehicle_delivery_type[]={"HOME DELIVERY @2000","SELF PICKUP @0"};
		final JComboBox<String> jcb1=new JComboBox<String>(vehicle_body_shape);
		jcb1.setBounds(160,80,150,20);
		final JLabel jl2=new JLabel();
		jl2.setText("Choose Colour");
		jl2.setBounds(150,110,150,50);
		final JComboBox<String> jcb2=new JComboBox<String>(vehicle_body_colour);
		jcb2.setBounds(160,160,150,20);
		final JLabel jl3=new JLabel();
		jl3.setText("Choose Wheel Material");
		jl3.setBounds(150,190,200,50);
		final JComboBox<String>jcb3=new JComboBox<String>(vehicle_wheel_material);
		jcb3.setBounds(160,240,150,20);
		final JLabel jl4=new JLabel();
		jl4.setText("Choose Delivery mode");
		jl4.setBounds(150,270,200,50);
		final JComboBox<String> jcb4=new JComboBox<String>(vehicle_delivery_type);
		jcb4.setBounds(160,320,150,20);
		JLabel jl5=new JLabel();
		jl5.setBounds(250,130,100,50);
		JLabel jl6=new JLabel();
		jl6.setBounds(250,150,100,50);
		JLabel jl7=new JLabel();
		jl7.setBounds(250,170,100,50);
		JLabel jl8=new JLabel();
		jl8.setBounds(250,190,200,50);
		JLabel jl9=new JLabel();
		jl9.setBounds(250,210,100,50);
		jf2.add(jcb1);
		jf2.add(jcb2);
		jf2.add(jcb3);
		jf2.add(jcb4);
		jf2.add(jl1);
		jf2.add(jl2);
		jf2.add(jl3);
		jf2.add(jl4);
		jf2.add(jl5);
		jf2.add(jl6);
		jf2.add(jl7);
		jf2.add(jl8);
		jf2.add(jl9);
		jf2.add(jb1);
		jf2.setLayout(null);
		jf2.setSize(500,500);
		jf2.setVisible(true);
		jb1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String body_type,body_colour,wheel_material,delivery_type;
				if(jcb1.getItemAt(jcb1.getSelectedIndex()) == "HATCHBACK @1,50,000rs") 
	    		{ 
	    			body_type="Body      - HATCHBACK"; 
	    			cost=cost+150000; 
	    		}	 
	    		else if(jcb1.getItemAt(jcb1.getSelectedIndex()) == "SEDAN @2,00,000rs") 
	    		{ 
	    			body_type="Body      - SEDAN"; 
	    			cost=cost+200000; 
	    		} 
	    		else if(jcb1.getItemAt(jcb1.getSelectedIndex()) == "SUV @2,25,000rs") 
	    		{ 
	    			body_type="Body      - SUV"; 
	    			cost=cost+225000; 
	    		} 
	    		else 
	    		{ 
	    			body_type="Body      - OFFROAD"; 
	    			cost=cost+275000; 
	    		} 
	    		msg+=body_type+"\n";

	    		if(jcb2.getItemAt(jcb2.getSelectedIndex()) == "RED @25,000rs") 
	    		{ 
	    			body_colour="Colour    - RED"; 
	    			cost=cost+25000; 
	    		} 
	    		else if(jcb2.getItemAt(jcb2.getSelectedIndex()) == "BLUE @25,000rs") 
	    		{ 
	    			body_colour="Colour    - BLUE"; 
	    			cost=cost+25000; 
	    		} 
	    		else if(jcb2.getItemAt(jcb2.getSelectedIndex()) == "WHITE @30,000rs") 
	    		{ 
	    			body_colour="Colour    - WHITE"; 
	    			cost=cost+30000; 
	    		} 
	    		else if(jcb2.getItemAt(jcb2.getSelectedIndex()) == "GRAY @25,000rs") 
	    		{ 
	    			body_colour="Colour    - GRAY"; 
	    			cost=cost+25000; 
	    		} 
	    		else if(jcb2.getItemAt(jcb2.getSelectedIndex()) == "MIRROR BLACK @35,000rs") 
	    		{ 
	    			body_colour="Colour    - MIRROR BLACK"; 
	    			cost=cost+35000; 
	    		} 
	    		else  
	    		{ 
	    			body_colour="Colour    - MATT BLACK"; 
	    			cost=cost+40000; 
	    		} 
	    		msg+=body_colour+"\n"; 
	    		if(jcb3.getItemAt(jcb3.getSelectedIndex()) == "STEEL @30,000rs") 
	    		{ 
	    			wheel_material="Wheels   - STEEL"; 
	    			cost=cost+30000; 
	    		} 
	    		else if(jcb3.getItemAt(jcb3.getSelectedIndex()) == "ALLOY @50,000rs") 
	    		{ 
	    			wheel_material="Wheels   - ALLOY"; 
	    			cost=cost+50000;	 
	    		} 
	    		else  
	    		{
	    			wheel_material="Wheels   - CARBON FIBRE"; 
	    			cost=cost+75000; 
	    		} 
	    		msg+=wheel_material+"\n"; 
	    		if(jcb4.getItemAt(jcb4.getSelectedIndex()) == "HOME DELIVERY @2000rs") 
	    		{ 
	    			delivery_type="Delivery - HOME DELIVERY"; 
	    			cost=cost+2000; 
	    		} 
	    		else  
	    		{ 
	    			delivery_type="Delivery - SELF PICKUP"; 
	    			cost=cost+0; 
	    		}
	    		msg+=delivery_type+"\n"; 
	    		msg+="--------------------\n"; 
	    		int total=cost;
	    		String Total="Total      - "+total; 
	    		JOptionPane.showMessageDialog(jf2,msg+"Total: "+cost);  
	    		jl9.setText(Total);
	    		jl5.setText(body_type);
	    		jl6.setText(body_colour);
	    		jl7.setText(wheel_material);
	    		jl8.setText(delivery_type);
				jf2.dispose();
			}
		});
	}
}