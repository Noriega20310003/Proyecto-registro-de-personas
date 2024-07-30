package persona;


public class Persona {
  String Nombre = "", Genero= "", Tez= "";
  int Edad;
  double Talla, Peso;
   
    public String Comer(){ 
    return "<p>come";
    }
    public String Dormir(){ 
    return "<p>Duerme";
    }
    public String Caminar(){
     return "<p>Camina";
    }
    public String Vivir(){
     return "<p>Vive";
    } 
    public String Hablar(){
     return "<p>Habla";
    }
    public String Morir(){
     return "<p>Muere";
    }
    public String Amar(){
     return "<p>Ama";
    }

    public String getNombre() {
        return Nombre;
    }
    public String getGenero() {
        return Genero;
    }
    public String getTez() {
        return Tez;
    }
    public int getEdad() {
        return Edad;
    }
    public double getTalla() {
        return Talla;
    }
    public double getPeso() {
        return Peso;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setTez(String Tez) {
        this.Tez = Tez;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setTalla(double Talla) {
        this.Talla = Talla;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

   public void Tendenciap(){
   Comer();
   Caminar();
   Amar();
   Vivir();
   Morir();
   Hablar();
   Dormir(); }
}

class Alumno extends Persona {
private String Beca = "", Carrera, Codigo, Escuela;
     private String Grado;
    
    public void setBeca(String Beca) {
        this.Beca = Beca;
    }
    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    public void setEscuela(String Escuela) {
        this.Escuela = Escuela;
    }
    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

    public String getBeca() {
        return Beca;
    }
    public String getCarrera() {
        return Carrera;
    }
    public String getCodigo() {
        return Codigo;
    }
    public String getEscuela() {
        return Escuela;
    }
    public String getGrado() {
        return Grado;
    }    
    public String Estudiar(){
   return "<p>Estudia";
    }
    public String Asistir(){
    return "<p>Asiste";
    }
    public String Fumar(){
     return "<p>Fuma";
    }
    public String Tomar(){
     return "<p>Toma";
    }
    public String Aprender(){
     return "<p>Aprende";
    }
    public String Llorar(){
     return "<p>Llora";
    }
    public String Planear(){
     return "<p>Planea";
    }
    
    public String Tendenciaa(){
        return Estudiar()+ Asistir()
     + Fumar()
      + Tomar()
       +Aprender()
      + Llorar()     
       +Planear();        
    }
}

class Profesor extends Persona {
    String Cedula, Profesion, Grupos, Academia;
    int Salario;

   public String Asistrir(){
     return "<p>Asiste";
    }   
   public String Enseñar(){
     return "<p>Enseña";
    }   
   public String Educar(){
     return "<p>Educa";
    }   
   public String Regañar(){
    return "<p>Regaña";
    }   
   public String Corregir(){
     return "<p>Corrige";
    }   
   public String Marcar(){
     return "<p>Marca";
    }   
   public String Salvar(){
     return "<p>Salva";
    }
   public String Tendenciapr(){
       return Asistrir()+
        Enseñar()+
        Educar()+     
        Regañar()+
        Corregir()+
        Marcar() +
        Salvar();        
    }
    public String getCedula() {
        return Cedula;
    }
    public String getProfesion() {
        return Profesion;
    }
    public String getGrupos() {
        return Grupos;
    }
    public String getAcademia() {
        return Academia;
    }
    public int getSalario() {
        return Salario;
    }
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }
    public void setGrupos(String Grupos) {
        this.Grupos = Grupos;
    }
    public void setAcademia(String Academia) {
        this.Academia = Academia;
    }
    public void setSalario(int Salario) {
        this.Salario = Salario;
    }   
    
}


class Deportista extends Persona {
    String Deporte, Entrenamiento, Esteroides, Pais, Medallas;

   
   public String Tendenciad() {
    return Dopar()
     +  Ganar()
      + Competir()
       + Triunfan()
       + Entrenar()
       + Motivar()
       + Correr();
         
   }
   public String Competir(){
   return "<p>Compite";
    }   
   public String Ganar(){
     return "<p>Gana";
    }   
   public String Dopar(){
    return "<p>Doparse";
    }   
   public String Triunfan(){
    return "<p>Triunfa";
    }   
   public String Entrenar(){
     return "<p>Entrena";
    }   
   public String Motivar(){
     return "<p>Motiva";
    }   
   public String Correr(){
     return "<p>Corre";
    }
    public String getDeporte() {
        return Deporte;
    }
    public String getEntrenamiento() {
        return Entrenamiento;
    }
    public String getEsteroides() {
        return Esteroides;
    }
    public String getPais() {
        return Pais;
    }
    public String getMedallas() {
        return Medallas;
    }
    public void setDeporte(String Deporte) {
        this.Deporte = Deporte;
    }
    public void setEntrenamiento(String Entrenamiento) {
        this.Entrenamiento = Entrenamiento;
    }
    public void setEsteroides(String Esteroides) {
        this.Esteroides = Esteroides;
    }
    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    public void setMedallas(String Medallas) {
        this.Medallas = Medallas;
    }   
}

class Artista extends Persona {
    String Talento, Esperanza, Sueños,Deprecion;
    int Dinero;

   public String Componer(){
    return "<p>Compone";
    }   
   public String Diseñar(){
    return "<p>Diseña";
    }   
   public String Cantar(){
     return "<p>Canta";
    }   
   public String Suicidar(){
     return "<p>Suicidarse";
    }   
   public String Drogar(){
     return "<p>Drogarse";
    }   
   public String Bailar(){
     return "<p>Baila";
    }   
   public String Tocar(){
     return "<p>Toca";
    }
   public String Tendenciaar(){
    return Suicidar()+
       Drogar()+
       Componer()+
       Diseñar()+
       Cantar()+
       Bailar()+
       Tocar();       
         
   }

    public String getTalento() {
        return Talento;
    }
    public String getEsperanza() {
        return Esperanza;
    }
    public String getSueños() {
        return Sueños;
    }
    public String getDeprecion() {
        return Deprecion;
    }
    public int getDinero() {
        return Dinero;
    }
    public void setTalento(String Talento) {
        this.Talento = Talento;
    }
    public void setEsperanza(String Esperanza) {
        this.Esperanza = Esperanza;
    }
    public void setSueños(String Sueños) {
        this.Sueños = Sueños;
    }
    public void setDeprecion(String Deprecion) {
        this.Deprecion = Deprecion;
    }
    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }   
}

class Nini extends Persona {
    String Ansiedad, Hambre, Flojera, Inestabilidad, Dependencia;

   public String Aislar(){
       return "<p>Aisla";
    
    }   
   public String Jugar(){
       return "<p>Juega";
    }   
   public String Leer(){
       return "<p>Lee";
    }   
   public String Pensar(){
       return "<p>Piensa";
    }   
   public String Olgasanear(){
       return "<p>Olgasanea";
    }   
   public String Sentar(){
       return "<p>Sentarse";
    }   
   public String Acostar(){
       return "<p>Acostarse";
    }
    public String getAnsiedad() {
        return Ansiedad;
    }
    public String getHambre() {
        return Hambre;
    }
    public String getFlojera() {
        return Flojera;
    }
    public String getInestabilidad() {
        return Inestabilidad;
    }
    public String getDependencia() {
        return Dependencia;
    }
    public void setAnsiedad(String Ansiedad) {
        this.Ansiedad = Ansiedad;
    }
    public void setHambre(String Hambre) {
        this.Hambre = Hambre;
    }
    public void setFlojera(String Flojera) {
        this.Flojera = Flojera;
    }
    public void setInestabilidad(String Inestabilidad) {
        this.Inestabilidad = Inestabilidad;
    }
    public void setDependencia(String Dependencia) {
        this.Dependencia = Dependencia;
    }
    public String Tendencian(){ 
           return Acostar()+
            Sentar()+
            Jugar()+
            Leer()+
            Olgasanear()+
            Pensar()+
            Aislar();
    }
}
    