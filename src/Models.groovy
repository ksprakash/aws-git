class Models {
    String name;
    int age;
    boolean isHuman;

    Models(String name,int age,isHuman){
        this.name=name;
        this.age = age;
        this.isHuman = isHuman;
    }

    String Capitalize(String name){
        return name.capitalize();

    }
    void getAllDetails(){
        echo "My name is ${this.name} and aged ${this.age} and I am human: ${this.isHuman}"
    }
}
