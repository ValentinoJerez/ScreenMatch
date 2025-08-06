package com.aluracursos.screenmatch.excepcion;

public class ErrorEnConversionDeDuracionExcepcion extends RuntimeException {
    private String mensaje;

    public ErrorEnConversionDeDuracionExcepcion(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
