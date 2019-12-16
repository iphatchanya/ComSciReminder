package code;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;

public class Year1Semester1Controller extends Controller {

    @FXML
    private HBox passButton112, passButton114, passButton131, passButton417111, passButton999111;
    @FXML
    private Label passButton112Text, passButton114Text, passButton131Text, passButton417111Text, passButton999111Text;
    @FXML
    private Circle circle114;

    @FXML
    public void initialize() {
        super.initializeData(passButton112);

        super.updatePassButton(passButton112, passButton112Text, "01418112");
        super.updatePassButton(passButton114, passButton114Text, "01418114");
        super.updatePassButton(passButton131, passButton131Text, "01418131");
        super.updatePassButton(passButton417111, passButton417111Text, "01417111");
        super.updatePassButton(passButton999111, passButton999111Text, "01999111");
        super.circleHandler(circle114, "01418114");
    }

    @FXML
    public void passButton112Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton112, passButton112Text, "01418112");
    }

    @FXML
    public void passButton114Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton114, passButton114Text, "01418114");
        super.circleHandler(circle114, "01418114");
    }

    @FXML
    public void passButton131Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton131, passButton131Text, "01418131");
    }

    @FXML
    public void passButton417111Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton417111, passButton417111Text, "01417111");
    }

    @FXML
    public void passButton999111Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton999111, passButton999111Text, "01999111");
    }
}