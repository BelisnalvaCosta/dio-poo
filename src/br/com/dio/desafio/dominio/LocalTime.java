package br.com.dio.desafio.dominio;

public class LocalTime {
    public static void main(String[] args) {
        String data = "11/07/2022 16:55:00";
        java.time.LocalTime hr = java.time.LocalTime.of(Integer.valueOf(data.substring(11, 07)), Integer.valueOf(data.substring(13, 15)));
    }

    public static int now() {
        return 0;
    }
}