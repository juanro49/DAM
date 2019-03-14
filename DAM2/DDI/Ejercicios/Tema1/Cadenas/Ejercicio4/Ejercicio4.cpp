// Leer una cadena por teclado y contar cuantas veces se repite cada letra(incompleto)

#include <iostream>

using namespace std;
#pragma warning(disable : 4996)

int main()
{
	char cadena[30];
	char abc[27] = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z' };
	int aux[27];

	for (int l = 0; l <= 26; l++)
	{
		aux[l] = 0;
	}

	printf("Escribe una frase\n");
	fgets(cadena, 256, stdin);
	strtok(cadena, "\n");
	
	for (int i = 0; i < strlen(cadena); i++)
	{
		for (int j = 0; j <= strlen(abc); j++)
		{
			if (cadena[i] == abc[j])
			{
				aux[j++];
			}
		}
	}


		for (int j = 0; j <= 26; j++)
		{
			cout << aux[j++] << endl;
		}
	
	/*
	for (int j = 0; j < strlen(cadena); j++)
	{
		for (int k = 0; k <= strlen(abc); k++)
		{
			if (cadena[j] == abc[k])
			{
				if (abc[k] != 0 || abc[k] != 1)
				{
					cout << "La letra " << "'" << cadena[j] << "'" << " se repite " << aux[k] << " veces" << endl;
				}
			}
		}
	}*/

	system("pause");
	
}