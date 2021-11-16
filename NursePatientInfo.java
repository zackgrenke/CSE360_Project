import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class NursePatientInfo extends HBox
{
    private TextField patientFullField, patientWeightField, patientHeightField, patientBloodPresField, patientPharmField;
    private Label status;
    public TextArea area1;

	//constructor
	public NursePatientInfo(ArrayList<Patient> list) //Creates the pane for the info to be stored in
	{
		VBox vBox = new VBox();
		GridPane grid1 = new GridPane();
		status = new Label("");
		area1 = new TextArea("Allergies and/or Health Concerns...");
		status.setTextFill(Color.RED);
		Label patientFullName = new Label("Patient Full Name");
		patientFullField = new TextField();
		Label patientWeight = new Label("Weight");
		patientWeightField = new TextField();
		Label patientHeight = new Label("Height");
		patientHeightField = new TextField();
		Label patientBloodPressure = new Label("Blood Pressure");
		patientBloodPresField = new TextField();
		Label patientPharmacy = new Label("Pharmacy");
		patientPharmField = new TextField();
		Button button1 = new Button("Submit");
		Button button2 = new Button("Patient's History");
		CheckBox checkBox1 = new CheckBox("Over 12?");
        
        //GridPane that holds labels & text fields.
		grid1.setPadding(new Insets(10, 10, 10, 10));;
		grid1.setHgap(5);
		grid1.setVgap(10);
        
        //Layout for the left half of the PatientInfo.
		grid1.add(patientFullName,  0, 1);
		grid1.add(patientFullField,  1, 1);
		grid1.add(patientWeight, 0, 2);
		grid1.add(patientWeightField, 1, 2);
		grid1.add(patientHeight, 0, 3);
		grid1.add(patientHeightField, 1, 3);
		grid1.add(patientBloodPressure,  0, 4);
		grid1.add(patientBloodPresField,  1, 4);
		grid1.add(patientPharmacy, 0, 5);
		grid1.add(patientPharmField, 1, 5);
		grid1.add(button1, 1, 7);
		grid1.add(checkBox1, 1, 6);
		grid1.add(button2, 1, 12);

		
        //the right half of the PatientInfo
		area1.setEditable(false);		
		grid1.setAlignment(Pos.TOP_CENTER);
		grid1.setPrefWidth(500);
        
        //Add the left half and right half to the Pane
		vBox.getChildren().addAll(status, grid1);
		this.getChildren().add(vBox);
		this.getChildren().add(area1);
		
		
		button1.setOnAction(
				event -> 
				{
					String patientName = patientFullField.getText();
					String patientW = patientWeightField.getText();
					String patientH = patientHeightField.getText();
					String patientBP = patientBloodPresField.getText();
					String patientPharm = patientPharmField.getText();
					boolean patientAge = checkBox1.isSelected();
					String patientAgeStr = Boolean.toString(patientAge);
					
					String prescription = patientName + "," + patientW + "," + patientH + "," + patientBP + "," + patientPharm + "," + patientAgeStr;
					

				});
		
		button2.setOnAction(
				event -> 
				{
					String patientName = patientFullField.getText();
					String patientW = patientWeightField.getText();
					String patientH = patientHeightField.getText();
					String patientBP = patientBloodPresField.getText();
					String patientPharm = patientPharmField.getText();
					String patientAlg = area1.getText();
					patientFullField.setText("");
					patientWeightField.setText("");
					patientHeightField.setText("");
					patientBloodPresField.setText("");
					patientPharmField.setText("");
					area1.setText("");
					
					boolean patientAge = checkBox1.isSelected();
					String patientAgeStr = Boolean.toString(patientAge);
					
					String prescription = patientName + "," + patientW + "," + patientH + "," + patientBP + "," + patientPharm + "," + patientAgeStr + "," + patientAlg;
					
				});
		
		
		
		
	}
}
