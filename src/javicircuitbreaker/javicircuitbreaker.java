package javicircuitbreaker;

import circuitEstado.circuitEstado;

public class javicircuitbreaker {

	public static void main(String[] args) {
		circuitEstado ce1 =new circuitEstado(10,0,20); 
		circuitEstado ce2 =new circuitEstado(10,5,20); 
		circuitEstado ce3 =new circuitEstado(10,5,20); 
		
		System.out.println(ce1.Estado());
		System.out.println(ce2.Estado());
		System.out.println(ce3.Estado());

	}

}
