Algoritmo Ej3
	Definir t,f Como Entero
	Escribir "dime una altura"
	Repetir
		Leer t
		Si t%2=0 Entonces
			Escribir "la altura introducida no es valida,dime otra "
		Fin Si
	Hasta Que t>=5 Y t%2=1
	Para f<-0 Hasta t-1 Hacer
		Si f=0 O (f=trunc(t/2)) O (f=t-1) Entonces
			Escribir "MMMMMM"
		SiNo
			Escribir "M    M"
		Fin Si
	Fin Para
FinAlgoritmo
