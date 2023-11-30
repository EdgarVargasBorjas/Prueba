public class ClaseCubo extends ClaseCuadrado 
{
    public ClaseCubo(float x){super(x);}

    public float CalculaArea(){ return 6*super.CalculaArea(); }

    public float CalculaVolumen(){ return (float) (Math.pow(ObtenerLado(),3)); }

    public String ObtenerNombre(){ return "Clase Cubo"; }

    public String ObtenerInstancias(){ return super.ObtenerInstancias(); }
}
