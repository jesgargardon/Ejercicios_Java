Algoritmo año_bisiesto
	Escribir "Introduce un año"
	leer año
	si (año MOD 4=0 y año MOD 100<>0) Entonces
		Escribir "El año " año " es bisiesto"
	Sino
		si (año MOD 400=0 y año MOD 100=0) Entonces
			Escribir "El año " año " es bisiesto"
		Sino
			escribir "El año " año " no es bisiesto"
		FinSi
   FinSi
FinAlgoritmo
