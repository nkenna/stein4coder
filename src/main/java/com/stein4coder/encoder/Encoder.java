/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stein4coder.encoder;

/**
 *
 * @author General Steinacoz
 */
public class Encoder implements EncodeInterface {
    
    /**
     * provide the letters and characters to be encoded
     */
    private String A = "0001", B = "0012", C = "0123", D = "1234", E = "1230", F = "1200";
    private String G = "1000", H = "0000", I = "4321", J = "4320", K = "4310", L = "4300";
    private String M = "4200", N = "4100", O = "4000", P = "3000", Q = "2000", R = "3211";
    private String S = "3210", T = "3200", U = "3100", V = "3300", W = "4444", X = "3333", Y = "2222", Z = "1111";
    private String space = "2424";
    private String a = "1001", b = "1012", c = "1123", d = "2234", e = "2284", f = "2200";
    private String g = "2100", h = "1100", i = "5321", j = "5320", k = "5310", l = "5300";
    private String m = "5200", n = "5100", o = "5001", p = "3001", q = "2011", r = "4212";
    private String s = "4211", t = "4201", u = "4205", v = "4301", w = "5445", x = "4334", y = "3223", z = "2112";
    
    private String one = "1989", two = "1991", three = "2222", four = "3333", five = "4444";
    private String six = "5555", seven = "6666", eight = "7777", nine = "8888", zero = "9999";        
    
    private String fin = "5999", exc = "5988", at = "5977", has = "5966", $ = "5955", perc = "5944";
    private String up = "5933", an = "5922", brao = "5911", brac = "5900", minus = "4990", under = "4880";
    private String eq = "4770", plus = "4660", curlo = "4550", curlc = "4440", sqo = "7321", sqc = "6321";
    private String stad = "5321", rgtb = "4321", lftb = "3321", dbl = "2321", sing = "1321", comma = "9321";
    private String fstop = "8321", grt = "8411", les = "8311", ques = "8211";
    
    
    private int inputLength;
    char[] inputs;
    private StringBuilder sb = new StringBuilder();
    
    private String encodedOutput;

    @Override
    public StringBuilder stringEncode(String input) {
        
        this.inputLength = input.length();
        
        inputs = input.toCharArray();
        
        //System.out.println(this.inputLength);
        // System.out.println(this.inputs.length);
        
        for(char letter:inputs){
            System.out.println(letter);
            
            switch (letter) {
                case ' ':
                    this.sb.append(this.space);
                    break;
                case 'A':
                    this.sb.append(this.A);
                    break;
                case 'B':
                    this.sb.append(this.B);
                    break;
                case 'C':
                    this.sb.append(this.C);
                    break;
                case 'D':
                    this.sb.append(this.D);
                    break;
                case 'E':
                    this.sb.append(this.E);
                    break;
                case 'F':
                    this.sb.append(this.F);
                    break;
                case 'G':
                    this.sb.append(this.G);
                    break;
                case 'H':
                    this.sb.append(this.H);
                    break;
                case 'I':
                    this.sb.append(this.I);
                    break;
                case 'J':
                    this.sb.append(this.J);
                    break;
                case 'K':
                    this.sb.append(this.K);
                    break;
                case 'L':
                    this.sb.append(this.L);
                    break;
                case 'M':
                    this.sb.append(this.M);
                    break;
                case 'N':
                    this.sb.append(this.N);
                    break;
                case 'O':
                    this.sb.append(this.O);
                    break;
                case 'P':
                    this.sb.append(this.P);
                    break;
                case 'Q':
                    this.sb.append(this.Q);
                    break;
                case 'R':
                    this.sb.append(this.R);
                    break;
                case 'S':
                    this.sb.append(this.S);
                    break;
                case 'T':
                    this.sb.append(this.T);
                    break;
                case 'U':
                    this.sb.append(this.U);
                    break;
                case 'V':
                    this.sb.append(this.V);
                    break;
                case 'W':
                    this.sb.append(this.W);
                    break;
                case 'X':
                    this.sb.append(this.X);
                    break;
                case 'Y':
                    this.sb.append(this.Y);
                    break;
                case 'Z':
                    this.sb.append(this.Z);
                    break;
                case 'a':
                    this.sb.append(this.a);
                    break;
                case 'b':
                    this.sb.append(this.b);
                    break;
                case 'c':
                    this.sb.append(this.c);
                    break;
                case 'd':
                    this.sb.append(this.d);
                    break;
                case 'e':
                    this.sb.append(this.e);
                    break;
                case 'f':
                    this.sb.append(this.f);
                    break;
                case 'g':
                    this.sb.append(this.g);
                    break;
                case 'h':
                    this.sb.append(this.h);
                    break;
                case 'i':
                    this.sb.append(this.i);
                    break;
                case 'j':
                    this.sb.append(this.j);
                    break;
                case 'k':
                    this.sb.append(this.k);
                    break;
                case 'l':
                    this.sb.append(this.l);
                    break;
                case 'm':
                    this.sb.append(this.m);
                    break;
                case 'n':
                    this.sb.append(this.n);
                    break;
                case 'o':
                    this.sb.append(this.o);
                    break;
                case 'p':
                    this.sb.append(this.p);
                    break;
                case 'r':
                    this.sb.append(this.r);
                    break;
                case 's':
                    this.sb.append(this.s);
                    break;
                case 't':
                    this.sb.append(this.t);
                    break;
                case 'u':
                    this.sb.append(this.u);
                    break;
                case 'v':
                    this.sb.append(this.v);
                    break;
                case 'w':
                    this.sb.append(this.w);
                    break;
                case 'x':
                    this.sb.append(this.x);
                    break;
                case 'y':
                    this.sb.append(this.y);
                    break;
                case 'z':
                    this.sb.append(this.z);
                    break;
                case 'q':
                    this.sb.append(this.q);
                    break;
                case '0':
                    this.sb.append(this.zero);
                    break;
                case '1':
                    this.sb.append(this.one);
                    break;
                case '2':
                    this.sb.append(this.two);
                    break;
                case '3':
                    this.sb.append(this.three);
                    break;
                case '4':
                    this.sb.append(this.four);
                    break;
                case '5':
                    this.sb.append(this.five);
                    break;
                case '6':
                    this.sb.append(this.six);
                    break;
                case '7':
                    this.sb.append(this.seven);
                    break;
                case '8':
                    this.sb.append(this.eight);
                    break;
                case '9':
                    this.sb.append(this.nine);
                    break;
                case '~':
                    this.sb.append(this.fin);
                    break;
                case '!':
                    this.sb.append(this.exc);
                    break;
                case '@':
                    this.sb.append(this.at);
                    break;
                case '#':
                    this.sb.append(this.has);
                    break;
                case '$':
                    this.sb.append(this.$);
                    break;
                case '%':
                    this.sb.append(this.perc);
                    break;
                case '^':
                    this.sb.append(this.up);
                    break;
                case '&':
                    this.sb.append(this.an);
                    break;
                case '(':
                    this.sb.append(this.brao);
                    break;
                case ')':
                    this.sb.append(this.brac);
                    break;
                case '-':
                    this.sb.append(this.minus);
                    break;
                case '_':
                    this.sb.append(this.under);
                    break;
                case '=':
                    this.sb.append(this.eq);
                    break;
                case '+':
                    this.sb.append(this.plus);
                    break;
                case '{':
                    this.sb.append(this.curlo);
                    break;
                case '}':
                    this.sb.append(this.curlc);
                    break;
                case '|':
                    this.sb.append(this.sing);
                    break;
                case ',':
                    this.sb.append(this.comma);
                    break;
                case '.':
                    this.sb.append(this.fstop);
                    break;
                case '<':
                    this.sb.append(this.les);
                    break;
                case '>':
                    this.sb.append(this.grt);
                    break;
                case '?':
                    this.sb.append(this.ques);
                    break;
                case '[':
                    this.sb.append(this.sqo);
                    break;
                case ']':
                    this.sb.append(this.sqc);
                    break;
                case '/':
                    this.sb.append(this.rgtb);
                    break;
                case '\\':
                    this.sb.append(this.lftb);
                    break;
                 case '"':
                    this.sb.append(this.dbl);
                    break;
                default:
                    break;
            }
        }
        
        return sb;
    }
    
    
}
