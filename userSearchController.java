package flights;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

public class userSearchController {
    @FXML
    private ComboBox<String> fromBox;
    @FXML
    private ComboBox<String> toBox;
    @FXML
    private ObservableList<String> destinations = (ObservableList<String>) FXCollections.observableArrayList(
            "Reykjavík, REY",
            "Akureyri, AK",
            "Egilsstaðir,EGS",
            "Ísafjörður,ÍS",
            "Höfn,HF",
            "Vestmannaeyjar,VE"
    );

    // Býr til forsíðu sem listar mögulega brottfarar/áfangastaði, dagsetningar.
    @FXML
    private DatePicker dateTo;
    @FXML
    private DatePicker dateFrom;
   /* @FXML
    private ObservableList<String> from = FXCollections.observableArrayList();
    @FXML
    private ObservableList<String> to = FXCollections.observableArrayList();*/

    //  Hægt að velja fjölda farþega.
    @FXML
    private ComboBox<Integer> passengersBox;
    @FXML
    private ObservableList <Integer> passengers = (ObservableList<Integer>) FXCollections.observableArrayList(
            1,2,3,4,5,6,7,8,9
    );



    @FXML
    private Button button;
    @FXML
    private Label invalidLabel;

    @FXML
    private void book(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("bookingPage.fxml"));
            Parent root =(Parent)fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Flugleitarvél 8F");
            stage.setScene(new Scene(root));

            String departDest=fromBox.getValue();
            String arrivalDest =toBox.getValue();
            int ps = passengersBox.getValue();

            if(departDest==arrivalDest ){
               invalidLabel.setText("Þú verður að velja áfangastað sem er ekki brottfararstaður þinn");
                stage.setScene(new Scene(root));
            }

            LocalDate date1 =dateFrom.getValue();
            System.out.println(fromBox.getValue()+" "+ toBox.getValue()+" "+passengersBox.getValue());
            System.out.println(date1+" "+ ps);

            Stage lastStage = (Stage) button.getScene().getWindow();
            lastStage.close();
            stage.show();

        } catch (IOException e) {
            System.err.println(e);
        }
    }

    @FXML
    private void initialize() {
        fromBox.setItems(destinations);
        toBox.setItems(destinations);
        passengersBox.setItems(passengers);

    }
}
