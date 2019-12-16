package code;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;

public class Year1Semester2Controller extends Controller {

    @FXML
    private HBox passButton113, passButton132, passButton417112;
    @FXML
    private Label passButton113Text, passButton132Text, passButton417112Text;
    @FXML
    private Circle circle112, circle417111;

    @FXML
    public void initialize() {
        super.initializeData(passButton113);

        super.updatePassButton(passButton113, passButton113Text, "01418113");
        super.updatePassButton(passButton132, passButton132Text, "01418132");
        super.updatePassButton(passButton417112, passButton417112Text, "01417112");
        super.circleHandler(circle112, "01418112");
        super.circleHandler(circle417111, "01417111");
    }

    @FXML
    public void passButton113Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton113, passButton113Text, "01418113");
    }

    @FXML
    public void passButton132Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton132, passButton132Text, "01418132");
    }

    @FXML
    public void passButton417112Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton417112, passButton417112Text, "01417112");
    }
}