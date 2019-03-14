// Pedir dos números, un operador(+, -, * o /) y mostrar el resultado

#include <string>
#include <iostream>

using namespace std;


int main()
{
	int n1, n2;
	char c;

	cout << "Introduce el primer numero\n";
	cin >> n1;

	cout << "Introduce el segundo numero\n";
	cin >> n2;

	cout << "Introduce el operador (+, -, * o /)\n";
	cin >> c;

	cout << "Resultado:\t";

	switch (c)
	{
		case '+':
		{
			cout << n1 + n2 << endl;
			break;
		}

		case '-':
		{
			cout << n1 - n2 << endl;
			break;
		}

		case '*':
		{
			cout << n1 * n2 << endl;
			break;
		}

		case '/':
		{
			cout << (double) n1 / n2 << endl;
			break;
		}

		default:
			cout << "Operador incorrecto\n";
	}

	system("pause");
}