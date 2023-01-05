import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class ChartTest extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        PieChart piechart = new PieChart();

        piechart.setData(getChartData());
        piechart.setLegendSide(Side.LEFT);
        piechart.setTitle("ავიაფრენები");
        piechart.setClockwise(false);

        StackPane root = new StackPane();

        root.getChildren().add(piechart);

        Scene scene = new Scene(root,800,600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ავიაფრენები");
        primaryStage.show();

    }

    private ObservableList<Data> getChartData() {
        ObservableList<Data> list = FXCollections.observableArrayList();
        list.addAll(new PieChart.Data("ლონდონი", 9),
                new PieChart.Data("პარიზი", 20),
                new PieChart.Data("ბერლინი", 10),
                new PieChart.Data("ნიუ-იორკი", 13),
                new PieChart.Data("ესპანეთი", 13)

        );
        return list;
    }
}