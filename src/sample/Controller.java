package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.awt.*;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sample.ClientSocket;

public class Controller {
    @FXML
    private TextField msg;
    @FXML
    private ImageView img;


     public void SendAction(ActionEvent actionEvent)
     {
         ClientSocket socket = new ClientSocket();
         String _msg = msg.getText();
         msg.setText(socket.sendData(_msg));
         msg.setText("Sent");
//         try {
//
//             img.setImage(new Image("file:../imgs/startIm.jpg"));
//         }
//         catch (Exception e){msg.setText("Не вижу картинку");}


     }

     public Controller()
     {

     }


}
