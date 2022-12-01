public class Retangulo extends Quadrilatero{
  private final float base;
  private final float altura;

  public Retangulo(float base, float altura){
    this.base = base;
    this.altura = altura;
  }
  public float calcularArea(){
   return base * altura;
  }

  public float getBase(){
    return base;
  }
  public float getAltura(){
    return altura;
  }
}