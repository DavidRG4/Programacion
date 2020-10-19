Algoritmo sin_titulo
	Definir tamaño,fila,columna Como Entero
	Repetir	
		escribir "dime un tamaño. Mayor que tres o igual"
		Leer tamaño
	Hasta Que tamaño>3 Y tamaño%2=1
	Para fila<-0 Hasta tamaño-1 Hacer
		Si fila%2=0 Entonces
			Escribir "******"
		SiNo
			Escribir "*    *"
		Fin Si
		
	Fin Para

	
FinAlgoritmo
