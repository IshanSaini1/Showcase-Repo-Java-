package collections.list;

import java.util.LinkedList;
import java.util.function.Supplier;

public class TravellingPlacesChallenge {
    public static void main(String[] args) {

    }

    private Supplier<LinkedList<Places>> initiateList(){
        LinkedList<Places> list = new LinkedList<>();
        Places adelaide = new Places("Adelaide", 1374);
        Places aliceSprings = new Places("Alice Springs", 2771);
        Places brisbane = new Places("Brisbane", 917);


        return ()->list;
    }
}


class Places{
    String town;
    Integer distanceFromSydney;

    public Places(String town, Integer distanceFromSydney){
        this.town = town;
        this.distanceFromSydney = distanceFromSydney;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Integer getDistanceFromSydney() {
        return distanceFromSydney;
    }

    public void setDistanceFromSydney(Integer distanceFromSydney) {
        this.distanceFromSydney = distanceFromSydney;
    }
}
