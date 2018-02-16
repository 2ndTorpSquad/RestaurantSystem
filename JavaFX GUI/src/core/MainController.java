package core;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainController
{
	@FXML Button XChicken;
	@FXML Button YChicken;
	@FXML Button ZChicken;
	@FXML ListView CurrentOrder;
	@FXML Label displayPriecTotal;

	List<Float> priceList = new ArrayList<>();

	public void addItem(String foodName)
	{
		ObservableList<String> foodList = CurrentOrder.getItems();
		foodList.add(foodName);
		CurrentOrder.setItems(foodList);
	}

	public void addPrice(float price)
	{
		priceList.add(price);
		updatePriceTotal();
	}

	public float priceTotal()
	{
		float totalPrice = 0;
		for(float foodPrice : priceList)
		{
			totalPrice+=foodPrice;
		}
		return totalPrice;
	}

	public void updatePriceTotal()
	{
		displayPriecTotal.setText(((Float)priceTotal()).toString());
	}

	public void onXChicken()
	{
		addItem("X Chicken");
	}

	public void onYChicken()
	{
		addItem("Y Chicken");
	}

	public void onZChicken()
	{
		addItem("Z Chicken");
	}
}