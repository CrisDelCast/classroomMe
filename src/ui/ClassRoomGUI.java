package ui;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import model.Acount;
import model.ClassRoom;


public class ClassRoomGUI {
	

	@FXML
	private Pane mainPane;

    @FXML
    private TextField txtUserNameMain;

    @FXML
    private TextField txtPasswordMain;

        @FXML
        private TextField txtUserName;

        @FXML
        private TextField txtPassword;

        @FXML
        private TextField txtLoadImage;

        @FXML
        private RadioButton oMale;

        @FXML
        private RadioButton oFemale;

        @FXML
        private RadioButton oOther;

        @FXML
        private CheckBox checkSoftware;

        @FXML
        private CheckBox checkTelematic;

        @FXML
        private CheckBox checkIndustrial;

        @FXML
        private DatePicker dateSelect;

        @FXML
        private ChoiceBox<String> choiceBox;

		private ClassRoom classRoom;

		private Acount acount;
	

	

		    @FXML
		    private Label txtNameUserin;

		    @FXML
		    private ImageView imageProfile;

		    @FXML
		    private TableView<Acount> tbtUsers;

		    @FXML
		    private TableColumn<Acount, String> colUserName;

		    @FXML
		    private TableColumn<Acount, String> colGender;

		    @FXML
		    private TableColumn<Acount, String> colCarrer;

		    @FXML
		    private TableColumn<Acount, String> colBirthday;

		    @FXML
		    private TableColumn<Acount, String> colBrowser;

		    @FXML
		    void exitButton(ActionEvent event) throws IOException {
		     	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PrincipalWindow.fxml"));
	        	
	        	fxmlLoader.setController(this);
	        	Parent root = fxmlLoader.load(); 
	        	
	        	mainPane.getChildren().clear();
	        	mainPane.getChildren().setAll(root);


		    }
		

		public ClassRoomGUI(ClassRoom classroom, Acount cd) {
			this.classRoom = classroom;
			this.acount = cd; 
		}

		@FXML
        public void CreateAcount1(ActionEvent event) {
			
        }

        @FXML
       public void login1(ActionEvent event) throws IOException {
        	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LoginUser.fxml"));
        	
        	fxmlLoader.setController(this);
        	Parent root = fxmlLoader.load(); 
        	
        	mainPane.getChildren().clear();
        	mainPane.getChildren().setAll(root);

        }



    @FXML
    public void loadMain() throws IOException {
     	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PrincipalWindow.fxml"));
    	
    	fxmlLoader.setController(this);
    	Parent root = fxmlLoader.load(); 
    	
    	mainPane.getChildren().clear();
    	mainPane.getChildren().setAll(root);

    	
    	
    	
    	

    }
    public void loginMain() throws IOException {
     	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LoginUser.fxml"));
    	
    	fxmlLoader.setController(this);
    	Parent root = fxmlLoader.load(); 
    	
    	mainPane.getChildren().clear();
    	mainPane.getChildren().setAll(root);
    }
    
    @FXML
    public void singupMain(ActionEvent event) throws IOException {
  	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LogIn.fxml"));
    	
    	fxmlLoader.setController(this);
    	Parent root = fxmlLoader.load(); 
    	mainPane.getChildren().clear();
    	mainPane.getChildren().setAll(root);

    }

}
