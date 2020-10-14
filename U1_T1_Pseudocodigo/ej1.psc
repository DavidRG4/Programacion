Algoritmo ej1
	Definir C Como real
	Escribir "¿Cuanto quiere?"
	Leer C
	Si C<=100 Entonces
		Escribir "Le costara ", abs(C*5.23)
	Fin Si
	Si C>=101 Y C<=1000 Entonces
		Escribir "Le costara ", abs(((100*5.23)+((C-100)*4.16)))
	Fin Si
	Si C>1000 Entonces
		Escribir  "Le costara ", abs((((100*5.23)+((C-100)*4.16)))/2)
	Fin Si
FinAlgoritmo
