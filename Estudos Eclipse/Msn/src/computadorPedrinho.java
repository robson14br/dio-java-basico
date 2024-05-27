public class computadorPedrinho {

    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem(); 

        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem(); 

        Telegram teleg = new Telegram();
        teleg.enviarMensagem();
        teleg.receberMensagem(); 
    }
}