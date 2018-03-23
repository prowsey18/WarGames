public class Health extends Collectable
{
    private final int modID = 1;
    private final int modQty = 3;
    
    public Health()
    {
        super();
    }
    
    public int getModID(){return modID;}
    
    public int getModQty(){return modQty;}
    
    public String getSymbol(){
        return("\uD83D\uDC89");
    }
}