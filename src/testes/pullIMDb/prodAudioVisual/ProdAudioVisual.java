package testes.pullIMDb.prodAudioVisual;
//O código de verdade vai ser acoplado aqui

public class ProdAudioVisual {
    private String year, runtime, type;

    public String getYear() {
        return year;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ProdAudioVisual{" +
                "year='" + year + '\'' +
                ", runtime='" + runtime + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
