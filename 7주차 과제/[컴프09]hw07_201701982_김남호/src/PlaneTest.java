public class PlaneTest {
   public static void main(String[] args) {
      Plane p1 = new Plane("Boeing", "787", "210��");
      Plane p2 = new Plane("300��");
      Plane p3 = new Plane();
      
      p1.print();
      p2.print();
      p3.print();
      int n = Plane.getPlanes();
      System.out.println("������ ����� ��  : " + n);

   }

}
