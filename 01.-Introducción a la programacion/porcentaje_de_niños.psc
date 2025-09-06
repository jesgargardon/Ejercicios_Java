Algoritmo porcentajes_de_niños
	Escribir "Introduce el numero de niños"
	Leer numero_niños
	Escribir "Introduce el numero de niñas"
	Leer numero_niñas
	porcentaje_niños<-numero_niños*100/(numero_niños+numero_niñas)
	porcentaje_niñas<-100-porcentaje_niños
	Escribir "Hay un " porcentaje_niños " % de niños"
	Escribir "Hay un " porcentaje_niñas " % de niñas"
FinAlgoritmo