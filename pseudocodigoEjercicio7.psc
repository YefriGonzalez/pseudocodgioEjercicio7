Algoritmo Ejercicio7
	pares=0
	impares=0
	ceros=0
	Para i=1 Hasta 15 Con Paso 1 Hacer
		num=azar(36+1)
		divisibl=num%2
		Escribir num
		si num=0 Entonces
			ceros=ceros+1
	
		siNo
			
			si divisibl=0 Entonces
				pares=pares+1
			
			SiNo
				impares=impares+1	
			FinSi
		
		FinSi
	
	FinPara
	porcentajePares=(pares*100)/15
	porcentajeImpares=(impares*100)/15
	porcentajeCeros=(ceros*100)/15
	Escribir "El porcentaje de pares es : " porcentajePares "%"
	Escribir "El porcentaje de impares es: " porcentajeImpares "%"
	Escribir "El porcentaje de ceros es : " porcentajeCeros "%"
	
	
FinAlgoritmo
