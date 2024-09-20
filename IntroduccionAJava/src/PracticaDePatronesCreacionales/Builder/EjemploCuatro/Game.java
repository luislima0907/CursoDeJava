package PracticaDePatronesCreacionales.Builder.EjemploCuatro;

public class Game {
    private String equipoLocal;
    private String equipoRival;
    private String division;
    private String clima;
    private String estadio;

    public static Builder builder(){
        return new Builder();
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoRival() {
        return equipoRival;
    }

    public void setEquipoRival(String equipoRival) {
        this.equipoRival = equipoRival;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        return "Game{" +
                "equipoLocal='" + equipoLocal + '\'' +
                ", equipoRival='" + equipoRival + '\'' +
                ", division='" + division + '\'' +
                ", clima='" + clima + '\'' +
                ", estadio='" + estadio + '\'' +
                '}';
    }

    public static class Builder {
        private Game game;

        public Builder() {
            game = new Game();
        }

        public Builder equipoLocal(String equipoLocal) {
            this.game.equipoLocal = equipoLocal;
            return this;
        }
        public Builder equipoRival(String equipoRival) {
            this.game.equipoRival = equipoRival;
            return this;
        }
        public Builder division(String division) {
            this.game.division = division;
            return this;
        }
        public Builder clima(String clima) {
            this.game.clima = clima;
            return this;
        }
        public Builder estadio(String estadio) {
            this.game.estadio = estadio;
            return this;
        }
        public Game build() {
            return this.game;
        }
    }
}
