package ui;



import java.io.File;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.Acount;
import model.ClassRoom;


public class ClassRoomGUI {
		
	  int contImage;
		

	  @FXML
	  private Pane mainPane;

      @FXML
      private TextField txtUserNameMain;

      @FXML
      private TextField txtPasswordMain;


  
     @FXML
     private TextField txtUserName;

     @FXML
     private PasswordField txtPassword ;

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
     private ComboBox<String> comboBrowsers;
     
     @FXML
     private ClassRoom classRoom;
     
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
     
     public void setInfoTableView() {
    	 
     	ObservableList<Acount> accounts = FXCollections.observableArrayList(classRoom.getUsrs());
     	
     	tbtUsers.setItems(accounts);
     	colUserName.setCellValueFactory(new PropertyValueFactory<Acount, String>("username"));
     	colGender.setCellValueFactory(new PropertyValueFactory<Acount, String>("gender"));
     	colCarrer.setCellValueFactory(new PropertyValueFactory<Acount, String>("career"));
     	colBirthday.setCellValueFactory(new PropertyValueFactory<Acount, String>("birthday"));
     	colBrowser.setCellValueFactory(new PropertyValueFactory<Acount, String>("favoriteBrowser"));
     }

     @FXML
     public void CreateAcount1(ActionEvent event) {
    	 String userName = txtUserName.getText();
    	 String password = String.valueOf(txtPassword.getCharacters());
    	 int genderInd = checkGen();
    	 String selectCarrer = selectCarrer();
    	 String date = String.valueOf(dateSelect.getValue());
    	 int browserInd = comboBrowsers.getSelectionModel()	.getSelectedIndex();
    	 
    	 if (!userName.equals("")&&!password.equals("") && genderInd != -1 && !selectCarrer.equals("")&&!date.equals("")&& browserInd != -1) {
    		 txtUserName.setText("");
    		 txtPassword.setText("");
    		 oMale.setSelected(false);
     		 oFemale.setSelected(false);
     		 oOther.setSelected(false);
     		 checkIndustrial.setSelected(false);
     		 checkSoftware.setSelected(false);
     		 checkTelematic.setSelected(false);
     		 dateSelect.getEditor().clear();
     		comboBrowsers.getSelectionModel().select(-1);;

    	 
    	 classRoom.addUsr(userName, password,browserInd,genderInd, selectCarrer, date);
 	
		contImage++;
 		
 		Alert alert = new Alert(AlertType.INFORMATION);
 		alert.setTitle("Create account");
 		alert.setHeaderText(null);
 		alert.setContentText("The account was created");
 		alert.showAndWait();
 		
    	}else {
 		Alert alert = new Alert(AlertType.WARNING);
 		alert.setTitle("Incomplete profile!");
 		alert.setHeaderText(null);
 		alert.setContentText("There are unfilled fields");
 		alert.showAndWait();
 		}
 	}
     @FXML
     void browseRute(ActionEvent event) {
    	 try {
 	    	Stage stage = new Stage();
 	    	FileChooser fileChooser = new FileChooser();
 	    	fileChooser.setTitle("Open Resource File");
 	    	
 	    	File file = fileChooser.showOpenDialog(stage);
 	    	txtLoadImage.setText(file.getPath());
 		} catch (Exception e) {
 			
 		} 	

     }

     @FXML
     void comboBrowser(ActionEvent event) {

     }

     
     @FXML
     public void selectFemaleRadioButton(ActionEvent event) {
     	oMale.setSelected(false);
     	oOther.setSelected(false);
     }

     @FXML
     public void selectMaleRadioButton(ActionEvent event) {
     	oFemale.setSelected(false);
     	oOther.setSelected(false);
     }

     @FXML
     public void selectOtherRadioButton(ActionEvent event) {
     	oMale.setSelected(false);
     	oFemale.setSelected(false);
     }
     public int checkGen() {
    	 int selected = -1;
    	 
    	 if (checkSoftware.isSelected()) {
    		 selected = 0;  		 
    	 }else if(checkIndustrial.isSelected()) {
    		 selected = 1;		 
    	 }else if(checkIndustrial.isSelected()) {
    		 selected = 2;
    	 }
    	 return selected; 
     }
     public String selectCarrer() {
     	String selectCareer = "";
     	
     	if(checkSoftware.isSelected()) {
     		selectCareer += "Software Engeneering" + "\n";
     	} if(checkIndustrial.isSelected()) {
     		selectCareer += "Industrial Engeneering" + "\n";
     	} if(checkTelematic.isSelected()) {
     		selectCareer += "Telematic Engeneering" + "\n";
     	}
     	
 		return selectCareer;
     }

	@FXML
     public void Login1(ActionEvent event) throws IOException {
        	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PrincipalWindow.fxml"));
        	
        	fxmlLoader.setController(this);
        	Parent root = fxmlLoader.load(); 
        	
        	mainPane.getChildren().clear();
        	mainPane.getChildren().setAll(root);
        	

     }

	@FXML
	public void exitButton(ActionEvent event) throws IOException {
			 FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PrincipalWindow.fxml"));
	        	
			 fxmlLoader.setController(this);
			 Parent root = fxmlLoader.load(); 
	        	
			 mainPane.getChildren().clear();
			 mainPane.getChildren().setAll(root);
	}
		
	
	public ClassRoomGUI(ClassRoom classroom) {
			this.classRoom = classroom; 
			
	}




    @FXML
    public void loadMain() throws IOException {
     	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PrincipalWindow.fxml"));
    	
    	fxmlLoader.setController(this);
    	Parent root = fxmlLoader.load(); 
    	
    	mainPane.getChildren().clear();
    	mainPane.getChildren().setAll(root);


    }
    @FXML
    public void loginMain(ActionEvent event) throws IOException {
    	 if(classRoom.getUsrs().size() != 0) {
    		
    		for(int i = 0; i < classRoom.getUsrs().size(); i++) {
        		
        		if(classRoom.getUsrs().get(i).getUserName().equals(txtUserName.getText()) && 
        				classRoom.getUsrs().get(i).getPassword().equals(String.valueOf(txtPassword.getCharacters()))) {
        			
            		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LoginUser.fxml"));
                	fxmlLoader.setController(this);
                	
                	Parent root = fxmlLoader.load();
                	mainPane.getChildren().clear();
                	mainPane.getChildren().setAll(root);
            		
                	txtNameUserin.setText(classRoom.getUsrs().get(i).getUserName());
                	setInfoTableView();
                	
            	} else if(i == classRoom.getUsrs().size() - 1){
            		Alert alert = new Alert(AlertType.WARNING);
            		alert.setTitle("Log In Incorrect");
            		alert.setHeaderText(null);
            		alert.setContentText("The username and password given are incorrect");
            		alert.showAndWait();
            	}
    		} 	
    		
    	} else {
    		
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("No accounts");
    		alert.setHeaderText(null);
    		alert.setContentText("There are no accounts created yet");
    		alert.showAndWait();
    		
    	}
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



