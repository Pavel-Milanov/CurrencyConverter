package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public ComboBox<String> comboBox1;
    public ComboBox<String> comboBox2;
    public TextField textField;
    public Button btn;
    public TextField output;
    public Label chosenCurrency;
    public Label convertCurrency;


    String getCurrency = "";
    String getCurrency1 = "";
    Double value ;
    DecimalFormat df = new DecimalFormat("#.##");


    ObservableList<String> items = FXCollections.observableArrayList("USD", "EUR", "BGN", "GBP");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox1.setItems(items);
        comboBox2.setItems(items);
    }

    public void changing(ActionEvent e){
        getCurrency = comboBox1.getValue();
        getCurrency1 = comboBox2.getValue();
        chosenCurrency.setText(comboBox1.getValue());
        convertCurrency.setText(comboBox2.getValue());
    }

    public void convertTo(ActionEvent e){
        if (textField.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Input correct Value!");
            alert.setContentText(
                    "Check entered Value of the Currency");
            alert.showAndWait();
        }else {
            if (getCurrency == "USD" ){
                switch (getCurrency1){
                    case "USD":
                        value = Double.parseDouble(textField.getText());
                        output.setText(df.format(value));
                        break;
                    case "EUR":
                        value = Double.parseDouble(textField.getText()) * 0.84471985;
                        output.setText(df.format(value));
                        break;
                    case "BGN":
                        value = Double.parseDouble(textField.getText()) * 1.6522593;
                        output.setText(df.format(value));
                        break;
                    case "GBP":
                        value = Double.parseDouble(textField.getText()) * 0.72600774;
                        output.setText(df.format(value));
                        break;
                }
            }
            if (getCurrency == "EUR" ){
                switch (getCurrency1){
                    case "USD":
                        value = Double.parseDouble(textField.getText()) * 1.1837306;
                        output.setText(df.format(value));
                        break;
                    case "EUR":
                        value = Double.parseDouble(textField.getText()) * 1;
                        output.setText(df.format(value));
                        break;
                    case "BGN":
                        value = Double.parseDouble(textField.getText()) * 1.95583;
                        output.setText(df.format(value));
                        break;
                    case "GBP":
                        value = Double.parseDouble(textField.getText()) * 0.85935626;
                        output.setText(df.format(value));
                        break;
                }
            }
            if (getCurrency == "BGN" ){
                switch (getCurrency1){
                    case "USD":
                        value = Double.parseDouble(textField.getText()) * 0.60523268;
                        output.setText(df.format(value));
                        break;
                    case "EUR":
                        value = Double.parseDouble(textField.getText()) * 0.51129188;
                        output.setText(df.format(value));
                        break;
                    case "BGN":
                        value = Double.parseDouble(textField.getText()) * 1;
                        output.setText(df.format(value));
                        break;
                    case "GBP":
                        value = Double.parseDouble(textField.getText()) * 0.43938188;
                        output.setText(df.format(value));
                        break;
                }
            }
            if (getCurrency == "GBP" ){
                switch (getCurrency1){
                    case "USD":
                        value = Double.parseDouble(textField.getText()) * 1.3774639;
                        output.setText(df.format(value));
                        break;
                    case "EUR":
                        value = Double.parseDouble(textField.getText()) * 1.1637757;
                        output.setText(df.format(value));
                        break;
                    case "BGN":
                        value = Double.parseDouble(textField.getText()) * 2.2761474;
                        output.setText(df.format(value));
                        break;
                    case "GBP":
                        value = Double.parseDouble(textField.getText()) * 1;
                        output.setText(df.format(value));
                        break;
                }
            }
        }
    }



}
