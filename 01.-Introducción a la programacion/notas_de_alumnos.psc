Funcion nota<-IntroNota (num)
	Repetir
		Escribir "nota " num ":"
		leer nota
		si nota<0 o nota>10
			Escribir "Error en nota " num
		FinSi
	Hasta Que nota>=0 y nota<=10
		
FinFuncion

Algoritmo notas_de_alumnos
	
	Escribir "Nombre alumno"
	Leer nombre
	Mientras nombre<>""
		nota1=IntroNota(1)
		nota2=IntroNota(2)
		nota3=IntroNota(3)
		Escribir "La media es:"  nota1*0.1+nota2*0.5+nota3*0.4
		
		Escribir "Nombre alumno"
		Leer nombre
	FinMientras
FinAlgoritmo