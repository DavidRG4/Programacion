Funcion Espar <- Espar (n1)
	Si n1%2=0 Entonces
		Escribir "Es par"
	SiNo
		Escribir "Es impar"
	Fin Si
Fin Funcion

Algoritmo sin_titulo
	Definir x Como entero
	Escribir "dime un numero"
	Leer x
	x=Espar(x)
FinAlgoritmo
