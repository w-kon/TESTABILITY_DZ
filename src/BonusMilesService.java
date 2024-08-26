public class BonusMilesService {
    public int calculate(int price){
        int oneMile = 20;
        int bonusMiles;
        bonusMiles = price / oneMile;
        return bonusMiles;

    }
}
