/* Leer una frase por teclado y encontrar el número de palabras que tiene (las separadas 
por signos de puntuación cuentan como diferentes)*/

#include <iostream>
#pragma warning(disable : 4996)

using namespace std;

int main()
{
	char *cad = (char*)malloc(50);
	int tam, palabras = 1, inicio = 0;

	printf("Introduce una frase\n");
	fgets(cad, 256, stdin);
	strtok(cad, "\n");

	tam = strlen(cad);

	for (int i = 0; i <= tam; i++)
	{
		//Comprueba si la frase empieza sin signos de puntuación (Usando su código ASCII)
		if ((cad[i] >= 97 && cad[i] <= 122) || (cad[i] >= 65 && cad[i] <= 90) || (cad[i] >= 48 && cad[i] <= 57))
		{
			inicio++;//Solo se incrementa cuando encuentra una letra o número
		}

		//Una vez se cumple lo anterior, empieza a contar las palabras en cuanto encuentra el primer signo de puntuación despues de un caracter
		if (inicio != 0 && ((cad[i] >= 0 && cad[i] <= 47) || (cad[i] >= 58 && cad[i] <= 64) || (cad[i] >= 91 && cad[i] <= 96) || (cad[i] >= 123 && cad[i] <= 127)))
		{
			//Si hay varios signos de puntuacion seguidos solo cuenta el último
			if((cad[i + 1] >= 97 && cad[i + 1] <= 122) || (cad[i + 1] >= 65 && cad[i + 1] <= 90) || (cad[i + 1] >= 48 && cad[i + 1] <= 57))
			{
				palabras++;
			}
		}
	}

	//Si la frase solo contiene signos de puntuación, al tener palabras inicializado a 1 le restamos 1 para que muestre 0
	if (inicio == 0)
	{
		palabras--;
	}

	cout << "La frase " << '"' << cad << '"' << " contiene " << palabras << " palabras." << endl;
	system("pause");
}