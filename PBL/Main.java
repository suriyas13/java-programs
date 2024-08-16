class Author {
    String name;
    String email;
    String gender;

    public Author(String n, String e, String g) {
        name = n;
        email = e;
        gender = g;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String g) {
        gender = g;
    }

    @Override
    public String toString() {
        return "Author{Name:" + name + " Email:" + email + " Gender:" + gender + "}";
    }
}

class Book {
    String bname;
    Author author;
    double price;
    int stock;

    public Book(String n, Author a, double p, int s) {
        bname = n;
        author = a;
        price = p;
        stock = s;
    }

    public String getName() {
        return bname;
    }

    public void setName(String n) {
        bname = n;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author a) {
        author = a;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int s) {
        stock = s;
    }

    @Override
    public String toString() {
        return "Book{BookName:" + bname + " Author:" + author + " Price:" + price + "Stock:" + stock + "}";
    }
}

class Main {
    public static void main(String[] args) {
        Author b1 = new Author("suriya", "suriya@gmail.com", "male");
        Book b = new Book("MASTER", b1, 1000, 4);
        System.out.println(b);
    }
}