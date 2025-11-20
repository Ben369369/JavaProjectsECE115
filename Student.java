class Student {
    public String name;
    private int age;
    private String major;
    private String college;
    private double GPA;
    public void setName(String name) {
        this.name = name;}
    public String getName() {
        return name;}
    public int getAge() {
        return age;}
    public String getMajor() {
        return major;}
    public String getCollege() {
        return college;}
    public double getGPA() {
        return GPA;}
    public Student(String name,int age,String major,String college,double GPA){
        this.name=name;
        this.age=age;
        this.major=major;
        this.college=college;
        this.GPA=GPA;}
    public static void main(String[] args){
        Student puid1=new Student("Benedict Ngetich",20,"ECE","NCW",4.0);    
 
        System.out.println(puid1.getGPA());
    }

}
