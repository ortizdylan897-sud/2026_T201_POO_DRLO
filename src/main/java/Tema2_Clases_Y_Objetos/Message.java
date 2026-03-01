package Tema2_Clases_Y_Objetos;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author Yeimy
 */
public class Message {
    //Metodos
    private String Mensaje;

    public Message(String Mensaje) {
        this.Mensaje = Mensaje;
    }
    private static final Logger LOG = Logger.getLogger(Message.class.getName());

    Message() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMensaje() {
        return Mensaje;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.Mensaje);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Message other = (Message) obj;
        return Objects.equals(this.Mensaje, other.Mensaje);
    }

    @Override
    public String toString() {
        return "Messaje{" + "Mensaje=" + Mensaje + '}';
    }
   
    
}