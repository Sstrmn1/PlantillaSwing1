package practicaswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        // Opcional: Configura el aspecto de la interfaz Swing (LookAndFeel)
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Muestra la ventana principal
//        mostrarVentanaPrincipal();
        mostrarVentana1();
        mostrarPanelIntro();
        mostrarDialogo(3020);
    }

    public static void mostrarVentana1() {
        NewJFrame1 frame = new NewJFrame1();
        // Ajusta el comportamiento de cierre de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centra la ventana en la pantalla
        frame.setLocationRelativeTo(null);

        // Muestra la ventana
        frame.setVisible(true);
    }

    // Método para mostrar la ventana principal
    public static void mostrarVentanaPrincipal() {
        // Crea una instancia de NewJFrame
        NewJFrame frame = new NewJFrame();

        // Ajusta el comportamiento de cierre de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centra la ventana en la pantalla
        frame.setLocationRelativeTo(null);

        // Muestra la ventana
        frame.setVisible(true);
    }

    // Método para mostrar el diálogo
    public static void mostrarDialogo(int tiempoApertura) {
        // Crea una instancia de NewJDialog11
        // Crea una instancia de NewJDialog1 con un Frame null y modal
        NewJDialog1 dialog = new NewJDialog1(null, true);

        // Ajusta el comportamiento de cierre del diálogo (puedes configurarlo según tus necesidades)
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        // Centra el diálogo en la pantalla
        dialog.setLocationRelativeTo(null);

        // Hace que el diálogo sea modal (bloquea la ventana principal hasta que se cierre)
        dialog.setModal(true);

        // Configura el tiempo en milisegundos antes de que el diálogo se abra automáticamente (3 segundos en este caso)
//        int tiempoApertura = 3000;
        // Crea un temporizador para abrir el diálogo después de 3 segundos
        Timer timer = new Timer(tiempoApertura, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true); // Abre el diálogo
            }
        });

        // Inicia el temporizador
        timer.setRepeats(false); // No se repite después de que se dispare una vez
        timer.start();
    }

    public static void mostrarPanelIntro() {
        JFrame frame = new JFrame("Panel de Introducción");

        // Crea una instancia de NewJPanel
        NewJPanel panel = new NewJPanel();

        // Agrega el panel al JFrame
        frame.add(panel);

        // Configura el comportamiento de cierre del JFrame
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.setUndecorated(true); // Oculta la barra de título

        // Configura el tiempo en milisegundos antes de que el marco se cierre automáticamente (2 segundos en este caso)
        int tiempoCierre = 3000;

        // Crea un temporizador para cerrar el marco después de 2 segundos
        Timer timer = new Timer(tiempoCierre, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Cierra el marco
            }
        });

        // Inicia el temporizador
        timer.setRepeats(false); // No se repite después de que se dispare una vez
        timer.start();

        // Ajusta el tamaño del JFrame según el contenido del panel
        frame.pack();

        // Centra el JFrame en la pantalla
        frame.setLocationRelativeTo(null);

        // Muestra el JFrame
        frame.setVisible(true);

    }

}
