import javax.swing.JOptionPane;

public class Prueba2JHInterface {
    // Método para solicitar al usuario que introduzca un valor
    public static float PedirDato(String Cad) {
        // Se muestra un cuadro de diálogo solicitando al usuario que introduzca un valor
        // Cad es la cadena que se muestra al usuario para indicarle lo que debe ingresar
        // El valor ingresado se convierte a float y se devuelve
        return Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el " + Cad));
    }

    public static void main(String[] args) {
        // Cad es la cadena donde se almacenará la salida
        String Cad = "";

        // Creación de tres objetos, solicitando al usuario que introduzca los valores necesarios para cada uno
        ClaseLadoInter ObjLado = new ClaseLadoInter(PedirDato("El valor de la base: "), PedirDato("El valor de la altura: "));
        Rectangulo ObjRect = new Rectangulo(PedirDato("El valor de la base: "), PedirDato("El valor de la altura: "));
        Triangulo ObjTri = new Triangulo(PedirDato("El valor de la base: "), PedirDato("El valor de la altura: "));

        // Se agregan los nombres de las clases de los objetos a Cad
        Cad = Cad + "Nombre de la clase" + ObjLado.ObtenerNombre() + "\n";
        Cad = Cad + "Nombre de la clase" + ObjRect.ObtenerNombre() + "\n";
        Cad = Cad + "Nombre de la clase" + ObjTri.ObtenerNombre() + "\n";

        // Se crea un array de Figurainterface y se almacenan los objetos en él
        Figurainterface Figura[] = new Figurainterface[3];
        Figura[0] = ObjLado;
        Figura[1] = ObjRect;
        Figura[2] = ObjTri;

        // Para cada objeto en el array, se agregan a Cad la información obtenida de los métodos de Figurainterface
        Cad = Cad + "Aplicando Polimorfismo \n";
        for (int i = 0; i < 3; i++) {
            Cad = Cad + "Nombre de la clase: " + Figura[i].ObtenerNombre() + "\n"
                    + "Instancias: " + Figura[i].ObtenerInstancias2() + "\n"
                    + "Area: " + Figura[i].CalculaArea() + "\n"
                    + "Perimetro: " + Figura[i].CalculaPerimetro() + "\n";
        }
        // Finalmente, se muestra Cad en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, Cad);
    }
}

