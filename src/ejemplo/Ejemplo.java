
package ejemplo;

public class Ejemplo {

    
    public static void main(String[] args) {
      Libro platero =new Libro ("901", "Platero y Yo", "Jr Gimenez", 1995);
      System.out.println("ISBN"+platero.getIsbn());
      System.out.println("Titulo"+platero.getTitulo());
      System.out.println("Autor"+platero.getAutor());
      System.out.println("Edicion"+platero.getEdicion());
    
      platero.setEdicion (2023);
      System.out.println("Edicion"+platero.getEdicion());
      //Creando un comentario experimentando el Git
      
    }
}

