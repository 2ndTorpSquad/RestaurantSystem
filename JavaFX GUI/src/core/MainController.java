package core;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController
{
	@FXML Button Delivery;
	@FXML Button Pickup;
	@FXML Button EatIn;
	@FXML Button ToGo;

	@FXML Button Record;

	@FXML Button Report;
	@FXML Button Info;
	@FXML Button Settings;

	byte deliveryType = 0;
	byte toGoType = 1;
	byte pickupType = 2;
	byte eatInType = 3;
	@FXML private void Order(byte orderType)
	{
//		switch (orderType)
//		{
//			case (0):
//			{
//
//				break;
//			}
//
//			case (1):
//			{
//
//				break;
//			}
//
//			case (2):
//			{
//
//				break;
//			}
//
//			case (3):
//			{
//
//				break;
//			}
//
//			default:
//			{
//
//				break;
//			}
//		}
		try
		{
			Stage settings = new Stage(); //opens a new stage for the OrderWindow
			settings.setTitle("Order"); //sets title
			//settings.getIcons().add(new Image("core/icon.png")); //sets icon
			settings.setScene(new Scene(FXMLLoader.load(getClass().getResource("OrderWindow.fxml")))); //sets GUI file
			settings.setAlwaysOnTop(true); //sets OrderWindow to always show on top of desktop (until closed)
			settings.show(); //shows the OrderWindow
		}
		catch (Exception e)
		{
			e.printStackTrace();
			//new Tracer(e).showAlert();
		}

	}
	@FXML private void Delivery()
	{
		//call a new Window
		Order(deliveryType);
	}
	@FXML private void ToGo()
	{
		Order(toGoType);

	}
	@FXML private void Pickup()
	{
		Order(pickupType);

	}
	@FXML private void EatIn()
	{
		Order(eatInType);

	}

}