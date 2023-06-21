package Atividade2;

public class Livro {
    private String genero;
    private String nome;
    private String ISBN;
    private String autor;

    public Livro(String genero, String nome, String ISBN, String autor) {
        this.genero = genero;
        this.nome = nome;
        this.ISBN = ISBN;
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void registraLivro(String ISBN) {
        System.out.println("O livro foi registrado com o "+ getISBN());
    }

    public void registraLivro(String ISBN, String nome) {
        System.out.println("O livro foi registrado com o "+ getISBN() + " e o nome " + getNome());
    }

    public void registraLivro(String ISBN, String nome, String genero) {
        System.out.println("O livro foi registrado com o "+ getISBN() + " e o nome " + getNome() + " e o gênero " + getGenero());
    }

    public void registraLivro(String ISBN, String nome, String genero, String autor) {
        System.out.println("O livro foi registrado com o "+ getISBN() + " e o nome " + getNome() + " e o gênero " + getGenero() + " e tem como autor " + getAutor());
    }
}
