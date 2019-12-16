package code;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;

public class Year2Semester2Controller extends Controller {

    @FXML
    private HBox passButton221, passButton233, passButton232;
    @FXML
    private Label passButton221Text, passButton233Text, passButton232Text;
    @FXML
    private Circle circle113, circle1132, circle131, circle231, circle132;

    @FXML
    public void initialize() {
        super.initializeData(passButton221);

        super.updatePassButton(passButton221, passButton221Text, "01418221");
        super.updatePassButton(passButton233, passButton233Text, "01418233");
        super.updatePassButton(passButton232, passButton232Text, "01418232");
        super.circleHandler(circle113, "01418113");
        super.circleHandler(circle1132, "01418113");
        super.circleHandler(circle131, "01418131");
        super.circleHandler(circle231, "01418231");
        super.circleHandler(circle132, "01418132");
    }

    @FXML
    public void passButton221Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton221, passButton221Text, "01418221");
    }

    @FXML
    public void passButton233Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton233, passButton233Text, "01418233");
    }

    @FXML
    public void passButton232Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton232, passButton232Text, "01418232");
    }
}