package RestaurantSystem_change;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.List;

public class MainController
{
	@FXML ListView listvCurrentFood;
	
	@FXML Text textSubtotalValue;
	@FXML Text textTaxValue;
	@FXML Text textTotalValue;
	
	List<Double> subtotalList = new ArrayList<>();
	double subtotal = 0;
	double tax = 0;
	double total = 0;
	
	//Calculation
	public void addItem(String foodName)
	{
		ObservableList<String> tempFoodList =  listvCurrentFood.getItems(); //ListView only take ObservableList data type
		tempFoodList.add(tempFoodList.size(), foodName);
		listvCurrentFood.setItems(tempFoodList);
	}

	public void addSubtotal(double price)
	{
		subtotalList.add(price);
	}

	public void computeSubtotal()
	{
		for(double price : subtotalList)
		{
			subtotal+=price;
		}
		subtotal = Math.round(subtotal * 100.0) / 100.0;
		
	}
	
	public void computeTax()
	{
		tax = subtotal * 0.06;
		tax = Math.round(tax * 100.0) / 100.0;
	}
	
	public void computeTotal()
	{
		total = tax + subtotal;
		total = Math.round(total * 100.0) / 100.0;
	}
	
	public void updatePrice()
	{
		subtotal = 0;
		computeSubtotal();
		computeTax();
		computeTotal();
		
		textSubtotalValue.setText("$" + Double.toString(subtotal) );
		textTaxValue.setText("$" + Double.toString(tax) );
		textTotalValue.setText("$" + Double.toString(total) );
		
		String subtotalTemp = textSubtotalValue.getText();
		String taxTemp = textTaxValue.getText();
		String totalTemp = textTotalValue.getText();
		
		//Ckeck price value and will add "0" accordingly
		if ((subtotalTemp.substring(subtotalTemp.indexOf("."))).length() < 3)
		{
			String subtotal = subtotalTemp + "0";
			textSubtotalValue.setText(subtotal);
		}
		if ((taxTemp.substring(taxTemp.indexOf("."))).length() < 3)
		{
			String tax = taxTemp + "0";
			textTaxValue.setText(tax);
		}
		if ((totalTemp.substring(totalTemp.indexOf("."))).length() < 3)
		{
			String total = totalTemp + "0";
			textTotalValue.setText(total);
		}
			
	}
	
	//Additon Function
	public void onAdd()
	{
		ObservableList<String> tempFoodList =  listvCurrentFood.getItems();
		int selectedItem = listvCurrentFood.getSelectionModel().getSelectedIndex();
		String selectedItemName = tempFoodList.get(selectedItem);
		tempFoodList.add(selectedItem + 1 ,selectedItemName);
		
		listvCurrentFood.setItems(tempFoodList);		
		subtotalList.add(selectedItem + 1 , subtotalList.get(selectedItem));
		updatePrice();
	}
	public void onDelete()
	{
		ObservableList<String> tempFoodList =  listvCurrentFood.getItems();
		int selectedItem = listvCurrentFood.getSelectionModel().getSelectedIndex();
		tempFoodList.remove(selectedItem);
		
		listvCurrentFood.setItems(tempFoodList);		
		subtotalList.remove(selectedItem);
		updatePrice();
	}
	public void onNew()
	{
		ObservableList<String> tempFoodList =  listvCurrentFood.getItems();
		tempFoodList.remove(0 ,tempFoodList.size());
		subtotalList.clear();
		updatePrice();
	}
	public void onSave()
	{
		
	}
	
	
	
	/*
	//Template for buttons
	public void on()
	{
		addItem("8 Wing w/ ");
		addSubtotal( );
		updatePrice();
	}
	*/

	//*Lunch Start------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	//*Lunch Chicken------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onLChicken1()
	{
		addItem("LTerayiki Chicken");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLChicken2()
	{
		addItem("LKung Pao Chicken");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLChicken3()
	{
		addItem("LVegetable Chicken");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLChicken4()
	{
		addItem("LHoney Chicken");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLChicken5()
	{
		addItem("LString Bean Chicken");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLChicken6()
	{
		addItem("LBroccoli Chicken");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLChicken7()
	{
		addItem("LHunan Chicken");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLChicken8()
	{
		addItem("LSweet & Sour Chicken");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLChicken9()
	{
		addItem("LMogolian Chicken");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLChicken10()
	{
		addItem("LMoo Shu Chicken");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLChicken11()
	{
		addItem("LSpicy Garlic Chicken");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLChicken12()
	{
		addItem("LSesame Chicken");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLChicken13()
	{
		addItem("LGeneral Tso Chicken");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLChicken14()
	{
		addItem("LOrange Chicken");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLChicken15()
	{
		addItem("LPepper Chicken");
		addSubtotal( 5.00);
		updatePrice();
	}

	//*Lunch Beef------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onLBeef1()
	{
		addItem("LTerayiki Beef");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLBeef2()
	{
		addItem("LKung Pao Beef");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLBeef3()
	{
		addItem("LVegetable Beef");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLBeef4()
	{
		addItem("LHoney Beef");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLBeef5()
	{
		addItem("LString Bean Beef");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLBeef6()
	{
		addItem("LBroccoli Beef");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLBeef7()
	{
		addItem("LHunan Beef");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLBeef8()
	{
		addItem("LSweet & Sour Beef");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLBeef9()
	{
		addItem("LMogolian Beef");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLBeef10()
	{
		addItem("LMoo Shu Beef");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLBeef11()
	{
		addItem("LSpicy Garlic Beef");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLBeef12()
	{
		addItem("LSesame Beef");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLBeef13()
	{
		addItem("LGeneral Tso Beef");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLBeef14()
	{
		addItem("LOrange Beef");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLBeef15()
	{
		addItem("LPepper Beef");
		addSubtotal( 5.25);
		updatePrice();
	}
	
	//*Lunch Pork------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onLPork1()
	{
		addItem("LTerayiki Pork");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLPork2()
	{
		addItem("LKung Pao Pork");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLPork3()
	{
		addItem("LVegetable Pork");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLPork4()
	{
		addItem("LHoney Pork");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLPork5()
	{
		addItem("LString Bean Pork");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLPork6()
	{
		addItem("LBroccoli Pork");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLPork7()
	{
		addItem("LHunan Pork");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLPork8()
	{
		addItem("LSweet & Sour Pork");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLPork9()
	{
		addItem("LMogolian Pork");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLPork10()
	{
		addItem("LMoo Shu Pork");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLPork11()
	{
		addItem("LSpicy Garlic Pork");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLPork12()
	{
		addItem("LSesame Pork");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLPork13()
	{
		addItem("LGeneral Tso Pork");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLPork14()
	{
		addItem("LOrange Pork");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLPork15()
	{
		addItem("LPepper Pork");
		addSubtotal( 5.00);
		updatePrice();
	}
	
	//*Lunch Shirmp------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onLShirmp1()
	{
		addItem("LTerayiki Shirmp");
		addSubtotal( 5.75);
		updatePrice();
	}
	public void onLShirmp2()
	{
		addItem("LKung Pao Shirmp");
		addSubtotal( 5.75);
		updatePrice();
	}
	public void onLShirmp3()
	{
		addItem("LVegetable Shirmp");
		addSubtotal( 5.75);
		updatePrice();
	}
	public void onLShirmp4()
	{
		addItem("LHoney Shirmp");
		addSubtotal( 5.75);
		updatePrice();
	}
	public void onLShirmp5()
	{
		addItem("LString Bean Shirmp");
		addSubtotal( 5.75);
		updatePrice();
	}
	public void onLShirmp6()
	{
		addItem("LBroccoli Shirmp");
		addSubtotal( 5.75);
		updatePrice();
	}
	public void onLShirmp7()
	{
		addItem("LHunan Shirmp");
		addSubtotal( 5.75);
		updatePrice();
	}
	public void onLShirmp8()
	{
		addItem("LSweet & Sour Shirmp");
		addSubtotal( 5.75);
		updatePrice();
	}
	public void onLShirmp9()
	{
		addItem("LMogolian Shirmp");
		addSubtotal( 5.75);
		updatePrice();
	}
	public void onLShirmp10()
	{
		addItem("LMoo Shu Shirmp");
		addSubtotal( 5.75);
		updatePrice();
	}
	public void onLShirmp11()
	{
		addItem("LSpicy Garlic Shirmp");
		addSubtotal( 5.75);
		updatePrice();
	}
	public void onLShirmp12()
	{
		addItem("LSesame Shirmp");
		addSubtotal( 5.75);
		updatePrice();
	}
	public void onLShirmp13()
	{
		addItem("LGeneral Tso Shirmp");
		addSubtotal( 5.75);
		updatePrice();
	}
	public void onLShirmp14()
	{
		addItem("LOrange Shirmp");
		addSubtotal( 5.75);
		updatePrice();
	}
	public void onLShirmp15()
	{
		addItem("LPepper Shirmp");
		addSubtotal( 5.75);
		updatePrice();
	}
	
	//*Lunch Vegetable------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onLVegetable1()
	{
		addItem("LTerayiki Vegetable");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLVegetable2()
	{
		addItem("LKung Pao Vegetable");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLVegetable3()
	{
		addItem("LSteam Vegetable");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLVegetable4()
	{
		addItem("LHoney Vegetable");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLVegetable5()
	{
		addItem("LSteam String Bean");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLVegetable6()
	{
		addItem("LSteam Broccoli");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLVegetable7()
	{
		addItem("LHunan Vegetable");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLVegetable8()
	{
		addItem("LSweet & Sour Vegetable");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLVegetable9()
	{
		addItem("LMogolian Vegetable");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLVegetable10()
	{
		addItem("LMoo Shu Vegetable");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLVegetable11()
	{
		addItem("LSpicy Garlic Vegetable");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLVegetable12()
	{
		addItem("LSesame Vegetable");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLVegetable13()
	{
		addItem("LGeneral Tso Vegetable");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLVegetable14()
	{
		addItem("LOrange Vegetable");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLVegetable15()
	{
		addItem("LSauteed Pepper");
		addSubtotal( 5.00);
		updatePrice();
	}
	
	//*Lunch Thai------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onLThai1()
	{
		addItem("LMassaman Curry");
		addSubtotal( 0.00);
		updatePrice();
	}
	public void onLThai2()
	{
		addItem("LThai Jalapeno");
		addSubtotal( 0.00);
		updatePrice();
	}
	public void onLThai3()
	{
		addItem("	Vegetable");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLThai4()
	{
		addItem("LPanang Curry");
		addSubtotal( 0.00);
		updatePrice();
	}
	public void onLThai5()
	{
		addItem("LThai Basil");
		addSubtotal( 0.00);
		updatePrice();
	}
	public void onLThai6()
	{
		addItem("	Chicken");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLThai7()
	{
		addItem("LGreen Curry");
		addSubtotal( 0.00);
		updatePrice();
	}
	public void onLThai8()
	{
		addItem("LPad Tai");
		addSubtotal( 0.00);
		updatePrice();
	}
	public void onLThai9()
	{
		addItem("	Beef");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLThai10()
	{
		addItem("LRoast Chili");
		addSubtotal( 0.00);
		updatePrice();
	}
	public void onLThai11()
	{
		addItem("LFried Rice Thai");
		addSubtotal( 0.00);
		updatePrice();
	}
	public void onLThai12()
	{
		addItem("	Pork");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLThai15()
	{
		addItem("	Shirmp");
		addSubtotal( 5.75);
		updatePrice();
	}
	
	//*Lunch Rice/Noodle------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onLRiceNoodle1()
	{
		addItem("LVegetable Fried Rice");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLRiceNoodle2()
	{
		addItem("LVegetable Lo Mein");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLRiceNoodle3()
	{
		addItem("LVegetable Mi Fun");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLRiceNoodle4()
	{
		addItem("LChicken Fried Rice");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLRiceNoodle5()
	{
		addItem("LChicken Lo Mein");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLRiceNoodle6()
	{
		addItem("LChicken Mi Fun");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLRiceNoodle7()
	{
		addItem("LBeef Fried Rice");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLRiceNoodle8()
	{
		addItem("LBeef Lo Mein");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLRiceNoodle9()
	{
		addItem("LBeef Mi Fun");
		addSubtotal( 5.25);
		updatePrice();
	}
	public void onLRiceNoodle10()
	{
		addItem("LPork Fried Rice");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLRiceNoodle11()
	{
		addItem("LPork Lo Mein");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLRiceNoodle12()
	{
		addItem("LPork Mi Fun");
		addSubtotal( 5.00);
		updatePrice();
	}
	public void onLRiceNoodle13()
	{
		addItem("LShirmp Fried Rice");
		addSubtotal( 5.75);
		updatePrice();
	}
	public void onLRiceNoodle14()
	{
		addItem("LShirmp Lo Mein");
		addSubtotal( 5.75);
		updatePrice();
	}
	public void onLRiceNoodle15()
	{
		addItem("LShirmp Mi Fun");
		addSubtotal( 5.75);
		updatePrice();
	}
	public void onLRiceNoodle16()
	{
		addItem("LHouse Fried Rice");
		addSubtotal( 6.00);
		updatePrice();
	}
	public void onLRiceNoodle17()
	{
		addItem("LHouse Lo Mein");
		addSubtotal( 6.00);
		updatePrice();
	}
	public void onLRiceNoodle18()
	{
		addItem("LHouse Mi Fun");
		addSubtotal( 6.00);
		updatePrice();
	}
	public void onLRiceNoodle19()
	{
		addItem("Plain Fried Rice");
		addSubtotal( 2.00);
		updatePrice();
	}
	public void onLRiceNoodle20()
	{
		addItem("Plain Lo Mein");
		addSubtotal( 3.00);
		updatePrice();
	}
	public void onLRiceNoodle21()
	{
		addItem("Plain Mi Fun");
		addSubtotal( 3.00);
		updatePrice();
	}
	public void onLRiceNoodle22()
	{
		addItem("Steamed Rice");
		addSubtotal( 1.50);
		updatePrice();
	}
	//*Lunch End------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	//*Dinner Start------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	//*Dinner Chicken------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onDChicken1()
	{
		addItem("DTerayiki Chicken");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDChicken2()
	{
		addItem("DKung Pao Chicken");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDChicken3()
	{
		addItem("DVegetable Chicken");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDChicken4()
	{
		addItem("DHoney Chicken");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDChicken5()
	{
		addItem("DString Bean Chicken");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDChicken6()
	{
		addItem("DBroccoli Chicken");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDChicken7()
	{
		addItem("DHunan Chicken");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDChicken8()
	{
		addItem("DSweet & Sour Chicken");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDChicken9()
	{
		addItem("DMogolian Chicken");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDChicken10()
	{
		addItem("DMoo Shu Chicken");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDChicken11()
	{
		addItem("DSpicy Garlic Chicken");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDChicken12()
	{
		addItem("DSesame Chicken");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDChicken13()
	{
		addItem("DGeneral Tso Chicken");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDChicken14()
	{
		addItem("DOrange Chicken");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDChicken15()
	{
		addItem("DPepper Chicken");
		addSubtotal( 8.00);
		updatePrice();
	}

	//*Dinner Beef------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onDBeef1()
	{
		addItem("DTerayiki Beef");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDBeef2()
	{
		addItem("DKung Pao Beef");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDBeef3()
	{
		addItem("DVegetable Beef");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDBeef4()
	{
		addItem("DHoney Beef");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDBeef5()
	{
		addItem("DString Bean Beef");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDBeef6()
	{
		addItem("DBroccoli Beef");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDBeef7()
	{
		addItem("DHunan Beef");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDBeef8()
	{
		addItem("DSweet & Sour Beef");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDBeef9()
	{
		addItem("DMogolian Beef");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDBeef10()
	{
		addItem("DMoo Shu Beef");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDBeef11()
	{
		addItem("DSpicy Garlic Beef");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDBeef12()
	{
		addItem("DSesame Beef");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDBeef13()
	{
		addItem("DGeneral Tso Beef");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDBeef14()
	{
		addItem("DOrange Beef");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDBeef15()
	{
		addItem("DPepper Beef");
		addSubtotal( 8.25);
		updatePrice();
	}
	
	//*Dinner Pork------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onDPork1()
	{
		addItem("DTerayiki Pork");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDPork2()
	{
		addItem("DKung Pao Pork");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDPork3()
	{
		addItem("DVegetable Pork");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDPork4()
	{
		addItem("DHoney Pork");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDPork5()
	{
		addItem("DString Bean Pork");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDPork6()
	{
		addItem("DBroccoli Pork");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDPork7()
	{
		addItem("DHunan Pork");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDPork8()
	{
		addItem("DSweet & Sour Pork");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDPork9()
	{
		addItem("DMogolian Pork");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDPork10()
	{
		addItem("DMoo Shu Pork");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDPork11()
	{
		addItem("DSpicy Garlic Pork");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDPork12()
	{
		addItem("DSesame Pork");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDPork13()
	{
		addItem("DGeneral Tso Pork");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDPork14()
	{
		addItem("DOrange Pork");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDPork15()
	{
		addItem("DPepper Pork");
		addSubtotal( 8.00);
		updatePrice();
	}
	
	//*Dinner Shirmp------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onDShirmp1()
	{
		addItem("DTerayiki Shirmp");
		addSubtotal( 8.75);
		updatePrice();
	}
	public void onDShirmp2()
	{
		addItem("DKung Pao Shirmp");
		addSubtotal( 8.75);
		updatePrice();
	}
	public void onDShirmp3()
	{
		addItem("DVegetable Shirmp");
		addSubtotal( 8.75);
		updatePrice();
	}
	public void onDShirmp4()
	{
		addItem("DHoney Shirmp");
		addSubtotal( 8.75);
		updatePrice();
	}
	public void onDShirmp5()
	{
		addItem("DString Bean Shirmp");
		addSubtotal( 8.75);
		updatePrice();
	}
	public void onDShirmp6()
	{
		addItem("DBroccoli Shirmp");
		addSubtotal( 8.75);
		updatePrice();
	}
	public void onDShirmp7()
	{
		addItem("DHunan Shirmp");
		addSubtotal( 8.75);
		updatePrice();
	}
	public void onDShirmp8()
	{
		addItem("DSweet & Sour Shirmp");
		addSubtotal( 8.75);
		updatePrice();
	}
	public void onDShirmp9()
	{
		addItem("DMogolian Shirmp");
		addSubtotal( 8.75);
		updatePrice();
	}
	public void onDShirmp10()
	{
		addItem("DMoo Shu Shirmp");
		addSubtotal( 8.75);
		updatePrice();
	}
	public void onDShirmp11()
	{
		addItem("DSpicy Garlic Shirmp");
		addSubtotal( 8.75);
		updatePrice();
	}
	public void onDShirmp12()
	{
		addItem("DSesame Shirmp");
		addSubtotal( 8.75);
		updatePrice();
	}
	public void onDShirmp13()
	{
		addItem("DGeneral Tso Shirmp");
		addSubtotal( 8.75);
		updatePrice();
	}
	public void onDShirmp14()
	{
		addItem("DOrange Shirmp");
		addSubtotal( 8.75);
		updatePrice();
	}
	public void onDShirmp15()
	{
		addItem("DPepper Shirmp");
		addSubtotal( 8.75);
		updatePrice();
	}
	
	//*Dinner Vegetable------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onDVegetable1()
	{
		addItem("DTerayiki Vegetable");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDVegetable2()
	{
		addItem("DKung Pao Vegetable");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDVegetable3()
	{
		addItem("DSteam Vegetable");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDVegetable4()
	{
		addItem("DHoney Vegetable");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDVegetable5()
	{
		addItem("DSteam String Bean");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDVegetable6()
	{
		addItem("DSteam Broccoli");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDVegetable7()
	{
		addItem("DHunan Vegetable");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDVegetable8()
	{
		addItem("DSweet & Sour Vegetable");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDVegetable9()
	{
		addItem("DMogolian Vegetable");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDVegetable10()
	{
		addItem("DMoo Shu Vegetable");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDVegetable11()
	{
		addItem("DSpicy Garlic Vegetable");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDVegetable12()
	{
		addItem("DSesame Vegetable");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDVegetable13()
	{
		addItem("DGeneral Tso Vegetable");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDVegetable14()
	{
		addItem("DOrange Vegetable");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDVegetable15()
	{
		addItem("DSauteed Pepper");
		addSubtotal( 8.00);
		updatePrice();
	}
	
	//*Dinner Thai------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onDThai1()
	{
		addItem("DMassaman Curry");
		addSubtotal( 0.00);
		updatePrice();
	}
	public void onDThai2()
	{
		addItem("DThai Jalapeno");
		addSubtotal( 0.00);
		updatePrice();
	}
	public void onDThai3()
	{
		addItem("	Vegetable");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDThai4()
	{
		addItem("DPanang Curry");
		addSubtotal( 0.00);
		updatePrice();
	}
	public void onDThai5()
	{
		addItem("DThai Basil");
		addSubtotal( 0.00);
		updatePrice();
	}
	public void onDThai6()
	{
		addItem("	Chicken");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDThai7()
	{
		addItem("DGreen Curry");
		addSubtotal( 0.00);
		updatePrice();
	}
	public void onDThai8()
	{
		addItem("DPad Tai");
		addSubtotal( 0.00);
		updatePrice();
	}
	public void onDThai9()
	{
		addItem("	Beef");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDThai10()
	{
		addItem("DRoast Chili");
		addSubtotal( 0.00);
		updatePrice();
	}
	public void onDThai11()
	{
		addItem("DFried Rice Thai");
		addSubtotal( 0.00);
		updatePrice();
	}
	public void onDThai12()
	{
		addItem("	Pork");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDThai15()
	{
		addItem("	Shirmp");
		addSubtotal( 8.75);
		updatePrice();
	}
	
	//*Dinner Rice/Noodle------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onDRiceNoodle1()
	{
		addItem("DVegetable Fried Rice");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDRiceNoodle2()
	{
		addItem("DVegetable Lo Mein");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDRiceNoodle3()
	{
		addItem("DVegetable Mi Fun");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDRiceNoodle4()
	{
		addItem("DChicken Fried Rice");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDRiceNoodle5()
	{
		addItem("DChicken Lo Mein");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDRiceNoodle6()
	{
		addItem("DChicken Mi Fun");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDRiceNoodle7()
	{
		addItem("DBeef Fried Rice");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDRiceNoodle8()
	{
		addItem("DBeef Lo Mein");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDRiceNoodle9()
	{
		addItem("DBeef Mi Fun");
		addSubtotal( 8.25);
		updatePrice();
	}
	public void onDRiceNoodle10()
	{
		addItem("DPork Fried Rice");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDRiceNoodle11()
	{
		addItem("DPork Lo Mein");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDRiceNoodle12()
	{
		addItem("DPork Mi Fun");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onDRiceNoodle13()
	{
		addItem("DShirmp Fried Rice");
		addSubtotal( 8.75);
		updatePrice();
	}
	public void onDRiceNoodle14()
	{
		addItem("DShirmp Lo Mein");
		addSubtotal( 8.75);
		updatePrice();
	}
	public void onDRiceNoodle15()
	{
		addItem("DShirmp Mi Fun");
		addSubtotal( 8.75);
		updatePrice();
	}
	public void onDRiceNoodle16()
	{
		addItem("DHouse Fried Rice");
		addSubtotal( 9.00);
		updatePrice();
	}
	public void onDRiceNoodle17()
	{
		addItem("DHouse Lo Mein");
		addSubtotal( 9.00);
		updatePrice();
	}
	public void onDRiceNoodle18()
	{
		addItem("DHouse Mi Fun");
		addSubtotal( 9.00);
		updatePrice();
	}
	public void onDRiceNoodle19()
	{
		addItem("Plain Fried Rice");
		addSubtotal( 2.00);
		updatePrice();
	}
	public void onDRiceNoodle20()
	{
		addItem("Plain Lo Mein");
		addSubtotal( 3.00);
		updatePrice();
	}
	public void onDRiceNoodle21()
	{
		addItem("Plain Mi Fun");
		addSubtotal( 3.00);
		updatePrice();
	}
	public void onDRiceNoodle22()
	{
		addItem("Steamed Rice");
		addSubtotal( 1.50);
		updatePrice();
	}
	//*Dinner End------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	//*Wing Start------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	//*WingOnly------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onWingOnly1()
	{
		addItem("5 Wings");
		addSubtotal( 3.00);
		updatePrice();
	}	
	public void onWingOnly4()
	{
		addItem("10 Wings");
		addSubtotal( 6.00);
		updatePrice();
	}
	public void onWingOnly7()
	{
		addItem("20 Wings");
		addSubtotal( 12.00);
		updatePrice();
	}	
	public void onWingOnly10()
	{
		addItem("30 Wings");
		addSubtotal( 18.00);
		updatePrice();
	}
	public void onWingOnly13()
	{
		addItem("40 Wings");
		addSubtotal( 24.00);
		updatePrice();
	}
	public void onWingOnly16()
	{
		addItem("50 Wings");
		addSubtotal( 30.00);
		updatePrice();
	}
	public void onWingOnly19()
	{
		addItem("100 Wings");
		addSubtotal( 50.00);
		updatePrice();
	}
	public void onWingOnly22()
	{
		addItem("Ranch");
		addSubtotal( 0.25);
		updatePrice();
	}
	public void onWingOnly25()
	{
		addItem("Blue Cheese");
		addSubtotal( 0.25);
		updatePrice();
	}
	public void onWingOnly2()
	{
		addItem("	Plain");
		addSubtotal( 0.00);
		updatePrice();
	}
	public void onWingOnly3()
	{
		addItem("	Mild");
		addSubtotal( 0.00);
		updatePrice();
	}	
	public void onWingOnly5()
	{
		addItem("	Garlic");
		addSubtotal( 0.00);
		updatePrice();
	}	
	public void onWingOnly6()
	{
		addItem("	Hot");
		addSubtotal( 0.00);
		updatePrice();
	}	
	public void onWingOnly8()
	{
		addItem("	Cajun");
		addSubtotal( 0.00);
		updatePrice();
	}	
	public void onWingOnly9()
	{
		addItem("	XHot");
		addSubtotal( 0.00);
		updatePrice();
	}	
	public void onWingOnly11()
	{
		addItem("	Lemon");
		addSubtotal( 0.00);
		updatePrice();
	}	
	public void onWingOnly12()
	{
		addItem("	Sesame");
		addSubtotal( 0.00);
		updatePrice();
	}	
	public void onWingOnly14()
	{
		addItem("	General Tso");
		addSubtotal( 0.00);
		updatePrice();
	}	
	public void onWingOnly15()
	{
		addItem("	Orange");
		addSubtotal( 0.00);
		updatePrice();
	}	
	public void onWingOnly17()
	{
		addItem("	Terayiki");
		addSubtotal( 0.00);
		updatePrice();
	}	
	public void onWingOnly18()
	{
		addItem("	Braised");
		addSubtotal( 0.00);
		updatePrice();
	}	
	public void onWingOnly20()
	{
		addItem("	Thai");
		addSubtotal( 0.00);
		updatePrice();
	}	
	public void onWingOnly21()
	{
		addItem("	Sweet & Sour");
		addSubtotal( 0.00);
		updatePrice();
	}	
	public void onWingOnly23()
	{
		addItem("	Honey");
		addSubtotal( 0.00);
		updatePrice();
	}	
	public void onWingOnly24()
	{
		addItem("	BBQ");
		addSubtotal( 0.00);
		updatePrice();
	}	
	public void onWingOnly26()
	{
		addItem("	More Sauce");
		addSubtotal( 0.00);
		updatePrice();
	}	
	public void onWingOnly27()
	{
		addItem("	Less Sauce");
		addSubtotal( 0.00);
		updatePrice();
	}
	
	//*Wing Combo------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onWingCombo1()
	{
		addItem("8 Wing w/Fried Rice");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onWingCombo2()
	{
		addItem("8 Wing w/Lo Mein");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onWingCombo3()
	{
		addItem("8 Wing w/French Fried");
		addSubtotal( 8.00);
		updatePrice();
	}
	public void onWingCombo4()
	{
		addItem("8 Wing w/Vegetable Fried Rice");
		addSubtotal( 9.00);
		updatePrice();
	}
	public void onWingCombo5()
	{
		addItem("8 Wing w/Vegetable Lo Mein");
		addSubtotal( 9.00);
		updatePrice();
	}
	public void onWingCombo7()
	{
		addItem("8 Wing w/Chicken Fried Rice");
		addSubtotal( 9.00);
		updatePrice();
	}
	public void onWingCombo8()
	{
		addItem("8 Wing w/Chicken Lo Mein");
		addSubtotal( 9.00);
		updatePrice();
	}
	public void onWingCombo10()
	{
		addItem("8 Wing w/Beef Fried Rice");
		addSubtotal( 9.25);
		updatePrice();
	}
	public void onWingCombo11()
	{
		addItem("8 Wing w/Beef Lo Mein");
		addSubtotal( 9.25);
		updatePrice();
	}
	public void onWingCombo13()
	{
		addItem("8 Wing w/Pork Fried Rice");
		addSubtotal( 9.00);
		updatePrice();
	}
	public void onWingCombo14()
	{
		addItem("8 Wing w/Pork Lo Mein");
		addSubtotal( 9.00);
		updatePrice();
	}
	public void onWingCombo16()
	{
		addItem("8 Wing w/Shirmp Fried Rice");
		addSubtotal( 10.00);
		updatePrice();
	}
	public void onWingCombo17()
	{
		addItem("8 Wing w/Shirmp Lo Mein");
		addSubtotal( 10.00);
		updatePrice();
	}
	public void onWingCombo19()
	{
		addItem("8 Wing w/House Fried Rice");
		addSubtotal( 11.00);
		updatePrice();
	}
	public void onWingCombo20()
	{
		addItem("8 Wing w/House Lo Mein");
		addSubtotal( 11.00);
		updatePrice();
	}
	//*Wing End------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	//*Soup Start------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	//*Soup------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onSoup1()
	{
		addItem("Wonton Soup");
		addSubtotal( 2.50);
		updatePrice();
	}
	public void onSoup2()
	{
		addItem("Wonton Soup(L)");
		addSubtotal( 4.00);
		updatePrice();
	}
	public void onSoup4()
	{
		addItem("Egg Drop Soup");
		addSubtotal( 2.50);
		updatePrice();
	}
	public void onSoup5()
	{
		addItem("Egg Drop Soup(L)");
		addSubtotal( 4.00);
		updatePrice();
	}
	public void onSoup7()
	{
		addItem("Hot & Sour Soup");
		addSubtotal( 2.50);
		updatePrice();
	}
	public void onSoup8()
	{
		addItem("Hot & Sour Soup(L)");
		addSubtotal( 4.00);
		updatePrice();
	}
	public void onSoup10()
	{
		addItem("Vegetable Soup");
		addSubtotal( 4.00);
		updatePrice();
	}
	public void onSoup13()
	{
		addItem("Phoenix & Drangon Soup");
		addSubtotal( 4.00);
		updatePrice();
	}
	public void onSoup16()
	{
		addItem("Sizziling Rice Soup");
		addSubtotal( 4.00);
		updatePrice();
	}
	//*Soup End------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	//*Drink Start------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	//*Drink------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	public void onDrink1()
	{
		addItem("Coke");
		addSubtotal( 1.00);
		updatePrice();
	}
	public void onDrink2()
	{
		addItem("Fanta Orange");
		addSubtotal( 1.00);
		updatePrice();
	}
	public void onDrink3()
	{
		addItem("Sweet Tea");
		addSubtotal( 1.00);
		updatePrice();
	}
	public void onDrink4()
	{
		addItem("Diet Coke");
		addSubtotal( 1.00);
		updatePrice();
	}
	public void onDrink5()
	{
		addItem("Pink Lemonade");
		addSubtotal( 1.00);
		updatePrice();
	}
	public void onDrink6()
	{
		addItem("Coffee");
		addSubtotal( 1.00);
		updatePrice();
	}
	public void onDrink7()
	{
		addItem("Coke Zero");
		addSubtotal( 1.00);
		updatePrice();
	}
	public void onDrink10()
	{
		addItem("Sprite");
		addSubtotal( 1.00);
		updatePrice();
	}
	public void onDrink13()
	{
		addItem("Mountain Dew");
		addSubtotal( 1.00);
		updatePrice();
	}
	public void onDrink16()
	{
		addItem("Pepsi");
		addSubtotal( 1.00);
		updatePrice();
	}
	//*Drink End------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
}