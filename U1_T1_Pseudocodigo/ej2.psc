Algoritmo Ej2
	Definir n1 Como Entero
	Definir n2 Como Entero
	Definir c Como entero
	Escribir "Dime un numero positivo"
	Leer n1
	n2 <- 0;
	Mientras n1 > 0 Hacer
		c<- n1%10;
		n1<- n1-c;
		n1<- n1/10;
		n2<- n2*10+c;
	Fin Mientras
	Escribir "El numero resultante es ", n2;
FinAlgoritmo
