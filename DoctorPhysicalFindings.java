import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class DoctorPhysicalFindings extends HBox
{
	ArrayList<Patient> patientList;

    //The relationship between CreatePane and SelectPane is Aggregation
    private TextField patientFirstField, patientLastField, medField;
    private Label status;
    public TextArea area1;

	//constructor
	public DoctorPhysicalFindings(ArrayList<Patient> list) //Creates the pane for the info to be stored in
	{
		
		this.patientList = list;
		VBox vBox = new VBox();
		GridPane grid1 = new GridPane();
		status = new Label("");
		status.setTextFill(Color.RED);
		
		area1 = new TextArea("Enter Patients Physical Findings...");
		
		Label patientFirstName = new Label("Patient First Name");
		patientFirstField = new TextField();
		
		Label patientLastName = new Label("Patient Last Name");
		patientLastField = new TextField();
		
		Label medicationPresc = new Label("Prescribe Medication");
		medField = new TextField();
		
		Button button1 = new Button("Send Prescription");
		Button button2 = new Button("Submit Findings");
        
        //GridPane that hold those labels & text fields.
		grid1.setPadding(new Insets(10, 10, 10, 10));;
		grid1.setHgap(5);
		grid1.setVgap(10);
        
        //Set up the layout for the left half of PatientPhysicalFindings.
		grid1.add(patientFirstName,  0, 1);
		grid1.add(patientFirstField,  1, 1);
		grid1.add(patientLastName, 0, 2);
		grid1.add(patientLastField, 1, 2);
		grid1.add(medicationPresc, 0, 3);
		grid1.add(medField, 1, 3);
		grid1.add(button1, 1, 5);
		grid1.add(button2, 2, 20);
		
        //the right half of the PatientPhysicalFindings
		area1.setEditable(true);		
		grid1.setAlignment(Pos.TOP_CENTER);
		grid1.setPrefWidth(500);
        
        //Add the left half and right half to the PatientPhysicalFindings
		vBox.getChildren().addAll(status, grid1);
		this.getChildren().add(vBox);
		this.getChildren().add(area1);
		
		button1.setOnAction(
				event -> 
				{
					String patientFirst = patientFirstField.getText();
					String patientLast = patientLastField.getText();
					String patientPresc = medField.getText();
					
					String prescription = patientFirst + "," + patientLast + "," + patientPresc;
					

				});
		
		button2.setOnAction(
				event -> 
				{
					String patientFirst = patientFirstField.getText();
					String patientLast = patientLastField.getText();
					String patientPresc = medField.getText();
					String patientFindings = area1.getText();
					patientFirstField.setText("");
					patientLastField.setText("");
					medField.setText("");
					area1.setText("");
					
					String findings = patientFirst + "," + patientLast + "," + patientPresc +"," + patientFindings;
					
				});
		
		
	}
}
