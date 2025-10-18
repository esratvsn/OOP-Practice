
public class Main {
    public static void main(String[] args) {
       Post post=new Post("asd","KARABUK","ANKARA");

       PostOffice KARABUKPO=new PostOffice("Karabuk p.o");
       PostOffice ISTANBULPO=new PostOffice("İstanbul p.o");


       KARABUKPO.send(post);
       ISTANBULPO.receive(post);
    }
}