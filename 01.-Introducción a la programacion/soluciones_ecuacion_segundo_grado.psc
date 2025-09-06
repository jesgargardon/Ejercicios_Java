Algoritmo soluciones_ecuacion_segundo_grado
	Escribir "escibe el valor de a"
	Leer a
	Escribir "escibe el valor de b"
	Leer b
	Escribir "escibe el valor de c"
	Leer c
	neg<--b
	dentro_raiz<-(b^2-4*a*c)
	Si dentro_raiz<=0 Entonces
		Escribir "La ecuacion no se puede resolver"
	Sino
		raiz_cuadrada=dentro_raiz^0.5
		solucion_1<-(neg+raiz_cuadrada)/(2*a)
		solucion_2<-(neg-raiz_cuadrada)/(2*a)
		Escribir "primera solución" solucion_1
		Escribir "segunda solución" solucion_2
	FinSi
FinAlgoritmo
