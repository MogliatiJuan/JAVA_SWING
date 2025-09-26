package controlador;

import modelo.Producto;
import java.io.*;
import java.util.*;

public class ProductoController {

    public List<Producto> cargar(File archivo) {
        List<Producto> lista = new ArrayList<>();
        if (archivo == null) {
            return lista;
        }

        try {
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                String nombre = sc.nextLine();
                if (!sc.hasNextLine()) {
                    break;
                }
                String desc = sc.nextLine();
                if (!sc.hasNextLine()) {
                    break;
                }
                String precio = sc.nextLine();
                lista.add(new Producto(nombre, desc, precio));
            }
            sc.close();
        } catch (Exception e) {
            lista.clear();
            System.out.println(e);
        }
        return lista;
    }

    public boolean guardar(File archivo, List<Producto> productos) {
        if (archivo == null) {
            return false;
        }

        try {
            FileWriter fw = new FileWriter(archivo);
            for (Producto p : productos) {
                fw.write(p.getNombre() + "\n");
                fw.write(p.getDescripcion() + "\n");
                fw.write(p.getPrecio() + "\n");
            }
            fw.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
