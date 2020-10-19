Funcion multiplos <-multiplos(n1,n2)
	Si n1%n2=0 Entonces
		Escribir "Son multiplos"
	SiNo
		Escribir "No son multiplos"
	Fin Si
Fin Funcion

Algoritmo sin_titulo
	Definir x Como entero
	Definir A Como entero
	Escribir "dime un numero"
	Leer x
	Escribir "dime otro numero"
	Leer A
	x= multiplos(x,A)
	
FinAlgoritmo