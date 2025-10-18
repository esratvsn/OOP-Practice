public class PostOffice {
    String name;
    PostOffice(String name){
        this.name=name;
    }
    public void send(Post post){
        System.out.printf("This post %s has been sent by %s to %s %n",
                post.content,
                post.sourceAddress,
                post.targetAddress);
    }
    public void receive(Post post){
        System.out.printf("This post %s has been received by %s to %s %n",
                post.content,
                post.targetAddress,
                post.sourceAddress);
    }
}
