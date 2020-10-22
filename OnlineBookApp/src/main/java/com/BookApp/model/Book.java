package com.BookApp.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Book {
String author;
String category;
Integer bookId;
String title;
double price;

}
