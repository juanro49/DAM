//1. Pide dos números por teclado y muéstrelos en pantalla

#include <string>
#include <iostream>

using namespace std;

int n1, n2;

int main()
{
	//Introducimos los números por teclado

	cout << "Escribe el primer numero\n";
	cin >> n1;

	cout << "Escribe el segundo numero\n";
	cin >> n2;

	//Sacamos los números por pantalla

	cout << "El primer número es: " << n1 << endl;
	cout << "El segundo número es: " << n2 << endl;

	system("pause");
	return 0;
}