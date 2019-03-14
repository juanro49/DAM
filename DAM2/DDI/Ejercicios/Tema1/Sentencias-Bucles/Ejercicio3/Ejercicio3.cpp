// Pedir un número y mostrar el doble y el triple de ese número

#include <string>
#include <iostream>

using namespace std;

int n;

int main()
{
	cout << "Escribe el numero\n";
	cin >> n;

	cout << "Doble\t" << n * 2 << endl;
	cout << "Triple\t" << n * 3 << endl;

	system("pause");
}