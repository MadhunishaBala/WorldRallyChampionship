module com.example.worldrallychampionship {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.worldrallychampionship to javafx.fxml;
    exports com.example.worldrallychampionship;
}