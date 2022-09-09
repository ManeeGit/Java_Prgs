import allprog.ang;
import allprog.fact;
import allprog.palin;
import allprog.prime;
class allprog
{
    public static void main(String args[])
    {
      ang mb=new ang();
      fact mb1=new fact();
      palin mb2=new palin();
      prime mb3=new prime();
      mb.compute(153);
      mb1.compute1(6);
      mb2.compute2(121);
      mb3.compute3(23);
    }
}