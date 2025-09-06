Algoritmo descuento_en_octubre
	Escribir "escribe el importe de la compra"
    Leer importe
    Escribir "Introduce el mes"
    Leer mes
    //Si el mes es octubre, se aplicara el descuento
    Si (mes="octubre") Entonces
		total<-importe*0.85
    Sino
		total<-importe
    FinSi
    Escribir "El total a pagar es " total
FinAlgoritmo
