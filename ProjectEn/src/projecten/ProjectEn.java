/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecten;

import util.JerseyClient;
import util.JerseyClient2;

/**
 *
 * @author chakk
 */
public class ProjectEn {

    public static void main(String[] args) {
        JerseyClient pro = new JerseyClient();
        JerseyClient2 bnk = new JerseyClient2();
        String x = pro.getJson();
        String y = bnk.getJson();
        System.out.println(x);
        System.out.println(y);
    }
    
}
