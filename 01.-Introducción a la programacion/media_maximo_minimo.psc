Algoritmo media_maximo_minimo
	
	maximo=0
	minimo=99999
	suma=0
	cuenta=0
	Escribir "N�mero:"
	leer numero
	Mientras numero<>0 Hacer
		Si numero>maximo Entonces
			maximo=numero
		Fin Si
		Si numero<minimo Entonces
			minimo=numero
		Fin Si
		suma=suma+numero
		cuenta=cuenta+1
		Escribir "N�mero:"
		leer numero
	Fin Mientras
	Escribir "media: " suma/cuenta " maximo: " maximo " minimo: " minimo
FinAlgoritmo
