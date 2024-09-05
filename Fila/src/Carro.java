public class Carro {
    
    //===== ===== ATRIBUTOS ===== =====
    private String modelo;
    private String marca;
    private int ano;
    private double preco;

    //===== ===== CONSTRUTOR ===== =====
    public Carro(String modelo, String marca, int ano, double preco){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    //===== ====== SETTERS ===== =====
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    //===== ===== GETTERS ===== =====
    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }

    public int getAno(){
        return ano;
    }

    public double getPreco(){
        return preco;
    }

    // Reescrição do método toString(); 
    @Override
    public String toString(){
        String string = "\nMarca: "+this.marca+
                        "\nModelo: "+this.modelo+
                        "\nAno: "+this.ano+
                        "\nPreço: "+this.preco+"0R$";
        return string;
    }

}

