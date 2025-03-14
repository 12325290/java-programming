

class StudentToString {
    String name;
    int age;
    String rollNumber;
    String house;

    public StudentToString(String name,int age,String rollNumber,String house){
        this.name=name;
        this.age=age;
        this.rollNumber=rollNumber;
        this.house=house;
    }

    @Override
    public String toString() {
        return "Student Details:{name:" + name 
        + ",age:" + age 
        + ",roll Number:" + rollNumber 
        +",house:" + house +" }";
    }

    public static void main(String[] args) {
        StudentToString stu = new StudentToString("amit",12,"2","delhi");
        System.out.print(stu);

    }
}

  

    

