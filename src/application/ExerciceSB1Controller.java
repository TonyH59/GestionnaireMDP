package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.event.ActionEvent;

public class ExerciceSB1Controller {
    @FXML
    private Button validerButton;
    @FXML
    private TextField inputText;
    @FXML
    private Label nomLabel;
    @FXML
    private Button afficherButton;

    @FXML
    public void afficherValeur(ActionEvent event) {
        String text = inputText.getText();
        nomLabel.setText(text);
    }
    public void afficherFenetreMots(ActionEvent event) throws IOException {
    	
    	Parent root = FXMLLoader.load(getClass().getResource("/application/afficherFenetreMots.fxml"));
    	Scene scene = new Scene(root);
    	Stage stage = new Stage();
    	stage.setScene(scene);
    	stage.show();
  
  	
    } 
}