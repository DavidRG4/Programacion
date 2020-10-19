Algoritmo Dibujar_A
	Definir tamaño,fila,columna Como Entero
	Repetir
		Escribir "introduce tamaño.Mayor que tres e impar"
		Leer  tamaño
	Hasta Que tamaño>=3 Y tamaño%2=1
	Para fila<-0 Hasta tamaño-1 Hacer
		Si fila=0 O fila=trunc(tamaño/2) Entonces
			Escribir "*****"
		SiNo
			Escribir "*   *"
		Fin Si
	Fin Para
	
FinAlgoritmo
