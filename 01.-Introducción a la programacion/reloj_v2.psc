Funcion xx<-formatear(x)
	si x<10 Entonces
		xx="0" + ConvertirATexto(x)
	SiNo
		xx=ConvertirATexto(x)
	FinSi
FinFuncion
Algoritmo sin_titulo
	s=0
	m=0
	h=0
	Mientras Verdadero
		Esperar 1 Segundos
		s=s+1
		si s=60
			m=m+1
			s=0
		FinSi
		si m=60
			h=h+1
			m=0
		FinSi
		hh=formatear(h)
		mm=formatear(m)
		ss=formatear(s)
		Escribir hh ":" mm ":" ss
	FinMientras
FinAlgoritmo
