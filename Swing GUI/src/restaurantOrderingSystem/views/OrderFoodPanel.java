package restaurantOrderingSystem.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.CardLayout;

public class OrderFoodPanel extends JFrame 
{

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public OrderFoodPanel() 
	{
		setAlwaysOnTop(true);
		initComponents();
		createEvents();
	}

	private void initComponents() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_111322270386455");
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "name_111326461017813");
		
	}
	
	private void createEvents() 
	{
		// TODO Auto-generated method stub
		
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					OrderFoodPanel frame = new OrderFoodPanel();
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
