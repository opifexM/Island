package com.javarash.utils;

public class Color {
    public String selectColor(ColorCode colorCode) {
        return switch (colorCode) {
            case FONT_BLACK -> "\u001B[38;5;" + 0 + "m";
            case FONT_GRAY -> "\u001B[38;5;" + 240 + "m";
            case FONT_BLUE -> "\u001B[38;5;" + 27 + "m";
            case FONT_GREEN -> "\u001B[38;5;" + 29 + "m";
            case FONT_DARK_GREEN -> "\u001B[38;5;" + 65 + "m";
            case FONT_DARK_RED -> "\u001B[38;5;" + 203 + "m";
            case FONT_DARK_BLUE -> "\u001B[38;5;" + 20 + "m";
            case FONT_DARK_BROWN -> "\u001B[38;5;" + 16 + "m";
            case FONT_VINOUS -> "\u001B[38;5;" + 134 + "m";
            case FONT_AMBER -> "\u001B[38;5;" + 39 + "m";
            case BACK_WHITE -> "\u001B[48;5;" + 15 + "m";
            case BOLD -> "\u001B[1m";
            case RESET -> "\u001B[m";
        };
    }
}
