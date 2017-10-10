# stein4coder

I decided to create my own text encoding system in JAVA. It may look trivial but was worth the time. It is still a work in progress.

See Example for Encoder(TestWork.java):
public class TestWork {
    
    public static void main (String args[]){
        Encoder enc = new Encoder();
        
        
        
        System.out.println(enc.stringEncode("SEE JAVA"));
        
        //outputs: 32101230123024244320000133000001
        
        
    }
    
}

See Example for Decoder(TestWork.java):

public class TestWork {
    
    public static void main (String args[]){
        Decoder enc = new Decoder();
        
        
        
        System.out.print(enc.StringDecode("32101230123024244320000133000001"));
        //outputs: SEE JAVA
        
    }
    
}
