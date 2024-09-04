package Colores.enums;

public enum Color {
    ROJO("#FF0000"),
    AMARILLO("#FFFF00"),
    AZUL("#0000FF");

    private String valorHexadecimal;

    // Constructor
    Color(String valorHexadecimal) {
        this.valorHexadecimal = valorHexadecimal;
    }

    public String getColorHexadecimal() {
        return valorHexadecimal;
    }

    public static Color convertirHexadecimal(String valorHexadecimal) {
        for (Color color: Color.values()) {
            if (color.getColorHexadecimal().equals(valorHexadecimal)) {
                return color;
            }
        }
        return null;
    }
}
