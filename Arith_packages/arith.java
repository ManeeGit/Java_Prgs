import arith.add;
import arith.sub;
import arith.mul;
import arith.div;
class arith
{
  public static void main(String args[])
  {
    add m=new add();
    sub b=new sub();
    mul bm=new mul();
    div bm1=new div();
    m.compute(25,50);
    b.compute1(50,20);
    bm.compute2(10,20);
    bm1.compute3(100,5);
  }
}
    