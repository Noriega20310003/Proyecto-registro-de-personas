
package persona;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Frame extends JFrame {

    private String Texto="";
    public Frame(){
        setSize(800, 640 );
        setTitle("Ventana.Persona");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void ventana(){
        
        int edad = 0, salario=0;
        String nombre="", genero = "", tez="";
        
       JPanel p1 = new JPanel();
       this.getContentPane().add(p1);
       p1.setLayout(null);
       
       JLabel marca = new JLabel();
       p1.add(marca);
       marca.setLayout(null);
       marca.setBounds(595, 580, 300, 20);
       marca.setText("KalmonsInc @BryanAxel.Mades'");
       marca.setVisible(true);
       
       JTextField tf4 = new JTextField();
       tf4.setBounds(10, 70, 100, 30);
       tf4.setText(null);
       p1.add(tf4);
       JFormattedTextField tf5 = new JFormattedTextField(new Integer ((int) edad));
       tf5.setBounds(10, 70, 100, 30);
       tf5.setValue(null);
       p1.add(tf5);
       JFormattedTextField tf6 = new JFormattedTextField(NumberFormat.getNumberInstance(Locale.ENGLISH));
       tf6.setBounds(10, 70, 100, 30);
       p1.add(tf6);
       JFormattedTextField tf7 = new JFormattedTextField(NumberFormat.getNumberInstance(Locale.ENGLISH) );
       tf7.setBounds(10, 70, 100, 30);
       p1.add(tf7);
       JTextField tf8 = new JTextField();
       tf8.setBounds(10, 70, 100, 30);
       tf8.setText(null);
       p1.add(tf8);
       JTextField tf9 = new JTextField();
       tf9.setBounds(10, 70, 100, 30);
       tf9.setText(null);
       p1.add(tf9);
       JTextField tf10 = new JTextField();
       tf10.setBounds(10, 70, 100, 30);
       tf10.setText(null);
       p1.add(tf10);
       JTextField tf11 = new JTextField();
       tf11.setBounds(10, 70, 100, 30);
       tf11.setText(null);
       p1.add(tf11);
       JTextField tf12 = new JTextField();
       tf12.setBounds(10, 70, 100, 30);
       tf12.setText(null);
       p1.add(tf12);
       JTextField tf13 = new JTextField();
       
       tf13.setBounds(10, 70, 100, 30);
       tf13.setText(null);
       p1.add(tf13);
       JFormattedTextField tf14 = new JFormattedTextField(new Integer ((int) salario));
       tf14.setBounds(10, 70, 100, 30);
       tf14.setText(null);
       p1.add(tf14);
       
       tf4.setVisible(false);
       tf5.setVisible(false);
       tf6.setVisible(false);
       tf7.setVisible(false);
       tf8.setVisible(false);
       tf9.setVisible(false);
       tf10.setVisible(false);
       tf11.setVisible(false);
       tf12.setVisible(false); 
       tf13.setVisible(false);
       tf14.setVisible(false); 
       
       JTextField tf1 = new JTextField();
       JTextField tf2 = new JTextField();
       JTextField tf3 = new JTextField();
       JLabel l1 = new JLabel();
       JLabel l2 = new JLabel();
       JLabel l3 = new JLabel();
       l1.setLayout(null);
       tf4.setLayout(null);
       p1.add(tf1);
       p1.add(tf2);
       p1.add(tf3);
       p1.add(l2);
       p1.add(l1);
       p1.add(l3);
       tf1.setBounds(10, 70, 100, 30);
       tf2.setBounds(10, 70, 100, 30);
       tf2.setText(null);
       tf1.setText(null);
       tf3.setBounds(10, 70, 100, 30);
       l2.setBounds(10,10, 800,30);
       l2.setText(null);
       l3.setText(null);
       l3.setBounds(10,80, 600,500);
       l2.setText("A continuacion requeriremos de algunos de sus datos");
       l1.setBounds(10,30, 500,30);
       tf2.setVisible(false);
       tf3.setVisible(false); 
       
       
       
       Persona pe = new Persona();
       Alumno al = new Alumno();  
       Nini ni = new Nini();
       Deportista dep = new Deportista();  
       Profesor pro = new Profesor();
       Artista ar = new Artista();
       
       l1.setText("Introduzca su nombre");
       tf1.requestFocus();
       tf1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               tf4.removeActionListener(this);
                                                                                                                   tf5.removeActionListener(this);
                                                                                                                   tf6.removeActionListener(this);
                                                                                                                   tf7.removeActionListener(this);
                                                                                                                   tf8.removeActionListener(this);
                                                                                                                   tf9.removeActionListener(this);
                                                                                                                   tf10.removeActionListener(this);
                                                                                                                   tf10.removeAll();
                                                                                                                   tf11.removeActionListener(this);
                                                                                                                   tf12.removeActionListener(this);
                                                                                                                   tf13.removeActionListener(this);
                                                                                                                   tf14.removeActionListener(this);
               al.setNombre(tf1.getText());
               ni.setNombre(tf1.getText());
               dep.setNombre(tf1.getText());
               pro.setNombre(tf1.getText());
               ar.setNombre(tf1.getText());
               System.out.println(nombre);
               
               if(nombre != null){
                   tf1.setVisible(false);
                   tf3.setVisible(true);
                   tf3.requestFocus();
                   l1.setText("Introduzca su genero");
                    
                   
                   tf3.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent ae) {
                       al.setGenero(tf3.getText());
                       ni.setGenero(tf3.getText());
                       dep.setGenero(tf3.getText());
                       pro.setGenero(tf3.getText());
                       ar.setGenero(tf3.getText());
                       if(genero!=null){
                         tf3.setVisible(false);
                         tf4.setVisible(true);
                         l1.setText("Introduzca su tez");
                         tf4.requestFocus();
                         
                         tf4.addActionListener(new ActionListener() {
                           @Override
                           public void actionPerformed(ActionEvent ae) {
                             al.setTez(tf4.getText());
                             ni.setTez(tf4.getText());
                             dep.setTez(tf4.getText());
                             pro.setTez(tf4.getText());
                             ar.setTez(tf4.getText());
                             if(tez!=null){
                               tf4.setVisible(false);
                               tf5.setVisible(true);
                               l1.setText("Introduzca su edad");     
                               tf5.requestFocus();
                               
                               tf5.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent ae) {
                                    Integer edad  = (Integer) tf5.getValue();
                                    al.setEdad(edad);
                                    ni.setEdad(edad);
                                    dep.setEdad(edad);
                                    pro.setEdad(edad);
                                    ar.setEdad(edad);
                                     
                                   if(edad!=0){
                                     tf5.setVisible(false);
                                     tf6.setVisible(true);
                                     l1.setText("Introduzca su talla con el formato 0.00# con almenos un valor despues del punto que no sea cero");
                                     tf6.requestFocus();
                                     
                                     tf6.addActionListener(new ActionListener() {
                                       @Override
                                       public void actionPerformed(ActionEvent ae) {
                                         try{
                                         double talla = (double) tf6.getValue();
                                         al.setTalla(talla);
                                         ni.setTalla(talla);
                                         dep.setTalla(talla);
                                         pro.setTalla(talla);
                                         ar.setTalla(talla);
                                         
                                         
                                             tf6.setVisible(false);
                                             tf7.setVisible(true);
                                             l1.setText("Introduzca su peso formato 0.00# con almenos un valor despues del punto que no sea cero");
                                             tf7.requestFocus();
                                             
                                             tf7.addActionListener(new ActionListener() {
                                                 @Override
                                                 public void actionPerformed(ActionEvent ae2) {
                                                     try{
                                                     double peso1 = (double) tf7.getValue();
                                                     al.setPeso(peso1);
                                                     ni.setPeso(peso1);
                                                     dep.setPeso(peso1);
                                                     pro.setPeso(peso1);
                                                     ar.setPeso(peso1);
                                                     
                                                         tf7.setVisible(false);
                                                         tf8.setVisible(true);
                                                         l1.setBounds(10,10, 700,60);
                                                         l2.setVisible(false);
                                                         l1.setText("<html>A continuacion requeriremos algunos datos sobre su ocupacion, si usted es un estudiante escriba la palabra Alumno, si"
                                                                 + " usted es un Maestr@ escriba la palabra Profesor,\nsi usted es un Nini escriba esta palabra, si usted es un 'Artista' escriba tal palabra, si usted se dedica al deporte escriba Deportista"
                                                                 + " \nsi desea salir escriba Salir<html>" );
                                                         tf6.requestFocus();
                                                         tf8.requestFocus();
                                                         tf8.addActionListener(new ActionListener() {
                                                             @Override
                                                             public void actionPerformed(ActionEvent ae3) {
                                                                 String opcion = "";
                                                                 opcion =tf8.getText();
                                                                 if (opcion.toLowerCase().equals("alumno")) {
                                                                     tf8.setVisible(false);
                                                                     tf9.setVisible(true);
                                                                     l1.setText("Usted es poseedor de alguna beca, de ser asi cual?");
                                                                     tf9.requestFocus();
                                                                     tf9.addActionListener(new ActionListener() {
                                                                         @Override
                                                                         public void actionPerformed(ActionEvent ae4) {
                                                                             al.setBeca(tf9.getText());
                                                                             tf9.setVisible(false);
                                                                             tf10.setVisible(true);
                                                                             l1.setText("Que carrera cursas");
                                                                             tf10.requestFocus();
                                                                             tf10.addActionListener(new ActionListener() {
                                                                                 @Override
                                                                                 public void actionPerformed(ActionEvent ae5) {
                                                                                     al.setCarrera(tf10.getText());
                                                                                     tf10.setVisible(false);
                                                                                     tf11.setVisible(true);
                                                                                     l1.setText("Cual es tu codigo como alumno");
                                                                                     tf11.requestFocus();
                                                                                     tf11.addActionListener(new ActionListener() {
                                                                                         @Override
                                                                                         public void actionPerformed(ActionEvent ae6) {
                                                                                             al.setCodigo(tf10.getText());
                                                                                             tf11.setVisible(false);
                                                                                             tf12.setVisible(true);
                                                                                             l1.setText("A que escuela o institucion asistes");
                                                                                             tf12.requestFocus();
                                                                                             tf12.addActionListener(new ActionListener() {
                                                                                                 @Override
                                                                                                 public void actionPerformed(ActionEvent ae7) {
                                                                                                     al.setEscuela(tf10.getText());
                                                                                                     tf12.setVisible(false);
                                                                                                     tf13.setVisible(true);
                                                                                                     l1.setText("Cual es el grado o nivel que cursas");
                                                                                                     tf13.requestFocus();
                                                                                                     tf13.addActionListener(new ActionListener() {
                                                                                                         @Override
                                                                                                         public void actionPerformed(ActionEvent ae8) {
                                                                                                             al.setGrado(tf10.getText());
                                                                                                             tf13.setVisible(false);
                                                                                                             tf14.setVisible(true);
                                                                                                             l3.setText("<html>sus datos como persona son:<p>Nombre: " + al.getNombre()
                                                                                                                     + "<p>Genero: " + al.getGenero() + "<p>Tez: " + al.getTez()
                                                                                                                     + "<p>Edad: " + al.getEdad() + "<p>Talla: " + al.getTalla()
                                                                                                                     + "<p>Peso: " + al.getPeso() + "<p>Sus tendencias como Persona podrian ser: "
                                                                                                                     + al.Comer() + al.Dormir() + al.Caminar() + al.Vivir() + al.Hablar() 
                                                                                                                     + al.Morir() + al.Amar()
                                                                                                                     + "<p>Sus datos como Alumno son: " + "<p>Beca: " + al.getBeca()
                                                                                                                     + "<p>Carrera: " + al.getCarrera() + "<p>Codigo: " + al.getCodigo()
                                                                                                                     + "<p>Escuela/Institucion: " + al.getEscuela()
                                                                                                                     + "<p>Grado/Nivel: <html>" + al.getGrado() +"<p>Sus tendencias como Alumno podrian ser: "
                                                                                                                     + al.Tendenciaa());
                                                                                                             l1.setText("Desea probar otra configuracion?");
                                                                                                             tf14.setVisible(false);
                                                                                                             tf2.setVisible(true);
                                                                                                             tf2.requestFocus();
                                                                                                             tf2.addActionListener(new ActionListener() {
                                                                                                               @Override
                                                                                                               public void actionPerformed(ActionEvent ae) {
                                                                                                                 String a = tf2.getText(); 
                                                                                                                 if(a.toLowerCase().equals("si")){
                                                                                                                   tf2.setVisible(false);
                                                                                                                   tf1.setVisible(true);
                                                                                                                   tf4.removeActionListener(this);
                                                                                                                   tf5.removeActionListener(this);
                                                                                                                   tf6.removeActionListener(this);
                                                                                                                   tf7.removeActionListener(this);
                                                                                                                   tf8.removeActionListener(this);
                                                                                                                   tf9.removeActionListener(this);
                                                                                                                   tf10.removeActionListener(this);
                                                                                                                   tf10.removeAll();
                                                                                                                   tf11.removeActionListener(this);
                                                                                                                   tf12.removeActionListener(this);
                                                                                                                   tf13.removeActionListener(this);
                                                                                                                   tf14.removeActionListener(this);
                                                                                                                   tf1.setBounds(10, 70, 100, 30);
                                                                                                                   tf2.setBounds(10, 70, 100, 30);
                                                                                                                   l2.setText("A continuacion requeriremos de algunos de sus datos");
                                                                                                                   l1.setText("Introduzca su nombre");
                                                                                                                   l3.setText(null);
                                                                                                                   tf2.setText(null);
                                                                                                                   tf1.setText(null);
                                                                                                                   tf3.setText(null);
                                                                                                                   tf4.setText(null);
                                                                                                                   tf5.setText(null);
                                                                                                                   tf6.setText(null);
                                                                                                                   tf7.setText(null);
                                                                                                                   tf8.setText(null);
                                                                                                                   tf9.setText(null);
                                                                                                                   tf10.setText(null);
                                                                                                                   tf11.setText(null);
                                                                                                                   tf12.setText(null);
                                                                                                                   tf13.setText(null);
                                                                                                                   tf14.setText(null);
                                                                                                                   tf2.requestFocus();
                                                                                                                 }
                                                                                                                 if(a.toLowerCase().equals("no")){
                                                                                                                   dispose();
                                                                                                                   
                                                                                                                 }
                                                                                                               }
                                                                                                           });
                                                                                                         }
                                                                                                     });
                                                                                                 }
                                                                                             });
                                                                                         }
                                                                                     });
                                                                                 }
                                                                             });
                                                                         }
                                                                     });  
                                                                 }
                                                                 if (opcion.toLowerCase().equals("nini")) {
                                                                     tf8.setVisible(false);
                                                                     tf9.setVisible(true);
                                                                     l1.setText("Usted padece de ansiedad?");
                                                                     tf9.requestFocus();
                                                                     tf9.addActionListener(new ActionListener() {
                                                                         @Override
                                                                         public void actionPerformed(ActionEvent ae9) {
                                                                             ni.setAnsiedad(tf9.getText());
                                                                             tf9.setVisible(false);
                                                                             tf10.setVisible(true);
                                                                             l1.setText("Usted sufre de algun tipo de hambre o enfermedad relacionada a esta? ");
                                                                        tf10.requestFocus();
                                                                             tf10.addActionListener(new ActionListener() {
                                                                                 @Override
                                                                                 public void actionPerformed(ActionEvent ae10) {
                                                                                     ni.setHambre(tf10.getText());
                                                                                     tf10.setVisible(false);
                                                                                     tf11.setVisible(true);
                                                                                     l1.setText("Cual seria su nivel de flojera");
                                                                                     tf11.requestFocus();
                                                                                     tf11.addActionListener(new ActionListener() {
                                                                                         @Override
                                                                                         public void actionPerformed(ActionEvent ae111) {
                                                                                             ni.setFlojera(tf11.getText());
                                                                                             tf11.setVisible(false);
                                                                                             tf12.setVisible(true);
                                                                                             l1.setText("Usted sufre de algun tipo de inestabilidad?");
                                                                                            tf12.requestFocus();
                                                                                             tf12.addActionListener(new ActionListener() {
                                                                                                 @Override
                                                                                                 public void actionPerformed(ActionEvent ae1112) {
                                                                                                     ni.setInestabilidad(tf12.getText());
                                                                                                     tf12.setVisible(false);
                                                                                                     tf13.setVisible(true);
                                                                                                     l1.setText("Introduzca sus niveles de dependencia");
                                                                                                tf13.requestFocus();
                                                                                                     tf13.addActionListener(new ActionListener() {
                                                                                                         @Override
                                                                                                         public void actionPerformed(ActionEvent ae11113) {
                                                                                                             ni.setDependencia(tf13.getText());
                                                                                                             tf13.setVisible(false);
                                                                                                             tf14.setVisible(true);        
                                                                                                             l3.setText("<html>sus datos como persona son<p>Nombre: " + ni.getNombre() 
                                                                                                                       + "<p>Genero: " + ni.getGenero() + "<p>Tez: " + ni.getTez() 
                                                                                                                       + "<p>Edad: " + ni.getEdad() + "<p>Talla: "+ ni.getTalla() 
                                                                                                                       + "<p>Peso: " + ni.getPeso()+"<p>Sus tendencias como Persona son: "
                                                                                                                       + ni.Comer() + ni.Dormir() + ni.Caminar() + ni.Vivir() + ni.Hablar() 
                                                                                                                       + ni.Morir() + ni.Amar()
                                                                                                                       + "<p>Sus datos como Nini son: " + "<p>Ansiedad: " + ni.getAnsiedad() 
                                                                                                                       + "<p>Hambre: " + ni.getHambre() + "<p>Flojera: " + ni.getFlojera() 
                                                                                                                       + "<p>Inestibalidad: " + ni.getInestabilidad() + "<p>Dependencia: <html>" 
                                                                                                                       + ni.getDependencia() + "<p>Sus tendencias como Nini son: " + ni.Tendencian());
                                                                                                             l1.setText("Desea probar otra configuracion?");
                                                                                                             tf14.setVisible(false);
                                                                                                             tf2.setVisible(true);
                                                                                                             tf2.requestFocus();
                                                                                                             tf2.addActionListener(new ActionListener() {
                                                                                                               @Override
                                                                                                               public void actionPerformed(ActionEvent ae) {
                                                                                                                 String a = tf2.getText(); 
                                                                                                                 if(a.toLowerCase().equals("si")){
                                                                                                                   tf2.setVisible(false);
                                                                                                                   tf1.setVisible(true);
                                                                                                                   tf4.removeActionListener(this);
                                                                                                                   tf5.removeActionListener(this);
                                                                                                                   tf6.removeActionListener(this);
                                                                                                                   tf7.removeActionListener(this);
                                                                                                                   tf8.removeActionListener(this);
                                                                                                                   tf9.removeActionListener(this);
                                                                                                                   tf10.removeActionListener(this);
                                                                                                                   tf11.removeActionListener(this);
                                                                                                                   tf12.removeActionListener(this);
                                                                                                                   tf13.removeActionListener(this);
                                                                                                                   tf14.removeActionListener(this);
                                                                                                                   tf1.setBounds(10, 70, 100, 30);
                                                                                                                   tf2.setBounds(10, 70, 100, 30);
                                                                                                                   l2.setText("A continuacion requeriremos de algunos de sus datos");
                                                                                                                   l1.setText("Introduzca su nombre");
                                                                                                                   l3.setText(null);
                                                                                                                   tf2.setText(null);
                                                                                                                   tf1.setText(null);
                                                                                                                   tf3.setText(null);
                                                                                                                   tf4.setText(null);
                                                                                                                   tf5.setText(null);
                                                                                                                   tf6.setText(null);
                                                                                                                   tf7.setText(null);
                                                                                                                   tf8.setText(null);
                                                                                                                   tf9.setText(null);
                                                                                                                   tf10.setText(null);
                                                                                                                   tf11.setText(null);
                                                                                                                   tf12.setText(null);
                                                                                                                   tf13.setText(null);
                                                                                                                   tf14.setText(null);
                                                                                                                   tf2.requestFocus();
                                                                                                                 }
                                                                                                                 if(a.toLowerCase().equals("no")){
                                                                                                                   dispose();
                                                                                                                   
                                                                                                                 }
                                                                                                               }
                                                                                                           });
                                                                                                         }
                                                                                                     });
                                                                                                 }
                                                                                             });
                                                                                         }
                                                                                     });
                                                                                 }
                                                                             });
                                                                         }
                                                                     });  
                                                                 }
                                                                 if (opcion.toLowerCase().equals("profesor")) {
                                                                     tf8.setVisible(false);
                                                                     tf9.setVisible(true);
                                                                     l1.setText("Introduzca su cedula");
                                                                     tf9.requestFocus();
                                                                     tf9.addActionListener(new ActionListener() {
                                                                         @Override
                                                                         public void actionPerformed(ActionEvent ae111114) {
                                                                             pro.setCedula(tf9.getText());
                                                                             tf9.setVisible(false);
                                                                             tf10.setVisible(true); 
                                                                             l1.setText("Cual es su profecion");
                                                                             tf10.requestFocus();
                                                                             tf10.addActionListener(new ActionListener() {
                                                                                 @Override
                                                                                 public void actionPerformed(ActionEvent ae1111115) {
                                                                                     pro.setProfesion(tf10.getText());
                                                                                     tf10.setVisible(false);
                                                                                     tf11.setVisible(true);
                                                                                     l1.setText("A que grupos imparte clases");
                                                                                     tf11.requestFocus();
                                                                                     tf11.addActionListener(new ActionListener() {
                                                                                         @Override
                                                                                         public void actionPerformed(ActionEvent ae11111116) {
                                                                                             pro.setGrupos(tf11.getText());
                                                                                             tf11.setVisible(false);
                                                                                             tf12.setVisible(true);
                                                                                             l1.setText("A que academia pertenecen");
                                                                                             tf12.requestFocus();
                                                                                             tf12.addActionListener(new ActionListener() {
                                                                                                 @Override
                                                                                                 public void actionPerformed(ActionEvent ae111111117) {
                                                                                                     pro.setAcademia(tf12.getText());
                                                                                                     tf12.setVisible(false);
                                                                                                     tf14.setVisible(true);
                                                                                                     l1.setText("Cual es su salario");
                                                                                                     tf14.requestFocus();
                                                                                                     tf14.addActionListener(new ActionListener() {
                                                                                                         @Override
                                                                                                         public void actionPerformed(ActionEvent ae1111111118) {
                                                                                                             Integer salario = (Integer) tf14.getValue();
                                                                                                             pro.setSalario(salario);
                                                                                                             tf13.setVisible(false);
                                                                                                             tf14.setVisible(true);       
                                                                                                             l3.setText("<html>sus datos como persona son<p>Nombre: " + pro.getNombre() 
                                                                                                                       + "<p>Genero: " + pro.getGenero() + "<p>Tez: " + pro.getTez() 
                                                                                                                       + "<p>Edad: " + pro.getEdad() + "<p>Talla: "+ pro.getTalla() 
                                                                                                                       + "<p>Peso: " + pro.getPeso()+"<p>Sus tendencias como Persona son: "
                                                                                                                       + pro.Comer() + pro.Dormir() + pro.Caminar() + pro.Vivir() + pro.Hablar() 
                                                                                                                       + pro.Morir() + pro.Amar()
                                                                                                                       + "<p>Sus datos como Profesor son: " + "<p>Cedula: " + pro.getCedula() 
                                                                                                                       + "<p>Grupos: " + pro.getGrupos() + "<p>Profecion: " + pro.getProfesion()
                                                                                                                       + "<p>Academia: " + pro.getAcademia() + "<p>Salario: " + pro.getSalario()
                                                                                                                       + "<p>Sus tendencias como Profesor son: " + pro.Tendenciapr());
                                                                                                             l1.setText("Desea probar otra configuracion?");
                                                                                                             tf14.setVisible(false);
                                                                                                             tf2.setVisible(true);
                                                                                                             tf2.requestFocus();
                                                                                                             tf2.addActionListener(new ActionListener() {
                                                                                                               @Override
                                                                                                               public void actionPerformed(ActionEvent ae) {
                                                                                                                 String a = tf2.getText(); 
                                                                                                                 if(a.toLowerCase().equals("si")){
                                                                                                                   tf2.setVisible(false);
                                                                                                                   tf1.setVisible(true);
                                                                                                                   tf4.removeActionListener(this);
                                                                                                                   tf5.removeActionListener(this);
                                                                                                                   tf6.removeActionListener(this);
                                                                                                                   tf7.removeActionListener(this);
                                                                                                                   tf8.removeActionListener(this);
                                                                                                                   tf9.removeActionListener(this);
                                                                                                                   tf10.removeActionListener(this);
                                                                                                                   tf11.removeActionListener(this);
                                                                                                                   tf12.removeActionListener(this);
                                                                                                                   tf13.removeActionListener(this);
                                                                                                                   tf14.removeActionListener(this);
                                                                                                                   tf1.setBounds(10, 70, 100, 30);
                                                                                                                   tf2.setBounds(10, 70, 100, 30);
                                                                                                                   l2.setText("A continuacion requeriremos de algunos de sus datos");
                                                                                                                   l1.setText("Introduzca su nombre");
                                                                                                                   l3.setText(null);
                                                                                                                   tf2.setText(null);
                                                                                                                   tf1.setText(null);
                                                                                                                   tf3.setText(null);
                                                                                                                   tf4.setText(null);
                                                                                                                   tf5.setText(null);
                                                                                                                   tf6.setText(null);
                                                                                                                   tf7.setText(null);
                                                                                                                   tf8.setText(null);
                                                                                                                   tf9.setText(null);
                                                                                                                   tf10.setText(null);
                                                                                                                   tf11.setText(null);
                                                                                                                   tf12.setText(null);
                                                                                                                   tf13.setText(null);
                                                                                                                   tf14.setText(null);
                                                                                                                   tf2.requestFocus();
                                                                                                                 }
                                                                                                                 if(a.toLowerCase().equals("no")){
                                                                                                                   dispose();
                                                                                                                   
                                                                                                                 }
                                                                                                               }
                                                                                                           });
                                                                                                         }
                                                                                                     });
                                                                                                 }
                                                                                             });
                                                                                         }
                                                                                     });
                                                                                 }
                                                                             });
                                                                         }
                                                                     });  
                                                                 }
                                                                 if (opcion.toLowerCase().equals("artista")) {
                                                                     System.out.println("a");
                                                                     tf8.setVisible(false);
                                                                     tf9.setVisible(true);
                                                                     l1.setText("usted se considera una persona talentosa?, des ser afirmativo que talento cree poseer");
                                                                     tf9.requestFocus();
                                                                     tf9.addActionListener(new ActionListener() {
                                                                         @Override
                                                                         public void actionPerformed(ActionEvent ae11111111119) {
                                                                             ar.setTalento(tf9.getText());
                                                                             tf9.setVisible(false);
                                                                             tf10.setVisible(true); 
                                                                             l1.setText("Usted tiene ezperanza?");
                                                                             tf10.requestFocus();
                                                                             tf10.addActionListener(new ActionListener() {
                                                                                 @Override
                                                                                 public void actionPerformed(ActionEvent ae111111111120) {
                                                                                     ar.setEsperanza(tf10.getText());
                                                                                     tf10.setVisible(false);
                                                                                     tf11.setVisible(true);
                                                                                     l1.setText("Usted tiene sueños de ser afirmativo, cuales son? ");
                                                                                     tf11.requestFocus();
                                                                                     tf11.addActionListener(new ActionListener() {
                                                                                         @Override
                                                                                         public void actionPerformed(ActionEvent ae1111111111221) {
                                                                                             ar.setSueños(tf11.getText());
                                                                                             tf11.setVisible(false);
                                                                                             tf12.setVisible(true);
                                                                                             l1.setText("usted sufre deprecion? ");
                                                                                             tf12.requestFocus();
                                                                                             tf12.addActionListener(new ActionListener() {
                                                                                                 @Override
                                                                                                 public void actionPerformed(ActionEvent ae11111111112222) {
                                                                                                     ar.setDeprecion(tf12.getText());
                                                                                                     tf12.setVisible(false);
                                                                                                     tf14.setVisible(true);
                                                                                                     l1.setText("cuantos son sus ingresos mensuales ");
                                                                                                     tf14.requestFocus();
                                                                                                     tf14.addActionListener(new ActionListener() {
                                                                                                         @Override
                                                                                                         public void actionPerformed(ActionEvent ae111111111122223) {
                                                                                                             Integer salario = (Integer) tf14.getValue();
                                                                                                             ar.setDinero(salario);
                                                                                                             tf13.setVisible(false);
                                                                                                             tf14.setVisible(true);
                                                                                                             l3.setText("<html>sus datos como persona son<p>Nombre: " + ar.getNombre() 
                                                                                                                       + "<p>Genero: " + ar.getGenero() + "<p>Tez: " + ar.getTez() 
                                                                                                                       + "<p>Edad: " + ar.getEdad() + "<p>Talla: "+ ar.getTalla() 
                                                                                                                       + "<p>Peso: " + ar.getPeso()+"<p>Sus tendencias como Persona son: "
                                                                                                                       + ar.Comer() + ar.Dormir() + ar.Caminar() + ar.Vivir() + ar.Hablar() 
                                                                                                                       + ar.Morir() + ar.Amar()
                                                                                                                       + "<p>Sus datos como Artista son: " + "<p>Deprecion: " + ar.getDeprecion() 
                                                                                                                       + "<p>Esperanza: " + ar.getEsperanza() + "<p>Sueños: " + ar.getSueños() 
                                                                                                                       + "<p>Talentos: " + ar.getTalento() + "<p>Ingresos: <html>"  + ar.getDinero()
                                                                                                                       + "<p>Sus tendencias como Artista son: "+ ar.Tendenciaar());
                                                                                                             l1.setText("Desea probar otra configuracion?");
                                                                                                             tf14.setVisible(false);
                                                                                                             tf2.setVisible(true);
                                                                                                             tf2.requestFocus();
                                                                                                             tf2.addActionListener(new ActionListener() {
                                                                                                               @Override
                                                                                                               public void actionPerformed(ActionEvent ae) {
                                                                                                                 String a = tf2.getText(); 
                                                                                                                 if(a.toLowerCase().equals("si")){
                                                                                                                   tf2.setVisible(false);
                                                                                                                   tf1.setVisible(true);
                                                                                                                   tf4.removeActionListener(this);
                                                                                                                   tf5.removeActionListener(this);
                                                                                                                   tf6.removeActionListener(this);
                                                                                                                   tf7.removeActionListener(this);
                                                                                                                   tf8.removeActionListener(this);
                                                                                                                   tf9.removeActionListener(this);
                                                                                                                   tf10.removeActionListener(this);
                                                                                                                   tf11.removeActionListener(this);
                                                                                                                   tf12.removeActionListener(this);
                                                                                                                   tf13.removeActionListener(this);
                                                                                                                   tf14.removeActionListener(this);
                                                                                                                   tf1.setBounds(10, 70, 100, 30);
                                                                                                                   tf2.setBounds(10, 70, 100, 30);
                                                                                                                   l2.setText("A continuacion requeriremos de algunos de sus datos");
                                                                                                                   l1.setText("Introduzca su nombre");
                                                                                                                   l3.setText(null);
                                                                                                                   tf2.setText(null);
                                                                                                                   tf1.setText(null);
                                                                                                                   tf3.setText(null);
                                                                                                                   tf4.setText(null);
                                                                                                                   tf5.setText(null);
                                                                                                                   tf6.setText(null);
                                                                                                                   tf7.setText(null);
                                                                                                                   tf8.setText(null);
                                                                                                                   tf9.setText(null);
                                                                                                                   tf10.setText(null);
                                                                                                                   tf11.setText(null);
                                                                                                                   tf12.setText(null);
                                                                                                                   tf13.setText(null);
                                                                                                                   tf14.setText(null);
                                                                                                                   tf2.requestFocus();
                                                                                                                 }
                                                                                                                 if(a.toLowerCase().equals("no")){
                                                                                                                   dispose();
                                                                                                                   
                                                                                                                 }
                                                                                                               }
                                                                                                           });   
                                                                                                         }
                                                                                                     });
                                                                                                 }
                                                                                             });
                                                                                         }
                                                                                     });
                                                                                 }
                                                                             });
                                                                         }
                                                                     });  
                                                                 }
                                                                 if (opcion.toLowerCase().equals("deportista")) {
                                                                     System.out.println("d");
                                                                     tf8.setVisible(false);
                                                                     tf9.setVisible(true);
                                                                     l1.setText("Que deporte practica, o se dedica ");
                                                                     tf9.requestFocus();
                                                                     tf9.addActionListener(new ActionListener() {
                                                                         @Override
                                                                         public void actionPerformed(ActionEvent ae1111111111222224) {
                                                                             dep.setDeporte(tf9.getText());
                                                                             tf9.setVisible(false);
                                                                             tf10.setVisible(true); 
                                                                             l1.setText("Cuantas horas y que entrenamiento dedica");
                                                                             tf10.requestFocus();
                                                                             tf10.addActionListener(new ActionListener() {
                                                                                 @Override
                                                                                 public void actionPerformed(ActionEvent ae11111111112222225) {
                                                                                     dep.setEntrenamiento(tf10.getText());
                                                                                     tf10.setVisible(false);
                                                                                     tf11.setVisible(true);
                                                                                     l1.setText("Cual es su regisro de dopage ");
                                                                                     tf11.requestFocus();
                                                                                     tf11.addActionListener(new ActionListener() {
                                                                                         @Override
                                                                                         public void actionPerformed(ActionEvent ae111111111122222226) {
                                                                                             dep.setEsteroides(tf11.getText());
                                                                                             tf11.setVisible(false);
                                                                                             tf12.setVisible(true);
                                                                                             l1.setText("De que pais forma parte, y que division");
                                                                                             tf12.requestFocus();
                                                                                             tf12.addActionListener(new ActionListener() {
                                                                                                 @Override
                                                                                                 public void actionPerformed(ActionEvent ae1111111111222222227) {
                                                                                                     dep.setPais(tf12.getText());
                                                                                                     tf12.setVisible(false);
                                                                                                     tf13.setVisible(true);
                                                                                                     l1.setText("Usted cuenta con alguna medalla o condecoracion, de ser asi cuantas y cuales");
                                                                                                     tf13.requestFocus();
                                                                                                     tf13.addActionListener(new ActionListener() {
                                                                                                         @Override
                                                                                                         public void actionPerformed(ActionEvent ae11111111112222222228) {
                                                                                                             dep.setMedallas(tf13.getText());
                                                                                                             tf13.setVisible(false);
                                                                                                             tf14.setVisible(true);
                                                                                                             l3.setText("<html>sus datos como persona son<p>Nombre: " + dep.getNombre() 
                                                                                                                       + "<p>Genero: " + dep.getGenero() + "<p>Tez: " + dep.getTez() 
                                                                                                                       + "<p>Edad: " + dep.getEdad() + "<p>Talla: "+ dep.getTalla() 
                                                                                                                       + "<p>Peso: " + dep.getPeso()+"<p>Sus tendencias como Persona son: " 
                                                                                                                       + dep.Comer() + dep.Dormir() + dep.Caminar() + dep.Vivir() + dep.Hablar() 
                                                                                                                       + dep.Morir() + dep.Amar() + "<p>Sus datos como Deportista son: " + "<p>Deporte: " 
                                                                                                                       + dep.getDeporte() + "<p>Entrenamiento: " + dep.getEntrenamiento() + "<p>Esteroides: " 
                                                                                                                       + dep.getEsteroides() + "<p>Medallas: " + dep.getMedallas() + "<p>Pais: <html>" 
                                                                                                                       + dep.getPais()+ "<p>Sus tendencias como Deportista son: " + dep.Tendenciad());
                                                                                                             l1.setText("Desea probar otra configuracion?");
                                                                                                             tf14.setVisible(false);
                                                                                                             tf2.setVisible(true);
                                                                                                             tf2.requestFocus();
                                                                                                             tf2.addActionListener(new ActionListener() {
                                                                                                               @Override
                                                                                                               public void actionPerformed(ActionEvent ae) {
                                                                                                                 String a = tf2.getText(); 
                                                                                                                 if(a.toLowerCase().equals("si")){
                                                                                                                   tf2.setVisible(false);
                                                                                                                   tf1.setVisible(true);
                                                                                                                   tf4.removeActionListener(this);
                                                                                                                   tf5.removeActionListener(this);
                                                                                                                   tf6.removeActionListener(this);
                                                                                                                   tf7.removeActionListener(this);
                                                                                                                   tf8.removeActionListener(this);
                                                                                                                   tf9.removeActionListener(this);
                                                                                                                   tf10.removeActionListener(this);
                                                                                                                   tf11.removeActionListener(this);
                                                                                                                   tf12.removeActionListener(this);
                                                                                                                   tf13.removeActionListener(this);
                                                                                                                   tf14.removeActionListener(this);
                                                                                                                   tf1.setBounds(10, 70, 100, 30);
                                                                                                                   tf2.setBounds(10, 70, 100, 30);
                                                                                                                   l2.setText("A continuacion requeriremos de algunos de sus datos");
                                                                                                                   l1.setText("Introduzca su nombre");
                                                                                                                   l3.setText(null);
                                                                                                                   tf2.setText(null);
                                                                                                                   tf1.setText(null);
                                                                                                                   tf3.setText(null);
                                                                                                                   tf4.setText(null);
                                                                                                                   tf5.setText(null);
                                                                                                                   tf6.setText(null);
                                                                                                                   tf7.setText(null);
                                                                                                                   tf8.setText(null);
                                                                                                                   tf9.setText(null);
                                                                                                                   tf10.setText(null);
                                                                                                                   tf11.setText(null);
                                                                                                                   tf12.setText(null);
                                                                                                                   tf13.setText(null);
                                                                                                                   tf14.setText(null);
                                                                                                                   tf2.requestFocus();
                                                                                                                 }
                                                                                                                 if(a.toLowerCase().equals("no")){
                                                                                                                   dispose();
                                                                                                                   
                                                                                                                 }
                                                                                                               }
                                                                                                           });
                                                                                                         }
                                                                                                     });
                                                                                                 }
                                                                                             });
                                                                                         }
                                                                                     });
                                                                                 }
                                                                             });
                                                                         }
                                                                     });  
                                                                 }
                                                             }
                                                         });
                                                     
                                                     }catch(Exception e){
                                             System.out.println(e.getMessage());
                                         }
                                                 }
                                             });
                                         
                                       }catch(Exception e){
                                             System.out.println(e.getMessage());
                                         }
                                         }
                                     });
                                   }
                                 }
                               });
                             }
                           }
                         });
                       }           
                     }
                   });
               }
           }
       });
    }
}
    