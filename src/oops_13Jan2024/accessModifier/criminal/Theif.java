package src.oops_13Jan2024.accessModifier.criminal;

import src.oops_13Jan2024.accessModifier.police.Cop;

public class Theif {
    public static void main(String[] args) {

        Cop cop = new Cop(10);
        System.out.println(cop.gun);
        //cop.canIShoot();
        //He is not in the Protect Police folder


    }
}
