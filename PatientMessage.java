import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class PatientMessage extends HBox
{
    private Label status;
    public TextArea area1;

	//constructor
	public PatientMessage(ArrayList<Patient> list) //Creates the pane for the info to be stored in
	{
		VBox vBox = new VBox();
		GridPane grid1 = new GridPane();
		status = new Label("");
		area1 = new TextArea("Message for Doctor/Nurse...");
		
		Button button1 = new Button("Send");
		Label sendTo = new Label("Send to:");

		CheckBox checkBox1 = new CheckBox("Doctor");
		CheckBox checkBox2 = new CheckBox("Nurse");
		CheckBox checkBox3 = new CheckBox("Urgent?");
        
        //GridPane that holds labels & text fields.
		grid1.setPadding(new Insets(10, 10, 10, 10));;
		grid1.setHgap(5);
		grid1.setVgap(10);
        
        //Layout for the left half of the PatientInfo.
		grid1.add(sendTo, 1, 5);
		grid1.add(checkBox1, 1, 6);
		grid1.add(checkBox2, 1, 7);
		grid1.add(checkBox3, 1, 10);
		grid1.add(button1, 1, 11);
		
        //the right half of the PatientInfo
		area1.setEditable(false);		
		area1.setPrefWidth(800);
		grid1.setAlignment(Pos.TOP_CENTER);
		grid1.setPrefWidth(400);
        
        //Add the left half and right half to the Pane
		vBox.getChildren().addAll(status, grid1);
		this.getChildren().add(vBox);
		this.getChildren().add(area1);
	}
}
