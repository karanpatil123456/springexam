package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok. NoArgsConstructor;

@Data

@NoArgsConstructor

@AllArgsConstructor

@Document(collection="Book")

public class Book {

@Id

private int id;

private String bookName;

private String authorName;

public Book()
{

}

public Book(int id, String bookName, String authorName)
{
	super();
	this.id=id;
	this.bookName=bookName;
	this.authorName=authorName;
}
public int getid() {
	return id;
}
public void setid(int id) {this.id=id;
}
public String getBookName() {return bookName;
}
public void setBookName(String bookName) {this.bookName=bookName;
}
public String getAuthorName() {return authorName;
}
public void setAutoName(String autorName) {this.authorName = authorName;
}

}
