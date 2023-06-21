package Atividade2;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro(" comedia", "Amor", "253278", "Yasmin Alves");

        Livro livro2 = new Livro(" suspense", "A Casa mal assombrada!", "452739", "Lucas Santos");

        Livro livro3 = new Livro(" auto ajuda", "Como ter uma vida melhor?", "328975", "Yasmin Alves");

        livro1.registraLivro(livro1.getISBN());
        livro2.registraLivro(livro2.getISBN(),livro2.getNome());
        livro2.registraLivro(livro2.getISBN(),livro2.getNome(),livro2.getGenero());
        livro3.registraLivro(livro3.getISBN(),livro3.getNome(),livro3.getGenero(),livro3.getAutor());
    }
}
