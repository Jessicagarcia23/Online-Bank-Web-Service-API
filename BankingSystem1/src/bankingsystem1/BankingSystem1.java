/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem1;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
/**
 *
 * @author Jessica Garcia -- Jessicagarcia@hotmail.com
 */
public class BankingSystem1 extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    /**public static void main(String[] args) {*/
        public BankingSystem1() {
            initComponents();
            setLocationRelativeTo(null); //Centrar pantalla.
            setResizable(false); //Para que no se maximize la pantalla.
            setTitle("Menu"); //Poner titulo a nuestro JFrame.
    
            setIconImage(new ImageIcon(getClass().getResource("/images/fondo.png")).getImage()); //Buscamos e instanciamos el icono perzonalizado para JFrame.
        ((JPanel)getContentPane()).setOpaque(false); //Para que la imagen se aplique tambien dentro de JPanel y no quede con fondo unico y blanco.
        ImageIcon MyImgCustom =new ImageIcon(this.getClass().getResource("/images/fondo.png")); //Creamos un objeto de tipo imagen y buscamos la imagen de fondo para nuestro JFrame.
        JLabel fondo= new JLabel(); //Declaramos un objeto de tipo Jlabel. 
        
        fondo.setIcon(MyImgCustom); //Mandamos la imagen ya instanciada desde el objeto MyImgCustom.
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER); //Carga la imagen ya mandada a "fondo" a nuestro contenedor o panel para visualizarla.
        fondo.setBounds(0,0,MyImgCustom.getIconWidth(),MyImgCustom.getIconHeight()); //Ajustamos o acoplamos la imagen que usaremos de fondo al tamaño de nuestro JFrame.
        
}

    
