package tutorial.core.services;

import tutorial.core.models.entities.BlogEntry;

/**
 * Created by basalgin on 11.09.2016.
 */
public interface BlogEntryService {

    public BlogEntry find(Long id);

    public BlogEntry deleteBlogEntry(Long blogEntryId);

    public BlogEntry updateBlogEntry(Long blogEntryId);
}
