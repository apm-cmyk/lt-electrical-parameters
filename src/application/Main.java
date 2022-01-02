package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	private static Stage stage;
	private static Scene newProjectScene;
	private static Scene openProjectScene;
	private static Scene userManualScene;
	private static Scene mainScene;
	
	@Override

	public void start(Stage primaryStage) {
		try {

			stage = primaryStage;

			FXMLLoader fxmlMain = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			Pane paneMain = fxmlMain.load();
			Image towerMainImage = new Image("C:\\ProjetosJava\\ParametrosEletricosLT\\src\\image\\towerMainImage.jpg");
			BackgroundImage img = new BackgroundImage(towerMainImage, BackgroundRepeat.NO_REPEAT,
					BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
			Background backImg = new Background(img);
			// ImageView towerMain = new ImageView(towerMainImage);
			// paneMain.getChildren().addAll(towerMain);
			mainScene = new Scene(paneMain);

			FXMLLoader fxmlNewProject = new FXMLLoader(getClass().getResource("/gui/NewProjectView.fxml"));
			ScrollPane scrollpaneNewProject = fxmlNewProject.load();
			newProjectScene = new Scene(scrollpaneNewProject);
			scrollpaneNewProject.setFitToHeight(true);
			scrollpaneNewProject.setFitToWidth(true);

			FXMLLoader fxmlOpenProject = new FXMLLoader(getClass().getResource("/gui/OpenProjectView.fxml"));
			ScrollPane scrollpaneOpenProject = fxmlOpenProject.load();
			openProjectScene = new Scene(scrollpaneOpenProject);
			scrollpaneOpenProject.setFitToHeight(true);
			scrollpaneOpenProject.setFitToWidth(true);

			FXMLLoader fxmlUserManual = new FXMLLoader(getClass().getResource("/gui/UserManualView.fxml"));
			ScrollPane scrollpaneUserManual = fxmlUserManual.load();
			userManualScene = new Scene(scrollpaneUserManual);
			scrollpaneUserManual.setFitToHeight(true);
			scrollpaneUserManual.setFitToWidth(true);

			paneMain.setBackground(backImg);
			primaryStage.setResizable(false);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("LT Electrical Parameters - UFF");
			primaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void changeScene(String scene) {

		switch (scene) {
		case "btReturnMain":
			stage.setScene(mainScene);
			stage.setTitle("New Project - LT Electrical Parameters");
			break;
		case "newProject":
			stage.setScene(newProjectScene);
			stage.setTitle("New Project - LT Electrical Parameters");
			break;

		case "openProject":
			stage.setScene(openProjectScene);
			stage.setTitle("Open Project - LT Electrical Parameters");
			break;
		case "userManual":
			stage.setScene(userManualScene);
			stage.setTitle("User Manual - LT Electrical Parameters");
			break;

		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
