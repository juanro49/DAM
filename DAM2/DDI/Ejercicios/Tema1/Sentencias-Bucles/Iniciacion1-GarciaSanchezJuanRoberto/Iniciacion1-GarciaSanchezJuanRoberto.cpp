
#include <iostream>

using namespace std;

void ejercicio1()
{
	/*Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, 
	resta, multiplicación, división y módulo (resto de la división).*/

	int n1 = 10;
	int n2 = 5;

	cout << "Suma:\t" << n1 + n2 << endl;
	cout << "Resta:\t" << n1 - n2 << endl;
	cout << "Multiplicacion:\t" << n1 * n2 << endl;
	cout << "Division:\t" << n1 / n2 << endl;
	cout << "Modulo:\t" << n1 % n2 << endl;
}

void ejercicio2()
{
	/*Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de 
	los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar 
	que funciona.*/

	int n1 = 10;
	int n2 = 5;

	cout << "Numeros: " << n1 << " y " << n2 << endl;

	if (n1 > n2)
	{
		cout << n1 << " es mayor que " << n2 << endl;
	}
	else if (n1 < n2)
	{
		cout << n2 << " es mayor que " << n1 << endl;
	}
	else if (n1 == n2)
	{
		cout << n1 << " y " << n2 << " son iguales" << endl;
	}
}

void ejercicio3()
{
	/*Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, 
	también debemos indicarlo.*/

	int n;

	cout << "Introduce un numero\n";
	cin >> n;

	if (n % 2 == 0)
	{
		cout << n << " es divisible entre 2\n";
	}
	else
	{
		cout << n << " no es divisible entre 2\n";
	}
}

void ejercicio4()
{
	/*Lee un número por teclado que pida el precio de un producto (puede tener decimales) 
	y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.*/

	double n, iva, pfinal;

	cout << "Introduce el precio del producto\n";
	cin >> n;

	iva = n * 0.21;
	pfinal = n + iva;

	cout << "El precio con IVA es " << pfinal << endl;
}

void ejercicio5()
{
	/*Escribe un programa Java que declare una variable entera N y asígnale un valor. A 
	continuación escribe las instrucciones que realicen los siguientes:
	Incrementar N en 77.
	Decrementarla en 3.
	Duplicar su valor.
	Si por ejemplo N = 1 la salida del programa será: Valor inicial de N = 1*/

	int n = 10;

	cout << "Valor inicial de N = " << n << endl;

	n += 77;
	cout << "Incrementar N en 77 -->\t\t" << n << endl;

	n -= 3;
	cout << "Decrementar N en 3 -->\t\t" << n << endl;

	n *= 2;
	cout << "Duplicar el valor de N -->\t" << n << endl;
}

void ejercicio6()
{
	/*Escriba un programa que lea cuatro numeros enteros y escriba en pantalla el mayor 
	de ellos. Sugerencia: acumule en una variable temporal uno de ellos y compare con los 
	demas uno a uno.*/

	int n1, n2, n3, n4, aux;

	cout << "Escribe el primer numero\n";
	cin >> n1;

	cout << "Escribe el segundo numero\n";
	cin >> n2;

	cout << "Escribe el tercero numero\n";
	cin >> n3;

	cout << "Escribe el cuarto numero\n";
	cin >> n4;

	aux = n1;

	if (aux < n2)
	{
		aux = n2;
	}
	
	if (aux < n3)
	{
		aux = n3;
	}
	
	if (aux < n4)
	{
		aux = n4;
	}

	cout << "El mayor de " << n1 << ", " << n2 << ", " << n3 << " y " << n4 << " es: " << aux << endl;
}

void ejercicio7()
{
	/*Escriba un programa que reciba cuatro calificaciones de un estudiante y devuelva 
	el promedio y la máxima y la mínima calificación*/

	double c1, c2, c3, c4, media, max, min;

	cout << "Escribe la primera calificacion\n";
	cin >> c1;

	cout << "Escribe la segunda calificacion\n";
	cin >> c2;

	cout << "Escribe la tercera calificacion\n";
	cin >> c3;

	cout << "Escribe la cuarta calificacion\n";
	cin >> c4;

	max = c1;
	min = max;

	//maxima
	if (max < c2)
	{
		max = c2;
	}

	if (max < c3)
	{
		max = c3;
	}

	if (max < c4)
	{
		max = c4;
	}

	//minima
	if (min > c2)
	{
		min = c2;
	}

	if (min > c3)
	{
		min = c3;
	}

	if (min > c4)
	{
		min = c4;
	}

	//promedio
	media = (c1 + c2 + c3 + c4) / 4;

	cout << "Promedio:\t" << media << endl;
	cout << "Maxima:\t\t" << max << endl;
	cout << "Minima:\t\t" << min << endl;
}

void ejercicio8()
{
	/*Que muestre los números del 100 al 1.*/
	
	for (int i = 100; i >= 1; i--)
	{
		cout << i;

		if (i != 1)
		{
			cout << ", ";
		}
	}

	cout << endl;
}

void ejercicio9()
{
	/*Que muestre los números impares que haya del 1 al 100.*/

	for (int i = 1; i <= 100; i++)
	{
		if (i % 2 != 0)
		{
			cout << i << ", ";
		}
	}

	cout << endl;
}

void ejercicio10()
{
	/*Que imprima la suma de todos los números que van del 1 al 100.*/

	int n = 0;

	for (int i = 1; i <= 100; i++)
	{
		n += i;
	}

	cout << "La suma de todos los numeros del 1 al 100 es: " << n << endl;
}

void ejercicio11()
{
	/* Que imprima la suma de todos los números pares que van del 1 al 100 y diga 
	cuántos hay.*/

	int n = 0;
	int cont = 0;

	for (int i = 1; i <= 100; i++)
	{
		if (i % 2 == 0)
		{
			n += i;
			cont++;
		}
	}

	cout << "La suma de los " << cont << " numeros pares que hay del 1 al 100 es: " << n << endl;
}

void ejercicio12()
{
	/* Que pida dos números y muestre todos los números que van desde el primero 
	al segundo. Se debe controlar que los valores son correctos.*/

	int n1, n2, aux;

	cout << "Introduce un numero\n";
	cin >> n1;

	cout << "Introduce otro numero\n";
	cin >> n2;

	if (n1 > n2)
	{
		aux = n1;
		n1 = n2;
		n2 = aux;
	}

	cout << "Los numeros que van del " << n1 << " al " << n2 << " sin contar ambos son:\n";

	for (int i = n1 + 1; i < n2; i++)
	{
		cout << i;

		if (i != n2 - 1)
		{
			cout << ", ";
		}
	}

	cout << endl;
}

void ejercicio13()
{
	/* Que pida un número y diga si es primo o no.*/

	int n, cont = 0;

	cout << "Introduce un numero\n";
	cin >> n;

	for (int i = n - 1; i > 1; i--)
	{
		if (n % i == 0)
		{
			cont++;
		}
	}

	if (cont == 0)
	{
		cout << "El numero " << n << " es primo\n";
	}
	else
	{
		cout << "El numero " << n << " no es primo\n";
	}
}

void ejercicio14()
{
	/* Escriba un programa que lea un numero N de teclado y a continuacion 
	imprima en pantalla:
	• Su factorial.
	•La suma de los N primeros terminos de la serie armonica (1+1/2+...+1/N)
	•Los n primeros terminos de la sucesion de Fibonacci.*/

	int n, fn;
	int f1 = 1;
	int f2 = 1;
	int fac = 1;
	double arm = 0;

	cout << "Introduce un numero\n";
	cin >> n;

	//factorial
	for (int i = n; i >= 1; i--)
	{
		fac *= i;
	}

	cout << "El factorial de " << n << " es: " << fac << endl;

	//armonica
	for (double i = 1; i <= n; i++)
	{
		arm += (1 / i);
	}

	cout << "La suma de los " << n << " primeros terminos de la serie armonica es: " << arm << endl;

	//fibonacci
	cout << "Los " << n << " primeros terminos de la serie de Fibonacci son:\n";

	for (int i = 1; i <= n; i++)
	{
		if (i <= 2)
		{
			fn = 1;
		}
		else
		{
			fn = f1 + f2;
			f1 = f2;
			f2 = fn;
		}

		cout << fn << ", ";
	}
}

void ejercicio15()
{
	/*Escriba un programa que lea un numero N e imprima una piramide de 
	numeros con N filas como en la siguiente figura:
			1
		   121
		  12321
		 1234321*/

	int n, espacios;
	int alt = 1;

	cout << "Introduce el numero de filas de la piramide de numeros\n";
	cin >> n;

	espacios = n - 1;

	while (alt <= n)
	{
		//añade espacios
		for (int i = 1; i <= espacios; i++)
		{
			cout << " ";
		}

		//añade numeros
		for (int i = 1; i <= alt; i++)
		{
			cout << i;
		}

		for (int i = alt -1; i > 0; i--)
		{
			cout << i;
		}

		cout << endl;

		espacios--;
		alt++;
	}
}

int main()
{
	int n;

	do
	{
		printf("\n Ejercicios1-C++\n");
		printf("\t 1. Ejercicio1\n");
		printf("\t 2. Ejercicio2\n");
		printf("\t 3. Ejercicio3\n");
		printf("\t 4. Ejercicio4\n");
		printf("\t 5. Ejercicio5\n");
		printf("\t 6. Ejercicio6\n");
		printf("\t 7. Ejercicio7\n");
		printf("\t 8. Ejercicio8\n");
		printf("\t 9. Ejercicio9\n");
		printf("\t 10. Ejercicio10\n");
		printf("\t 11. Ejercicio11\n");
		printf("\t 12. Ejercicio12\n");
		printf("\t 13. Ejercicio13\n");
		printf("\t 14. Ejercicio14\n");
		printf("\t 15. Ejercicio15\n");
		printf("\t 0. Salir\n\n");
		printf("Selecciona el ejercicio a realizar:\n");

		cin >> n;
		printf("\n");

		switch (n)
		{
			case 0:
			{
				printf("Saliendo del proyecto...\n");
				break;
			}

			case 1:
			{
				ejercicio1();
				break;
			}

			case 2:
			{
				ejercicio2();
				break;
			}

			case 3:
			{
				ejercicio3();
				break;
			}

			case 4:
			{
				ejercicio4();
				break;
			}

			case 5:
			{
				ejercicio5();
				break;
			}

			case 6:
			{
				ejercicio6();
				break;
			}

			case 7:
			{
				ejercicio7();
				break;
			}

			case 8:
			{
				ejercicio8();
				break;
			}

			case 9:
			{
				ejercicio9();
				break;
			}

			case 10:
			{
				ejercicio10();
				break;
			}

			case 11:
			{
				ejercicio11();
				break;
			}

			case 12:
			{
				ejercicio12();
				break;
			}

			case 13:
			{
				ejercicio13();
				break;
			}

			case 14:
			{
				ejercicio14();
				break;
			}

			case 15:
			{
				ejercicio15();
				break;
			}

			default:
			{
				printf("Selecciona una opcion correcta\n");
				break;
			}
		}
	} while (n != 0);

	system("pause");
}