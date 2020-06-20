

public class arbol {
	private Nodo raiz;
	private String Recorrido;
	public arbol(){
		raiz = null;
		Recorrido="";
	} 
	//metodo a envolver
	private void insertarDesde(Nodo noda, Nodo Desde){
// Esto pasa cuando la raiz es nula
	       // Es decir es el primer elemento
	       
		   if(Desde.obtenerData()==noda.obtenerData()){
		   return;
		   }
		   if (noda.obtenerData()>Desde.obtenerData()){
		      //colocar a la derecha
		      if(Desde.Der==null){
				  Desde.Der=noda;
			  }else{
				  //11
				  insertarDesde(noda,Desde.Der);
				  return;
			   }
			  }else{
				  //colocar a la izquierda
				  if(Desde.Izq==null){
				     Desde.Izq=noda;
				     return;
				  }else{
					  //11
					  insertarDesde(noda,Desde.Izq);
					  return;
					}
			  }
		   }
		   //metodo que envuelve wrapper
		   public void insertar(Nodo noda){
		   // Es decir es el primer elemento
		   //esto pasa cuando la raiz es nula
		   if(raiz==null){
		      raiz=noda;
		      return;
		   }
		   //si llego aqui la raiz no es nula
		  // insertarDesde(noda,raiz);11
		  insertarDesde(noda,raiz);	       
		   }		
	//}
	
	/////////////////////
	public boolean buscar(Nodo noba){
	    return bucarDesde(noba, raiz);
	}
	/////////////////////////////
	private boolean bucarDesde(Nodo noba, Nodo Desde){
		if (Desde==null){
		     return false;
		 }    
		if(Desde.obtenerData()==noba.obtenerData()){
		   return true;
	   }
	   if (noba.obtenerData()>Desde.obtenerData()){
	   //derecha
	   return bucarDesde (noba,Desde.Der);
	   }else{
		   //izquierda
	   return bucarDesde (noba,Desde.Izq);

		   //izquiera
	   }
	}
	/////////////////////////7
	public String toStringPreOrder(){
	Recorrido="";
	//////////////////////////
	preOrderDesde(raiz);
	/////////////////////////
	return Recorrido;
	}
	//tipo VID
	private void preOrderDesde(Nodo Desde){
		if(Desde ==null){
         return;	
		}
		//valor
		Recorrido=Recorrido+" "+Desde;
		//Recorrido=Recorrido+" "+Desde.obtenerData
        //IZQ
        preOrderDesde(Desde.Izq);
        //DERECHA
        preOrderDesde(Desde.Der);

		
	}
	
	
}

