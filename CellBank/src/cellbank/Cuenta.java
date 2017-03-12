package cellbank;

import java.io.Serializable;

class Cuenta implements Serializable {
    public int cuenta;
    public float saldo,valor;
    String fecha,descrip;
    public Cuenta() {
    }
    
    public Cuenta(int cuenta, float saldo,String fecha,float valor, String descrip) {
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.valor = valor;
        this.fecha = fecha;
        this.descrip = descrip;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

   
     
}
