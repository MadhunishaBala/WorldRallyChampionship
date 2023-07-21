package com.example.worldrallychampionship;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

import java.io.*;
import java.util.List;

public class Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;
    public Button exit;

    @FXML
    private TextField License_num;
    @FXML
    private TextField driver_name;
    @FXML
    private TextField driver_age;
    @FXML
    private TextField driver_team;
    @FXML
    private TextField driver_car;
    @FXML
    private TextField current_points;

   //ADD FUNCTION
    @FXML
    void setText(MouseEvent event) {
            String licenseNum = License_num.getText().trim();
            String driverName = driver_name.getText().trim();
            String driverAge = driver_age.getText().trim();
            String driverTeam = driver_team.getText().trim();
            String driverCar = driver_car.getText().trim();
            String currentPoints = current_points.getText().trim();

            //VALIDATION FOR THE INPUT FIELDS
            if (licenseNum.isEmpty() || !licenseNum.matches("\\d+")) {
                System.out.println("Not a valid license number");
                return;
            }
            if (driverName.isEmpty()) {
                System.out.println("Not a valid driver name");
                return;
            }
            if (driverAge.isEmpty() || !driverAge.matches("\\d+")) {
                System.out.println("Not a valid driver age");
                return;
            }
            if (driverTeam.isEmpty() || driverTeam.matches("[a-zA-Z\\s]")) {
                System.out.println("Not a valid driver team");
                return;
            }
            if (driverCar.isEmpty() || driverCar.matches("[a-zA-Z\\s]")) {
                System.out.println("Not a valid driver car");
                return;
            }
            if (currentPoints.isEmpty() || !currentPoints.matches("\\d+")) {
                System.out.println("Not a valid current points");
                return;
            }
            //THE INPUTS ARE STORE IN ONE STRING
            String driverDetails = licenseNum + "~" + driverName + "~" + driverAge + "~" + driverTeam + "~" + driverCar + "~" + currentPoints;
            DriverEdit.add(driverDetails);

    }
    //DDD FUNCTION
    @FXML
    private TextField removeDriver;

    @FXML
    void ddd(MouseEvent event) {
        String deleteDriver = removeDriver.getText().trim();
        if (deleteDriver.isEmpty() || !deleteDriver.matches("\\d+")) {
            System.out.println("Not a valid license number");
            return;
        }
        DriverEdit.DDD(deleteDriver);
    }
    //SRR FUNCTION
    @FXML
    private Label srr;
    public void randomrace() //The random race generated (date,location) will be printed.
    {
        srr.setText(RaceEdit.SRR());
    }

    @FXML  //VCT
    public TableView<Driver> tableView;
    @FXML
    private TableColumn<Driver,Integer>licenseColumn;
    @FXML
    private TableColumn<Driver,String>drivernameColumn;
    @FXML
    private TableColumn<Driver,Integer>driverageColumn;
    @FXML
    private TableColumn<Driver,String>driverTeamColumn;
    @FXML
    private TableColumn<Driver,String>drivercarColumn;
    @FXML
    private TableColumn<Driver,Integer>CurrenpointsColumn;
    @FXML
    private void driver_table(ActionEvent event) {
        licenseColumn.setCellValueFactory(new PropertyValueFactory<>("licenseNum"));
        drivernameColumn.setCellValueFactory(new PropertyValueFactory<>("driverName"));
        driverageColumn.setCellValueFactory(new PropertyValueFactory<>("driverAge"));
        driverTeamColumn.setCellValueFactory(new PropertyValueFactory<>("driverTeam"));
        drivercarColumn.setCellValueFactory(new PropertyValueFactory<>("driverCar"));
        CurrenpointsColumn.setCellValueFactory(new PropertyValueFactory<>("currentPoints"));

        List<Driver> order=Driver_Standings.vct();
        tableView.getItems().addAll(order);

    }

    @FXML   //VRL
    public TableView<Race> raceView;
    @FXML
    private TableColumn<Race,String> Datecolumn;
    @FXML
    private TableColumn<Race,String> Locationcolumn;
    @FXML
    private TableColumn<Race,Integer> ChampionIdcolumn;

    @FXML
    private void racetable(ActionEvent event) {
        Datecolumn.setCellValueFactory(new PropertyValueFactory<>("Date"));
        Locationcolumn.setCellValueFactory(new PropertyValueFactory<>("Location"));
        ChampionIdcolumn.setCellValueFactory(new PropertyValueFactory<>("ChampionId"));

        List<Race>race=Race_Standings.vrl();
        raceView.getItems().addAll(race);

    }     

    //The below codes are the navigation through the menu and the button options
    public void gotomenu(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void gotoadd (ActionEvent event)throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("ADD.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void gotoddd (ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DDD.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void gotoudd (ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UDD.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void gotosrr (ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SRR.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void gotovct (ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VCT.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void gotovrl (ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VRL.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void quit(){
        Stage stage=(Stage)exit.getScene().getWindow();
        stage.close();
    }


}