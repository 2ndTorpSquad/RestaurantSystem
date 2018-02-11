package restaurantOrderingSystem.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class UserOperationPanel extends JFrame 
{
	private JButton ButtonDelivery;
	private JButton ButtonPickup;
	private JButton ButtonToGo;
	private JButton ButtonEatIn;
	private JButton ButtonRecord;
	private JButton ButtonPlaceHolder1;
	private JButton ButtonMenu;
	private JButton ButtonInfo;
	private JButton ButtonReport;
	private JButton ButtonPlaceHolder3;
	private JButton ButtonPlaceHolder4;
	private JButton ButtonSetting;

	/**
	 * Create the frame.
	 */
	public UserOperationPanel() 
	{
		setAlwaysOnTop(true);
		initComponents();
		createEvents();

	}
	
	////////////////////////////////////////////////////////////////////////////
	// This method is for creating and initializing component.
	////////////////////////////////////////////////////////////////////////////
	private void initComponents() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		setBounds(100 , 100 , 1200 , 720);
		
		//First Row
		ButtonDelivery = new JButton("Delivery");
		ButtonDelivery.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		ButtonPickup = new JButton("Pickup");
		ButtonPickup.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		ButtonToGo = new JButton("To Go");
		ButtonToGo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		ButtonEatIn = new JButton("Eat In");
		ButtonEatIn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		//First Row End
		
		//Second Row
		ButtonRecord = new JButton("Record");
		ButtonRecord.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		ButtonPlaceHolder1 = new JButton("");
		ButtonPlaceHolder1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		

		ButtonMenu = new JButton("Menu");
		ButtonMenu.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		ButtonInfo = new JButton("Info");
		ButtonInfo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		//Second Row End
		
		//Third Row
		ButtonReport = new JButton("Report");
		ButtonReport.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		ButtonPlaceHolder3 = new JButton("");
		ButtonPlaceHolder3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		ButtonPlaceHolder4 = new JButton("");
		ButtonPlaceHolder4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		ButtonSetting = new JButton("Setting");
		ButtonSetting.setFont(new Font("Tahoma", Font.PLAIN, 30));
		//Third Row End
		
		//Auto Resize
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(ButtonDelivery, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
							.addGap(16)
							.addComponent(ButtonPickup, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
							.addGap(16)
							.addComponent(ButtonToGo, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
							.addGap(16)
							.addComponent(ButtonEatIn, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(ButtonRecord, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
							.addGap(16)
							.addComponent(ButtonPlaceHolder1, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
							.addGap(16)
							.addComponent(ButtonMenu, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
							.addGap(16)
							.addComponent(ButtonInfo, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(ButtonReport, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
							.addGap(16)
							.addComponent(ButtonPlaceHolder3, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
							.addGap(16)
							.addComponent(ButtonPlaceHolder4, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
							.addGap(16)
							.addComponent(ButtonSetting, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
					.addGap(10))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(ButtonDelivery, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
						.addComponent(ButtonPickup, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(ButtonToGo, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(ButtonEatIn, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(ButtonRecord, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(ButtonPlaceHolder1, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(ButtonMenu, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(ButtonInfo, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(ButtonReport, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(ButtonPlaceHolder3, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(ButtonPlaceHolder4, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(ButtonSetting, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
					.addGap(31))
		);
		getContentPane().setLayout(groupLayout);
		//Auto Resize End
	}

	
	////////////////////////////////////////////////////////////////////////////
	// This method is for creating events.
	////////////////////////////////////////////////////////////////////////////
	private void createEvents() 
	{
		//First Row
		ButtonDelivery.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				OrderPanel delivery = new OrderPanel();
				delivery.setVisible(true);
				setVisible(false);
			}
		});
		
		ButtonPickup.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				OrderPanel pickup = new OrderPanel();
				pickup.setVisible(true);
				setVisible(false);
			}
		});		

		ButtonToGo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				OrderPanel togo = new OrderPanel();
				togo.setVisible(true);
				setVisible(false);
			}
		});		

		ButtonEatIn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				OrderPanel eatin = new OrderPanel();
				eatin.setVisible(true);
				setVisible(false);
		    }
	    });		
		//FirstRow

		//Second Row
		ButtonRecord.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			}
		});
		
		ButtonMenu.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
			}
		});

		ButtonInfo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
			}
		});
		//Second Row
		
		//Third Row
		ButtonReport.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			}
		});
		
		ButtonSetting.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			}
		});
		//Third Row
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		try 
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					UserOperationPanel frame = new UserOperationPanel();
					frame.setVisible(true);
				} 
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	
}
