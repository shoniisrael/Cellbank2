package cellbank;
import java.io.*;
import java.util.*;

public class Sistema2 {
   Cuenta a = new Cuenta();
Vector vec=new Vector();
String nombres="";
int cuenta;
public void guardar(int cuenta, float saldo,String fecha,float valor,String descrip) {
    
    a=new Cuenta(cuenta,saldo,fecha,valor,descrip);   // nuevo objeto que deseo almacenar en el fichero
     File fc=new File("registro2.bin");
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
    }
public String imprimirRegistro (int numcuenta) {
    nombres="";
    int numcuent=numcuenta;
                File fc=new File("registro2.bin");
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
                Cuenta aux=new Cuenta();
                for(int i=0;i<vec.size();i++){
                    
                    aux=(Cuenta)vec.get(i);
                   if(aux.cuenta==numcuent){
                          nombres=nombres.concat(aux.fecha);
                           nombres=nombres.concat("\n \t");
                           nombres=nombres.concat(aux.descrip);
                           nombres=nombres.concat("\t");
                           nombres=nombres.concat(String.valueOf(aux.valor));
                           nombres=nombres.concat("\t");
                           nombres=nombres.concat(String.valueOf(aux.saldo));
                           nombres=nombres.concat("\n \n \n");
                   }
                    
                }
                 return (nombres);
    }



public Float get_Saldo (int numcuenta) {
                File fc=new File("registro2.bin");
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
                Cuenta aux=new Cuenta();
                for(int i=0;i<vec.size();i++){
                    aux=(Cuenta)vec.get(i);
                    if(aux.cuenta==numcuenta){
                           return(aux.saldo);
                    }
                   
                }
                System.out.println("Error obteniendo el Saldo de la cuenta ");
                float cero=0;
                 return (cero);
    }

//public int Posicion() {
//        int posicion=0;
//                File fc=new File("registro2.bin");
//                FileInputStream fi;
//                ObjectInputStream ob;
//                Vector vec=new Vector();
//                try{
//                    fi=new FileInputStream(fc);
//                    ob=new ObjectInputStream(fi);
//                    vec=(Vector)ob.readObject();
//                    ob.close();
//                    fi.close();
//                }catch(IOException | ClassNotFoundException ex3){
//                    System.out.println("***** al parecer algo no a salido bien, estamos esperimentando ciertas dificultades al asignar un numero de cuenta***");
//                   
//                }
//                Cuenta aux=new Cuenta();
//                for(int i=0;i<vec.size();i++){
//                     posicion++;
//                }    
//                 return (posicion);
//    }



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

}
