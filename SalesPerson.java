public class SalesPerson {
    private String id;

    private Sales[] salesHistory;

    private int count = 0;






    public SalesPerson(String id){


        this.id = id;
        this.salesHistory = new Sales[100];

    }





    public SalesPerson(String id, Sales[] s, int c){


        this.id = id;
        this.salesHistory = s;
        this.count = c;

    }

    public SalesPerson() {

    }

    public Sales getSalesHistory(int i) {
        return this.salesHistory[i];

    }

    public int getCount(){return count;}

    public String getId() {return id;}

    public void setSalesHistory(Sales s){

        salesHistory[count] = s;

        count = count +1;

    }



    public double calcTotalSales(){



        double total = 0;

        for(int i = 0; i<count; i++){
            total+=salesHistory[i].getValue() * salesHistory[i].getQuantity();
        }
        return total;

    }



    public Sales largestSale(){


        Sales highest = null;
        for(int i = 0; i<count; i++){
            if(salesHistory[i].getValue()*salesHistory[i].getQuantity() > highest.getValue()*highest.getQuantity()){
                highest = salesHistory[i];
            }
        }
        return highest;
    }



}