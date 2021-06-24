package book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    @Autowired
    BookStorage storage;

    @GetMapping(value = "/book")
    public String BookForm(Model model) {
        model.addAttribute("div", storage.isEmpty());
        model.addAttribute("books", storage.get());
        return "book";
    }

    @GetMapping("/book/add")
    public String BookAdd(Model model) {
        model.addAttribute("book", new newBook("","",""));
        return "add";
    }

    @PostMapping("/book/add")
    public String BookAdd(@ModelAttribute newBook books, Model model) {
        model.addAttribute("book", books);
        storage.add(books.getName(), books.getAuthor(), books.getSize());
        return "add";
    }

    @RequestMapping("/book/delete")
    public String BookDelete(@RequestParam(value = "name", required = false, defaultValue = "0") String name, Model model) {
        model.addAttribute("books", storage.get());
        storage.removeByName(name);
        return "delete";
    }
}
