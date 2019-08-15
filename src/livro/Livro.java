
package livro;


public class Livro {
    private String titulo;
    private String autor;
    private int isbn;
    private int qtdPaginas;
    private int ano;
    private String editora;
    private double valor;
    
    public void setTitulo(String titulo){
     this.titulo = titulo;
    }
    public void setAutor(String autor){
     this.autor = autor;
    }
    public void setIsbn(int isbn){
     this.isbn = isbn;
    }
    public void setQtdPaginas(int titulo){
     this.qtdPaginas = titulo;
    }
    public void setAno(int titulo){
     this.ano = titulo;
    }
    public void setEditora(String titulo){
     this.editora = titulo;
    }
    public void setvalor(double titulo){
     this.valor = titulo;
    }
    public String getTitulo(){
     return this.titulo;
    }
    public String getAutor(){
     return this.autor;
    }
    public int getIsbn(){
     return this.isbn;
    }
    public int getQtdPaginas(){
     return this.qtdPaginas;
    }
    public int getAno(){
     return this.ano;
    }
    public String getEditora(){
     return this.editora;
    }
    public double getValor(){
     return this.valor;
    }
    
    public String Exibir(){
    return "O livro "+titulo+" O Autor é "+autor+"\n Editora: "+editora+"\n quantidade de páginas: "+Integer.toString(qtdPaginas)+"\n Ano: "+Integer.toString(ano)+"\n Isbn: "+Integer.toString(isbn)+"\n Valor: "+Double.toString(valor);
    }
    public double Venda(int qtd){
    return qtd*valor;
    }
}

//Vai fazendo um exemplo da interface grafica plz, ou sla pelo menos da login no git
