public class Humano {
    /**
     * Atributo que representa a idade do humano.
     */
    private int idade;

    /**
     * Método que simula a ação de andar.
     * @return uma string indicando que o humano está andando.
     */
    public String andar() {
        return "andando...";
    }

    /**
     * Define a idade do humano.
     * @param idade a idade a ser definida.
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Obtém a idade do humano.
     * @return a idade do humano.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Verifica se o humano tem vontade de ir ao banheiro.
     * @param resposta indica se o humano quer ir ao banheiro (true) ou não (false).
     * @return uma mensagem recomendando ir ou não ao banheiro.
     */
    public String vontadeDeIrBanheiro(boolean resposta) {
        if(resposta) {
            return "va ao banheiro";
        } else {
            return "nao va ao banheiro";
        }
    }
}
