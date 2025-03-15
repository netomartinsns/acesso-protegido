package codigo27;

public abstract class Pessoa {
    private String identificador;

    protected abstract boolean atualizarID ( String identificador );
    protected String recuperarID ( ){
        return this.identificador;
    }

}
