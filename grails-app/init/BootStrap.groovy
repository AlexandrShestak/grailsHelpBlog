import helpblog.com.shestakam.News

class BootStrap {

    def init = { servletContext ->
        if (!News.count()) {
            new News(newsText: "tratatatata",creatorUsername: "admin",creationDate: "12-12-15").save(failOnError: true)
        }
    }
    def destroy = {
    }
}
