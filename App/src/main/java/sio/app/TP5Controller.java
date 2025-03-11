package sio.app;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sio.app.models.Cours;
import sio.app.models.CoursCollectif;
import sio.app.models.CoursIndividuel;
import sio.app.models.Instrument;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TP5Controller implements Initializable {

    @FXML
    private TableView tvCours;
    @FXML
    private TableColumn tcPrix;
    @FXML
    private TableColumn tcInfos;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<Cours> cours = new ArrayList<Cours>();

        //objet de type cours
        Cours c1 = new Cours(1,5);
        Cours c2 = new Cours(2,5);

        //objet de type cours individuel
        Instrument i1 = new Instrument(1,"Guittare");
        Instrument i2 = new Instrument(2,"Piano");
        CoursIndividuel ci1 = new CoursIndividuel(3,5,i1);
        CoursIndividuel ci2 = new CoursIndividuel(4,5,i2);

        //objet de type cours collectif
        CoursCollectif cc1 = new CoursCollectif(5,5,"Apprendre le solfage",7,15);
        CoursCollectif cc2 = new CoursCollectif(6,5,"Choral Adulte",18,30);

        //ajout des cours a la list d'objet on remarque que malgres le fait que la liste sois typer on peut ajt touyt les type de cours
        cours.add(c1);
        cours.add(c2);
        cours.add(ci1);
        cours.add(ci2);
        cours.add(cc1);
        cours.add(cc2);

        //préparer table view
        tcPrix.setCellValueFactory(new PropertyValueFactory<>("idCours"));
        tcInfos.setCellValueFactory(new PropertyValueFactory<>("prixCours"));
        tvCours.setItems(FXCollections.observableList(cours));
    }
}