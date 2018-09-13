package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Principal {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				
		Comment c11 = new Comment("Have a nice trip.");
		Comment c12 = new Comment("WOW...That is awesomwe!!!");
		Comment c21 = new Comment("Good Night");
		Comment c22 = new Comment("May the FORCE be with you");
				
		Date data = sdf.parse("21/06/2018 13:05:44");
		String title = "Travelling to New Zeland";
		String content = "I'm going to visit this wonderful country!";
		int likes = 12;
		Post post1 = new Post(data, title, content, likes);
		post1.addComment(c11);
		post1.addComment(c12);
		System.out.println(post1);
		
		data = sdf.parse("28/07/2018 23:14:19");
		title = "Good night guys";
		content = "See you tomorrow";
		likes = 5;
		Post post2 = new Post(data, title, content, likes);
		post2.addComment(c21);
		post2.addComment(c22);
		System.out.println(post2);
				
	}

}
