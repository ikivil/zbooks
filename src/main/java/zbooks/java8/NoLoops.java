package zbooks.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
/**
 * Java 8 循环过滤的新方式
 * @author K
 *
 */
public class NoLoops {
	//JavaBean
	class Article{
		private String title;
	    private String author;
	    private List<String> tags;
	   
	    public Article() {
			super();
		}
		public Article(String title, String author, List<String> tags) {
			super();
			this.title = title;
			this.author = author;
			this.tags = tags;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public void setTags(List<String> tags) {
			this.tags = tags;
		}
		public String getTitle() {
	        return title;
	    }
	    public String getAuthor() {
	        return author;
	    }
	    public List<String> getTags() {
	        return tags;
	    }
		@Override
		public String toString() {
			return "Article [title=" + title + ", author=" + author + ", tags=" + tags + "]";
		}
	}
	//Test Main
	public static void main(String[] args) {
		NoLoops nl = new NoLoops();
		List<Article> articles = nl.getData();
		//Article article = nl.getFirstJavaArticle(articles);//Test 1
		Optional<Article> article8 =nl.getFirstJavaArticle8(articles);//Test 2
		System.out.println(article8.get());
	}
	//Test Data
	public List<Article> getData(){
		Article article = new Article();
			article.setTitle("title1");
			article.setAuthor("ljw1");
				List<String> tags = new ArrayList<String>();
				tags.add("Java");
				tags.add("泛型");
			article.setTags(tags);
		List<Article> articles = new ArrayList<Article>();
			articles.add(article);
		return articles;
	}
	
	//Java7
	public Article getFirstJavaArticle(List<Article> articles) {
	    for (Article article : articles) {
	        if (article.getTags().contains("Java")) {
	            return article;
	        }
	    }
	    return null;
	}
	//Java8
	public Optional<Article> getFirstJavaArticle8(List<Article> articles) {  
	    return articles.stream()
	        .filter(article -> article.getTags().contains("Java"))
	        .findFirst();
	}
	
	//Java7
	public List<Article> getAllJavaArticles(List<Article> articles) {
	    List<Article> result = new ArrayList<>();
	    for (Article article : articles) {
	        if (article.getTags().contains("Java")) {
	            result.add(article);
	        }
	    }
	    return result;
	}
	//Java8
	public List<Article> getAllJavaArticles8(List<Article> articles) {
		return articles.stream()
		        .filter(article -> article.getTags().contains("Java"))
		        .collect(Collectors.toList());
	}
	

}