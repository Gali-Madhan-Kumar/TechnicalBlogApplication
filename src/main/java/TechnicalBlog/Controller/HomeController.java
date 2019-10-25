package TechnicalBlog.Controller;

import TechnicalBlog.Model.Post;
import TechnicalBlog.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    public HomeController() {
        System.out.println("*** Home Controller ***");
    }

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String getAllPosts(Model model) {

        ArrayList<Post> posts = postService.getAllPosts();
        model.addAttribute("posts", posts);

        return "index";

    }
}
