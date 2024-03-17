public class Media {
   private int quantmin;

   private int quantmax;
     private int quanttotal;


    public void setQuantmin(int quantmin) {
        this.quantmin = quantmin;
    }


    public void setQuantmax(int quantmax) {
        this.quantmax = quantmax;
    }

    public int mediatotal(){
        int Mediatotal = (quantmax + quantmin)/2;
        return Mediatotal;
    }

    public void setQuanttotal(int quanttotal) {
        this.quanttotal = quanttotal;
    }

    public int getQuanttotal() {
        int quantidade =  quanttotal;

        if (quanttotal >= mediatotal()){
            System.out.println("Não efetuar compra!");
            System.out.println("media do estoque:"+mediatotal());

        }else {
            System.out.println("Pode efetuar a compra!");
            System.out.println("media do estoque:"+mediatotal());
        }
        return quantidade;


}
}

