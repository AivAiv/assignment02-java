package application;
	
import Communication.CommController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
    
        CommController controller;
    
	@Override
	public void start(Stage primaryStage) {
		try {
		    Parent root = FXMLLoader.load(getClass().getResource("/iot water check1.fxml"));
                    primaryStage.setScene(new Scene(root));
                    primaryStage.show();
                    controller = new CommController();
                    Platform.runLater(new Runnable() {
                        @Override public void run() {
                            try {
                                controller.communicate();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
