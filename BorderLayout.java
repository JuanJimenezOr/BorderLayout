//librerias que puso el profe en clasess
import javax.swing.JFrame;
import javax.swing.JButton;
public class BorderLayout extends JFrame{ //Teniamos que extenderle el JFrame, por eso se importaba la libreria JFrame.

 private void ventana(){ //Tambien hacia falta crear la ventana, en el main solo lo declararon mas pusieron el metodo y escribimos codigo afuera. Por eso nos marcaban varios errores (Ya esta corregido)
  
    //tamaño de la ventana x,y, y longitudes
    this.setBounds (10,40,350,280);
    //creación de la variable border
    BorderLayout bd= new BorderLayout ();
    
    this.setLayout(bd);//me marca un error aqui, borren el comentario de "private void ventana" cuando lo suban al github
    
    //Creacion de los controles
    //Me hacia falta agregar "new"
    JButton btnNor = new JButton("Norte"); 
    JButton btnSur = new JButton("Sur"); 
    JButton btnCen = new JButton("Centro");
    JButton btnWest = new JButton("Oeste");
    JButton btnEast = new JButton("Este");

  }//ventana

    public static void main(String ar[]){
	BorderLayout m = new  BorderLayout();
	m.ventana();		
    }//main

}//class
