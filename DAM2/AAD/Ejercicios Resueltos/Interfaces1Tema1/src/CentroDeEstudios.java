public interface CentroDeEstudios
{
    byte NumeroDePisos = 5;
    byte NumeroDeAulas = 25;
    byte NumeroDeDespachos = 10;
    short NumeroDeAprobados(float[] Notas);
    short NumeroDeSuspensos(float[] Notas);
    float NotaMedia(float[] Notas);
    float Varianza(float[] Notas);
}