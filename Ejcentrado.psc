Funcion linea <- escribircentrado ( A )
	Definir  tam Como Entero
	tam=longitud(A)
	esp=trunc((80-tam)/2)
	linea=""
	para contador<-1 Hasta esp Hacer
		linea=Concatenar(linea,"-")
	FinPara
	linea=linea+A+linea
Fin Funcion
Algoritmo sin_titulo
	Definir A Como caracter
	Escribir "introduce cadena"
	Leer A
	Escribir escribircentrado(A)
FinAlgoritmo