class BFG {
    private int ammo = 1000;
    private int damage = 50;
    private String name = "BFG";

    public BFG(int ammo, int damage, String name){
        this.ammo = ammo;
        this.damage = damage;
        this.name = name;
    }
    public BFG(int ammo, int damage){
        this.ammo = ammo;
        this.damage = damage;
    }
    public BFG(int ammo){
        this.ammo = ammo;
    }
    public BFG(){
    }

    public int getAmmo() {
        return ammo;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name + ", ammo: " + ammo + ", damage: " + damage;
    }
}
class BfgTest {
    public static void main(String[] args) {
        //ExtraGun, ammo: 10000, damage: 300
        System.out.println(new BFG(10000, 300, "ExtraGun"));

        //BFG, ammo: 5000, damage: 200
        System.out.println(new BFG(5000, 200));

        //BFG, ammo: 2000, damage: 50
        System.out.println(new BFG(2000));

        //BFG, ammo: 1000, damage: 50
        System.out.println(new BFG());

    }
}