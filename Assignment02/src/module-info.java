module Assignment02 {
	requires javafx.controls;
    requires javafx.fxml;
    requires jssc;
    requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
}
