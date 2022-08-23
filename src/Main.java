public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(900);
        boss.setDamage(150);
        boss.getWeapon().setWeaponType(WeaponType.AVTOMAT);
        boss.getWeapon().setWeaponName("KALASH");
        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(300);
        skeleton.setDamage(100);
        skeleton.getWeapon().setWeaponType(WeaponType.PISTOLET);
        skeleton.getWeapon().setWeaponName("GLOCK");
        System.out.println(skeleton.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton.setHealth(200);
        skeleton.setDamage(50);
        skeleton.getWeapon().setWeaponType(WeaponType.VINTOVKA);
        skeleton.getWeapon().setWeaponName("Barret");
        System.out.println(skeleton1.printInfo());
    }
}