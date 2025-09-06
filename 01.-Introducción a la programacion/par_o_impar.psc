Algoritmo par_o_impar
	Escribir "Introduce un numero"
	Leer numero
	Si (numero=0) Entonces
		Escribir "El " numero " no es par ni impar"
	Sino
		//comprobamos si el numero es par
		Si (numero MOD 2=0) Entonces
			Escribir "El " numero " es par"
		Sino
			Escribir "El " numero " es impar"
		FinSi
	FinSi
FinAlgoritmo