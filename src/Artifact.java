public class Artifact {
    String name;
    int year;
    static int count=0;
    public Artifact(){
        count++;
    }
    public Artifact(String name){
        this.name=name;
        count++;
    }

    public Artifact(String name, int year){
        this.name=name;
        this.year=year;
        count++;
    }

    public static void main(String[]agrs){

        Artifact artifact=new Artifact();
        System.out.println(count);
        Artifact artifact1=new Artifact("Runa");
        System.out.println(artifact1.name + count);
        Artifact artifact2=new Artifact("Iron",5);
        System.out.println(artifact2.name + artifact2.year + count);


    }
}
