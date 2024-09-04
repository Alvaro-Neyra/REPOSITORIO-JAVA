package Colores;

import Colores.enums.Color;
import Colores.modelos.ConvertidorColor;

public class Application {
    public static void main(String[] args) {
        String[] valoresHex = {"#FF0000", "#00FF00", "#FFFF00", "#0000FF", "#FFFFFF"};

        for (String valorHex : valoresHex) {
            Color color = ConvertidorColor.convertirHexadecimal(valorHex);
            if (color != null) {
                System.out.println(valorHex + " es el color " + color.name());
            } else {
                System.out.println(valorHex + " No es un color primario");
            }
        }
    }
}
