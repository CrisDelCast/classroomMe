package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;



public class Main extends Application {
	
	private ClassRoom classroom;
	private ClassRoomGUI classroomGUI;
	
	
	public Main() {
		classroom = new ClassRoom();
		classroomGUI = new ClassRoomGUI(classroom);
	}
	
	public static void main(String[] args) {
	
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BlankPage.fxml"));
		fxmlLoader.setController(classroomGUI);
		
		Parent root = fxmlLoader.load();
		
		
		Scene scene = new Scene(root); 
		primaryStage.setScene(scene);
		primaryStage.setTitle("Principal");
		primaryStage.show();
		classroomGUI.loadMain();
		
		
		
	}

		

}
