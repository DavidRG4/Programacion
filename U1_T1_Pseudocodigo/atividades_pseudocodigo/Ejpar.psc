Algoritmo sin_titulo
	Definir tama�o,fila,columna Como Entero
	Repetir	
		escribir "dime un tama�o. Mayor que tres o igual"
		Leer tama�o
	Hasta Que tama�o>3 Y tama�o%2=1
	Para fila<-0 Hasta tama�o-1 Hacer
		Si fila%2=0 Entonces
			Escribir "******"
		SiNo
			Escribir "*    *"
		Fin Si
		
	Fin Para

	
FinAlgoritmo
