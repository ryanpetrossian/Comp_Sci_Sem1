import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Priority;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;

public class SimpleGrapher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private GraphCanvas graph;  

    private TextField functionInput;  

    private Label message;  
    
    public void start(Stage stage) {

        graph = new GraphCanvas( new Expr("0") );
        
        message = new Label("                      Enter a Function");

        functionInput = new TextField("0");
        
        Button graphIt = new Button("Enter");
        graphIt.setDefaultButton(true);
        
        Font helveticaboldtitle = Font.font("Helvetica", FontWeight.BOLD, FontPosture.REGULAR, 40);

        graphIt.setOnAction( evt -> {
                   
                Expr function;
                try {
                    String def = functionInput.getText();
                    function = new Expr(def);
                    graph.setFunction(function);
                    message.setText("                      Enter a Function");
                }
                catch (IllegalArgumentException e) {
                    graph.clearFunction();
                    message.setText(e.getMessage());
                }
                functionInput.selectAll();
                functionInput.requestFocus(); 
            } );
        
        HBox bottom = new HBox(8, new Label("f(x) ="), functionInput, graphIt);
        
        BorderPane root = new BorderPane();
        root.setCenter(graph);
        root.setTop(message);
        root.setBottom(bottom);
        root.setStyle("-fx-border-color:gray; -fx-border-width:4px");
        message.setTextFill(Color.RED); 
        message.setFont(helveticaboldtitle);
        message.setStyle("-fx-background-color:whitesmoke; -fx-padding:7px; "
                + "-fx-border-color:gray; -fx-border-width:0 0 4px 0");
        message.setMaxWidth(10000); 
        bottom.setStyle("-fx-border-color:gray; -fx-border-width:4px 0 0 0; -fx-padding:8px");
        HBox.setHgrow(functionInput, Priority.ALWAYS); 
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Graphing Calculator");
        stage.show();

    }
}