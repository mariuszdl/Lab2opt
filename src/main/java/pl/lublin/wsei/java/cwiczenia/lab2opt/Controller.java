package pl.lublin.wsei.java.cwiczenia.lab2opt;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private LineChart lineChart;
    @FXML
    private Slider aplitudeSlider, frequencySlider, phaseSlider, offsetSlider;
    private XYChart.Series series;

    @FXML
    public void initialize() {
        series = new XYChart.Series<>();
        series.setName("sin");
        lineChart.getData().add(series);
        lineChart.setAnimated(false);
        lineChart.setCreateSymbols(false);
        regenSin();
    }

    @FXML
    private void suwakChanged(MouseEvent event) {
        regenSin();
    }

    private void regenSin() {
        series.getData().clear();
        for (int i = 0; i < 200; i++) {
            series.getData().add(new XYChart.Data(i + "", offsetSlider.getValue() + aplitudeSlider.getValue() * Math.sin(i/200.0 * Math.PI * 2 * frequencySlider.getValue() + phaseSlider.getValue())));
        }
    }
}