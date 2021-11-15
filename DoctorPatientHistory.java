import java.util.ArrayList;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class DoctorPatientHistory extends HBox
{
    private Label status;
    public TextArea area1, area2;

	//constructor
	public DoctorPatientHistory(ArrayList<Patient> list) //Creates the pane for the info to be stored in
	{

		TableView<Patient> table = new TableView<Patient>();
		
		table.setEditable(true);
		TableColumn<Patient, String> firstNameColumn = new TableColumn<Patient, String>("First Name");
		firstNameColumn.setCellValueFactory(new PropertyValueFactory<Patient, String>("firstName"));
		
		TableColumn<Patient, String> lastNameColumn = new TableColumn<Patient, String>("Last Name");
		lastNameColumn.setCellValueFactory(new PropertyValueFactory<Patient, String>("lastName"));

		TableColumn<Patient, Integer> btColumn = new TableColumn<Patient, Integer>("Body Temp");
		btColumn.setCellValueFactory(new PropertyValueFactory<Patient, Integer>("bodyTemp"));
		
		TableColumn<Patient, Integer> bpColumn = new TableColumn<Patient, Integer>("Blood Pressure");
		bpColumn.setCellValueFactory(new PropertyValueFactory<Patient, Integer>("bloodPressure"));

		table.getColumns().add(firstNameColumn);
		table.getColumns().add(lastNameColumn);
		table.getColumns().add(btColumn);
		table.getColumns().add(bpColumn);
		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

		
		
		status = new Label("");
		status.setTextFill(Color.RED);
				
		area1 = new TextArea("Allergies and/or Health Concerns...");
		area2 = new TextArea("Doctor's Notes");

		

        

		
        //the right half of the PatientInfo
		area1.setEditable(true);		
		area1.setPrefHeight(100);
		area1.setPrefWidth(300);
        
		area2.setEditable(true);
		area2.setPrefHeight(100);
		area2.setPrefWidth(300);

		table.setPrefHeight(100);
		table.setPrefWidth(500);
        //Add the left half and right half to the Pane
		this.getChildren().addAll(table, area1, area2 );
		//this.getChildren().add(area1);
		//this.getChildren().add(area2);
	}
}
