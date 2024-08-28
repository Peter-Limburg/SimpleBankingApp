module com.example.portfoliobankingapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.portfoliobankingapp to javafx.fxml;
    exports com.example.portfoliobankingapp;
}