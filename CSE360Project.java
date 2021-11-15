import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;
import java.util.ArrayList;

public class CSE360Project extends Application
{
	private TabPane tabPane;
	private DoctorPhysicalFindings nPatFind;
	private NursePatientInfo nPatInfo;
	private DoctorPatientHistory dPatHist;
    private ArrayList<Patient> patientList;
	private NursePatientHistory nPatHist;
	private PatientMessage pMessage;
	private PatientPortal patientPortal;

    public void start(Stage stage)
    {
 		StackPane root = new StackPane();

 		nPatInfo = new NursePatientInfo(patientList);
 		nPatFind = new DoctorPhysicalFindings(patientList);
 		dPatHist = new DoctorPatientHistory(patientList);
 		nPatHist = new NursePatientHistory(patientList);
 		pMessage = new PatientMessage(patientList);
 		patientPortal = new PatientPortal(patientList);

        tabPane = new TabPane();

        Tab tab1 = new Tab();
        tab1.setText("DoctorPhysicalFindings");
        tab1.setContent(nPatFind);

        Tab tab2 = new Tab();
        tab2.setText("NursePatientInfo");
        tab2.setContent(nPatInfo);
        
        Tab tab3 = new Tab();
        tab3.setText("DoctorPatientHistory");
        tab3.setContent(dPatHist);
        
        Tab tab4 = new Tab();
        tab4.setText("NursePatientHistory");
        tab4.setContent(nPatHist);
        
        Tab tab5 = new Tab();
        tab5.setText("PatientMessage");
        tab5.setContent(pMessage);
        
        Tab tab6 = new Tab();
        tab6.setText("PatientPortal");
        tab6.setContent(patientPortal);

        tabPane.getSelectionModel().select(0);
        tabPane.getTabs().addAll(tab1, tab2, tab3, tab4, tab5, tab6);

        root.getChildren().add(tabPane);

        Scene scene = new Scene(root, 900, 400);
        stage.setTitle("Doctor and Nurse Views");
        stage.setScene(scene);
        stage.show();
    }
}