
public class ClaseCuadrado extends ClaseLadoInter {
    public ClaseCuadrado(float x) {
        super(x);
    }

    public float ObtenerPerimetro() {
        return 4 * ObtenerLado();
    }

    public float CalculaArea() {
        return (float) (Math.pow(ObtenerLado(), 2));
    }

    public String ObtenerNombre() {
        return "Clase Cuadrado";
    }

    public String ObtenerInstancias() {
        return super.ObtenerInstancias();
    }
}
