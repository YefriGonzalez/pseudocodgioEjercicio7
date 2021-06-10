public class Ejercicio7{
	public static void main(String[] args){
		int numero;
		int pares=0;
		int impares=0;
		int ceros=0;
		double porcentajePares;
		double porcentajeImpares;
		double porcentajeCeros;
		for (int i=1;i<=15;i++) {
			numero=(int)(Math.random()*36);
			if (numero==0) {
				ceros=ceros+1;
			} else if ((numero%2)==0) {
				pares=pares+1;
			} else {
				impares=impares+1;
			}
		}
		porcentajeImpares=(impares*100)/15;
		porcentajeCeros=(ceros*100)/15;
		porcentajePares=(pares*100)/15;
		System.out.println("El porcentaje de Pares es: "+porcentajePares);
		System.out.println("El porcentaje de Impares es: "+porcentajeImpares);
		System.out.println("El porcentaje de Ceros es: "+porcentajeCeros);	
	}

}