package menza;

/**
 * Created by Student on 6/28/2017.
 */
public class Ital extends Termek
{
    private boolean alcoholic;
    public static int alcoholicd,nonalcoholic;

    public Ital(String a, String b, int c,String s)
    {
        super(a, b, c);
        if("alkoholos".equals(s))
        {
            alcoholic=true;
            alcoholicd++;
        }
        else if("mentes".equals(s))
        {
            alcoholic=false;
            nonalcoholic++;
        }
        else
        {
            System.out.println("???");
        }
    }
}

