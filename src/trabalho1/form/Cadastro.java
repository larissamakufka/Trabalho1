package trabalho1.Form;

import java.io.*;
import java.util.logging.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import trabalho1.Musica;
//import trabalho1.Musicas;

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(jtfArtista))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(jbSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            i = 30 - i;
            while (i != 30) {
                titulo = titulo + " ";
                i = i + 1;
            }
            m.setTitulo(titulo);
        }

        String artista = jtfArtista.getText();
        i = artista.length();
        if (i > 30) {
            m.setArtista(artista.substring(0, 29));
        } else {
            i = 30 - i;
            while (i != 30) {
                artista = artista + " ";
                i = i + 1;
            }
            m.setArtista(artista);
        }

        String album = jtfAlbum.getText();
        i = album.length();
        if (i > 30) {
            m.setAlbum(album.substring(0, 29));
        } else {
            i = 30 - i;
            while (i != 30) {
                album = album + " ";
                i = i + 1;
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
                i = i + 1;
            }
            m.setAno(Integer.valueOf(ano));
        }

        String comentario = jtfComentario.getText();
        String jtfComentario = "";
        i = comentario.length();
        if (i > 28) {
            jtfComentario = comentario.substring(0, 27);
        } else {
            i = 28 - i;
            while (i != 28) {
                comentario = comentario + " ";
                i = i + 1;
            }
            jtfComentario = comentario;
        }

        String flag = jtfFlag.getText();
        String jtfFlag = "";
        i = flag.length();
        if (i > 1) {
            jtfFlag = flag.substring(0);
        } else {
            if (i != 1) {
                jtfFlag = " ";
            } else {
                jtfFlag = flag;
            }
        }

        String nrFaixa = jtfNrFaixa.getText();
        String jtfNrFaixa = "";
        i = nrFaixa.length();
        if (i > 1) {
            jtfNrFaixa = nrFaixa.substring(0);
        } else {
            if (i != 1) {
                jtfNrFaixa = " ";
            } else {
                jtfNrFaixa = nrFaixa;
            }
        }

        String genero = jtfGenero.getText();
        String jtfGenero = "";
        i = genero.length();
        if (i > 1) {
            jtfGenero = genero.substring(0);
        } else {
            if (i != 1) {
                jtfGenero = " ";
            } else {
                jtfGenero = genero;
            }
        }

        String arquivo = jtfTitulo + "-" + jtfArtista;
        File fileOut = new File(getClass().getResource("../Arquivos").getPath() + "/test" + arquivo + ".ID3v1.1");
        try {
            FileOutputStream fos = new FileOutputStream(fileOut);
            fos.write(cabecalho.getBytes());
            fos.close();
            fos.write(m.getTitulo().getBytes());
            fos.close();
            fos.write(m.getArtista().getBytes());
            fos.close();
            fos.write(m.getAlbum().getBytes());
            fos.close();
            fos.write(String.valueOf(m.getAno()).getBytes());
            fos.close();
            fos.write(jtfComentario.getBytes());
            fos.close();
            fos.write(jtfFlag.getBytes());
            fos.close();
            fos.write(jtfNrFaixa.getBytes());
            fos.close();
            fos.write(jtfGenero.getBytes());
            fos.close();
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
