Algoritmo ordenacion_descendente
		Definir n, i, j, aux Como Entero
		Definir numeros Como Entero
		Escribir "Ingrese la cantidad de n�meros:"
		Leer n
		Dimension numeros[n]
		// Leer los n�meros
		Para i <- 1 Hasta n Con Paso 1
			Escribir "Ingrese el n�mero ", i , ":"
			Leer numeros[i]
		Fin Para
		// Ordenar de mayor a menor (burbuja)
		Para i <- 1 Hasta n - 1 Con Paso 1
			Para j <- 1 Hasta n - i Con Paso 1
				Si numeros[j] < numeros[j + 1] Entonces
					aux <- numeros[j]
					numeros[j] <- numeros[j + 1]
					numeros[j + 1] <- aux
				Fin Si
			Fin Para
		Fin Para
		// Mostrar los n�meros ordenados
		Escribir "N�meros ordenados de mayor a menor:"
		Para i <- 1 Hasta n Con Paso 1
			Escribir numeros[i]
		Fin Para
FinAlgoritmo
