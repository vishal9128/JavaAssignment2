
class HillStation{
    void location(){
        System.out.println("Location : Hill stations");
    }
    void famousFor(){
        System.out.println("Famous For : Hill Beauty");
    }
}

class Manali extends HillStation{
    @Override
    void location(){
        System.out.println("Location : Manali, UttraKhand");
    }

    @Override
    void famousFor(){
        System.out.println("Famous For : Mountain and their beauty");
    }
}

class Mussoorie extends HillStation{
    @Override
    void location(){
        System.out.println("Location : Mussoorie, UttaraKhand");
    }
    @Override
    void famousFor(){
        System.out.println("Famous For : Mountain and their Beauty");
    }
}

class Gulmarg extends HillStation{
    @Override
    void location(){
        System.out.println("Location : Gulmarg, Small country");
    }
    @Override
    void famousFor(){
        System.out.println("Famous For : Hilly Area ");
    }
}

public class Station {
    public static void main(String[] args) {
        HillStation h = new HillStation();
        h.location();
        h.famousFor();

        Manali m = new Manali();
        m.location();
        m.famousFor();

        Mussoorie mu = new Mussoorie();
        mu.location();
        mu.famousFor();

        Gulmarg g = new Gulmarg();
        g.location();
        g.famousFor();
    }
}
