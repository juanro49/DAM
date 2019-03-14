public class ArrayReales implements Estadistica{
    
    double [] valor;
    public void asignar() {
        for (int i=0; i<valor.length; i++) {
            valor[i] = Math.random()*100;
            valor[i] = Math.rint(valor[i]*10)/10;
        }
    }

    public double minimo() {
        double menor = valor[0];
        for (int i=0; i<valor.length; i++) {
            if (menor>valor[i]) { menor=valor[i]; }
        }
        return menor;
    }

    public double maximo() {
        double mayor = valor[0];
        for (int i=0; i<valor.length; i++) {
            if (mayor<valor[i]) { mayor=valor[i]; }
        }
        return mayor;
    }

    public double sumatorio() {
        double suma =0.0;
        for (int i=0; i<valor.length; i++) {
            suma+=valor[i];
            suma=Math.rint(suma*10)/10;
        }
        return suma;
    }
}