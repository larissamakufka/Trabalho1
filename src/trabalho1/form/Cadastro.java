package trabalho1.Form;

import java.io.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import trabalho1.Musica;

public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfArtista = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfAlbum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfAno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfComentario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfFlag = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfNrFaixa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfGenero = new javax.swing.JTextField();
        jbCancelar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Título da música:");

        jtfTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTituloActionPerformed(evt);
            }
        });

        jLabel2.setText("Artista:");

        jLabel3.setText("Albúm:");

        jLabel4.setText("Ano:");

        jLabel5.setText("Comentário:");

        jLabel6.setText("Flag de trilha:");

        jtfFlag.setEditable(false);
        jtfFlag.setText("0");
        jtfFlag.setEnabled(false);

        jLabel7.setText("Nr. Faixa:");

        jLabel8.setText("Gênero:");

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jLabel9.setText("Cadastrar novo arquivo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfTitulo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfNrFaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtfFlag, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                                            .addComponent(jtfGenero))
                                        .addGap(48, 129, Short.MAX_VALUE))
                                    .addComponent(jtfAlbum)
                                    .addComponent(jtfComentario)
                                    .addComponent(jtfArtista)))
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtfFlag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfNrFaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbSalvar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        int i = 0;
        Musica m = new Musica();

        String cabecalho = "TAG";

        String titulo = jtfTitulo.getText();
        i = titulo.length();
        if (i > 30) {
            m.setTitulo(titulo.substring(0, 29));
        } else {
            while (i != 30) {
                titulo += "+";
                i++;
            }
            m.setTitulo(titulo);
        }

        String artista = jtfArtista.getText();
        i = artista.length();
        if (i > 30) {
            m.setArtista(artista.substring(0, 29));
        } else {
            while (i != 30) {
                artista += "+";
                i++;
            }
            m.setArtista(artista);
        }

        String album = jtfAlbum.getText();
        i = album.length();
        if (i > 30) {
            m.setAlbum(album.substring(0, 29));
        } else {
            while (i != 30) {
                album += "+";
                i++;
            }
            m.setAlbum(album);
        }

        String ano = jtfAno.getText();
        i = ano.length();
        if (i > 4) {
            m.setAno(Integer.getInteger(ano.substring(0, 3)));
        } else {
            while (i != 4) {
                ano = ano + "0";
                i++;
            }
            m.setAno(Integer.valueOf(ano));
        }

        String comentario = jtfComentario.getText();
        String jtfComentario = "";
        i = comentario.length();
        if (i > 28) {
            m.setComentario(comentario.substring(0, 27));
        } else {
            while (i != 28) {
                comentario += "+";
                i++;
            }
            m.setComentario(comentario);
        }

        m.setFlag(0);

        String nrFaixa = jtfNrFaixa.getText();
        i = nrFaixa.length();
        if (i > 1) {
            m.setNrFaixa(Integer.valueOf(nrFaixa.substring(0)));
        } else {
            m.setNrFaixa(0);
        }

        String genero = jtfGenero.getText();
        i = genero.length();
        if (i > 1) {
            m.setGenero(Integer.valueOf(genero.substring(0)));
        } else {
            m.setGenero(0);
        }

        String arquivo = jtfTitulo.getText() + "-" + jtfArtista.getText();

        File fileOut = new File("C:\\Users\\Bruna Schroeder\\Desktop\\FURB\\Prog II\\Nova pasta" + arquivo + ".ID3v1");

        if (!fileOut.exists()) {
            try {
                fileOut.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            try (FileOutputStream fos = new FileOutputStream(fileOut)) {
                fos.write(cabecalho.getBytes());
                fos.write(m.getTitulo().getBytes());
                fos.write(m.getArtista().getBytes());
                fos.write(m.getAlbum().getBytes());
                fos.write(String.valueOf(m.getAno()).getBytes());
                fos.write(jtfComentario.getBytes());
                fos.write(String.valueOf(m.getFlag()).getBytes());
                fos.write(String.valueOf(m.getNrFaixa()).getBytes());
                fos.write(String.valueOf(m.getGenero()).getBytes());
            }
            JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso!");
            dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtfTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTituloActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTextField jtfAlbum;
    private javax.swing.JTextField jtfAno;
    private javax.swing.JTextField jtfArtista;
    private javax.swing.JTextField jtfComentario;
    private javax.swing.JTextField jtfFlag;
    private javax.swing.JTextField jtfGenero;
    private javax.swing.JTextField jtfNrFaixa;
    private javax.swing.JTextField jtfTitulo;
    // End of variables declaration//GEN-END:variables
}
