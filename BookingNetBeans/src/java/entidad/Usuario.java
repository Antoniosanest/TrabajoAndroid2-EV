package entidad;

import java.util.ArrayList;

public class Usuario {
    // ATRIBUTES
    private  int idUsuario;
    private String nombre;
    private String apellido;
    private String cumple;
    private String correo;
    private String contraseña;
    
    // CONSTRUCTOR

    public Usuario(int idUsuario, String nombre, String apellido, String cumple,String correo, String contraseña) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cumple = cumple;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public Usuario() {
      
    }

   
    
    // GETTERS/SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCumple() {
        return cumple;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

  
 public static String fromArrayListToJson(ArrayList<Usuario> lstUsuario) {
        String resp = "[";
        for (Usuario Usuario : lstUsuario) {
            resp += "{"
                    + "\"ID_Usuario\" :\"" + Usuario.getIdUsuario()+ "\", "
                    + "\"NOMBRE\" :\"" + Usuario.getNombre()+ "\", "
                    + "\"APELLIDO\" :\"" + Usuario.getApellido()+ "\", "
                    + "\"CUMPLE\" :\"" + Usuario.getCumple()+ "\", "
                    +"\"CORREO\" :\"" + Usuario.getCorreo()+ "\", "
                    + "\"CONTRASEÑAS\" : \"" + Usuario.getContraseña()+ "\"}";
            resp += ",";
        }
        resp = resp.substring(0, resp.length() - 1);
        resp += "]";
        return resp;
    }

    
}
