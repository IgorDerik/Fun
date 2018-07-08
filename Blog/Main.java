package Blog;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<BlogPost> posts = new ArrayList<>();

        posts.add( new BlogPost("Derek","Title","Body","Cat",new Date()));
        posts.add( new BlogPost("Sam","Title","Body","Cat",new Date()));
        posts.add( new BlogPost("John","Title","Body","Other",new Date()));
        posts.add( new BlogPost("Mike","Title","Body","Cat",new Date()));
        posts.add( new BlogPost("Monika","Title","Body","Cat",new Date()));
        posts.add( new BlogPost("Jessica","Title","Body","Cat",new Date()));
        posts.add( new BlogPost("Milena","Title","Body","Other",new Date()));
        posts.add( new BlogPost("Roberta","Title","Body","Cat",new Date()));
        posts.add( new BlogPost("Lily","Title","Body","Other",new Date()));

        Blog blog = new Blog(posts);

//        blog.getAllAuthors().forEach(System.out::println);
        blog.getCategoryCounts().forEach( (k,v) -> System.out.println( k + " " + v ) );
    }

}
