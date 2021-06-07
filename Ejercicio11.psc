Algoritmo Ejercicio11
	Escribir 'Ingrese un numero'
	Leer Num
	Mientras Num>=0 Y Num<=36 Hacer
		Si Num MOD 2=1 Entonces
			Impares <- Impares+1
		SiNo
			Si Num=0 Entonces
				Pares <- Pares+Num
				CantidadPares <- CantidadPares
			SiNo
				Pares <- Pares+Num
				CantidadPares <- CantidadPares+1
			FinSi
		FinSi
		Si Num>=13 Y Num<=24 Entonces
			SegundaDocena <- SegundaDocena+1
		FinSi
		Si Num>Maximo Entonces
			Maximo <- M
		FinSi
		Escribir 'Ingrese un numero'
		Leer Num
	FinMientras
	Escribir 'a) La cantidad de numeros impares: ',Impares
	Escribir 'b) El promedio de los numeros pares: ',Pares/CantidadPares
	Escribir 'c) Cantidad 2° docena son: ',SegundaDocena
	Escribir 'e) El numero mas grande: ',Maximo
FinAlgoritmo
