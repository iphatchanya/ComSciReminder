package code;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;

public class Year4Semester2Controller extends Controller {

    @FXML
    private HBox passButton499;
    @FXML
    private Label passButton499Text;
    @FXML
    private Circle circle321;

    @FXML
    public void initialize() {
        super.initializeData(passButton499);

        super.updatePassButton(passButton499, passButton499Text, "01418499");
        super.circleHandler(circle321, "01418499");
    }

    @FXML
    public void passButton499Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton499, passButton499Text, "01418499");
    }
}