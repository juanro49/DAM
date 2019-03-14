// Dar el radio de una circunferencia, calcular el área, la longitud y mostrarlo por pantalla

#include <string>
#include <iostream>

using namespace std;

int r;
double a, l;

int main()
{
	cout << "Escribe el radio\n";
	cin >> r;

	l = 2 * 3.14 * r;
	a = 3.14 * pow(r, 2);

	cout << "Longitud:\t" << l << endl;
	cout << "Area:\t" << a << endl;

	system("pause");
}