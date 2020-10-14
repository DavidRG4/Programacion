Funcion m<- multiplos ( n1 )
	Definir m Como Entero
	m=0
	Para n2<-1 Hasta n1 Hacer
		Si n1%n2=0 Entonces
			Escribir n2, " Es divisor de ",n1
			m=m+1
		Fin Si
	Fin Para
Fin Funcion

Algoritmo sin_titulo
	Definir n1 Como Entero
	Definir m Como Entero
	Repetir
		Escribir "dime un numero"
		Leer n1 
	Hasta Que n1>0
	m=multiplos ( n1 )

	
FinAlgoritmo
