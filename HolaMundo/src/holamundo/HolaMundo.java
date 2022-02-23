package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("hola mundo");

        Persona per1 = new Persona();
        per1.setNombre("Alexys SG");
        System.out.println("Nombre: " + per1.getNombre());
        per1.comer("Hamburguesa hawaiana");
        
        Persona per2 = new Persona();
        per2.setNombre("Felipe");
        per2.comer("Pizza hawaiana");
        System.out.println("Nombre per 2:" + per2.getNombre());
        
        Automovil bocho=new Automovil();
            System.out.println("El automovil es un: Bocho");
        bocho.setMarca("VW");
            System.out.println("Marca " + bocho.getMarca() );
        bocho.setSubMarca("Sedan");
                System.out.println("SubMarca "+bocho.getSubMarca() );
        bocho.setModelo(1970);
            System.out.println("Modelo: "+bocho.getModelo() );
        bocho.setColor(Color.blue);
            System.out.println("Color: "+ bocho.getColor() );
        
            Automovil mustang=new Automovil();
        System.out.println("El automovil es un: Mustang");
        mustang.setMarca("Ford");
        System.out.println("Marca " + mustang.getMarca() );
        mustang.setSubMarca("Mustan");
                System.out.println("SubMarca "+mustang.getSubMarca() );
        mustang.setModelo(1970);
            System.out.println("Modelo: "+mustang.getModelo() );
        mustang.setColor(Color.yellow);
            System.out.println("Color: "+ mustang.getColor() );        
            
                        Automovil akura=new Automovil();
        System.out.println("El automovil es un: Akura");
        akura.setMarca("Akura");
        System.out.println("Marca " + akura.getMarca() );
        akura.setSubMarca("NSX");
                System.out.println("SubMarca "+akura.getSubMarca() );
        akura.setModelo(2013);
            System.out.println("Modelo: "+akura.getModelo() );
        akura.setColor(Color.gray);
            System.out.println("Color: "+ akura.getColor() );
    }

}