package trabalho1.form;

public class Arquivo {

    private String cabecalho;
    private String titulo;
    private String artista;
    private String album;
    private String ano;
    private String comentario;
    private String flag;
    private String nrFaixa;
    private String genero;

    public Arquivo(String cabecalho, String titulo, String artista, String album, String ano, String comentario, String flag, String nrFaixa, String genero) {
        this.cabecalho = cabecalho;
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.ano = ano;
        this.comentario = comentario;
        this.flag = flag;
        this.nrFaixa = nrFaixa;
        this.genero = genero;
    }

    public String getCabecalho() {
        return cabecalho;
    }

    public void setCabecalho(String cabecalho) {
        this.cabecalho = cabecalho;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getNrFaixa() {
        return nrFaixa;
    }

    public void setNrFaixa(String nrFaixa) {
        this.nrFaixa = nrFaixa;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
