Funcion c <- escribirespaciado ( cad )
	Definir pos Como Entero
	c=""
	Para pos<-1 Hasta Longitud(cad) Hacer
		c= c + Subcadena(cad,pos,pos) +" "
	Fin Para
Fin Funcion

Algoritmo sin_titulo
	Definir cad Como Caracter
	Escribir "Dime una Cadena"
	Leer cad
	Escribir escribirespaciado(cad)
FinAlgoritmo
