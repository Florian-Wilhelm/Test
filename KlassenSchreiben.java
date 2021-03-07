public class KlassenSchreiben {
   public static void main(String[] args) {      
	  System.out.println("Java-Uebung zu Variablen und Konstruktoren");
	  Klasse1.ausgabe(); // Zugriff auf Klassenmethode
	  Klasse1.init();
	  Klasse1.ausgabe();
	  Klasse1.attr1 = 42;
	  Klasse1 ob1 = new Klasse1(); // Konstruktor ("new") - Erzeugung von ob1
	  System.out.println(ob1.attr1);
	  System.out.println(ob1.attr2);
	  // die folgende Zeile ist unkluge Programmierung: Zugriff auf ein Klassenelement über eine Instanz; attr1 ist als "static" deklariert (=Klassenelement)
	  // Klassenelemente gehören zur Klasse selbst und nicht zu einem spezifischen Objekt; grundsätzlich sollten Klassenelemente so wenig wie möglich Verwendung finden
	  ob1.attr1 = 666; 	  
	  System.out.println(ob1.attr1);
	  System.out.println(ob1.attr2);
	  System.out.println(ob1.A[1]);
	  System.out.println(ob1.B);
	  Klasse1.ausgabe();
	  ob1.ausgabe();
   }
}
