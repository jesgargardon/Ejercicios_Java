Algoritmo a�o_bisiesto
	Escribir "Introduce un a�o"
	leer a�o
	si (a�o MOD 4=0 y a�o MOD 100<>0) Entonces
		Escribir "El a�o " a�o " es bisiesto"
	Sino
		si (a�o MOD 400=0 y a�o MOD 100=0) Entonces
			Escribir "El a�o " a�o " es bisiesto"
		Sino
			escribir "El a�o " a�o " no es bisiesto"
		FinSi
   FinSi
FinAlgoritmo
