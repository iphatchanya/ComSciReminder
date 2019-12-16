package code;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;

public class Year3Semester1Controller extends Controller {

    @FXML
    private HBox passButton331, passButton321, passButton497, passButton341;
    @FXML
    private Label passButton331Text, passButton321Text, passButton497Text, passButton341Text;
    @FXML
    private Circle circle233, circle221, circle211, circle232, circle2332, circle2212;

    @FXML
    public void initialize() {
        super.initializeData(passButton331);

        super.updatePassButton(passButton331, passButton331Text, "01418331");
        super.updatePassButton(passButton321, passButton321Text, "01418321");
        super.updatePassButton(passButton497, passButton497Text, "01418497");
        super.updatePassButton(passButton341, passButton341Text, "01418341");
        super.circleHandler(circle233, "01418233");
        super.circleHandler(circle221, "01418221");
        super.circleHandler(circle211, "01418211");
        super.circleHandler(circle232, "01418232");
        super.circleHandler(circle2332, "01418233");
        super.circleHandler(circle2212, "01418221");
    }

    @FXML
    public void passButton331Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton331, passButton331Text, "01418331");
    }

    @FXML
    public void passButton321Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton321, passButton321Text, "01418321");
    }

    @FXML
    public void passButton497Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton497, passButton497Text, "01418497");
    }

    @FXML
    public void passButton341Handler(MouseEvent mouseEvent) {
        super.passButtonHandler(passButton341, passButton341Text, "01418341");
    }
}