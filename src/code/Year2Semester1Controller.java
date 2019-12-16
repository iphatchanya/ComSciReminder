package code;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;

public class Year2Semester1Controller extends Controller {

    @FXML
    private HBox passButton211, passButton231, passButton417322, passButton422111;
    @FXML
    private Label passButton211Text, passButton231Text, passButton417322Text, passButton422111Text;
    @FXML
    private Circle circle113, circle1132, circle417112;

    @FXML
    public void initialize() {
        super.initializeData(passButton211);

        super.updatePassButton(passButton211, passButton211Text, "01418211");
        super.updatePassButton(passButton231, passButton231Text, "01418231");
        super.updatePassButton(passButton417322, passButton417322Text, "01417322");
        super.updatePassButton(passButton422111, passButton422111Text, "01422111");
        super.circleHandler(circle113, "01418113");
        super.circleHandler(circle1132, "01418113");
        super.circleHandler(circle417112, "01417112");
    }

    @FXML
    public void passButton211Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton211, passButton211Text, "01418211");
    }

    @FXML
    public void passButton231Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton231, passButton231Text, "01418231");
    }

    @FXML
    public void passButton417322Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton417322, passButton417322Text, "01417322");
    }

    @FXML
    public void passButton422111Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton422111, passButton422111Text, "01422111");
    }
}