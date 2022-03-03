package Ej4;

enum ListaEquipos{ATHLETICCLUB ,ATLETICODEMADRID , OSASUNA, CADIZ, ALAVES, ELCHE,
                  BARCELONA, GETAFE, GRANADA, LEVANTE, RAYOVALLECANO, CELTA, ESPANYOL,
                  MALLORCA, REALBETIS, REALMADRID, REALSOCIEDAD, SEVILLA, VALENCIA,
                  VILLAREAL}

public class LaLiga {
    private int puntos, golesAFavor, golesEnContra, partidosJugados;
    private LaLiga NombreEquipo;

    public LaLiga(){
    golesAFavor=0;
    golesEnContra=0;
    puntos=0;
    partidosJugados=0;
    }

    //Geters y Setters
    public int getPuntos() {return puntos;}

    public void setPuntos(int puntos) {this.puntos = puntos;}

    public int getGolesAFavor() {return golesAFavor;}

    public void setGolesAFavor(int golesAFavor) {this.golesAFavor = golesAFavor;}

    public int getGolesEnContra() {return golesEnContra;}

    public void setGolesEnContra(int golesEnContra) {this.golesEnContra = golesEnContra;}

    public int getPartidosJugados() {return partidosJugados;}

    public void setPartidosJugados(int partidosJugados) {this.partidosJugados = partidosJugados;}

    public LaLiga getNombreEquipo() {return NombreEquipo;}

    public void setNombreEquipo(LaLiga nombreEquipo) {NombreEquipo = nombreEquipo;}

    public static LaLiga[] generarEquipos(){
        final int CANTIDADEQUIPOS=20;
        LaLiga[] Equipos=new LaLiga[CANTIDADEQUIPOS];
        for(int i=0; i< Equipos.length; i++){
            for(ListaEquipos x: ListaEquipos.values()){
                Equipos[i]= new LaLiga();
            }
        }

        return Equipos;
    }

}
