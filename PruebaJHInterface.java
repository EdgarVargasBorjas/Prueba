import javax.swing.JOptionPane;

public class PruebaJHInterface {
    // Método para solicitar al usuario que introduzca un valor para el lado
    public static float PedirDato() {
        // Se muestra un cuadro de diálogo solicitando al usuario que introduzca un valor
        // El valor ingresado se convierte a float y se devuelve
        return Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el lado"));
    }

    public static void main(String[] args) {
        // Cad es la cadena donde se almacenará la salida
        String Cad = "";

        // Creación de tres objetos, solicitando al usuario que introduzca los valores necesarios para cada uno
        ClaseLadoInter ObjLado = new ClaseLadoInter(PedirDato());
        ClaseCuadrado ObjCuadrado = new ClaseCuadrado(PedirDato());
        ClaseCubo ObjCubo = new ClaseCubo(PedirDato());

        // Se agregan los nombres de las clases de los objetos a Cad
        Cad = Cad + "Nombre de la clase" + ObjLado.ObtenerNombre() + "\n";
        Cad = Cad + "Nombre de la clase" + ObjCuadrado.ObtenerNombre() + "\n";
        Cad = Cad + "Nombre de la clase" + ObjCubo.ObtenerNombre() + "\n";

        // Se crea un array de Figurainterface y se almacenan los objetos en él
        Figurainterface Figura[] = new Figurainterface[3];
        Figura[0] = ObjLado;
        Figura[1] = ObjCuadrado;
        Figura[2] = ObjCubo;

        // Para cada objeto en el array, se agregan a Cad la información obtenida de los métodos de Figurainterface
        Cad = Cad + "Aplicando Polimorfismo \n";
        for (int i = 0; i < 3; i++) {
            Cad = Cad + "Nombre de la clase: " + Figura[i].ObtenerNombre() + "\n"
                    + "Instancias: " + Figura[i].ObtenerInstancias() + "\n"
                    + "Area Perimetral: " + Figura[i].CalculaArea() + "\n"
                    + "Volumen: " + Figura[i].CalculaVolumen() + "\n";
        }
        // Finalmente, se muestra Cad en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, Cad);
    }
}
