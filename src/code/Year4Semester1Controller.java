package code;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;

public class Year4Semester1Controller extends Controller {

    @FXML
    private HBox passButton490;
    @FXML
    private Label passButton490Text;
    @FXML
    private Circle circle390;

    @FXML
    public void initialize() {
        super.initializeData(passButton490);

        super.updatePassButton(passButton490, passButton490Text, "01418490");
        super.circleHandler(circle390, "01418390");
    }

    @FXML
    public void passButton490Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton490, passButton490Text, "01418490");
    }
}