public class Plane {
   private String company, model, max;
   private static int planes = 0;
   
   public String getCompany(){ return company; }
   public void setCompany(String c){ company = c; }
   public String getModel(){ return model; }
   public void setModel(String m){ model = m; } 
   public String getMaximum(){ return max; }
   public void setMaximum(String m){ max = m; }
   
   public Plane(){
      company = "Boeing";
      model = "787";
      max = "210";
      planes++;
   }
   public Plane(String company, String model, String maximum){
      setPlanes(company, model, maximum);
      planes++;
   }
   public Plane(String max){
      setPlanes("Boeing", "787", max);
      planes++;
   }
   private void setPlanes(String company, String model, String max) {
      this.company = company;
      this.model = model;
      this.max = max;
   }
   public static int getPlanes(){
      return planes;
   }
   public void print(){
      System.out.println("ºñÇà±â Á¦ÀÛ»ç : " + company);
      System.out.println("¸ðµ¨: " + model);
      System.out.println("ÃÖ´ë ½Â°´ ¼ö : " + max);
   }
}