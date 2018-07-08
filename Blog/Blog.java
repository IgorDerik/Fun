package Blog;

import java.util.*;

public class Blog {

    private List<BlogPost> mPosts;

    public Blog(List<BlogPost> posts) {
        mPosts = posts;
    }

    public List<BlogPost> getPosts() {
        return mPosts;
    }

    public Map<String, Integer> getCategoryCounts() {

        Map<String, Integer> res = new HashMap<>();

        for(BlogPost post : mPosts) {
            String cat = post.getCategory();

            if( res.containsKey(cat) ) {
                int value = res.get(cat);
                res.put(cat, ++value);
            }
            else {
                res.put(cat,1);
            }
        }

        return res;
    }

    public Set<String> getAllAuthors() {

        Set<String> authors = new TreeSet<>();
        for ( BlogPost post : mPosts) {
            authors.add( post.getAuthor() );
        }
        return authors;

//        return mPosts.stream().map(BlogPost::getAuthor).collect(Collectors.toSet());
    }

}
