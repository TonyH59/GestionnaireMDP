package application;



import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class afficherFenetreMots{

    @FXML
    private Button affichertextButton;

    @FXML
    private ListView<String> listViewText;
    
    @FXML
    public void initialize () throws IOException {
		ObservableList<String> items = FXCollections.observableArrayList();
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/Florine_07/Desktop/fichierlu.txt"))) {
			
			String line;
			while((line = bufferedReader.readLine()) != null) {
				
				items.add(line);
			}
			
    } catch (IOException e) {
    	
    	e.printStackTrace();
    }
			listViewText.setItems(items);
			

    }
}