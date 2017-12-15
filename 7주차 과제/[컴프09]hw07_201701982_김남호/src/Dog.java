public class Dog {
   private String name;
   public static String breed;
   private int age;

   public Dog(String name, int age){
      setDog(name, "닥스 훈트", age);
   }
   public Dog(String name, String breed, int age){
      setDog(name, breed, age);
   }
   private void setDog(String name, String breed, int age){
      this.name = name;
      this.breed = breed;
      this.age = age;
   }
   public void print(){
      System.out.println("강아지의 이름은 " + name+",강아지의 종은 "+breed+", 강아지의 나이는 "+age);
   }
}

