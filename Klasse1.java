public class Klasse1 {
   protected static int attr1; // hier besteht ein Zugriffsschutz ("protected")
   static int attr2; // Klassenelement ("static") - nicht an ein Objekt gebunden
   int attr3; // Instanzelement - wird erst in einem Objekt verwendet
   int A[] = {10,20,30};
   int B = 111;
   static void init() {
      attr1 = 2;
	  attr2 = 5;
    }
	static void ausgabe() {
	  System.out.println(attr1);
	  System.out.println(attr2);
	}
}
