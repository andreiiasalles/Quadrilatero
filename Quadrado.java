public class Quadrado extends Quadrilatero{

  private final float lado;

  public Quadrado(float lado){
    this.lado = lado;
  }
  
  public float calcularArea(){
   return lado*lado;
  }

  public float getLado(){
    return lado;
  }
}