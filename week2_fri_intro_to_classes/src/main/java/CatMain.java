public class CatMain {
    public static void main(String[] args) {
        CatClass cat = new CatClass("Larry", CatColour.WHITE); //creating a new object named "cat" which is of the class "Cat". Also need to pass 2 arguments through as "Cat" class requires 2 args: name and colour
        System.out.println(cat.getName());
        System.out.println(cat.getColour());
        System.out.println(cat.toString());

    }
}
