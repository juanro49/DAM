// Pedir Nombre y Apellidos en cadenas diferentes y mostrarlo.

#include <iostream>
#pragma warning(disable : 4996)

using namespace std;

int main()
{
	char *cad1 = (char*)malloc(30);
	char cad2[15] = "";
	char cad3[10] = "";
	int tam;

	printf("Introduce el nombre\n");
	fgets(cad1, 30, stdin);
	strtok(cad1, "\n");

	printf("Introduce el primer apellido\n");
	fgets(cad2, 15, stdin);
	strtok(cad2, "\n");

	printf("Introduce el segundo apellido\n");
	fgets(cad3, 10, stdin);
	strtok(cad3, "\n");

	tam = strlen(cad1);

	strcat(strcat(strcat(strcat(cad1, " "), cad2), " "), cad3);

	printf("El nombre y los apellidos son %s ", cad1);
	printf("\n");
	printf("El tamaño del nombre es %i ", tam);
	printf("\n");

	system("pause");
}