Algoritmo Dibujar_A
	Definir tama�o,fila,columna Como Entero
	Repetir
		Escribir "introduce tama�o.Mayor que tres e impar"
		Leer  tama�o
	Hasta Que tama�o>=3 Y tama�o%2=1
	Para fila<-0 Hasta tama�o-1 Hacer
		Si fila=0 O fila=trunc(tama�o/2) Entonces
			Escribir "*****"
		SiNo
			Escribir "*   *"
		Fin Si
	Fin Para
	
FinAlgoritmo
