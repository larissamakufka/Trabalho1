package trabalho1.Form;

import java.io.*;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import trabalho1.Musica;
import trabalho1.model.TableModelMusica;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        popularTabela();
    }

    public void popularTabela() {

        File file = new File("C:\\Users\\Bruna Schroeder\\Desktop\\FURB\\Prog II\\Nova pasta");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao criar pasta. Erro: " + ex.getMessage());
            }
        }

        File afile[] = file.listFiles();
        int i = 0;
        for (int j = afile.length; i < j; i++) {
            File arquivo = afile[i];

            try {
                FileInputStream fis = new FileInputStream(arquivo);
                Musica m = new Musica();

                //TAG        
                int data = fis.read();
                data = fis.read();
                data = fis.read();

                // Título da música
                String titulo = "";
                for (int t = 0; t < 30; t++) {
                    data = fis.read();
                    titulo += Character.toString((char) data);
                }
                m.setTitulo(titulo);

                String artista = "";
                for (int t = 0; t < 30; t++) {
                    data = fis.read();
                    artista += Character.toString((char) data);
                }
                m.setArtista(artista);

                String album = "";
                for (int t = 0; t < 30; t++) {
                    data = fis.read();
                    album += Character.toString((char) data);
                }
                m.setAlbum(album);

                String ano = "";
                for (int t = 0; t < 4; t++) {
                    data = fis.read();
                    ano += Character.toString((char) data);
                }
                m.setAno(Integer.valueOf(ano));

                String comentario = "";
                for (int t = 0; t < 28; t++) {
                    data = fis.read();
                    comentario += Character.toString((char) data);
                }
                m.setComentario(comentario);

                data = fis.read();
                String flag = Character.toString((char) data);
                m.setFlag(Integer.valueOf(flag));

                String nrFaixa = "";
                for (int t = 0; t < 1; t++) {
                    data = fis.read();
                    nrFaixa += Character.toString((char) data);
                }
                m.setNrFaixa(Integer.valueOf(nrFaixa));

                String genero = "";
                for (int t = 0; t < 1; t++) {
                    data = fis.read();
                    genero += Character.toString((char) data);
                }
                m.setGenero(Integer.valueOf(genero));

                fis.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao ler arquivo. Erro: " + ex.getMessage());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao ler arquivo. Erro: " + ex.getMessage());
            }
            System.out.println(arquivo.getName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jbAdicionar = new javax.swing.JButton();
        jbVerDetalhes = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable);

        jbAdicionar.setText("Adicionar");
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
            }
        });

        jbVerDetalhes.setText("Ver detalhes");
        jbVerDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerDetalhesActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbVerDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbVerDetalhes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
    }//GEN-LAST:event_jbAdicionarActionPerformed

    private void jbVerDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerDetalhesActionPerformed
        Object nomeTitulo = jTable.getModel().getValueAt(jTable.getSelectedRow(), 0);
        Object nomeArtista = jTable.getModel().getValueAt(jTable.getSelectedRow(), 0);

        VerDetalhes verDetalhes = new VerDetalhes();
        verDetalhes.setVisible(true);

    }//GEN-LAST:event_jbVerDetalhesActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed

        Object nomeTitulo = jTable.getModel().getValueAt(jTable.getSelectedRow(), 0);
        Object nomeArtista = jTable.getModel().getValueAt(jTable.getSelectedRow(), 0);

        File fileOut = new File("C:\\Users\\Bruna Schroeder\\Desktop\\FURB\\Prog II\\Nova pasta" + nomeTitulo
                + "-" + nomeArtista + ".ID3v1");
        fileOut.deleteOnExit();

    }//GEN-LAST:event_jbExcluirActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbVerDetalhes;
    // End of variables declaration//GEN-END:variables
}
