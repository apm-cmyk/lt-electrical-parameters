package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class NewProjectController implements Initializable {

	@FXML
	private Button btReturnMain;

	@FXML
	public void onBtRetrunMainAction() {
	Main.changeScene("btReturnMain");
	}
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
