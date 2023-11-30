public class ClaseLadoInter implements Figurainterface {
    // Definición de atributos
    float L = 0.0f, Base = 0.0f, Altura = 0.0f;

    // Constructor que acepta un solo argumento y lo utiliza para establecer el
    // valor del lado
    public ClaseLadoInter(float x) {
        EstablecerLado(x);
    }

    // Constructor que acepta dos argumentos y los utiliza para establecer el valor
    // de la base y la altura
    public ClaseLadoInter(float x, float y) {
        EstablecerBase(x);
        EstablecerAltura(y);
    }

    // Método para establecer el valor del lado, siempre y cuando sea mayor que 0
    public void EstablecerLado(float x) {
        L = (x > 0.0f) ? x : 0.0f;
    }

    // Método para establecer el valor de la base, siempre y cuando sea mayor que 0
    public void EstablecerBase(float x) {
        Base = (x > 0.0f) ? x : 0.0f;
    }

    // Método para establecer el valor de la altura, siempre y cuando sea mayor que
    // 0
    public void EstablecerAltura(float y) {
        Altura = (y > 0.0f) ? y : 0.0f;
    }

    // Métodos para obtener los valores de los atributos
    public float ObtenerLado() {
        return L;
    }

    public float ObtenerBase() {
        return Base;
    }

    public float ObtenerAltura() {
        return Altura;
    }

    // Método que implementa ObtenerNombre() de Figurainterface, devuelve "Clase
    // Lado"
    public String ObtenerNombre() {
        return "Clase Lado";
    }

    // Método que implementa ObtenerInstancias() de Figurainterface, devuelve una
    // cadena que indica el valor del lado
    public String ObtenerInstancias() {
        return "El lado es: " + ObtenerLado();
    }

    // Método que implementa ObtenerInstancias2() de Figurainterface, devuelve una
    // cadena que indica los valores de la base y la altura
    public String ObtenerInstancias2() {
        return "Base es: " + ObtenerBase() + "\nAltura es: " + ObtenerAltura();
    }

    // Métodos que implementan los cálculos de área, volumen y perímetro de
    // Figurainterface.
    // Como ClaseLadoInter representa un lado, estos métodos simplemente devuelven
    // 0.
    public float CalculaArea() {
        return 0;
    }

    public float CalculaVolumen() {
        return 0;
    }

    public float CalculaPerimetro() {
        return 0;
    }
}
