//librerias que puso el profe en clasess
import javax.swing.JFrame;
import javax.swing.JButton;
public class BorderLayout extends JFrame{ //Teniamos que extenderle el JFrame, por eso se importaba la libreria JFrame.

  
    //tamaño de la ventana x,y, y longitudes
    this.setBounds (10,40,350,280);
    //creación de la variable border
    BorderLayout bd= new BorderLayout ();
    this.setLayout(bd);
    //Creacion de los controles
    JButton btnNor = JButton("Norte"); 
    JButton btnSur = JButton("Sur"); 
    JButton btnCen = JButton("Centro");
    JButton btnWest = JButton("Oeste");
    JButton btnEast = JButton("Este");
  
    public static void main(String ar[]){
	hola m = new  hola();
	m.ventana();		
    }//main

}//class
