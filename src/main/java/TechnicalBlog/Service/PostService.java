package TechnicalBlog.Service;

import TechnicalBlog.Model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {

    public PostService() {
        System.out.println("*** Post Service ***");
    }

    public ArrayList<Post> getAllPosts() {
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setBody("Post 1 body");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("Post 2 body");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post 3");
        post3.setBody("Post 3 body");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;
    }

    public ArrayList<Post> getOnePost() {
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("This is your post");
        post1.setBody("This is your post. it has some valid content");
        post1.setDate(new Date());

        posts.add(post1);

        return posts;
    }

    public void createPost(Post newPost) {

    }
}
