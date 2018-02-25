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
	
	@FXML Button buttonAdd;
	@FXML Button buttonDelete;
	@FXML Button buttonPrint1;
	@FXML Button buttonPrint2;
	
	@FXML Button LChicken1;
	@FXML Button LChicken2;
	@FXML Button LChicken3;
	@FXML Button LChicken4;
	@FXML Button LChicken5;
	@FXML Button LChicken6;
	@FXML Button LChicken7;
	@FXML Button LChicken8;
	@FXML Button LChicken9;
	@FXML Button LChicken10;
	@FXML Button LChicken11;
	@FXML Button LChicken12;
	@FXML Button LChicken13;
	@FXML Button LChicken14;
	@FXML Button LChicken15;
	@FXML Button LChicken16;
	
	@FXML Button Drink1;
	@FXML Button Drink2;
	@FXML Button Drink3;
	@FXML Button Drink4;
	@FXML Button Drink5;
	@FXML Button Drink6;
	@FXML Button Drink7;
	@FXML Button Drink10;
	@FXML Button Drink13;
	@FXML Button Drink16;
	
	List<Float> subtotalList = new ArrayList<>();
	float subtotal = 0;
	float tax = 0;
	float total = 0;

	public void addItem(String foodName)
	{
		ObservableList<String> tempFoodList =  listvCurrentFood.getItems(); //ListView only take ObservableList data type
		tempFoodList.add(tempFoodList.size(), foodName);
		listvCurrentFood.setItems(tempFoodList);
	}

	public void addSubtotal(float price)
	{
		subtotalList.add(price);
	}

	public void computeSubtotal()
	{
		for(float price : subtotalList)
		{
			subtotal+=price;
		}
	}
	
	public void computeTax()
	{
		tax = (float)(subtotal * 0.06);
	}
	
	public void computeTotal()
	{
		total = (float)(tax + subtotal);
	}
	
	public void updatePrice()
	{
		subtotal = 0;
		computeSubtotal();
		computeTax();
		computeTotal();
		
		textSubtotalValue.setText("$" +  Float.toString(subtotal));
		textTaxValue.setText("$" +  Float.toString(tax));
		textTotalValue.setText("$" +  Float.toString(total));
		
		String subtotalTemp = textSubtotalValue.getText();
		String taxTemp = textTaxValue.getText();
		String totalTemp = textTotalValue.getText();
		
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
	
	public void onAdd()
	{
		ObservableList<String> tempFoodList =  listvCurrentFood.getItems();
		int selectedItem = listvCurrentFood.getSelectionModel().getSelectedIndex();
		String selectedItemName = tempFoodList.get(selectedItem);
		tempFoodList.add(selectedItem + 1,selectedItemName);
		
		listvCurrentFood.setItems(tempFoodList);		
		subtotalList.add(selectedItem + 1, subtotalList.get(selectedItem));
		updatePrice();
	}
	public void onDelete()
	{
		ObservableList<String> tempFoodList =  listvCurrentFood.getItems();
		int selectedItem = listvCurrentFood.getSelectionModel().getSelectedIndex();
		String selectedItemName = tempFoodList.get(selectedItem);
		tempFoodList.remove(selectedItem);
		
		listvCurrentFood.setItems(tempFoodList);		
		subtotalList.remove(selectedItem);
		updatePrice();
	}
	public void onPrint1()
	{
			
	}
	public void onPrint2()
	{
			
	}
	/*Templete for buttons
	public void on()
	{
		addItem("");
		addSubtotal((float) );
		updatePrice();
	}
	*/

	public void onLChicken1()
	{
		addItem("1 Chicken");
		addSubtotal((float) 1.00);
		updatePrice();
	}
	public void onLChicken2()
	{
		addItem("2 Chicken");
		addSubtotal((float) 2.00);
		updatePrice();
	}
	public void onLChicken3()
	{
		addItem("Chicken");
		addSubtotal((float) 3.00);
		updatePrice();
	}
	public void onLChicken4()
	{
		addItem("Chicken");
		addSubtotal((float) 5.00);
		updatePrice();
	}
	public void onLChicken5()
	{
		addItem("Chicken");
		addSubtotal((float) 5.00);
		updatePrice();
	}
	public void onLChicken6()
	{
		addItem("Chicken");
		addSubtotal((float) 5.00);
		updatePrice();
	}
	public void onLChicken7()
	{
		addItem("Chicken");
		addSubtotal((float) 5.00);
		updatePrice();
	}
	public void onLChicken8()
	{
		addItem("Chicken");
		addSubtotal((float) 5.00);
		updatePrice();
	}
	public void onLChicken9()
	{
		addItem("Chicken");
		addSubtotal((float) 5.00);
		updatePrice();
	}
	public void onLChicken10()
	{
		addItem("Chicken");
		addSubtotal((float) 5.00);
		updatePrice();
	}
	public void onLChicken11()
	{
		addItem("Chicken");
		addSubtotal((float) 5.00);
		updatePrice();
	}
	public void onLChicken12()
	{
		addItem("Chicken");
		addSubtotal((float) 5.00);
		updatePrice();
	}
	public void onLChicken13()
	{
		addItem("Chicken");
		addSubtotal((float) 5.00);
		updatePrice();
	}
	public void onLChicken14()
	{
		addItem("Chicken");
		addSubtotal((float) 5.00);
		updatePrice();
	}
	public void onLChicken15()
	{
		addItem("Chicken");
		addSubtotal((float) 5.00);
		updatePrice();
	}
	public void onLChicken16()
	{
		addItem("Chicken");
		addSubtotal((float) 5.00);
		updatePrice();
	}
									
	public void onDrink1()
	{
		addItem("Drink");
		addSubtotal((float) 1.00);
		updatePrice();
	}
	public void onDrink2()
	{
		addItem("Drink");
		addSubtotal((float) 1.00);
		updatePrice();
	}
	public void onDrink3()
	{
		addItem("Drink");
		addSubtotal((float) 1.00);
		updatePrice();
	}
	public void onDrink4()
	{
		addItem("Drink");
		addSubtotal((float) 1.00);
		updatePrice();
	}
	public void onDrink5()
	{
		addItem("Drink");
		addSubtotal((float) 1.00);
		updatePrice();
	}
	public void onDrink6()
	{
		addItem("Drink");
		addSubtotal((float) 1.00);
		updatePrice();
	}
	public void onDrink7()
	{
		addItem("Drink");
		addSubtotal((float) 1.00);
		updatePrice();
	}
	public void onDrink10()
	{
		addItem("Drink");
		addSubtotal((float) 1.00);
		updatePrice();
	}
	public void onDrink13()
	{
		addItem("Drink");
		addSubtotal((float) 1.00);
		updatePrice();
	}
	public void onDrink16()
	{
		addItem("Drink");
		addSubtotal((float) 1.00);
		updatePrice();
	}
}