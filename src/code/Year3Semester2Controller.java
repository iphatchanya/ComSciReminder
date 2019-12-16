package code;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;

public class Year3Semester2Controller extends Controller {

    @FXML
    private HBox passButton332, passButton333, passButton351, passButton390, passButton334;
    @FXML
    private Label passButton332Text, passButton333Text, passButton351Text, passButton390Text, passButton334Text;
    @FXML
    private Circle circle331, circle132, circle3312, circle321, circle333;

    @FXML
    public void initialize() {
        super.initializeData(passButton332);

        super.updatePassButton(passButton332, passButton332Text, "01418332");
        super.updatePassButton(passButton333, passButton333Text, "01418333");
        super.updatePassButton(passButton351, passButton351Text, "01418351");
        super.updatePassButton(passButton390, passButton390Text, "01418390");
        super.updatePassButton(passButton334, passButton334Text, "01418334");
        super.circleHandler(circle331, "01418331");
        super.circleHandler(circle132, "01418132");
        super.circleHandler(circle3312, "01418132");
        super.circleHandler(circle321, "01418321");
        super.circleHandler(circle333, "01418333");
    }

    @FXML
    public void passButton332Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton332, passButton332Text, "01418332");
    }

    @FXML
    public void passButton333Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton333, passButton333Text, "01418333");
    }

    @FXML
    public void passButton351Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton351, passButton351Text, "01418351");
    }

    @FXML
    public void passButton390Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton390, passButton390Text, "01418390");
    }

    @FXML
    public void passButton334Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton334, passButton334Text, "01418334");
    }
}