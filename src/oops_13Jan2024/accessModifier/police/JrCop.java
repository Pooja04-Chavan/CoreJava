package src.oops_13Jan2024.accessModifier.police;

import src.oops_13Jan2024.accessModifier.police.Cop;

public class JrCop {
    public static void main(String[] args) {

        Cop jrcop = new Cop(2);
        System.out.println(jrcop.gun);
        jrcop.canIShoot();
    }
}
