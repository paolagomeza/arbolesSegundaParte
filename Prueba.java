


public class Prueba {
	
	public static void main (String[] args) {
	arbol bonsai=new arbol();
	bonsai.insertar(new Nodo(10));
	if(bonsai.buscar(new Nodo(10))){
	   System.out.println("El 10 si se encuentra ");
	   	
	}
	Nodo AB ;
	AB=new Nodo(0);
	if(bonsai.buscar(AB)){
	   System.out.println("El "+AB+"  si se encuentra ");
     }else{
	 System.out.println("El "+AB+" no se encuentra ");

	 }
	 	 ///////////////////////////////

	 AB=new Nodo(5);
	 bonsai.insertar(AB);
	 if(bonsai.buscar(AB)){
	   System.out.println("El "+AB+"  si se encuentra ");
     }else{
	 System.out.println("El "+AB+" no  se encuentra ");

	 }	 ///////////////////////////////

	  AB=new Nodo(15);
	  	 bonsai.insertar(AB);

	 if(bonsai.buscar(AB)){
	   System.out.println("El "+AB+"  si se encuentra ");
     }else{
	 System.out.println("El "+AB+" no  se encuentra ");

	 }
	 	 ///////////////////////////////

	 AB=new Nodo(4);
	 	 bonsai.insertar(AB);

	 if(bonsai.buscar(AB)){
	   System.out.println("El "+AB+"  si se encuentra ");
     }else{
	 System.out.println("El "+AB+" no  se encuentra ");

	 }
	 	 ///////////////////////////////

	 AB=new Nodo(16);
	 	 bonsai.insertar(AB);

	 if(bonsai.buscar(AB)){
	   System.out.println("El "+AB+"  si se encuentra ");
     }else{
	 System.out.println("El "+AB+" no  se encuentra ");

	 }
	 	 ///////////////////////////////

	  AB=new Nodo(8);
	  	 bonsai.insertar(AB);

	 if(bonsai.buscar(AB)){
	   System.out.println("El "+AB+"  si se encuentra ");
     }else{
	 System.out.println("El "+AB+" no  se encuentra ");

	 }
	 ///////////////////////////////
	  AB=new Nodo(11);
	  	 bonsai.insertar(AB);

	 if(bonsai.buscar(AB)){
	   System.out.println("El "+AB+"  si se encuentra ");
     }else{
	 System.out.println("El "+AB+" no  se encuentra ");

	 }
	  AB=new Nodo(111);
	  	 

	 if(bonsai.buscar(AB)){
	   System.out.println("El "+AB+"  si se encuentra ");
     }else{
	 System.out.println("El "+AB+" no  se encuentra ");

	 }
	 System.out.println(bonsai.toStringPreOrder());
 }
}
