import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MemoryFX extends Application{
	

	@Override
	public void start(Stage meineStage) throws Exception {
		//den obersten Knoten erzeugen
		//hier verwenden wir ein FlowPane
		//erzeugt wird die Oberfläche über eine eigene 
		//Methode in der Klasse MemoryFeld
		FlowPane rootNot = new MemoryFeld().initGUI(new FlowPane());
		//die Szene erzeugen
		//an den Konstruktor werden der oberste Knoten und 
		//die Größe übergeben
		Scene scene = new Scene(rootNot, 480, 600);
		meineStage.setTitle("Memory");
		meineStage.setScene(scene);
		meineStage.setResizable(false);
		meineStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);

	}
}
