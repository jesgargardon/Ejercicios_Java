Proceso dibujar_cuadrado_hueco
	Leer lado
	Para asterisco<-1 Hasta lado Con Paso 1
		Escribir "* " Sin Saltar
	FinPara
	escribir "  "
	Para asterisco<-1 Hasta lado-2 Con Paso 1
		Escribir "* " Sin Saltar
		Para espacio<-1 Hasta lado-2 Con Paso 1
			Escribir "  " sin saltar
		FinPara
		Escribir "* " Sin Saltar
		escribir "  "
	FinPara
	Para asterisco<-1 Hasta lado Con Paso 1
		Escribir "* " Sin Saltar
	FinPara
	
	escribir "  "
	escribir "forma 2"
	para f=1 hasta lado
		para c=1 hasta lado
			si f=1 o f=lado o c=1 o c=lado Entonces
				escribir Sin Saltar "* "
			SiNo
				escribir Sin Saltar "  "
			FinSi
		FinPara
		Escribir "  "
	FinPara
FinProceso

