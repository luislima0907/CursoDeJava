package PracticaDePatronesCreacionales.Builder.EjemploCuatro;

public final class GameBuilder implements Builder{
//    private String equipoLocal;
//    private String equipoRival;
//    private String division;
//    private String clima;
//    private String estadio;
    private Game game;

    public GameBuilder(){
        this.game = new Game();
    }

    @Override
    public GameBuilder equipoLocal(String equipoLocal) {
        this.game.setEquipoLocal(equipoLocal);
        return this;
    }

    @Override
    public GameBuilder equipoRival(String equipoRival) {
        this.game.setEquipoRival(equipoRival);
        return this;
    }

    @Override
    public GameBuilder division(String division) {
        this.game.setDivision(division);
        return this;
    }

    @Override
    public GameBuilder clima(String clima) {
        this.game.setClima(clima);
        return this;
    }

    @Override
    public GameBuilder estadio(String estadio) {
        this.game.setEstadio(estadio);
        return this;
    }

    public Game build() {
        if (this.game.getEquipoLocal() == null) {
            throw new IllegalArgumentException("El equipoLocal no puede ser nulo");
        }
        if (this.game.getEquipoRival() == null) {
            throw new IllegalArgumentException("El equipoRival no puede ser nulo");
        }
        if (this.game.getDivision() == null) {
            throw new IllegalArgumentException("El division no puede ser nulo");
        }
        if (this.game.getClima() == null) {
            throw new IllegalArgumentException("El clima no puede ser nulo");
        }
        if (this.game.getEstadio() == null) {
            throw new IllegalArgumentException("El estadio no puede ser nulo");
        }
        return this.game;
    }
}
