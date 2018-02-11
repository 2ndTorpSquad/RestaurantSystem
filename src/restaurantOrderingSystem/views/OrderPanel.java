package restaurantOrderingSystem.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import java.awt.Component;
import javax.swing.JTextArea;
import java.awt.CardLayout;
import java.awt.List;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import javax.swing.BoxLayout;
import javax.swing.AbstractListModel;

public class OrderPanel extends JFrame {
	private final ButtonGroup OrderType = new ButtonGroup();
	private JTextField TextAddress;
	private JTextField TextCity;
	private JTextField TextOther1;
	private JTextField TextZip;
	private JTextField TextName;
	private JTextField TextOther2;
	private JTextField TextCharge;
	private JTextField TextPhone;
	private JLabel LabelPhone;
	private JLabel LabelAddress;
	private JLabel LabelCity;
	private JLabel LabelOther;
	private JLabel LabelMemo;
	private JLabel LabelCharge;
	private JPanel ContPaneOrderIntf;
	private JButton ButtonPrint;
	private JLabel LabelTotal;
	private JLabel LabelTax;
	private JLabel LabelSubtotal;
	private JRadioButton RadButtonDelivery;
	private JRadioButton RadButtonPickup;
	private JRadioButton RadButtonToGo;
	private JRadioButton RadButtonEatIn;
	private JTextField TextSubtotal;
	private JTextField TextTax;
	private JTextField TextTotal;
	private JButton ButtonRemove;
	private JButton ButtonAdd;
	private JTextArea TextAreaMemo;
	private JPanel PanelCustomerData;
	private JLabel LabelDate;
	private JButton Row5Col5;
	private JButton btnFriedPorkDumpling;
	private JButton btnvegetableeggRollab;
	private JButton btnspringeggRollab;
	private JButton btnBonelessHoneyPork;
	private JButton btnPuPuPlater;
	private JButton btnshirmpeggRollab;
	private JButton btnSteamPorkDumpling;
	private JButton btnChineseDonut;
	private JButton btnPlainWing;
	private JButton btnCrabRangoon;
	private JButton btnFriedWonton;
	private JButton btnChickenNugget;
	private JButton btnTerayikiChickenStick;
	private JButton btnChickenNugget_1;
	private JButton btnSaltPepper;
	private JButton btnFriedJumboShirmp;
	private JPanel PanelEmpty;
	private JButton button;
	private JButton button_1;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_10;
	private JButton button_12;
	private JButton button_15;
	private JButton button_19;
	private JButton button_20;
	private JButton button_21;
	private JButton button_22;
	private JButton button_23;
	private JButton button_24;
	private JButton button_25;
	private JButton button_26;
	private JButton button_27;
	private JButton button_28;
	private JButton button_29;
	private JButton button_30;
	private JButton button_31;
	private JButton button_32;
	private JButton button_33;
	private JPanel PanelSoup;
	private JButton btnWontonSoupSmall;
	private JButton btnWontonSoupLarge;
	private JButton btnVegetableSoup;
	private JButton btnEggdropSoupSmall;
	private JButton btnEggdropSoupLarge;
	private JButton btnPhoenixDragonSoup;
	private JButton btnHotsouSoupSmall;
	private JButton btnHotsouSoupLarge;
	private JButton btnSizzilingRiceSoup;
	private JButton btnSoup;
	private JPanel PanelFrLm;
	private JButton btnVegetableFriedRice;
	private JButton btnHouseFriedRice;
	private JButton btnChickenFriedRice;
	private JButton btnJumboShirmpFried;
	private JButton btnPorkFriedRice;
	private JButton btnBeefFriedRice;
	private JButton btnShirmpFriedRice;
	private JButton btnFriedRice;
	private JPanel PanelSideOrder;
	private JButton btnSteamRice;
	private JButton btnFriedRice_1;
	private JButton btnFrenchFried;
	private JButton btnCajunFried;
	private JButton btnRanch;
	private JButton btnBleuSheese;
	private JButton btnSideOther;
	private JPanel PanelLunchChicken;
	private JButton btnSweetSourChicken;
	private JButton btnLgeneralTsoChicken;
	private JButton btnLorangeChicken;
	private JButton btnMongolianChicken;
	private JButton btnLterayikiChicken;
	private JButton btnLcashewChicken;
	private JButton btnMooGooGai;
	private JButton btnLvegetableChicken;
	private JButton btnLkungPaoChicken;
	private JButton btnLbroccoliChicken;
	private JButton btnLsesameChicken;
	private JButton btnLhunanChicken;
	private JButton btnLunchChicken;
	private JPanel PanelLunchBeef;
	private JButton btnLpepperSteak;
	private JButton btnLterayikiBeef;
	private JButton btnLmogolianBeef;
	private JButton btnLspicyGarlicBeef;
	private JButton btnLhunanBeef;
	private JButton btnLbroccoliBeef;
	private JButton btnLvegetableBeef;
	private JButton btnLunchBeef;
	private JPanel PanelLunchSeafood;
	private JButton btnLvegetableShirmp;
	private JButton btnLbroccoliShirmp;
	private JButton btnLkungPaoShirmp;
	private JButton btnLsweetSourShirmp;
	private JButton btnLspicyGarlicShirmp;
	private JButton btnLunchShirmp;
	private JPanel PanelLunchVegetable;
	private JButton btnLfriedTofuVegetable;
	private JButton btnLsauteedVegetable;
	private JButton btnLhunanVegetable;
	private JButton btnLsteamedVegetable;
	private JButton btnLunchVegetable;
	private JPanel PanelLunchPork;
	private JButton btnLsweetSourPork;
	private JButton btnLvegetablePork;
	private JButton btnLspicyGarlicPork;
	private JButton btnLunchPork;
	private JPanel PanelLunchFrLm;
	private JButton btnLvegetableFriedRice;
	private JButton btnLshirmpFriedRice;
	private JButton btnLvegetableLoMein;
	private JButton btnLshirmpLoMein;
	private JButton btnLchickenFriedRice;
	private JButton btnLhouseFriedRice;
	private JButton btnLchickenLoMein;
	private JButton btnLhouseLoMein;
	private JButton btnLbeefFriedRice;
	private JButton btnLbeefLoMein;
	private JButton btnLporkFriedRice;
	private JButton btnLporkLoMein;
	private JButton btnLunchFriedRice;
	private JPanel PanelLunchThai;
	private JButton btnLmassamanCurry;
	private JButton btnLthaiRice;
	private JButton btnVegetable;
	private JButton btnShirmp;
	private JButton btnLpanangCurry;
	private JButton btnLcoconutShirmp;
	private JButton btnChicken;
	private JButton btnTriple;
	private JButton btnLgreenCurry;
	private JButton btnBeef;
	private JButton btnLspicyHalapeno;
	private JButton btnPork;
	private JButton btnLbasilLeaves;
	private JButton btnLunchThai;
	private JPanel PanelWing;
	private JButton btnWing;
	private JButton btnWing_4;
	private JButton btnLemonPeper;
	private JButton btnHotLemonPepper;
	private JButton btnSweetThaiChili;
	private JButton btnWing_1;
	private JButton btnWing_5;
	private JButton btnGarlicPepper;
	private JButton btnHotGarlicPepper;
	private JButton btnWing_2;
	private JButton btnCajunBbq;
	private JButton btnHoneyBbq;
	private JButton btnWing_3;
	private JButton btnMild;
	private JButton btnHot;
	private JButton btnExtraHot;
	private JButton btnTerayiki;
	private JButton btnBraised;
	private JButton btnWing_7;
	private JPanel PanelWingCB;
	private JButton btnWingFried;
	private JButton btnWingLo;
	private JButton btnWingChicken;
	private JButton btnWingChicken_1;
	private JButton btnWingPork;
	private JButton btnWingPork_1;
	private JButton btnWingBeef;
	private JButton btnWingBeef_1;
	private JButton btnWingHouse;
	private JButton btnWingHouse_1;
	private JButton btnWingShirmp;
	private JButton btnWingShirmp_1;
	private JButton button_118;
	private JButton button_119;
	private JButton btnWingFrench;
	private JButton btnDinnerCombo;
	private JButton btnNotice;



	/**
	 * Create the frame.
	 */
	public OrderPanel() 
	{
		setAlwaysOnTop(true);
		initComponents();
		createEvents();
	}
	
	private void initComponents() 
	{
		
		
		
		//ContPaneOrderIntf
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1970, 1048);
		ContPaneOrderIntf = new JPanel();
		ContPaneOrderIntf.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ContPaneOrderIntf);
		ContPaneOrderIntf.setLayout(null);
		
		PanelCustomerData = new JPanel();
		JPanel PanelCheckout = new JPanel();
		JPanel PanelMenuInterect = new JPanel();

		
		//ContPaneOrderIntf West
		ContPaneOrderIntf.add(PanelCustomerData);
		ContPaneOrderIntf.add(PanelCheckout);
		//ContPaneOrderIntf East
		ContPaneOrderIntf.add(PanelMenuInterect);
		
		//PanelCustomerData
		PanelCustomerData.setBounds(10, 10, 755, 510);
		PanelCustomerData.setLayout(null);
		//PanelCustomerData Component
		 //Top Row - Ticket# , Date
		 JLabel LabelTicketNumder = new JLabel("#00");
		 LabelTicketNumder.setFont(new Font("NSimSun", Font.PLAIN, 40));
		 LabelTicketNumder.setBounds(10, 10, 85, 50);
		 PanelCustomerData.add(LabelTicketNumder);
		
		 LabelDate = new JLabel("00/00/0000");
		 LabelDate.setFont(new Font("NSimSun", Font.PLAIN, 40));
		 LabelDate.setBounds(490, 10, 215, 50);
		 PanelCustomerData.add(LabelDate);
		
		 //Middle Row - Name , Phone , Address , City , Zip
		 JLabel LabelName = new JLabel("Name");
		 LabelName.setBounds(10, 75, 75, 30);
		 PanelCustomerData.add(LabelName);
		 LabelName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		 TextName = new JTextField();
		 TextName.setBounds(110, 75, 245, 35);
		 PanelCustomerData.add(TextName);
		 TextName.setText("James Buckery");
		 TextName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		 TextName.setColumns(10);
		
		 LabelPhone = new JLabel("Phone");
		 LabelPhone.setBounds(10, 115, 75, 35);
		 PanelCustomerData.add(LabelPhone);
		 LabelPhone.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
	 	 TextPhone = new JTextField();
		 TextPhone.setBounds(110, 115, 245, 35);
		 PanelCustomerData.add(TextPhone);
		 TextPhone.setText("0000");
		 TextPhone.setFont(new Font("Tahoma", Font.PLAIN, 25));
		 TextPhone.setColumns(10);
	 	
	 	 LabelAddress = new JLabel("Address");
		 LabelAddress.setBounds(10, 160, 90, 35);
		 PanelCustomerData.add(LabelAddress);
		 LabelAddress.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		 TextAddress = new JTextField();
		 TextAddress.setBounds(110, 160, 550, 35);
		 PanelCustomerData.add(TextAddress);
		 TextAddress.setText("12312- this is not a actual address, ignore me");
		 TextAddress.setFont(new Font("Tahoma", Font.PLAIN, 25));
		 TextAddress.setColumns(10);
		
		 LabelCity = new JLabel("City");
		 LabelCity.setBounds(110, 205, 75, 35);
		 PanelCustomerData.add(LabelCity);
		 LabelCity.setFont(new Font("Tahoma", Font.PLAIN, 25));
	 	
		 TextCity = new JTextField();
		 TextCity.setBounds(160, 205, 150, 35);
		 PanelCustomerData.add(TextCity);
		 TextCity.setText("Kennesaw");
		 TextCity.setFont(new Font("Tahoma", Font.PLAIN, 25));
		 TextCity.setColumns(10);
		
		 JLabel LabelZip = new JLabel("Zip");
		 LabelZip.setBounds(320, 205, 40, 35);
		 PanelCustomerData.add(LabelZip);
		 LabelZip.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		 TextZip = new JTextField();
		 TextZip.setBounds(360, 205, 80, 35);
		 PanelCustomerData.add(TextZip);
		 TextZip.setText("00000");
		 TextZip.setFont(new Font("Tahoma", Font.PLAIN, 25));
		 TextZip.setColumns(10);
		 
		 //Bottom Row - Other , Memo
		 LabelOther = new JLabel("Other");
	 	 LabelOther.setBounds(10, 250, 90, 35);
		 PanelCustomerData.add(LabelOther);
		 LabelOther.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		 TextOther1 = new JTextField();
		 TextOther1.setBounds(90, 250, 450, 35);
		 PanelCustomerData.add(TextOther1);
		 TextOther1.setText("Random Words, do not border");
		 TextOther1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		 TextOther1.setColumns(10);
	 	
		 TextOther2 = new JTextField();
		 TextOther2.setBounds(90, 285, 450, 35);
		 PanelCustomerData.add(TextOther2);
		 TextOther2.setText("Moar Random Words");
		 TextOther2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		 TextOther2.setColumns(10);
		
		 LabelMemo = new JLabel("Memo");
		 LabelMemo.setBounds(10, 330, 90, 35);
		 PanelCustomerData.add(LabelMemo);
		 LabelMemo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		 
		 TextAreaMemo = new JTextArea();
		 TextAreaMemo.setFont(new Font("Monospaced", Font.PLAIN, 20));
		 TextAreaMemo.setText("163516511111111111111111111111111111111111111");
		 TextAreaMemo.setBounds(90, 330, 450, 123);
		 PanelCustomerData.add(TextAreaMemo);
		
		 //Order Type Row - Charge , Delivery
		 LabelCharge = new JLabel("Charge");
		 LabelCharge.setBounds(10, 465, 90, 35);
		 PanelCustomerData.add(LabelCharge);
		 LabelCharge.setFont(new Font("Tahoma", Font.PLAIN, 25));
		 
		 TextCharge = new JTextField();
		 TextCharge.setBounds(90, 465, 85, 35);
		 PanelCustomerData.add(TextCharge);
		 TextCharge.setText("$00.00");
		 TextCharge.setFont(new Font("Tahoma", Font.PLAIN, 25));
		 TextCharge.setColumns(10);
		 
		 RadButtonDelivery = new JRadioButton("Delivery");
		 RadButtonDelivery.setBounds(175, 465, 115, 30);
		 PanelCustomerData.add(RadButtonDelivery);
		 OrderType.add(RadButtonDelivery);
		 RadButtonDelivery.setFont(new Font("Tahoma", Font.PLAIN, 25));
		 
		 RadButtonPickup = new JRadioButton("Pickup");
		 RadButtonPickup.setBounds(286, 465, 100, 30);
		 PanelCustomerData.add(RadButtonPickup);
		 OrderType.add(RadButtonPickup);
		 RadButtonPickup.setFont(new Font("Tahoma", Font.PLAIN, 25));
		   
		 RadButtonEatIn = new JRadioButton("Eat In");
		 RadButtonEatIn.setBounds(385, 465, 95, 30);
		 PanelCustomerData.add(RadButtonEatIn);
		 OrderType.add(RadButtonEatIn);
		 RadButtonEatIn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		  
		 RadButtonToGo = new JRadioButton("To Go");
		 RadButtonToGo.setBounds(480, 465, 100, 30);
		 PanelCustomerData.add(RadButtonToGo);
		 OrderType.add(RadButtonToGo);
		 RadButtonToGo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		 
		 btnNotice = new JButton("Notice");
		 btnNotice.setBounds(655, 440, 90, 60);
		 PanelCustomerData.add(btnNotice);
		
		
		

		

		PanelCheckout.setBounds(10, 925, 755, 75);
		
		PanelCheckout.setLayout(null);
		
		LabelSubtotal = new JLabel("Sub");
		LabelSubtotal.setBounds(10, 5, 50, 25);
		PanelCheckout.add(LabelSubtotal);
		LabelSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		TextSubtotal = new JTextField();
		TextSubtotal.setBounds(55, 0, 86, 30);
		PanelCheckout.add(TextSubtotal);
		TextSubtotal.setText("$00.00");
		TextSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		TextSubtotal.setColumns(10);
		
		LabelTax = new JLabel("Tax");
		LabelTax.setBounds(10, 45, 50, 25);
		PanelCheckout.add(LabelTax);
		LabelTax.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		TextTax = new JTextField();
		TextTax.setBounds(55, 40, 86, 30);
		PanelCheckout.add(TextTax);
		TextTax.setText("$00.00");
		TextTax.setFont(new Font("Tahoma", Font.PLAIN, 25));
		TextTax.setColumns(10);
		
		LabelTotal = new JLabel("Total");
		LabelTotal.setBounds(155, 40, 70, 25);
		PanelCheckout.add(LabelTotal);
		LabelTotal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		TextTotal = new JTextField();
		TextTotal.setBounds(225, 10, 150, 55);
		PanelCheckout.add(TextTotal);
		TextTotal.setText("$0000.00");
		TextTotal.setFont(new Font("Tahoma", Font.PLAIN, 35));
		TextTotal.setColumns(10);
		
		ButtonAdd = new JButton("ADD");
		ButtonAdd.setBounds(380, 5, 90, 60);
		PanelCheckout.add(ButtonAdd);
		
		ButtonRemove = new JButton("REMOVE");
		ButtonRemove.setBounds(470, 5, 90, 60);
		PanelCheckout.add(ButtonRemove);
		
		JButton ButtonReprint = new JButton("REPRINT");
		ButtonReprint.setBounds(575, 5, 90, 60);
		PanelCheckout.add(ButtonReprint);
		
		ButtonPrint = new JButton("PRINT");
		ButtonPrint.setBounds(665, 5, 90, 60);
		PanelCheckout.add(ButtonPrint);
		

		PanelMenuInterect.setBounds(770, 10, 1080, 675);
		PanelMenuInterect.setLayout(new CardLayout(0, 0));
		
		PanelEmpty = new JPanel();
		PanelMenuInterect.add(PanelEmpty, "name_197097977933893");
		PanelEmpty.setLayout(null);
		
		button = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button.setBounds(0, 0, 216, 135);
		button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button);
		
		button_33 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_33.setBounds(216, 0, 216, 135);
		button_33.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_33);
		
		button_32 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_32.setBounds(432, 0, 216, 135);
		button_32.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_32);
		
		button_31 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_31.setBounds(648, 0, 216, 135);
		button_31.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_31);
		
		button_30 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_30.setBounds(864, 0, 216, 135);
		button_30.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_30);
		
		button_29 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_29.setBounds(0, 135, 216, 135);
		button_29.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_29);
		
		button_28 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_28.setBounds(216, 135, 216, 135);
		button_28.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_28);
		
		button_27 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_27.setBounds(432, 135, 216, 135);
		button_27.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_27);
		
		button_26 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_26.setBounds(648, 135, 216, 135);
		button_26.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_26);
		
		button_25 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_25.setBounds(864, 135, 216, 135);
		button_25.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_25);
		
		button_24 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_24.setBounds(0, 270, 216, 135);
		button_24.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_24);
		
		button_23 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_23.setBounds(216, 270, 216, 135);
		button_23.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_23);
		
		button_22 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_22.setBounds(432, 270, 216, 135);
		button_22.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_22);
		
		button_21 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_21.setBounds(648, 270, 216, 135);
		button_21.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_21);
		
		button_20 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_20.setBounds(864, 270, 216, 135);
		button_20.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_20);
		
		button_19 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_19.setBounds(0, 405, 216, 135);
		button_19.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_19);
		
		button_15 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_15.setBounds(216, 405, 216, 135);
		button_15.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_15);
		
		button_12 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_12.setBounds(432, 405, 216, 135);
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_12);
		
		button_10 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_10.setBounds(648, 405, 216, 135);
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_10);
		
		button_7 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_7.setBounds(864, 405, 216, 135);
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_7);
		
		button_6 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_6.setBounds(0, 540, 216, 135);
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_6);
		
		button_5 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_5.setBounds(216, 540, 216, 135);
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_5);
		
		button_4 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_4.setBounds(432, 540, 216, 135);
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_4);
		
		button_3 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_3.setBounds(648, 540, 216, 135);
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_3);
		
		button_1 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_1.setBounds(864, 540, 216, 135);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelEmpty.add(button_1);
		
		JPanel PanelMenuAppetizer = new JPanel();
		PanelMenuInterect.add(PanelMenuAppetizer);
		PanelMenuAppetizer.setLayout(null);
		
		btnvegetableeggRollab = new JButton("<html><p>Vegetable</p><p>Egg Roll 2</p></html>");
		btnvegetableeggRollab.setBounds(0, 0, 216, 135);
		btnvegetableeggRollab.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuAppetizer.add(btnvegetableeggRollab);
		
		btnBonelessHoneyPork = new JButton("<html><p> Boneless </p><p> Honey Pork </p>  </html>");
		btnBonelessHoneyPork.setBounds(216, 0, 216, 135);
		btnBonelessHoneyPork.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuAppetizer.add(btnBonelessHoneyPork);
		
		btnChineseDonut = new JButton("<html><p> Chinese </p><p> Donut 20 </p>  </html>");
		btnChineseDonut.setBounds(432, 0, 216, 135);
		btnChineseDonut.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuAppetizer.add(btnChineseDonut);
		
		btnPlainWing = new JButton("<html><p> Plain </p><p> Wing 6 </p>  </html>");
		btnPlainWing.setBounds(648, 0, 216, 135);
		btnPlainWing.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuAppetizer.add(btnPlainWing);
		
		btnspringeggRollab = new JButton("<html><p>Spring</p><p>Egg Roll 2</p></html>");
		btnspringeggRollab.setBounds(0, 135, 216, 135);
		btnspringeggRollab.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuAppetizer.add(btnspringeggRollab);
		
		btnCrabRangoon = new JButton("<html><p> Crab </p><p> Rangoon 6 </p>  </html>");
		btnCrabRangoon.setBounds(216, 135, 216, 135);
		btnCrabRangoon.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuAppetizer.add(btnCrabRangoon);
		
		btnFriedWonton = new JButton("<html><p> Fried </p><p> Wonton 8 </p>  </html>");
		btnFriedWonton.setBounds(432, 135, 216, 135);
		btnFriedWonton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuAppetizer.add(btnFriedWonton);
		
		btnshirmpeggRollab = new JButton("<html><p>Shirmp</p><p>Egg Roll 2</p></html>");
		btnshirmpeggRollab.setBounds(0, 270, 216, 135);
		btnshirmpeggRollab.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuAppetizer.add(btnshirmpeggRollab);
		
		btnPuPuPlater = new JButton("<html><p> Pu Pu </p><p> Plater </p>  </html>");
		btnPuPuPlater.setBounds(216, 270, 216, 135);
		btnPuPuPlater.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuAppetizer.add(btnPuPuPlater);
		
		btnChickenNugget = new JButton("<html><p> Chicken </p><p> Nugget 10 </p>  </html>");
		btnChickenNugget.setBounds(432, 270, 216, 135);
		btnChickenNugget.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuAppetizer.add(btnChickenNugget);
		
		btnFriedPorkDumpling = new JButton("<html> <p> Fried Pork </p> Dumpling 8 </html>");
		btnFriedPorkDumpling.setBounds(0, 405, 216, 135);
		btnFriedPorkDumpling.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuAppetizer.add(btnFriedPorkDumpling);
		
		btnTerayikiChickenStick = new JButton("<html><p> Chicken</p><p>  Stick 4 </p>  </html>");
		btnTerayikiChickenStick.setBounds(216, 405, 216, 135);
		btnTerayikiChickenStick.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuAppetizer.add(btnTerayikiChickenStick);
		
		btnChickenNugget_1 = new JButton("<html><p> Chicken </p><p> Nugget 20 </p>  </html>");
		btnChickenNugget_1.setBounds(432, 405, 216, 135);
		btnChickenNugget_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuAppetizer.add(btnChickenNugget_1);
		
		btnSteamPorkDumpling = new JButton("<html> <p> Steam Pork </p> Dumpling 8 </html>");
		btnSteamPorkDumpling.setBounds(0, 540, 216, 135);
		btnSteamPorkDumpling.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuAppetizer.add(btnSteamPorkDumpling);
		
		btnFriedJumboShirmp = new JButton("<html><p> Fried Jumbo </p><p> Shirmp 8 </p>  </html>");
		btnFriedJumboShirmp.setBounds(216, 540, 216, 135);
		btnFriedJumboShirmp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuAppetizer.add(btnFriedJumboShirmp);
		
		btnSaltPepper = new JButton("<html><p> Salt & Pepper </p><p> Calamari </p>  </html>");
		btnSaltPepper.setBounds(432, 540, 216, 135);
		btnSaltPepper.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuAppetizer.add(btnSaltPepper);
		
		Row5Col5 = new JButton("Appetizer");
		Row5Col5.setBounds(864, 540, 216, 135);
		Row5Col5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuAppetizer.add(Row5Col5);
		
		PanelSoup = new JPanel();
		PanelMenuInterect.add(PanelSoup, "name_197200499303663");
		PanelSoup.setLayout(null);
		
		btnWontonSoupSmall = new JButton("<html><p> Wonton </p><p> Soup </p><p> Small </p>  </html>");
		btnWontonSoupSmall.setBounds(0, 0, 216, 135);
		btnWontonSoupSmall.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelSoup.add(btnWontonSoupSmall);
		
		btnWontonSoupLarge = new JButton("<html><p> Wonton </p><p> Soup </p><p> Large </p>  </html>");
		btnWontonSoupLarge.setBounds(216, 0, 216, 135);
		btnWontonSoupLarge.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelSoup.add(btnWontonSoupLarge);
		
		btnVegetableSoup = new JButton("<html><p> Vegetable\r\n    </p><p> Soup \r\n    </p>  </html>");
		btnVegetableSoup.setBounds(648, 0, 216, 135);
		btnVegetableSoup.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelSoup.add(btnVegetableSoup);
		
		btnEggdropSoupSmall = new JButton("<html><p> EggDrop </p><p> Soup </p><p> Small </p>  </html>");
		btnEggdropSoupSmall.setBounds(0, 135, 216, 135);
		btnEggdropSoupSmall.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelSoup.add(btnEggdropSoupSmall);
		
		btnEggdropSoupLarge = new JButton("<html><p> EggDrop </p><p> Soup </p><p> Large </p>  </html>");
		btnEggdropSoupLarge.setBounds(216, 135, 216, 135);
		btnEggdropSoupLarge.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelSoup.add(btnEggdropSoupLarge);
		
		btnPhoenixDragonSoup = new JButton("<html><p> Phoenix </p><p> Dragon </p><p> Soup </p>  </html>");
		btnPhoenixDragonSoup.setBounds(648, 135, 216, 135);
		btnPhoenixDragonSoup.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelSoup.add(btnPhoenixDragonSoup);
		
		btnHotsouSoupSmall = new JButton("<html><p> Hot&Sou </p><p> Soup </p><p> Small </p>  </html>");
		btnHotsouSoupSmall.setBounds(0, 270, 216, 135);
		btnHotsouSoupSmall.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelSoup.add(btnHotsouSoupSmall);
		
		btnHotsouSoupLarge = new JButton("<html><p> Hot&Sou </p><p> Soup </p><p> Large </p>  </html>");
		btnHotsouSoupLarge.setBounds(216, 270, 216, 135);
		btnHotsouSoupLarge.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelSoup.add(btnHotsouSoupLarge);
		
		btnSizzilingRiceSoup = new JButton("<html><p> Sizziling </p><p> Rice Soup </p>  </html>");
		btnSizzilingRiceSoup.setBounds(648, 270, 216, 135);
		btnSizzilingRiceSoup.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelSoup.add(btnSizzilingRiceSoup);
		
		btnSoup = new JButton("<html><p> Soup </p><p>  </p>  </html>");
		btnSoup.setBounds(864, 540, 216, 135);
		btnSoup.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelSoup.add(btnSoup);
		
		PanelFrLm = new JPanel();
		PanelMenuInterect.add(PanelFrLm, "name_197829217964633");
		PanelFrLm.setLayout(null);
		
		btnVegetableFriedRice = new JButton("<html><p>  Vegetable\r\n    </p><p>  Fried Rice\r\n    </p><p>  \r\n    </p>  </html>");
		btnVegetableFriedRice.setBounds(0, 0, 216, 135);
		btnVegetableFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelFrLm.add(btnVegetableFriedRice);
		
		btnShirmpFriedRice = new JButton("<html><p>  Shirmp\r\n    </p><p>  Fried Rice\r\n    </p><p>  \r\n    </p>  </html>");
		btnShirmpFriedRice.setBounds(216, 0, 216, 135);
		btnShirmpFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelFrLm.add(btnShirmpFriedRice);
		
		btnChickenFriedRice = new JButton("<html><p>  Chicken\r\n    </p><p>  Fried Rice\r\n    </p><p>  \r\n    </p>  </html>");
		btnChickenFriedRice.setBounds(0, 135, 216, 135);
		btnChickenFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelFrLm.add(btnChickenFriedRice);
		
		btnHouseFriedRice = new JButton("<html><p>  House Special\r\n    </p><p>  Fried Rice\r\n    </p><p>  \r\n    </p>  </html>");
		btnHouseFriedRice.setBounds(216, 135, 216, 135);
		btnHouseFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelFrLm.add(btnHouseFriedRice);
		
		btnPorkFriedRice = new JButton("<html><p>  Pork\r\n    </p><p>  Fried Rice\r\n    </p><p>  \r\n    </p>  </html>");
		btnPorkFriedRice.setBounds(0, 270, 216, 135);
		btnPorkFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelFrLm.add(btnPorkFriedRice);
		
		btnJumboShirmpFried = new JButton("<html><p>  Jumbo Shirmp\r\n    </p><p>  Fried Rice\r\n    </p><p>  \r\n    </p>  </html>");
		btnJumboShirmpFried.setBounds(216, 270, 216, 135);
		btnJumboShirmpFried.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelFrLm.add(btnJumboShirmpFried);
		
		btnBeefFriedRice = new JButton("<html><p>  Beef\r\n    </p><p>  Fried Rice\r\n    </p><p>  \r\n    </p>  </html>");
		btnBeefFriedRice.setBounds(0, 405, 216, 135);
		btnBeefFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelFrLm.add(btnBeefFriedRice);
		
		btnFriedRice = new JButton("<html><p>  Fried Rice</p><p>Lo Mein</p><p></p>  </html>");
		btnFriedRice.setBounds(864, 540, 216, 135);
		btnFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelFrLm.add(btnFriedRice);
		
		JButton button_9 = new JButton("<html><p>  Vegetable\r\n    </p><p>  Lo Mein\r\n    </p><p>  \r\n    </p>  </html>");
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_9.setBounds(432, 0, 216, 135);
		PanelFrLm.add(button_9);
		
		JButton button_11 = new JButton("<html><p>  Chicken\r\n    </p><p>  Lo Mein\r\n    </p><p>  \r\n    </p>  </html>");
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_11.setBounds(432, 135, 216, 135);
		PanelFrLm.add(button_11);
		
		JButton button_14 = new JButton("<html><p>  Pork\r\n    </p><p>  Lo Mein\r\n    </p><p>  \r\n    </p>  </html>");
		button_14.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_14.setBounds(432, 270, 216, 135);
		PanelFrLm.add(button_14);
		
		JButton button_18 = new JButton("<html><p>  Beef\r\n    </p><p>  Lo Mein\r\n    </p><p>  \r\n    </p>  </html>");
		button_18.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_18.setBounds(432, 405, 216, 135);
		PanelFrLm.add(button_18);
		
		JButton button_38 = new JButton("<html><p>  Shirmp\r\n    </p><p>  Lo Mein\r\n    </p><p>  \r\n    </p>  </html>");
		button_38.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_38.setBounds(648, 0, 216, 135);
		PanelFrLm.add(button_38);
		
		JButton button_39 = new JButton("<html><p>  House Special\r\n    </p><p>  Lo Mein\r\n    </p><p>  \r\n    </p>  </html>");
		button_39.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_39.setBounds(648, 135, 216, 135);
		PanelFrLm.add(button_39);
		
		JButton button_40 = new JButton("<html><p>  Jumbo Shirmp\r\n    </p><p>  Lo Mein\r\n    </p><p>  \r\n    </p>  </html>");
		button_40.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_40.setBounds(648, 270, 216, 135);
		PanelFrLm.add(button_40);
		
		JButton button_43 = new JButton("<html><p>  Singapore\r\n    </p><p>  Rice Noodle\r\n    </p><p>  \r\n    </p>  </html>");
		button_43.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_43.setBounds(648, 405, 216, 135);
		PanelFrLm.add(button_43);
		
		PanelSideOrder = new JPanel();
		PanelMenuInterect.add(PanelSideOrder, "name_198476635933508");
		PanelSideOrder.setLayout(null);
		
		btnSteamRice = new JButton("<html><p>  Steam\r\n    </p><p>  Rice\r\n    </p><p>  \r\n    </p>  </html>");
		btnSteamRice.setBounds(0, 0, 216, 135);
		btnSteamRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelSideOrder.add(btnSteamRice);
		
		btnFriedRice_1 = new JButton("<html><p>  Fried\r\n    </p><p>  Rice\r\n    </p><p>  \r\n    </p>  </html>");
		btnFriedRice_1.setBounds(0, 135, 216, 135);
		btnFriedRice_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelSideOrder.add(btnFriedRice_1);
		
		btnFrenchFried = new JButton("<html><p>  French\r\n    </p><p>  Fried\r\n    </p><p>  \r\n    </p>  </html>");
		btnFrenchFried.setBounds(0, 270, 216, 135);
		btnFrenchFried.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelSideOrder.add(btnFrenchFried);
		
		btnCajunFried = new JButton("<html><p>  Cajun \r\n    </p><p>  Fried\r\n    </p><p>  \r\n    </p>  </html>");
		btnCajunFried.setBounds(216, 270, 216, 135);
		btnCajunFried.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelSideOrder.add(btnCajunFried);
		
		btnRanch = new JButton("<html><p>  Ranch\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnRanch.setBounds(0, 540, 216, 135);
		btnRanch.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelSideOrder.add(btnRanch);
		
		btnBleuSheese = new JButton("<html><p>  Blue\r\n    </p><p>  Sheese\r\n    </p><p>  \r\n    </p>  </html>");
		btnBleuSheese.setBounds(216, 540, 216, 135);
		btnBleuSheese.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelSideOrder.add(btnBleuSheese);
		
		btnSideOther = new JButton("<html><p>  Side\r\n    </p><p>  Other\r\n    </p><p>  \r\n    </p>  </html>");
		btnSideOther.setBounds(864, 540, 216, 135);
		btnSideOther.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelSideOrder.add(btnSideOther);
		
		PanelLunchChicken = new JPanel();
		PanelMenuInterect.add(PanelLunchChicken, "name_267355757134860");
		PanelLunchChicken.setLayout(null);
		
		btnSweetSourChicken = new JButton("<html><p>  L-Sweet\r\n    </p><p>  Sour\r\n    </p><p>  Chicken\r\n    </p>  </html>");
		btnSweetSourChicken.setBounds(0, 0, 216, 135);
		btnSweetSourChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchChicken.add(btnSweetSourChicken);
		
		btnLgeneralTsoChicken = new JButton("<html><p>  L-General\r\n    </p><p>  Tso Chicken\r\n    </p><p>  \r\n    </p>  </html>");
		btnLgeneralTsoChicken.setBounds(216, 0, 216, 135);
		btnLgeneralTsoChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchChicken.add(btnLgeneralTsoChicken);
		
		btnLorangeChicken = new JButton("<html><p>  L-Orange\r\n    </p><p>  Chicken\r\n    </p><p>  \r\n    </p>  </html>");
		btnLorangeChicken.setBounds(432, 0, 216, 135);
		btnLorangeChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchChicken.add(btnLorangeChicken);
		
		btnMongolianChicken = new JButton("<html><p> L-Mongolian\r\n    </p><p>  Chicken\r\n    </p>  </html>");
		btnMongolianChicken.setBounds(0, 135, 216, 135);
		btnMongolianChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchChicken.add(btnMongolianChicken);
		
		btnLterayikiChicken = new JButton("<html><p>  L-Terayiki\r\n    </p><p>  Chicken\r\n    </p><p>  \r\n    </p>  </html>");
		btnLterayikiChicken.setBounds(216, 135, 216, 135);
		btnLterayikiChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchChicken.add(btnLterayikiChicken);
		
		btnLcashewChicken = new JButton("<html><p>  L-Cashew\r\n    </p><p>  Chicken\r\n    </p><p>  \r\n    </p>  </html>");
		btnLcashewChicken.setBounds(432, 135, 216, 135);
		btnLcashewChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchChicken.add(btnLcashewChicken);
		
		btnMooGooGai = new JButton("<html><p>  L-Moo Goo\r\n    </p><p>  Gai Pan\r\n    </p>  </html>");
		btnMooGooGai.setBounds(0, 270, 216, 135);
		btnMooGooGai.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchChicken.add(btnMooGooGai);
		
		btnLvegetableChicken = new JButton("<html><p>  L-Vegetable\r\n    </p><p>  Chicken\r\n    </p><p>  \r\n    </p>  </html>");
		btnLvegetableChicken.setBounds(216, 270, 216, 135);
		btnLvegetableChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchChicken.add(btnLvegetableChicken);
		
		btnLkungPaoChicken = new JButton("<html><p>  L-Kung Pao\r\n    </p><p>  Chicken\r\n    </p>  </html>");
		btnLkungPaoChicken.setBounds(0, 405, 216, 135);
		btnLkungPaoChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchChicken.add(btnLkungPaoChicken);
		
		btnLbroccoliChicken = new JButton("<html><p>  L-Broccoli\r\n    </p><p>  Chicken\r\n    </p><p>  \r\n    </p>  </html>");
		btnLbroccoliChicken.setBounds(216, 405, 216, 135);
		btnLbroccoliChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchChicken.add(btnLbroccoliChicken);
		
		btnLsesameChicken = new JButton("<html><p>  L-Sesame\r\n    </p><p>  Chicken\r\n    </p><p>  \r\n    </p>  </html>");
		btnLsesameChicken.setBounds(0, 540, 216, 135);
		btnLsesameChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchChicken.add(btnLsesameChicken);
		
		btnLhunanChicken = new JButton("<html><p>  L-Hunan\r\n    </p><p>  Chicken\r\n    </p><p>  \r\n    </p>  </html>");
		btnLhunanChicken.setBounds(216, 540, 216, 135);
		btnLhunanChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchChicken.add(btnLhunanChicken);
		
		btnLunchChicken = new JButton("<html><p>  Lunch\r\n    </p><p>  Chicken\r\n    </p><p>  \r\n    </p>  </html>");
		btnLunchChicken.setBounds(864, 540, 216, 135);
		btnLunchChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchChicken.add(btnLunchChicken);
		
		PanelLunchBeef = new JPanel();
		PanelMenuInterect.add(PanelLunchBeef, "name_274744838347014");
		PanelLunchBeef.setLayout(null);
		
		btnLpepperSteak = new JButton("<html><p>  L-Pepper\r\n    </p><p>  Steak\r\n    </p><p>  \r\n    </p>  </html>");
		btnLpepperSteak.setBounds(0, 0, 216, 135);
		btnLpepperSteak.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchBeef.add(btnLpepperSteak);
		
		btnLterayikiBeef = new JButton("<html><p>  L-Terayiki\r\n    </p><p> Beef \r\n    </p><p>  \r\n    </p>  </html>");
		btnLterayikiBeef.setBounds(216, 0, 216, 135);
		btnLterayikiBeef.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchBeef.add(btnLterayikiBeef);
		
		btnLmogolianBeef = new JButton("<html><p>  L-Mogolian\r\n    </p><p>  Beef\r\n    </p><p>  \r\n    </p>  </html>");
		btnLmogolianBeef.setBounds(0, 135, 216, 135);
		btnLmogolianBeef.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchBeef.add(btnLmogolianBeef);
		
		btnLspicyGarlicBeef = new JButton("<html><p>  L-Spicy\r\n    </p><p>  Garlic Beef\r\n    </p><p>  \r\n    </p>  </html>");
		btnLspicyGarlicBeef.setBounds(216, 135, 216, 135);
		btnLspicyGarlicBeef.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchBeef.add(btnLspicyGarlicBeef);
		
		btnLhunanBeef = new JButton("<html><p>  L-Hunan\r\n    </p><p>  Beef\r\n    </p><p>  \r\n    </p>  </html>");
		btnLhunanBeef.setBounds(0, 270, 216, 135);
		btnLhunanBeef.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchBeef.add(btnLhunanBeef);
		
		btnLbroccoliBeef = new JButton("<html><p>  L-Broccoli\r\n    </p><p>  Beef\r\n    </p><p>  \r\n    </p>  </html>");
		btnLbroccoliBeef.setBounds(0, 405, 216, 135);
		btnLbroccoliBeef.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchBeef.add(btnLbroccoliBeef);
		
		btnLvegetableBeef = new JButton("<html><p>  L-Vegetable\r\n    </p><p>  Beef\r\n    </p><p>  \r\n    </p>  </html>");
		btnLvegetableBeef.setBounds(0, 540, 216, 135);
		btnLvegetableBeef.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchBeef.add(btnLvegetableBeef);
		
		btnLunchBeef = new JButton("<html><p>  Lunch\r\n    </p><p>  Beef\r\n    </p><p>  \r\n    </p>  </html>");
		btnLunchBeef.setBounds(864, 540, 216, 135);
		btnLunchBeef.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchBeef.add(btnLunchBeef);
		
		PanelLunchSeafood = new JPanel();
		PanelMenuInterect.add(PanelLunchSeafood, "name_354545631432296");
		PanelLunchSeafood.setLayout(null);
		
		btnLvegetableShirmp = new JButton("<html><p>  L-Vegetable\r\n    </p><p>  Shirmp\r\n    </p><p>  \r\n    </p>  </html>");
		btnLvegetableShirmp.setBounds(0, 0, 216, 135);
		btnLvegetableShirmp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchSeafood.add(btnLvegetableShirmp);
		
		btnLbroccoliShirmp = new JButton("<html><p>  L-Broccoli\r\n    </p><p>  Shirmp\r\n    </p><p>  \r\n    </p>  </html>");
		btnLbroccoliShirmp.setBounds(0, 135, 216, 135);
		btnLbroccoliShirmp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchSeafood.add(btnLbroccoliShirmp);
		
		btnLkungPaoShirmp = new JButton("<html><p>  L-Kung Pao \r\n    </p><p>  Shirmp\r\n    </p><p>  \r\n    </p>  </html>");
		btnLkungPaoShirmp.setBounds(0, 270, 216, 135);
		btnLkungPaoShirmp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchSeafood.add(btnLkungPaoShirmp);
		
		btnLsweetSourShirmp = new JButton("<html><p>  L-Sweet\r\n    </p><p>  Sour\r\n    </p><p>  Shirmp\r\n    </p>  </html>");
		btnLsweetSourShirmp.setBounds(0, 405, 216, 135);
		btnLsweetSourShirmp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchSeafood.add(btnLsweetSourShirmp);
		
		btnLspicyGarlicShirmp = new JButton("<html><p>  L-Spicy\r\n    </p><p>  Garlic\r\n    </p><p>  Shirmp\r\n    </p>  </html>");
		btnLspicyGarlicShirmp.setBounds(0, 540, 216, 135);
		btnLspicyGarlicShirmp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchSeafood.add(btnLspicyGarlicShirmp);
		
		btnLunchShirmp = new JButton("<html><p>  Lunch\r\n    </p><p>  Shirmp\r\n    </p><p>  \r\n    </p>  </html>");
		btnLunchShirmp.setBounds(864, 540, 216, 135);
		btnLunchShirmp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchSeafood.add(btnLunchShirmp);
		
		PanelLunchVegetable = new JPanel();
		PanelMenuInterect.add(PanelLunchVegetable, "name_354745671080927");
		PanelLunchVegetable.setLayout(null);
		
		btnLfriedTofuVegetable = new JButton("<html><p>  L-Fried Tofu\r\n    </p><p>  Vegetable\r\n    </p><p>  \r\n    </p>  </html>");
		btnLfriedTofuVegetable.setBounds(0, 0, 216, 135);
		btnLfriedTofuVegetable.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchVegetable.add(btnLfriedTofuVegetable);
		
		btnLsauteedVegetable = new JButton("<html><p>  L-Sauteed\r\n    </p><p>  Vegetable\r\n    </p><p>  \r\n    </p>  </html>");
		btnLsauteedVegetable.setBounds(0, 135, 216, 135);
		btnLsauteedVegetable.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchVegetable.add(btnLsauteedVegetable);
		
		btnLhunanVegetable = new JButton("<html><p>  L-Hunan\r\n    </p><p>  Vegetable\r\n    </p><p>  \r\n    </p>  </html>");
		btnLhunanVegetable.setBounds(0, 270, 216, 135);
		btnLhunanVegetable.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchVegetable.add(btnLhunanVegetable);
		
		btnLsteamedVegetable = new JButton("<html><p>  L-Steamed\r\n    </p><p>  Vegetable\r\n    </p><p>  \r\n    </p>  </html>");
		btnLsteamedVegetable.setBounds(0, 405, 216, 135);
		btnLsteamedVegetable.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchVegetable.add(btnLsteamedVegetable);
		
		btnLunchVegetable = new JButton("<html><p>  Lunch\r\n    </p><p>  Vegetable\r\n    </p><p>  \r\n    </p>  </html>");
		btnLunchVegetable.setBounds(864, 540, 216, 135);
		btnLunchVegetable.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchVegetable.add(btnLunchVegetable);
		
		PanelLunchPork = new JPanel();
		PanelMenuInterect.add(PanelLunchPork, "name_356305651694137");
		PanelLunchPork.setLayout(null);
		
		btnLsweetSourPork = new JButton("<html><p>  L-Sweet\r\n    </p><p>  Sour\r\n    </p><p>  Pork\r\n    </p>  </html>");
		btnLsweetSourPork.setBounds(0, 0, 216, 135);
		btnLsweetSourPork.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchPork.add(btnLsweetSourPork);
		
		btnLvegetablePork = new JButton("<html><p>  L-Vegetable\r\n    </p><p>  Pork\r\n    </p><p>  \r\n    </p>  </html>");
		btnLvegetablePork.setBounds(0, 135, 216, 135);
		btnLvegetablePork.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchPork.add(btnLvegetablePork);
		
		btnLspicyGarlicPork = new JButton("<html><p>  L-Spicy\r\n    </p><p>  Garlic\r\n    </p><p>  Pork\r\n    </p>  </html>");
		btnLspicyGarlicPork.setBounds(0, 270, 216, 135);
		btnLspicyGarlicPork.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchPork.add(btnLspicyGarlicPork);
		
		btnLunchPork = new JButton("<html><p>  Lunch\r\n    </p><p>  Pork\r\n    </p><p>  \r\n    </p>  </html>");
		btnLunchPork.setBounds(864, 540, 216, 135);
		btnLunchPork.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchPork.add(btnLunchPork);
		
		PanelLunchFrLm = new JPanel();
		PanelMenuInterect.add(PanelLunchFrLm, "name_356471631623402");
		PanelLunchFrLm.setLayout(null);
		
		btnLvegetableFriedRice = new JButton("<html><p>  L-Vegetable\r\n    </p><p>  Fried Rice\r\n    </p><p>  \r\n    </p>  </html>");
		btnLvegetableFriedRice.setBounds(0, 0, 216, 135);
		btnLvegetableFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchFrLm.add(btnLvegetableFriedRice);
		
		btnLshirmpFriedRice = new JButton("<html><p>  L-Shirmp\r\n    </p><p>  Fried Rice\r\n    </p><p>  \r\n    </p>  </html>");
		btnLshirmpFriedRice.setBounds(216, 0, 216, 135);
		btnLshirmpFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchFrLm.add(btnLshirmpFriedRice);
		
		btnLvegetableLoMein = new JButton("<html><p>  L-Vegetable\r\n    </p><p>  Lo Mein\r\n    </p><p>  \r\n    </p>  </html>");
		btnLvegetableLoMein.setBounds(432, 0, 216, 135);
		btnLvegetableLoMein.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchFrLm.add(btnLvegetableLoMein);
		
		btnLshirmpLoMein = new JButton("<html><p>  L-Shirmp\r\n    </p><p>  Lo Mein\r\n    </p><p>  \r\n    </p>  </html>");
		btnLshirmpLoMein.setBounds(648, 0, 216, 135);
		btnLshirmpLoMein.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchFrLm.add(btnLshirmpLoMein);
		
		btnLchickenFriedRice = new JButton("<html><p>  L-Chicken\r\n    </p><p>  Fried Rice\r\n    </p><p>  \r\n    </p>  </html>");
		btnLchickenFriedRice.setBounds(0, 135, 216, 135);
		btnLchickenFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchFrLm.add(btnLchickenFriedRice);
		
		btnLhouseFriedRice = new JButton("<html><p>  L-House \r\n    </p><p>  Fried Rice\r\n    </p><p>  \r\n    </p>  </html>");
		btnLhouseFriedRice.setBounds(216, 135, 216, 135);
		btnLhouseFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchFrLm.add(btnLhouseFriedRice);
		
		btnLchickenLoMein = new JButton("<html><p>  L-Chicken\r\n    </p><p>  Lo Mein\r\n    </p><p>  \r\n    </p>  </html>");
		btnLchickenLoMein.setBounds(432, 135, 216, 135);
		btnLchickenLoMein.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchFrLm.add(btnLchickenLoMein);
		
		btnLhouseLoMein = new JButton("<html><p>  L-House\r\n    </p><p>  Lo Mein\r\n    </p><p>  \r\n    </p>  </html>");
		btnLhouseLoMein.setBounds(648, 135, 216, 135);
		btnLhouseLoMein.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchFrLm.add(btnLhouseLoMein);
		
		btnLbeefFriedRice = new JButton("<html><p>  L-Beef\r\n    </p><p>  Fried Rice\r\n    </p><p>  \r\n    </p>  </html>");
		btnLbeefFriedRice.setBounds(0, 270, 216, 135);
		btnLbeefFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchFrLm.add(btnLbeefFriedRice);
		
		btnLbeefLoMein = new JButton("<html><p>  L-Beef\r\n    </p><p>  Lo Mein\r\n    </p><p>  \r\n    </p>  </html>");
		btnLbeefLoMein.setBounds(432, 270, 216, 135);
		btnLbeefLoMein.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchFrLm.add(btnLbeefLoMein);
		
		btnLporkFriedRice = new JButton("<html><p>  L-Pork\r\n    </p><p>  Fried Rice\r\n    </p><p>  \r\n    </p>  </html>");
		btnLporkFriedRice.setBounds(0, 405, 216, 135);
		btnLporkFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchFrLm.add(btnLporkFriedRice);
		
		btnLporkLoMein = new JButton("<html><p>  L-Pork\r\n    </p><p>  Lo Mein\r\n    </p><p>  \r\n    </p>  </html>");
		btnLporkLoMein.setBounds(432, 405, 216, 135);
		btnLporkLoMein.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchFrLm.add(btnLporkLoMein);
		
		btnLunchFriedRice = new JButton("<html><p>  Lunch\r\n    </p><p>  Fried Rice\r\n    </p><p>  Lo Mein\r\n    </p>  </html>");
		btnLunchFriedRice.setBounds(864, 540, 216, 135);
		btnLunchFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchFrLm.add(btnLunchFriedRice);
		
		PanelLunchThai = new JPanel();
		PanelMenuInterect.add(PanelLunchThai, "name_356721551391305");
		PanelLunchThai.setLayout(null);
		
		btnLmassamanCurry = new JButton("<html><p>  L-Massaman\r\n    </p><p>  Curry\r\n    </p><p>  \r\n    </p>  </html>");
		btnLmassamanCurry.setBounds(0, 0, 216, 135);
		btnLmassamanCurry.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchThai.add(btnLmassamanCurry);
		
		btnLthaiRice = new JButton("<html><p>  L-Thai\r\n    </p><p>  Fried\r\n    </p><p>  Rice\r\n    </p>  </html>");
		btnLthaiRice.setBounds(216, 135, 216, 135);
		btnLthaiRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchThai.add(btnLthaiRice);
		
		btnVegetable = new JButton("<html><p>  Vegetable\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnVegetable.setBounds(648, 0, 216, 135);
		btnVegetable.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchThai.add(btnVegetable);
		
		btnShirmp = new JButton("<html><p>  Shirmp\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnShirmp.setBounds(864, 0, 216, 135);
		btnShirmp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchThai.add(btnShirmp);
		
		btnLpanangCurry = new JButton("<html><p>  L-Panang\r\n    </p><p>  Curry\r\n    </p><p>  \r\n    </p>  </html>");
		btnLpanangCurry.setBounds(0, 135, 216, 135);
		btnLpanangCurry.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchThai.add(btnLpanangCurry);
		
		btnLcoconutShirmp = new JButton("<html><p>  L-Coconut\r\n    </p><p>  Shirmp\r\n    </p><p>  \r\n    </p>  </html>");
		btnLcoconutShirmp.setBounds(216, 270, 216, 135);
		btnLcoconutShirmp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchThai.add(btnLcoconutShirmp);
		
		btnChicken = new JButton("<html><p>  Chicken\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnChicken.setBounds(648, 135, 216, 135);
		btnChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchThai.add(btnChicken);
		
		btnTriple = new JButton("<html><p>  Triple\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnTriple.setBounds(864, 135, 216, 135);
		btnTriple.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchThai.add(btnTriple);
		
		btnLgreenCurry = new JButton("<html><p>  L-Green\r\n    </p><p>  Curry\r\n    </p><p>  \r\n    </p>  </html>");
		btnLgreenCurry.setBounds(0, 270, 216, 135);
		btnLgreenCurry.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchThai.add(btnLgreenCurry);
		
		btnBeef = new JButton("<html><p>  Beef\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnBeef.setBounds(648, 270, 216, 135);
		btnBeef.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchThai.add(btnBeef);
		
		btnLspicyHalapeno = new JButton("<html><p>  L-Spicy\r\n    </p><p>  Halapeno\r\n    </p><p>  \r\n    </p>  </html>");
		btnLspicyHalapeno.setBounds(0, 405, 216, 135);
		btnLspicyHalapeno.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchThai.add(btnLspicyHalapeno);
		
		btnPork = new JButton("<html><p>  Pork\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnPork.setBounds(648, 405, 216, 135);
		btnPork.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchThai.add(btnPork);
		
		btnLbasilLeaves = new JButton("<html><p>  L-Basil\r\n    </p><p>  Leaves\r\n    </p><p>  \r\n    </p>  </html>");
		btnLbasilLeaves.setBounds(216, 0, 216, 135);
		btnLbasilLeaves.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchThai.add(btnLbasilLeaves);
		
		btnLunchThai = new JButton("<html><p>  Lunch\r\n    </p><p>  Thai\r\n    </p><p>  \r\n    </p>  </html>");
		btnLunchThai.setBounds(864, 540, 216, 135);
		btnLunchThai.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelLunchThai.add(btnLunchThai);
		
		PanelWing = new JPanel();
		PanelWing.setLayout(null);
		PanelMenuInterect.add(PanelWing, "name_372046671577853");
		
		btnWing = new JButton("<html><p>  8 Wing\r\n    </p><p>  1 Flavor\r\n    </p><p>  \r\n    </p>  </html>");
		btnWing.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWing.setBounds(0, 0, 216, 135);
		PanelWing.add(btnWing);
		
		btnWing_4 = new JButton("<html><p> 50  Wing\r\n    </p><p> 5  Flavor\r\n    </p><p>  \r\n    </p>  </html>");
		btnWing_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWing_4.setBounds(216, 0, 216, 135);
		PanelWing.add(btnWing_4);
		
		btnLemonPeper = new JButton("<html><p>  Lemon Pepper\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnLemonPeper.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnLemonPeper.setBounds(432, 0, 216, 135);
		PanelWing.add(btnLemonPeper);
		
		btnHotLemonPepper = new JButton("<html><p>  Hot\r\n    </p><p>  Lemon Pepper\r\n    </p><p>  \r\n    </p>  </html>");
		btnHotLemonPepper.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnHotLemonPepper.setBounds(648, 0, 216, 135);
		PanelWing.add(btnHotLemonPepper);
		
		btnSweetThaiChili = new JButton("<html><p>  Sweet Thai\r\n    </p><p>  Chili\r\n    </p><p>  \r\n    </p>  </html>");
		btnSweetThaiChili.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSweetThaiChili.setBounds(864, 0, 216, 135);
		PanelWing.add(btnSweetThaiChili);
		
		btnWing_1 = new JButton("<html><p> 10  Wing\r\n    </p><p>  1 Flavor\r\n    </p><p>  \r\n    </p>  </html>");
		btnWing_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWing_1.setBounds(0, 135, 216, 135);
		PanelWing.add(btnWing_1);
		
		btnWing_5 = new JButton("<html><p> 100  Wing\r\n    </p><p>  10 Flavor\r\n    </p><p>  \r\n    </p>  </html>");
		btnWing_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWing_5.setBounds(216, 135, 216, 135);
		PanelWing.add(btnWing_5);
		
		btnGarlicPepper = new JButton("<html><p>  Garlic Pepper\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnGarlicPepper.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnGarlicPepper.setBounds(432, 135, 216, 135);
		PanelWing.add(btnGarlicPepper);
		
		btnHotGarlicPepper = new JButton("<html><p>  Hot\r\n    </p><p>  Garlic Pepper\r\n    </p><p>  \r\n    </p>  </html>");
		btnHotGarlicPepper.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnHotGarlicPepper.setBounds(648, 135, 216, 135);
		PanelWing.add(btnHotGarlicPepper);
		
		btnWing_2 = new JButton("<html><p> 15  Wing\r\n    </p><p> 1  Flavor\r\n    </p><p>  \r\n    </p>  </html>");
		btnWing_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWing_2.setBounds(0, 270, 216, 135);
		PanelWing.add(btnWing_2);
		
		btnCajunBbq = new JButton("<html><p>  Cajun BBQ\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnCajunBbq.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCajunBbq.setBounds(432, 270, 216, 135);
		PanelWing.add(btnCajunBbq);
		
		btnHoneyBbq = new JButton("<html><p>  Honey BBQ\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnHoneyBbq.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnHoneyBbq.setBounds(648, 270, 216, 135);
		PanelWing.add(btnHoneyBbq);
		
		btnWing_3 = new JButton("<html><p> 20  Wing\r\n    </p><p> 2  Flavor\r\n    </p><p>  \r\n    </p>  </html>");
		btnWing_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWing_3.setBounds(0, 405, 216, 135);
		PanelWing.add(btnWing_3);
		
		btnMild = new JButton("<html><p>  Mild\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnMild.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnMild.setBounds(432, 405, 216, 135);
		PanelWing.add(btnMild);
		
		btnHot = new JButton("<html><p>  Hot\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnHot.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnHot.setBounds(648, 405, 216, 135);
		PanelWing.add(btnHot);
		
		btnExtraHot = new JButton("<html><p>  Extra Hot\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnExtraHot.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnExtraHot.setBounds(864, 405, 216, 135);
		PanelWing.add(btnExtraHot);
		
		btnTerayiki = new JButton("<html><p>  Terayiki\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnTerayiki.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnTerayiki.setBounds(432, 540, 216, 135);
		PanelWing.add(btnTerayiki);
		
		btnBraised = new JButton("<html><p>  Braised\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnBraised.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBraised.setBounds(648, 540, 216, 135);
		PanelWing.add(btnBraised);
		
		btnWing_7 = new JButton("Wing");
		btnWing_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWing_7.setBounds(864, 540, 216, 135);
		PanelWing.add(btnWing_7);
		
		PanelWingCB = new JPanel();
		PanelWingCB.setLayout(null);
		PanelMenuInterect.add(PanelWingCB, "name_372421595853867");
		
		btnWingFried = new JButton("<html><p>  8 wing\r\n    </p><p>  Fried Rice\r\n    </p><p>  \r\n    </p>  </html>");
		btnWingFried.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWingFried.setBounds(0, 0, 216, 135);
		PanelWingCB.add(btnWingFried);
		
		btnWingLo = new JButton("<html><p>  8 wing\r\n    </p><p>  Lo Mein\r\n    </p><p>  \r\n    </p>  </html>");
		btnWingLo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWingLo.setBounds(216, 0, 216, 135);
		PanelWingCB.add(btnWingLo);
		
		btnWingChicken = new JButton("<html><p>  8 wing\r\n    </p><p>  Chicken\r\n    </p><p>  Fried Rice\r\n    </p>  </html>");
		btnWingChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWingChicken.setBounds(0, 135, 216, 135);
		PanelWingCB.add(btnWingChicken);
		
		btnWingChicken_1 = new JButton("<html><p>  8 wing\r\n    </p><p>  Chicken\r\n    </p><p>  Lo Mein\r\n    </p>  </html>");
		btnWingChicken_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWingChicken_1.setBounds(216, 135, 216, 135);
		PanelWingCB.add(btnWingChicken_1);
		
		btnWingPork = new JButton("<html><p>  8 wing\r\n    </p><p>  Pork\r\n    </p><p>  Fried Rice\r\n    </p>  </html>");
		btnWingPork.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWingPork.setBounds(0, 270, 216, 135);
		PanelWingCB.add(btnWingPork);
		
		btnWingPork_1 = new JButton("<html><p>  8 wing\r\n    </p><p>  Pork\r\n    </p><p>  Lo Mein\r\n    </p>  </html>");
		btnWingPork_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWingPork_1.setBounds(216, 270, 216, 135);
		PanelWingCB.add(btnWingPork_1);
		
		btnWingBeef = new JButton("<html><p>  8 wing\r\n    </p><p>  Beef\r\n    </p><p>  Fried Rice\r\n    </p>  </html>");
		btnWingBeef.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWingBeef.setBounds(0, 405, 216, 135);
		PanelWingCB.add(btnWingBeef);
		
		btnWingBeef_1 = new JButton("<html><p>  8 wing\r\n    </p><p>  Beef\r\n    </p><p>  Lo Mein\r\n    </p>  </html>");
		btnWingBeef_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWingBeef_1.setBounds(216, 405, 216, 135);
		PanelWingCB.add(btnWingBeef_1);
		
		btnWingHouse = new JButton("<html><p>  8 wing\r\n    </p><p>  House\r\n    </p><p>  Fried Rice\r\n    </p>  </html>");
		btnWingHouse.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWingHouse.setBounds(432, 405, 216, 135);
		PanelWingCB.add(btnWingHouse);
		
		btnWingHouse_1 = new JButton("<html><p>  8 wing\r\n    </p><p>  House\r\n    </p><p>  Lo Mein\r\n    </p>  </html>");
		btnWingHouse_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWingHouse_1.setBounds(648, 405, 216, 135);
		PanelWingCB.add(btnWingHouse_1);
		
		btnWingShirmp = new JButton("<html><p>  8 wing\r\n    </p><p>  Shirmp\r\n    </p><p>  Fried Rice\r\n    </p>  </html>");
		btnWingShirmp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWingShirmp.setBounds(0, 540, 216, 135);
		PanelWingCB.add(btnWingShirmp);
		
		btnWingShirmp_1 = new JButton("<html><p>  8 wing\r\n    </p><p>  Shirmp\r\n    </p><p>  Lo Mein\r\n    </p>  </html>");
		btnWingShirmp_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWingShirmp_1.setBounds(216, 540, 216, 135);
		PanelWingCB.add(btnWingShirmp_1);
		
		button_118 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_118.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_118.setBounds(432, 540, 216, 135);
		PanelWingCB.add(button_118);
		
		button_119 = new JButton("<html><p>  \r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		button_119.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_119.setBounds(648, 540, 216, 135);
		PanelWingCB.add(button_119);
		
		btnWingFrench = new JButton("<html><p>  8 wing\r\n    </p><p>  French Fries\r\n    </p><p>  \r\n    </p>  </html>");
		btnWingFrench.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWingFrench.setBounds(432, 0, 216, 135);
		PanelWingCB.add(btnWingFrench);
		
		JButton btnWingCombo_1 = new JButton("Wing Combo");
		btnWingCombo_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnWingCombo_1.setBounds(864, 540, 216, 135);
		PanelWingCB.add(btnWingCombo_1);
		
		JPanel PanelDinCB = new JPanel();
		PanelDinCB.setLayout(null);
		PanelMenuInterect.add(PanelDinCB, "name_375162561121618");
		
		JButton btnDSesameChicken = new JButton("<html><p>  D Sesame\r\n    </p><p>  Chicken\r\n    </p><p>  \r\n    </p>  </html>");
		btnDSesameChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDSesameChicken.setBounds(0, 0, 216, 135);
		PanelDinCB.add(btnDSesameChicken);
		
		JButton btnDHunanTriple = new JButton("<html><p>  D Hunan\r\n    </p><p>  Triple\r\n    </p><p>  Crown\r\n    </p>  </html>");
		btnDHunanTriple.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDHunanTriple.setBounds(216, 0, 216, 135);
		PanelDinCB.add(btnDHunanTriple);
		
		JButton btnDMongolianBeef = new JButton("<html><p>  D Mongolian\r\n    </p><p>  Beef\r\n    </p><p>  \r\n    </p>  </html>");
		btnDMongolianBeef.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDMongolianBeef.setBounds(432, 0, 216, 135);
		PanelDinCB.add(btnDMongolianBeef);
		
		JButton btnDSweetSour_2 = new JButton("<html><p>  D Sweet\r\n    </p><p>  Sour\r\n    </p><p>  Shirmp\r\n    </p>  </html>");
		btnDSweetSour_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDSweetSour_2.setBounds(648, 0, 216, 135);
		PanelDinCB.add(btnDSweetSour_2);
		
		JButton btnDCoconutShirmp = new JButton("<html><p>  D Coconut\r\n    </p><p>  Shirmp\r\n    </p><p>  \r\n    </p>  </html>");
		btnDCoconutShirmp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDCoconutShirmp.setBounds(864, 0, 216, 135);
		PanelDinCB.add(btnDCoconutShirmp);
		
		JButton btnDGeneralTso = new JButton("<html><p>  D General\r\n    </p><p>  Tso Chicken\r\n    </p><p>  \r\n    </p>  </html>");
		btnDGeneralTso.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDGeneralTso.setBounds(0, 135, 216, 135);
		PanelDinCB.add(btnDGeneralTso);
		
		JButton btnDTerayikiChicken = new JButton("<html><p>  D Terayiki\r\n    </p><p>  Chicken\r\n    </p><p>  \r\n    </p>  </html>");
		btnDTerayikiChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDTerayikiChicken.setBounds(216, 135, 216, 135);
		PanelDinCB.add(btnDTerayikiChicken);
		
		JButton btnDPepperSteak = new JButton("<html><p>  D Pepper\r\n    </p><p>  Steak\r\n    </p><p>  \r\n    </p>  </html>");
		btnDPepperSteak.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDPepperSteak.setBounds(432, 135, 216, 135);
		PanelDinCB.add(btnDPepperSteak);
		
		JButton btnDVegetableShirmp = new JButton("<html><p>  D Vegetable Shirmp\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnDVegetableShirmp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDVegetableShirmp.setBounds(648, 135, 216, 135);
		PanelDinCB.add(btnDVegetableShirmp);
		
		JButton btnDMongolianChicken = new JButton("<html><p>  D Mongolian\r\n    </p><p>  Chicken\r\n    </p><p>  \r\n    </p>  </html>");
		btnDMongolianChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDMongolianChicken.setBounds(0, 270, 216, 135);
		PanelDinCB.add(btnDMongolianChicken);
		
		JButton btnDSweetSour = new JButton("<html><p>  D Sweet\r\n    </p><p>  Sour\r\n    </p><p>  Chicken\r\n    </p>  </html>");
		btnDSweetSour.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDSweetSour.setBounds(216, 270, 216, 135);
		PanelDinCB.add(btnDSweetSour);
		
		JButton btnDTerayikiBeef = new JButton("<html><p>  D Terayiki\r\n    </p><p>  Beef\r\n    </p><p>  \r\n    </p>  </html>");
		btnDTerayikiBeef.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDTerayikiBeef.setBounds(432, 270, 216, 135);
		PanelDinCB.add(btnDTerayikiBeef);
		
		JButton btnDTerayikiShirmp = new JButton("<html><p>  D Terayiki\r\n    </p><p>  Shirmp\r\n    </p><p>  \r\n    </p>  </html>");
		btnDTerayikiShirmp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDTerayikiShirmp.setBounds(648, 270, 216, 135);
		PanelDinCB.add(btnDTerayikiShirmp);
		
		JButton btnDVegetableChicken = new JButton("<html><p>  D Vegetable Chicken\r\n    </p><p>  \r\n    </p><p>  \r\n    </p>  </html>");
		btnDVegetableChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDVegetableChicken.setBounds(0, 405, 216, 135);
		PanelDinCB.add(btnDVegetableChicken);
		
		JButton btnDKungPao = new JButton("<html><p>  D Kung Pao\r\n    </p><p>  Chicken\r\n    </p><p>  \r\n    </p>  </html>");
		btnDKungPao.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDKungPao.setBounds(216, 405, 216, 135);
		PanelDinCB.add(btnDKungPao);
		
		JButton btnDBroccoliBeef = new JButton("<html><p>  D Broccoli\r\n    </p><p>  Beef\r\n    </p><p>  \r\n    </p>  </html>");
		btnDBroccoliBeef.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDBroccoliBeef.setBounds(432, 405, 216, 135);
		PanelDinCB.add(btnDBroccoliBeef);
		
		JButton btnDBroccoliShirmp = new JButton("<html><p>  D Broccoli\r\n    </p><p>  Shirmp\r\n    </p><p>  \r\n    </p>  </html>");
		btnDBroccoliShirmp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDBroccoliShirmp.setBounds(648, 405, 216, 135);
		PanelDinCB.add(btnDBroccoliShirmp);
		
		JButton btnDOrangeChicken = new JButton("<html><p>  D Orange\r\n    </p><p>  Chicken\r\n    </p><p>  \r\n    </p>  </html>");
		btnDOrangeChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDOrangeChicken.setBounds(0, 540, 216, 135);
		PanelDinCB.add(btnDOrangeChicken);
		
		JButton btnDBroccoliChicken = new JButton("<html><p>  D Broccoli\r\n    </p><p>  Chicken\r\n    </p><p>  \r\n    </p>  </html>");
		btnDBroccoliChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDBroccoliChicken.setBounds(216, 540, 216, 135);
		PanelDinCB.add(btnDBroccoliChicken);
		
		JButton btnDSweetSour_1 = new JButton("<html><p>  D Sweet\r\n    </p><p>  Sour\r\n    </p><p>  Pork\r\n    </p>  </html>");
		btnDSweetSour_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDSweetSour_1.setBounds(432, 540, 216, 135);
		PanelDinCB.add(btnDSweetSour_1);
		
		JButton btnDHunanShirmp = new JButton("<html><p>  D Hunan\r\n    </p><p>  Shirmp\r\n    </p><p>  \r\n    </p>  </html>");
		btnDHunanShirmp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDHunanShirmp.setBounds(648, 540, 216, 135);
		PanelDinCB.add(btnDHunanShirmp);
		
		JButton btnDinnerCombo_1 = new JButton("Dinner Combo");
		btnDinnerCombo_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDinnerCombo_1.setBounds(864, 540, 216, 135);
		PanelDinCB.add(btnDinnerCombo_1);
		
		JPanel PanelMenuNavg = new JPanel();
		PanelMenuNavg.setBounds(1855, 10, 70, 990);
		ContPaneOrderIntf.add(PanelMenuNavg);
		PanelMenuNavg.setLayout(null);
		
		JButton btnNewButton = new JButton("<html><p>  U\r\n    </p><p>  P\r\n    </p></html>");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton.setBounds(5, 345, 60, 150);
		PanelMenuNavg.add(btnNewButton);
		
		JButton btnDOW = new JButton("<html><p>  D\r\n    </p><p>  O\r\n    </p><p>  W\r\n    </p><p>  N\r\n    </p></html>");
		btnDOW.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnDOW.setBounds(5, 500, 60, 150);
		PanelMenuNavg.add(btnDOW);
		
		JButton button_17 = new JButton("<html><p>  U\r\n    </p><p>  P\r\n    </p></html>");
		button_17.setFont(new Font("Tahoma", Font.PLAIN, 35));
		button_17.setBounds(5, 680, 60, 150);
		PanelMenuNavg.add(button_17);
		
		JButton button_53 = new JButton("<html><p>  D\r\n    </p><p>  O\r\n    </p><p>  W\r\n    </p><p>  N\r\n    </p></html>");
		button_53.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_53.setBounds(5, 835, 60, 150);
		PanelMenuNavg.add(button_53);
		
		JPanel PanelMenuShoCut = new JPanel();
		PanelMenuShoCut.setBounds(770, 685, 1080, 315);
		ContPaneOrderIntf.add(PanelMenuShoCut);
		PanelMenuShoCut.setLayout(new CardLayout(0, 0));
		
		JPanel PanelMenuShoCut1 = new JPanel();
		PanelMenuShoCut.add(PanelMenuShoCut1, "name_373751917750048");
		PanelMenuShoCut1.setLayout(null);
		
		JButton button_54 = new JButton("Appetizers");
		button_54.setBounds(0, 1, 216, 78);
		button_54.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut1.add(button_54);
		
		JButton btnSoup_1 = new JButton("Soup");
		btnSoup_1.setBounds(216, 1, 216, 78);
		btnSoup_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut1.add(btnSoup_1);
		
		JButton btnFriedRice_2 = new JButton("Fried Rice");
		btnFriedRice_2.setBounds(432, 1, 216, 78);
		btnFriedRice_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut1.add(btnFriedRice_2);
		
		JButton btnLoMien = new JButton("Lo Mien");
		btnLoMien.setBounds(648, 1, 216, 78);
		btnLoMien.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut1.add(btnLoMien);
		
		JButton btnChicken_1 = new JButton("Chicken");
		btnChicken_1.setBounds(0, 79, 216, 78);
		btnChicken_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut1.add(btnChicken_1);
		
		JButton btnBeef_1 = new JButton("Beef");
		btnBeef_1.setBounds(216, 79, 216, 78);
		btnBeef_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut1.add(btnBeef_1);
		
		JButton btnPork_1 = new JButton("Pork");
		btnPork_1.setBounds(432, 79, 216, 78);
		btnPork_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut1.add(btnPork_1);
		
		JButton btnSeafood = new JButton("Seafood");
		btnSeafood.setBounds(648, 79, 216, 78);
		btnSeafood.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut1.add(btnSeafood);
		
		JButton btnSideOrder = new JButton("Side Order");
		btnSideOrder.setBounds(864, 79, 216, 78);
		btnSideOrder.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut1.add(btnSideOrder);
		
		JButton btnVegetable_1 = new JButton("Vegetable");
		btnVegetable_1.setBounds(0, 157, 216, 78);
		btnVegetable_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut1.add(btnVegetable_1);
		
		JButton btnEggFooYong = new JButton("Egg Foo Yong");
		btnEggFooYong.setBounds(216, 157, 216, 78);
		btnEggFooYong.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut1.add(btnEggFooYong);
		
		JButton btnChefsSpecial = new JButton("Chef's Special");
		btnChefsSpecial.setBounds(432, 157, 216, 78);
		btnChefsSpecial.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut1.add(btnChefsSpecial);
		
		JButton btnThai = new JButton("Thai");
		btnThai.setBounds(648, 157, 216, 78);
		btnThai.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut1.add(btnThai);
		
		JButton btnKidMenu = new JButton("Kid Menu");
		btnKidMenu.setBounds(864, 157, 216, 78);
		btnKidMenu.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut1.add(btnKidMenu);
		
		JButton btnBeverages = new JButton("Beverages");
		btnBeverages.setBounds(864, 235, 216, 78);
		btnBeverages.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut1.add(btnBeverages);
		
		JPanel PanelMenuShoCut2 = new JPanel();
		PanelMenuShoCut.add(PanelMenuShoCut2, "name_374879762755115");
		PanelMenuShoCut2.setLayout(null);
		
		JButton btnLChicken = new JButton("L Chicken");
		btnLChicken.setBounds(0, 1, 216, 78);
		btnLChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut2.add(btnLChicken);
		
		JButton btnLBeef = new JButton("L Beef");
		btnLBeef.setBounds(216, 1, 216, 78);
		btnLBeef.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut2.add(btnLBeef);
		
		JButton btnLPork = new JButton("L Pork");
		btnLPork.setBounds(432, 1, 216, 78);
		btnLPork.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut2.add(btnLPork);
		
		JButton btnLSeafood = new JButton("L Seafood");
		btnLSeafood.setBounds(648, 1, 216, 78);
		btnLSeafood.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut2.add(btnLSeafood);
		
		JButton btnLVegetable = new JButton("L Vegetable");
		btnLVegetable.setBounds(0, 79, 216, 78);
		btnLVegetable.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut2.add(btnLVegetable);
		
		JButton btnLFriedRice = new JButton("L Fried Rice");
		btnLFriedRice.setBounds(432, 79, 216, 78);
		btnLFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut2.add(btnLFriedRice);
		
		JButton btnLLoMein = new JButton("L Lo Mein");
		btnLLoMein.setBounds(648, 79, 216, 78);
		btnLLoMein.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut2.add(btnLLoMein);
		
		JButton btnLThai = new JButton("L Thai");
		btnLThai.setBounds(648, 157, 216, 78);
		btnLThai.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut2.add(btnLThai);
		
		JButton btnWing_6 = new JButton("Wing");
		btnWing_6.setBounds(0, 235, 216, 78);
		btnWing_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut2.add(btnWing_6);
		
		JButton btnWingCombo = new JButton("Wing Combo");
		btnWingCombo.setBounds(216, 235, 216, 78);
		btnWingCombo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PanelMenuShoCut2.add(btnWingCombo);
		
		btnDinnerCombo = new JButton("Dinner Combo");
		btnDinnerCombo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDinnerCombo.setBounds(648, 235, 216, 78);
		PanelMenuShoCut2.add(btnDinnerCombo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 520, 755, 405);
		ContPaneOrderIntf.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JList list = new JList();
		list.setFont(new Font("Tahoma", Font.PLAIN, 25));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"000", "000", "000"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel.add(list, BorderLayout.WEST);
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"DC Sesame Chicken", "LC Moo Guu Gai Pan", "whatever the customer want"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(list_1, BorderLayout.CENTER);
		
		JList list_2 = new JList();
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"000.00"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(list_2, BorderLayout.EAST);
		
	}
	
	private void createEvents() 
	{
		
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
					OrderPanel frame = new OrderPanel();
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
