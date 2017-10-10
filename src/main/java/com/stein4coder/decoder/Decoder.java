/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stein4coder.decoder;

import java.util.Arrays;

/**
 *
 * @author General Steinacoz
 */
public class Decoder implements DecodeInterface{
    
    StringBuilder sb = new StringBuilder();
    private String a0001 = "A", b0012 = "B", c0123 = "C", d1234 = "D", e1230 = "E";
    private String space = " ";
    private String[] outputs;
    
    @Override
    public StringBuilder StringDecode(String input) {
        
    outputs = input.split("(?<=\\G....)");
    
    for(String letter:outputs){
        System.out.println(letter);
        
        if(letter.equals("2424")){
            sb.append(space);
        }
        if(letter.equals("0001")){
            sb.append(a0001);
        }
        if(letter.equals("0012")){
            sb.append(b0012);
        }
        if(letter.equals("0123")){
            sb.append(c0123);
        }
        if(letter.equals("1234")){
            sb.append(d1234);
        }
        if(letter.equals("1230")){
            sb.append(e1230);
        }
    }
        return sb;
    }
    
}
