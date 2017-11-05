package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.awt.*;
import sample.ClientSocket;

public class Controller {
    @FXML
    private TextField msg;


     public void SendAction(ActionEvent actionEvent)
     {
         ClientSocket socket = new ClientSocket();
         String _msg = msg.getText();
         socket.sendData(_msg);
         msg.setText("Sent");
     }

     public Controller()
     {

     }

}
