//2. Pedir cadena de texto y mostrarla

#include <string>
#include <iostream>

using namespace std;

string s;

int main()
{
	//Introducimos los números por teclado

	cout << "Escribe la cadena de texto\n";
	getline(cin, s, '\n');

	//Sacamos los números por pantalla

	cout << "La cadena es: " << s << endl;

	system("pause");
	return 0;
}