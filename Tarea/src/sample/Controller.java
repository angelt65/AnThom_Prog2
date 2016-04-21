package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Controller {
    ArrayList<Estudiante> lista = new ArrayList<>();
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private TextField tf1;
    @FXML
    private TextField tf2;

    @FXML
    private void guardarNombre(ActionEvent e) {
        Estudiante temp = new Estudiante();
        temp.setNombre(tf1.getText());
        temp.setNota(tf2.getText());
        lista.add(temp);
        tf1.setText("");
        tf2.setText("");
    }

    @FXML
    private void mostrarLista(ActionEvent e)throws IOException {
        Stage stage;
        Parent root;
        stage = (Stage) btn2.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Screen2.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        for (Estudiante elemento : lista) {
            System.out.println("\t" + elemento.getNombre() + "    " + elemento.getNota());
        }

    }



    @FXML
    private void regrePantalla(ActionEvent e) throws IOException{
        Stage stage;
        Parent root;
        stage = (Stage) btn3.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Screen1.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}

