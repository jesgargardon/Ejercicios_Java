Algoritmo agenda_telefonica
    Dimensionar nombres(100)
    Dimensionar telefonos(100)
    Definir opc Como Entero
    Definir nombreBuscado Como Cadena
    Definir indiceEncontrado Como Entero
	
	numContactos=0

    opc = 0
	
    Mientras opc <> 5 Hacer
		
		Escribir "**********************"
        Escribir " 1. Agregar contacto"
        Escribir " 2. Buscar contacto"
        Escribir " 3. Eliminar contacto"
        Escribir " 4. Mostrar contactos"
        Escribir " 5. Salir"
		Escribir ""
		Escribir "**********************"
        Escribir "   Ingrese su opción: "

		
        Leer opc
		
        Segun opc Hacer
            1:
				numContactos=numContactos+1
                Escribir("Introducir el nombre: ")
                Leer nombres[numContactos]
                Escribir("Introducir el teléfono: ")
                Leer telefonos[numContactos]
            2:
                Escribir("Introducir el nombre del contacto a buscar: ")
                Leer nombreBuscado
                indiceEncontrado <- -1
                Para i <- 1 Hasta 100 Hacer
                    Si nombres[i] =  nombreBuscado Entonces
                        indiceEncontrado <- i
                        Escribir "Nombre encontrado: "  nombres[indiceEncontrado]
                        Escribir "Teléfono correspondiente: ", telefonos[indiceEncontrado]
                    FinSi
                FinPara
                Si indiceEncontrado = -1 Entonces
                    Escribir("Nombre no encontrado en la agenda.")
                FinSi
            3:
                Escribir("Introducir el nombre a eliminar: ")
                Leer nombreBuscado
                indiceEncontrado <- -1
                Para i <- 1 Hasta 100 Hacer
                    Si nombres[i] =  nombreBuscado Entonces
                        indiceEncontrado <- i
                    FinSi
                FinPara
                Si indiceEncontrado <> -1 Entonces
                    nombres[indiceEncontrado] <- ""
                    telefonos[indiceEncontrado] <- ""
                    Escribir("Contacto eliminado.")
                Sino
                    Escribir("Nombre no encontrado en la agenda.")
                FinSi
			4:
				Escribir "------------ CONTACTOS -------------------"
				para i=1 Hasta 100
					si nombres[i]<>"" Entonces
						Escribir "  Nombre: " nombres[i] " Telefono: " telefonos[i]
					FinSi
				FinPara
				Escribir "------------------------------------------"
        FinSegun
    FinMientras
	
FinAlgoritmo

