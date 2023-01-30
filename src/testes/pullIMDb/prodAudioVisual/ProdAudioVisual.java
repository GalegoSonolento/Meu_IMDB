package testes.pullIMDb.prodAudioVisual;
//O código de verdade vai ser acoplado aqui

public class ProdAudioVisual {
    private String Year, Runtime, Type;

    public ProdAudioVisual(String year, String runtime, String type) {
        this.Year = year;
        this.Runtime = runtime;
        this.Type = type;
    }

    public String getYear() {
        return Year;
    }

    public String getRuntime() {
        return Runtime;
    }

    public String getType() {
        return Type;
    }

    @Override
    public String toString() {
        return "ProdAudioVisual{" +
                "year='" + Year + '\'' +
                ", runtime='" + Runtime + '\'' +
                ", type='" + Type + '\'' +
                '}';
    }
}
