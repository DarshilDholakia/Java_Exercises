public class CatClass {
    private String name;
    private CatColour colour;

    public CatClass(String name,
                    CatColour colour) {
        this.name = name;
        this.colour = colour;
    }

    //Getter
    public String getName() { //String because that is what we get back; method called getName()
        return name; //returns the name property of the class "Cat"
    }

    public CatColour getColour() {
        return colour; //returns the colour property which we set to Colour.WHITE
    }

    @Override
    public String toString() {
        return "Cat {" + "name = " + name + ", colour = " + colour + "}";
    }
}
