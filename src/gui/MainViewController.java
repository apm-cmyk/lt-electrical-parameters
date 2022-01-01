package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem newProject;
	@FXML
	private MenuItem openProject;
	@FXML
	private MenuItem userManual;

	@FXML
	public void onMenuItemNewProjectAction() {
		Main.changeScene("newProject");
	}

	@FXML
	public void onMenuItemOpenProjectAction() {
		Main.changeScene("openProject");

	}

	@FXML
	public void onMenuItemUserManualAction() {
		Main.changeScene("userManual");

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
