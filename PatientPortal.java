import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class PatientPortal extends HBox
{
	ArrayList<Patient> patientList;

    //The relationship between CreatePane and SelectPane is Aggregation
    private TextField patientFirstField, patientLastField, dateOfBirthField;
    private Label status;

	//constructor
	public PatientPortal(ArrayList<Patient> list) //Creates the pane for the info to be stored in
	{
		
		this.patientList = list;
		VBox vBox = new VBox();
		GridPane grid1 = new GridPane();
		
		status = new Label("");
		status.setTextFill(Color.RED);
		Label patientFirstName = new Label("First Name");
		patientFirstField = new TextField();
		Label patientLastName = new Label("Last Name");
		patientLastField = new TextField();
		Label dateOfBirth = new Label("Date of Birth");
		dateOfBirthField = new TextField();
		Button button1 = new Button("Login");
		Button button2 = new Button("Create New User");
		
		
        //GridPane that hold those labels & text fields.
		grid1.setPadding(new Insets(10, 10, 10, 10));;
		grid1.setHgap(5);
		grid1.setVgap(10);
        
        //Set up the layout for the left half of PatientPhysicalFindings.
		grid1.add(patientFirstName,  3, 1);
		grid1.add(patientFirstField,  4, 1);
		grid1.add(patientLastName, 3, 2);
		grid1.add(patientLastField, 4, 2);
		grid1.add(dateOfBirth, 3, 3);
		grid1.add(dateOfBirthField, 4, 3);
		grid1.add(button1, 4, 6);
		grid1.add(button2, 4, 7);
		
        //the right half of the PatientPhysicalFindings	
		grid1.setAlignment(Pos.TOP_CENTER);
		grid1.setPrefWidth(400);
        
        //Add the left half and right half to the PatientPhysicalFindings
		vBox.getChildren().addAll(status, grid1);
		this.getChildren().add(vBox);
	}
}
