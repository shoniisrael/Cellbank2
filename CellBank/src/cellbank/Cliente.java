package cellbank;

import java.io.Serializable;

public class Cliente implements Serializable{
    String nombre,password,telefono;
    int tipo,banco,cuenta;
public Cliente(){
    
}
    public Cliente(String nombre, String password, String telefono, int tipo, int banco,int cuenta) {
        this.nombre = nombre;
        this.password = password;
        this.telefono = telefono;
        this.tipo = tipo;
        this.banco = banco;
        this.cuenta=cuenta;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }
    
    
    
}
