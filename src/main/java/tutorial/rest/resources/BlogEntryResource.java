package tutorial.rest.resources;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by basalgin on 11.09.2016.
 */
public class BlogEntryResource extends ResourceSupport {



    private String title;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}

