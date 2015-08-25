package helpblog.com.shestakam

import java.sql.Timestamp

class News {

    static constraints = {
    }
    String newsText
    Timestamp creationDate
    String creatorUsername

   /* private String tagsString;
    private User creator;
    private Set<Tag> tagSet = new HashSet<>(0);
    private Set<Comments> commentsSet = new HashSet<>(0);*/
}
