public class Curriculo{

    //===== ===== ATRIBUTOS ===== =====
    private String nome;
    private String dataNascimento;
    private String formacao;
    private String experiencias;
    private double nota;

    //===== ===== CONSTRUTOR ===== ===== 
    public Curriculo(String nome, String dataNascimento, String formacao, String experiencias, double nota){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.formacao = formacao;
        this.experiencias = experiencias;
        this.nota = nota;
    }

    //===== ===== SETTERS ===== =====
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public void setFormacao(String formacao){
        this.formacao = formacao;
    }

    public void setExperiencias(String experiencias){
        this.experiencias = experiencias;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    //===== ===== GETTERS ===== =====
    public String getNome(){
        return nome;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    public String getFormacao(){
        return formacao;
    }

    public String getExperiencias(){
        return experiencias;
    }

    public double getNota(){
        return nota;
    }

    //Reescrição do método toString()
    @Override
    public String toString(){
        String toString =   "Nome: "+this.nome+
                            "\nData de Nascimento: "+this.dataNascimento+
                            "\nFormação: "+this.formacao+
                            "\nExperiências: "+this.experiencias+
                            "\nNota: "+this.nota;
        return toString;
    }

}