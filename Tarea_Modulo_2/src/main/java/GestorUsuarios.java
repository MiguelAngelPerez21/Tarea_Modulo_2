import javax.swing.*;

public class GestorUsuarios {
    private JPanel panel1;
    private JLabel Titulo;
    private JLabel Icono;
    private JPanel Header;
    private JPanel Navegacion;
    private JButton buttonDashboard;
    private JButton buttonUsuarios;
    private JButton buttonInformes;
    private JButton buttonAjustes;
    private JButton buttonAyuda;
    private JPanel Formulario;
    private JLabel Nombre;
    private JLabel Email;
    private JLabel Rol;
    private JLabel Activo;
    private JLabel Notas;
    private JTextField textFieldNombre;
    private JTextField textFieldEmail;
    private JComboBox comboBoxRol;
    private JCheckBox checkBoxActivo;
    private JTextArea textAreaNotas;
    private JPanel Previsualizacion;
    private JTabbedPane tabbedPaneRyL;
    private JTextArea gestorDeUsuariosTextArea;
    private JList listLogs;
    private JPanel Resumen;
    private JScrollPane JScrollPaneResumen;
    private JPanel Botonera;
    private JButton buttonCancelar;
    private JButton buttonLimpiar;
    private JButton buttonGuardar;

    public GestorUsuarios()
    {
        buttonGuardar.addActionListener(e -> {
            DialogConfirmacion dialog = new DialogConfirmacion();
            dialog.setModal(true);
            dialog.pack();
            dialog.setVisible(true);
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GestorUsuarios");
        frame.setContentPane(new GestorUsuarios().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
