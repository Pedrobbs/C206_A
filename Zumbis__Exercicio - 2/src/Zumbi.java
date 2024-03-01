public class Zumbi {

    //o que um zumbi sabe sobre ele
    double vida;
    String nome;

    boolean transferirVida(double quantia, Zumbi outrozumbi) {
        //como fazer
        if(vida > quantia ){
            vida -= quantia;
            outrozumbi.vida += quantia;
            return true;

        }else{
            return false;
        }
    }

}
