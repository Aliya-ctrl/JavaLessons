public class Dog {
    //типо статы песиля
 private    String name;
   private int weight;
    private String color;
    private String height;
    // то что может собакен
    public void AllData(String name,int weight,String color,String height){
        setName(name);
        setWeight(weight);
        setColor(color);
        setHeight(height);
    }
    public String getALL_DAta(){return getName()+getWeight()+getColor()+getHeight() ;}
// задаем имя и вес
    public void setName(String names) {
        this.name = names;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }
}
