Algoritmo juego_siete_y_media
	Dimension baraja(10,4)
	Dimensión puntos(10)
	
	Dimension cartaJugador(10)
	DImension puntosJugador(10)
	numCartasJugador=0
	
	Dimension cartaMaquina(10)
	DImension puntosMaquina(10)
	numCartasMaquina=0

	
	
	//crea la baraja y los puntos
	para i=1 hasta 10
		si i<8 y i <> 1 Entonces
			nombreCarta = "       " + ConvertirATexto(i) + " de"
		SiNo
			si i=1 Entonces
				nombreCarta="      As de"
			SiNo
				si i=8 Entonces
					nombreCarta = "    Sota de"
				SiNo
					si i=9 Entonces
						nombreCarta = " Caballo de"
					SiNo
						si i=10 Entonces
							nombreCarta = "     Rey de"
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
		baraja(i,1)=nombreCarta+" Oros   "
		baraja(i,2)=nombreCarta+" Espadas"
		baraja(i,3)=nombreCarta+" Copas  "
		baraja(i,4)=nombreCarta+" Bastos "
		
		si (i<8)
			puntos(i)=i
		SiNo
			puntos(i)=0.5
		FinSi
	FinPara
	
	dato=0
	mientras dato<>99
		Escribir "************************"
		escribir "*  1. Pedir carta      *"
		Escribir "*  2. Plantarse        *"
		Escribir "*  3. Ver baraja       *"
		Escribir "* 99. Salir del juego  *"
		Escribir "************************"
		leer dato
		
		si dato=1
			Repetir
				palo=azar(4)
				palo=palo+1
				numCarta=azar(10)
				numCarta=numCarta+1
				carta=baraja(numCarta,palo)
			Hasta Que carta<>"XXXXXXXXXXXXXXXXXXX"
			baraja(numCarta,palo)="XXXXXXXXXXXXXXXXXXX"
			numCartasJugador=numCartasJugador+1
			cartaJugador(numCartasJugador)=carta
			puntosJugador(numCartasJugador)=puntos(numCarta)
			puntosTotales=0
			para i=1 Hasta numCartasJugador
				Escribir cartaJugador(i) "->" puntosJugador(i)
				puntosTotales=puntosTotales+puntosJugador(i)
			FinPara
			Escribir "                            Suma: " puntosTotales
			si puntosTotales > 7.5 Entonces
				Escribir "Perdiste, tus puntos son mas de 7.5"
				dato=99
				muestraBaraja(baraja)
			FinSi
		FinSi
		
		si dato=2
			Escribir "************ Turno de la Máquina ***************"
			Repetir
				Repetir
					palo=azar(4)
					palo=palo+1
					numCarta=azar(10)
					numCarta=numCarta+1
					carta=baraja(numCarta,palo)
				Hasta Que carta<>"XXXXXXXXXXXXXXXXXXX"
				baraja(numCarta,palo)="XXXXXXXXXXXXXXXXXXX"
				numCartasMaquina=numCartasMaquina+1
				cartaMaquina(numCartasMaquina)=carta
				puntosMaquina(numCartasMaquina)=puntos(numCarta)
				puntosTotalesMaquina=0
				para i=1 Hasta numCartasMaquina
					Escribir cartaMaquina(i) "->" puntosMaquina(i)
					puntosTotalesMaquina=puntosTotalesMaquina+puntosMaquina(i)
				FinPara
				Escribir "                            Suma: " puntosTotalesMaquina
				si puntosTotalesMaquina > 7.5 Entonces
					Escribir "Has ganado, me he pasado de 7.5, he sacado " puntosTotalesMaquina
					dato=99
				FinSi
			Hasta Que puntosTotalesMaquina > 6 o dato=99
			si dato <>99 y puntosTotales>puntosTotalesMaquina Entonces
				Escribir "Has ganado, te has acercado mas a las 7.5"
			SiNo
				Escribir "He ganado, me he acercado mas a las 7.5"
			FinSi
			dato=99
			muestraBaraja(baraja)
		FinSi
		
		si dato=3
			muestraBaraja(baraja)
		FinSi
		
	FinMientras

FinAlgoritmo

Funcion muestraBaraja (baraja)
	Escribir "-------------------------------------------------------------------------------------"
	Escribir "         Oros              Espadas               Copas             Bastos"
	para i=1 hasta 10
		Escribir baraja(i,1) "   "  baraja(i,2) "   "  baraja(i,3) "   "  baraja(i,4) "   "  
	FinPara
	Escribir "-------------------------------------------------------------------------------------"
	Escribir ""
FinFuncion
