Algoritmo sin_titulo
	Definir tama�o,fila,columna Como Entero
	Repetir	
		escribir "dime un tama�o. Mayor que tres o igual"
		Leer tama�o
	Hasta Que tama�o>3 Y tama�o%2=1
	Para fila<-0 Hasta tama�o-1 Hacer
		Para columna<-0 Hasta tama�o-1 Hacer
			Si fila=0 O fila=tama�o-1 O (columna>=fila Y fila+columna<=tama�o-1) O (fila+columna>=tama�o-1 Y columna<=fila)Entonces
				Escribir Sin Saltar "*"
			SiNo
				Escribir Sin Saltar "-"
			Fin Si
		Fin Para
		Escribir " "
	Fin Para
	
	
FinAlgoritmo
