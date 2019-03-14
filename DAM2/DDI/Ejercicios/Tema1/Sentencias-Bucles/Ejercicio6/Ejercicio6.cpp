// Pedir números y mostrarlos hasta que se introduzca un 0

#include <iostream>

using namespace std;

int main()
{
	int n;

	do
	{
		cout << "Introduce un numero\n";
		cin >> n;
		cout << "Numero introducido: " << n << endl;
	} while (n != 0);

	system("pause");
}