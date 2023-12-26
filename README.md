# KotlinWithSpringboot
Kotlin with Spring Boot web application & JUnit5

#### 1. Setting Up a Spring Boot Project
You can use Spring Initializer to set up a new project. Visit https://start.spring.io/ and fill in the necessary details:

- Project: Gradle Project or Maven Project
- Language: Kotlin
- Spring Boot: Latest stable version
- Project Metadata: Group, Artifact, Name, Description, etc.

Click "Generate" to download the project zip file.

#### 2. Extract and Open the Project

Extract the downloaded zip file and open the project in your preferred Kotlin IDE. If you're using IntelliJ IDEA, it has excellent support for Kotlin.

#### 3. Create a Kotlin Data Class

Create a data class to represent your model. In `src/main/kotlin/com/example/demo/model`, create a file named `Book.kt`:

```
package com.example.demo.model

data class Book(val id: Long, val title: String, val author: String)
```
#### 4. Create a Controller

Create a controller to handle HTTP requests. In `src/main/kotlin/com/example/demo/controller`, create a file named `BookController.kt`

```
package com.example.demo.controller

import com.example.demo.model.Book
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/books")
class BookController {

    private val books = mutableListOf<Book>()

    @GetMapping
    fun getAllBooks(): List<Book> {
        return books
    }

    @GetMapping("/{id}")
    fun getBookById(@PathVariable id: Long): Book? {
        return books.find { it.id == id }
    }

    @PostMapping
    fun addBook(@RequestBody book: Book): Book {
        books.add(book)
        return book
    }

    @PutMapping("/{id}")
    fun updateBook(@PathVariable id: Long, @RequestBody updatedBook: Book): Book? {
        val index = books.indexOfFirst { it.id == id }
        if (index != -1) {
            books[index] = updatedBook
            return updatedBook
        }
        return null
    }

    @DeleteMapping("/{id}")
    fun deleteBook(@PathVariable id: Long): Boolean {
        return books.removeIf { it.id == id }
    }
}
```
#### 5. Run the Application

Run your Spring Boot application. If you're using IntelliJ IDEA, you can run the DemoApplication class.

#### 6. Test the API

You can test your API using tools like Insomnia, Postman, or a web browser.

- To get all books: `GET http://localhost:8080/api/books`
- To add a book: `POST http://localhost:8080/api/books` with a JSON payload.
- To update a book: `PUT http://localhost:8080/api/books/{id}` with a JSON payload.
- To delete a book: `DELETE http://localhost:8080/api/books/{id}`
