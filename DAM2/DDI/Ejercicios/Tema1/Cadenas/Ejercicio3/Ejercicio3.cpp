// Leer una cadena por teclado y contar el número de vocales

#include <iostream>

using namespace std;
#pragma warning(disable : 4996)

int main()
{
	char cadena[30];
	int cont = 0;

	printf("Escribe una frase\n");
	fgets(cadena, 256, stdin);
	strtok(cadena, "\n");

	for (int i = 0; i <= strlen(cadena); i++)
	{
		cadena[i] = tolower(cadena[i]);

		if (cadena[i] == 'a' || cadena[i] == 'e' || cadena[i] == 'i' || cadena[i] == 'o' || cadena[i] == 'u')
		{
			cont++;
		}
	}

	cout << "La frase " << "'" << cadena << "'" << " contiene " << cont << " vocales" << endl;

	system("pause");
}