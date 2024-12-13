package colleciones;
import java.util.HashMap;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		


	HashMap<String, String> transl  = new HashMap<String, String>(); 

    transl.put("red", "rojo"); 
    transl.put("girl", "chica");
    transl.put("boy", "chico"); 
    transl.put("tío", "auncle");
    transl.put("tía", "aunt");
    transl.put("hijo", "son");
    transl.put("hija", "daughter");
    transl.put("mine", "mio");
    transl.put("es", "is");
    transl.put("sol", "son");
    transl.put("luna", "moon");
    transl.put("adiós", "goodbye");
    transl.put("taza", "cup");
    transl.put("carro", "car");
    transl.put("casa", "house");
    transl.put("hermano", "brother");
    transl.put("hermana", "sister");
    transl.put("computer", "computadoora");
    transl.put("clase", "class");
    transl.put("zapato", "shoe");
    transl.put("manzana", "apple");
    transl.put("pillow", "almohada");
   
	Scanner = new Scanner(System.in); 
	
    String spanish = ""; 
    do {
      System.out.print("Escribir una palabra en español y  la traduciré al inglés: ");
      spanish = s.nextLine(); 
 
    
      if (!spanish.equals("salir")) { 
        if (transl.containsKey(spanish)) { 
          System.out.println("La traducción de " + spanish);
          System.out.println(" es " + transl.get(spanish)); 
        } else {
        	System.out.println("La palabra no esta en el diccionario");
          }
      }
    } while (!spanish.equals("salir")); 
     s.close();
  }
}