package trabalho1.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import trabalho1.Musica;

public class TableModelMusica extends AbstractTableModel {
    private String colunas[] = {"Título", "Artista"};
    private ArrayList<Musica> musica;
    private final int COLUNA_TITULO = 0;
    private final int COLUNA_ARTISTA = 1;

//    public FuncionarioTableModel(ArrayList<Funcionario> funcionarios) {
//        this.funcionarios = funcionarios;
//    }

    //retorna se a célula é editável ou não
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    //retorna o total de itens(que virarão linhas) da nossa lista
    @Override
    public int getRowCount() {
        return musica.size();
    }
    //retorna o total de colunas da tabela
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    //retorna o nome da coluna de acordo com seu indice
    @Override
    public String getColumnName(int indice) {
        return colunas[indice];
    }

    //determina o tipo de dado da coluna conforme seu indice
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case COLUNA_TITULO:
                return String.class;
            case COLUNA_ARTISTA:
                return String.class;
            default:
                return String.class;
        }
    }

    //preenche cada célula da tabela
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Musica musica = this.musica.get(rowIndex);

        switch (columnIndex) {
            case COLUNA_TITULO:
                return musica.getTitulo();
            case COLUNA_ARTISTA:
                return musica.getArtista();
        }
        return null;
    }
    //altera o valor do objeto de acordo com a célula editada
    //e notifica a alteração da tabela, para que ela seja atualizada na tela
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //o argumento recebido pelo método é do tipo Object
        //mas como nossa tabela é de funcionários, é seguro(e até recomendável) fazer o cast de suas propriedades
        Musica musica = this.musica.get(rowIndex);
        //de acordo com a coluna, ele preenche a célula com o valor
        //respectivo do objeto de mesmo indice na lista
        switch (columnIndex) {
            case COLUNA_TITULO:
                musica.setTitulo(String.valueOf(aValue));
                break;
            case COLUNA_ARTISTA:
                musica.setArtista(String.valueOf(aValue));
                break;
        }
        //este método é que notifica a tabela que houve alteração de dados
        fireTableDataChanged();
    }
    
}
