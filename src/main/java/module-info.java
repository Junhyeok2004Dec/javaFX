module javaWin.main.code {

    requires javafx.base;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    opens main.code to javafx.graphics,javafx.fxml;
}