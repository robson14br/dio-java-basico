public class FormatadorEx {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("35591157");
            System.out.println(cepFormatado);
        } catch (formatarCep e) {
            System.out.println("O cep nao corresponde com as regras de");
        }
     }
        static String formatarCep(String cep) throws formatarCep{
            if(cep.length() != 8)
              throw new formatarCep();
            
              //simulando um cep formatado
              return "23.765-064";
        
    }
}
