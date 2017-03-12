package cellbank;
import java.io.*;
import java.util.*;

public class Sistema {
   Cliente a = new Cliente();
Vector vec=new Vector();
String nombres="";
int cuenta;
public int guardar(String nombre, String password, String telefono, int tipo, int banco,int cont) {
    cuenta=Posicion();
    a=new Cliente(nombre,password,telefono,tipo,banco,cuenta);   // nuevo objeto que deseo almacenar en el fichero
     File fc=new File("registro.bin");
    FileOutputStream fo=null;
    ObjectOutputStream ob=null;
     FileInputStream fi=null;
     ObjectInputStream obi=null;
    if(fc.exists()){ // en caso de que el fichero exista cargo la informacion en el vector
        System.out.println("Actualizando información del fichero...");
                try{
                    fi=new FileInputStream(fc);
                    obi=new ObjectInputStream(fi);
                    vec=(Vector)obi.readObject();
                }catch(IOException | ClassNotFoundException ex3){
                    System.out.println("***** al parecer algo no a salido bien***** \n Estamos esperimentando ciertas dificultades técnicas con la lectura de su información");
                }    
        }
    vec.add(a); //añado el objeto al final del vector
        try{
            fo=new FileOutputStream(fc);
            ob=new ObjectOutputStream(fo);
            ob.writeObject(vec);
            
        }catch(Exception ex){
            System.out.println("Existió un problema en el almacenamiento de datos******");
        }finally{
            try{
                if(ob!=null){
                    obi.close();
                     fi.close();
                     ob.close();
                     fo.close();
                     
                }
            }catch(Exception ex2){
                System.out.println("No se pudo cerrar los ficheros correctamente*****");
            }
        }
        return(cont);
    }

public String imprimirRegistro () {
                String bancoycuenta;
                File fc=new File("registro.bin");
                FileInputStream fi;
                ObjectInputStream ob;
                Vector vec=new Vector();
                try{
                    fi=new FileInputStream(fc);
                    ob=new ObjectInputStream(fi);
                    vec=(Vector)ob.readObject();
                    ob.close();
                    fi.close();
                }catch(IOException | ClassNotFoundException ex3){
                    System.out.println("***** al parecer algo no a salido bien, estamos esperimentando ciertas dificultades tecnicas con la lectura de su información");
                }
                Cliente aux=new Cliente();
                for(int i=0;i<vec.size();i++){
                    aux=(Cliente)vec.get(i);
                    bancoycuenta=desencriptarBanco(aux.tipo, aux.banco);
                    nombres=nombres.concat("00");
                    nombres=nombres.concat(String.valueOf((aux.cuenta+1000)));
                    nombres=nombres.concat("   \t ");
                    nombres=nombres.concat(aux.nombre);
                    nombres=nombres.concat("\t");
                    nombres=nombres.concat(bancoycuenta);
                    nombres=nombres.concat("   \n");
                }
                 return (nombres);
    }

public boolean existe_usuario (String nombre) {
                String bancoycuenta;
                File fc=new File("registro.bin");
                FileInputStream fi;
                ObjectInputStream ob;
                Vector vec=new Vector();
                try{
                    fi=new FileInputStream(fc);
                    ob=new ObjectInputStream(fi);
                    vec=(Vector)ob.readObject();
                    ob.close();
                    fi.close();
                }catch(IOException | ClassNotFoundException ex3){
                    System.out.println("***** al parecer algo no a salido bien, estamos esperimentando ciertas dificultades tecnicas con la lectura de su información");
                }
                Cliente aux=new Cliente();
                for(int i=0;i<vec.size();i++){
                    aux=(Cliente)vec.get(i);
                   if(aux.nombre.equals(nombre)){
                       return(true) ;
                   }
               }
                 return (false);
    }

public boolean valida_password (String nombre,String passw) {
                String bancoycuenta;
                File fc=new File("registro.bin");
                FileInputStream fi;
                ObjectInputStream ob;
                Vector vec=new Vector();
                try{
                    fi=new FileInputStream(fc);
                    ob=new ObjectInputStream(fi);
                    vec=(Vector)ob.readObject();
                    ob.close();
                    fi.close();
                }catch(IOException | ClassNotFoundException ex3){
                    System.out.println("***** al parecer algo no a salido bien, estamos esperimentando ciertas dificultades tecnicas con la lectura de su información");
                }
                Cliente aux=new Cliente();
                for(int i=0;i<vec.size();i++){
                    aux=(Cliente)vec.get(i);
                   if(aux.nombre.equals(nombre)){
                         if(aux.password.equals(passw)){
                            return(true) ;
                         }
                   }
               }
                 return (false);
    }

public int get_posicion (String nombre) {
                String bancoycuenta;
                File fc=new File("registro.bin");
                FileInputStream fi;
                ObjectInputStream ob;
                Vector vec=new Vector();
                try{
                    fi=new FileInputStream(fc);
                    ob=new ObjectInputStream(fi);
                    vec=(Vector)ob.readObject();
                    ob.close();
                    fi.close();
                }catch(IOException | ClassNotFoundException ex3){
                    System.out.println("***** al parecer algo no a salido bien, estamos esperimentando ciertas dificultades tecnicas con la lectura de su información");
                }
                Cliente aux=new Cliente();
                for(int i=0;i<vec.size();i++){
                    aux=(Cliente)vec.get(i);
                   if(aux.nombre.equals(nombre)){
                       return(i) ;
                   }
               }
                 return (-1);
    }

public String get_telefono (String nombre) {
                String bancoycuenta;
                File fc=new File("registro.bin");
                FileInputStream fi;
                ObjectInputStream ob;
                Vector vec=new Vector();
                try{
                    fi=new FileInputStream(fc);
                    ob=new ObjectInputStream(fi);
                    vec=(Vector)ob.readObject();
                    ob.close();
                    fi.close();
                }catch(IOException | ClassNotFoundException ex3){
                    System.out.println("***** al parecer algo no a salido bien, estamos esperimentando ciertas dificultades tecnicas con la lectura de su información");
                }
                Cliente aux=new Cliente();
                for(int i=0;i<vec.size();i++){
                    aux=(Cliente)vec.get(i);
                   if(aux.nombre.equals(nombre)){
                       return(aux.telefono) ;
                   }
               }
                 return ("");
    }

public String get_Banco(String nombre) {
                String bancoycuenta;
                File fc=new File("registro.bin");
                FileInputStream fi;
                ObjectInputStream ob;
                Vector vec=new Vector();
                try{
                    fi=new FileInputStream(fc);
                    ob=new ObjectInputStream(fi);
                    vec=(Vector)ob.readObject();
                    ob.close();
                    fi.close();
                }catch(IOException | ClassNotFoundException ex3){
                    System.out.println("***** al parecer algo no a salido bien, estamos esperimentando ciertas dificultades tecnicas con la lectura de su información");
                }
                Cliente aux=new Cliente();
                for(int i=0;i<vec.size();i++){
                    aux=(Cliente)vec.get(i);
                   if(aux.nombre.equals(nombre)){
                       if(aux.banco==1){
                        return("Pichincha");
                    }else if(aux.banco==2){
                        return("Guayaquil");
                    }else{
                       return("Pacífico");
        }
                   }
               }
                 return ("");
    }

public String get_Tipo(String nombre) {
                String bancoycuenta;
                File fc=new File("registro.bin");
                FileInputStream fi;
                ObjectInputStream ob;
                Vector vec=new Vector();
                try{
                    fi=new FileInputStream(fc);
                    ob=new ObjectInputStream(fi);
                    vec=(Vector)ob.readObject();
                    ob.close();
                    fi.close();
                }catch(IOException | ClassNotFoundException ex3){
                    System.out.println("***** al parecer algo no a salido bien, estamos esperimentando ciertas dificultades tecnicas con la lectura de su información");
                }
                Cliente aux=new Cliente();
                for(int i=0;i<vec.size();i++){
                    aux=(Cliente)vec.get(i);
                   if(aux.nombre.equals(nombre)){
                       if(aux.tipo==1){
                        return("De Ahorros");
                    }else{
                       return("Corriente");
                      }
                   }
               }
                return("");
    }

public String desencriptarBanco(int cuenta,int banco){
    String bancos,cuentas,resultado;
    if(banco==1){
                        bancos="Pichincha\t";
                    }else if(banco==2){
                        bancos="Guayaquil\t";
                    }else{
                        bancos="Pacífico\t";
        }
     if(cuenta==1){
                cuentas="Ahorros";
                       
        }else {
                cuentas="Corriente";
        }
     
    return((resultado=bancos.concat(cuentas)));
}

public int Posicion() {
        int posicion=0;
                File fc=new File("registro.bin");
                FileInputStream fi;
                ObjectInputStream ob;
                Vector vec=new Vector();
                try{
                    fi=new FileInputStream(fc);
                    ob=new ObjectInputStream(fi);
                    vec=(Vector)ob.readObject();
                    ob.close();
                    fi.close();
                }catch(IOException | ClassNotFoundException ex3){
                    System.out.println("***** al parecer algo no a salido bien, estamos esperimentando ciertas dificultades al asignar un numero de cuenta***");
                   
                }
                Cliente aux=new Cliente();
                for(int i=0;i<vec.size();i++){
                     posicion++;
                }    
                 return (posicion);
    }

}
