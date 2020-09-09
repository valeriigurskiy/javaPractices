package javapractice1.FirstTask.Main;

public class Main {
    public static void main(String[] args) {
        Cinderella cinderella1 = new Cinderella("Cinderella", 22, 35, new Prince(35));
        Cinderella cinderella2 = new Cinderella("Cinderella", 22, 32, new Prince(28));
        Cinderella cinderella3 = new Cinderella("Cinderella", 22, 38, new Prince(31));
        Cinderella cinderella4 = new Cinderella("Cinderella", 22, 31, new Prince(31));

        Cinderella cinderellas[] = {cinderella1, cinderella2,cinderella3, cinderella4};

        for(int i = 0; i < cinderellas.length; i++){
            if(cinderellas[i].getFeetSize() == cinderellas[i].getPrince().getShoe()){
                System.out.println("Принц имеет подходящую туфельку для золушки под индексом " + (i+1));
            }
            else{
                System.out.println("Принц не имеет подходящей туфельки для золушки под индексом " + (i+1));
            }
        }
    }
}
