Algoritmo sin_titulo
	Definir tamaño,fila,columna Como Entero
	Repetir	
		escribir "dime un tamaño. Mayor que tres o igual"
		Leer tamaño
	Hasta Que tamaño>3 Y tamaño%2=1
	Para fila<-0 Hasta tamaño-1 Hacer
		Para columna<-0 Hasta tamaño-1 Hacer
			Si fila=0 O fila=tamaño-1 O (columna>=fila Y fila+columna<=tamaño-1) O (fila+columna>=tamaño-1 Y columna<=fila)Entonces
				Escribir Sin Saltar "*"
			SiNo
				Escribir Sin Saltar "-"
			Fin Si
		Fin Para
		Escribir " "
	Fin Para
	
	
FinAlgoritmo
