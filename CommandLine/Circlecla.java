class Circle{
    public static void main(String args[]){
       float rad=Float.parseFloat(args[0]);
       float pi=22/7;
       float area=pi*rad*rad;
       float peri=2*pi*rad;
       System.out.println("Area="+area);
       System.out.println("Perimeter="+peri);
      }
}