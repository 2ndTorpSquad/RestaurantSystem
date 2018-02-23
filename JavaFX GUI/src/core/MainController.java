package RestaurantSystem_change;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.List;

public class MainController
{
	@FXML ListView ;
	@FXML ListView ;
	@FXML Button Add;
	

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
		displaySubTotal.setEditable(true);
		displaySubTotal.setText(((Float)priceTotal()).toString());
		displaySubTotal.setEditable(false);

		displayTotal.setEditable(true);
		displayTotal.setText(((Float)(priceTotal()* (float) 1.06)).toString());
		displayTotal.setEditable(false);

	}

	public void onXChicken()
	{
		addItem("X Chicken");
		addPrice((float) 5.00);
	}

}