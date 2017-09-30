package ADOII;

/**
 *
 * @author Andreson
 */
public class Pessoa {
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public Pessoa(){
    this.nome = null;
    this.idade = 0;
    this.peso = 0.0f;
    this.altura = 0.0f;    
    }
    
    public Pessoa(String nome,int idade,float peso,float altura){
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * @return the IMC
     */
    public float calcularIMC(){
        return peso/(altura*altura);
    }
    
    public void statusIMC(){
        if(calcularIMC()<18.5){
            System.out.println("Abaixo do Peso");
                }else if(calcularIMC()>=18.5 && calcularIMC()<=24.9){
                    System.out.println("Peso Ideal");
                        }else if(calcularIMC() >=25 && calcularIMC()<=29.9){
                            System.out.println("Sobrepeso");
                                }else if(calcularIMC() >= 30 && calcularIMC() <= 34.9){
                                    System.out.println("Obesidade Grau I");
                                        }else if (calcularIMC()>= 35 && calcularIMC()<=39.9 ){
                                            System.out.println("Obesidade Grau II");
                                                } else{
                                                    System.out.println("Obesidade Grau III");
                                                    }
    }
}
