package com.example.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MainController {
@Autowired
private BookRepo repo;


@PostMapping("/addbook")
public String saveBook(@RequestBody Book book)
{
repo.save(book);
return "Added Successfully";
}

@GetMapping("/findAllBooks")
public List<Book>getBooks()

{

return repo.findAll();
}

@DeleteMapping("/delete/{id}")
public String deleteBook(@PathVariable int id)
{
repo.deleteById(id);
return"deleted Successfully";
}
@PutMapping("" + "")
public String updateBook(@RequestBody Book book)
{
	repo.save(book);
	return"update Sucessfully";
}
}

