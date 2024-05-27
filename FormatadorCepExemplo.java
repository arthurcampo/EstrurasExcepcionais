public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch(CepInvalidoExcepition e){
           System.out.println("Cep nao corresponde com as regras de negocios");
        }    
    }
    static String formatarCep(String cep) throws CepInvalidoExcepition{
        if(cep.length() !=8)
            throw new CepInvalidoExcepition();


            return "23.765-064";
    }
}
