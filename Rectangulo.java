public class Rectangulo extends ClaseLadoInter {
    public Rectangulo(float x, float y) {
        super(x, y);
    }

    public float CalculaArea() {
        return ObtenerBase() * ObtenerAltura();
    }

    public float CalculaPerimetro() {
        return 2 * ObtenerBase() + 2 * ObtenerAltura();
    }

    public String ObtenerNombre() {
        return "ClaseRectangulo";
    }

    public String ObtenerInstancias() {
        return " Lado es: " + super.ObtenerInstancias2();
    }
}
