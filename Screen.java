import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Screen implements Action {

    JFrame jFrame = new JFrame("Sistema PopuLari");
    JTextField textoum = new JTextField();
    JTextField textodois = new JPasswordField();
    JTextField textotres = new JTextField("Senha:");
    JTextField textoquatro = new JTextField("Usuário:");
    JLabel jl = new JLabel();

    public Screen() {
    }

    void jframe() {

        jFrame.setVisible(true);
        jFrame.setSize(400, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.getContentPane().setBackground(Color.pink);
        jFrame.setLayout(null);

        jl.setText("Sistema Empresarial PopuLari");
        jl.setBounds(80, 0, 300, 200);
        jl.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        jFrame.add(jl);

        textodois.setBounds(90, 230, 200, 30);
        textoum.setBounds(90, 160, 200, 30);
        textotres.setBounds(20, 230, 70, 30);
        textotres.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 15));
        textotres.setBackground(Color.pink);
        textotres.setEditable(false);
        textoquatro.setBounds(20, 160, 70, 30);
        textoquatro.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 15));
        textoquatro.setEditable(false);
        textoquatro.setBackground(Color.pink);

        jFrame.add(textoum);
        jFrame.add(textodois);
        jFrame.add(textotres);
        jFrame.add(textoquatro);


        JButton jButton = new JButton("Logar");
        jButton.setBounds(90, 300, 100, 30);
        jButton.setFont(new Font("Tahoma", Font.BOLD, 10));

        jFrame.add(jButton);

        JButton jButtonTwo = new JButton("Exit");
        jButtonTwo.setBounds(200, 300, 100, 30);
        jButtonTwo.setFont(new Font("Tahoma", Font.BOLD, 10));

        jFrame.add(jButtonTwo);

        jButtonTwo.addActionListener(action -> {
            this.actionPerformed(action);

        });

        
        jButton.addActionListener(action -> {
            this.actionExit(action);

        });
    }

    public void testando() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
      System.exit(0);

    }

    public void actionExit(ActionEvent e) {

        if (textoum.getText().equals("Larissa") && textodois.getText().equals("123")) {
            MenuOpcoes m = new MenuOpcoes();
            m.mostrarMenu();
        } else {
            JOptionPane.showConfirmDialog(null, "Acesso negado");
        }
      
         

    }

    @Override
    public Object getValue(String key) {

        return null;
    }

    @Override
    public void putValue(String key, Object value) {

    }

    @Override
    public void setEnabled(boolean b) {
    }

    @Override
    public boolean isEnabled() {

        return false;
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {

    }

}