public class Jogo {
 
    private char[][] tabuleiro;

    public void iniciar() {
        tabuleiro = new char[8][8];
        //....
    }
    
    private void colocarTesouro() {
        int linha = (int) (Math.random() * 8);
        int coluna = (int) (Math.random() * 8);
        //Colocar o tesouro na casa certa - linha e coluna
    }

    //private ....
}
