public class MinhaClasse {
    
    public static void main (String [] args) {
        String primeiroNome = "Robson";
        String segundoNome = "Dias de Paula";
    
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Ola " + primeiroNome.concat(" ").concat(segundoNome);
    }
}


