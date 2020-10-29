import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BusquedaReemplazar extends Application {

	private Label buscarLabel = new Label("Buscar:");
	private Label reemplazarLabel = new Label("Reemplazar con:");
	private TextField buscarText = new TextField();
	private TextField reemplazarText = new TextField();
	private Button buscarButton = new Button("Buscar");
	private Button reempButton = new Button("Reemplazar");
	private Button reempTodoButton = new Button("Reemplazar Todo");
	private Button cerrarButton = new Button("Cerrar");
	private Button ayudaButton = new Button("Ayuda");
	private CheckBox mayusMinCheck = new CheckBox();
	private CheckBox exprRegCheck = new CheckBox();
	private CheckBox buscarCheck = new CheckBox();
	private CheckBox resaltarCheck = new CheckBox();
	private GridPane root = new GridPane();
	private GridPane derechaPane = new GridPane();
	private VBox botonesBox = new VBox();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		root.setPadding(new Insets(5));
		root.setHgap(5);
		root.setVgap(5);
		root.setGridLinesVisible(true);
		
		root.addRow(0, buscarLabel, buscarText);
		root.addRow(1, reemplazarLabel, reemplazarText);

		RowConstraints[] rows = { new RowConstraints(), new RowConstraints() };
		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints()};
		
		root.getColumnConstraints().setAll(cols);
		cols[0].setFillWidth(true);
		cols[1].setFillWidth(false);

		
		botonesBox.getChildren().addAll(buscarButton,reempButton,reempTodoButton,cerrarButton,ayudaButton);
		root.addColumn(1, botonesBox);
		root.getRowConstraints().setAll(rows);
		botonesBox.setAlignment(Pos.CENTER);
		botonesBox.setFillWidth(true);
		Scene scene = new Scene(root, 640, 480);

		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
