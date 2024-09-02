package entidades;

public class Animal {
    private String nome;
    private String especie;
    private Integer idade;
    private Float peso;
    private Float tamanho;
    private String cor;
    private String habitat;
    private String dieta;
    private Integer expectativaDeVida;
    private String origemGeografica;

    public Animal() {
    }

    public Animal(String nome, String especie, Integer idade, Float peso, Float tamanho, String cor, String habitat, String dieta, Integer expectativaDeVida, String origemGeografica) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
        this.tamanho = tamanho;
        this.cor = cor;
        this.habitat = habitat;
        this.dieta = dieta;
        this.expectativaDeVida = expectativaDeVida;
        this.origemGeografica = origemGeografica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getTamanho() {
        return tamanho;
    }

    public void setTamanho(Float tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public Integer getExpectativaDeVida() {
        return expectativaDeVida;
    }

    public void setExpectativaDeVida(Integer expectativaDeVida) {
        this.expectativaDeVida = expectativaDeVida;
    }

    public String getOrigemGeografica() {
        return origemGeografica;
    }

    public void setOrigemGeografica(String origemGeografica) {
        this.origemGeografica = origemGeografica;
    }
}
