package ernest;

import java.util.*;

public class Ernest {

    public static Scanner in = new Scanner(System.in).useDelimiter("\n");
    public static int id, option, choose;
    public static String rid, btitle, bauthor, bgenre, bstatus, options;
    private static List<Library> bookList = new ArrayList<>();
    private static Set<BookID> bookID = new HashSet<>();
    // Add new book method para dani ta mag store og mga value satong mga input og output sa mga books
    // Lahi ni sya sa Addnewbooktolibrary na method kay output nani sya ga based which is mao ni atong
    // kibali ga stored og value

    private static void AddNewBook(Library library) {
        bookList.add(library);
    }
    // Existing book method para naa tay given na book daan sa system

    public static void Existingbooks() {
        Library library1 = new Library(1, "Math", "Albert Einstein", "Education", "Available");
        Library library2 = new Library(2, "English", "William Shakespeare", "Education", "Available");
        Library library3 = new Library(3, "Science", "Isaac Newton", "Formula", "Available");
        Library library4 = new Library(4, "Noli Me Tangere", "Jose Rizal", "Novel", "Available");
        Library library5 = new Library(5, "Data Structure", "LordNeil Actub", "Education", "Available");
        Library library6 = new Library(6, "One Piece", "Eiichiro Oda", "Fiction, Supernatural, Adventure", "Available");
        Library library7 = new Library(7, "Naruto", "Masashi Kishimoto", "Fiction, Superpowers, Drama", "Available");
        Library library8 = new Library(8, "Bleach", "Tite Kubo", "Supernatural, Fiction", "Available");
        Library library9 = new Library(9, "Chainsaw Man", "Tatsuki Fujimoto", "Fiction, Superpowers", "Available");
        Library library10 = new Library(10, "Attack On Titan", "Hajime Isayama", "Fiction, Horror, Drama ", "Available");
        Library library11 = new Library(11, "History", "Emilio Aguinaldo", "Education", "Available");
        Library library12 = new Library(12, "Calculus", "James Stewart", "Education", "Available");
        Library library13 = new Library(13, "Biology", "H.G Wells", "Education", "Available");
        Library library14 = new Library(14, "The Bible", "Moses", "History", "Available");
        Library library15 = new Library(15, "Frankenstein", "Mary Shelley", "Horror", "Available");
        Library library16 = new Library(16, "Dracula", "Bram Stoker", "Horror", "Available");
        Library library17 = new Library(17, "IT", "Stephen King", "Horror", "Available");
        Library library18 = new Library(18, "Ring", "Koji Suzuki", "Horror", "Available");
        Library library19 = new Library(19, "The Exorcist", "William Blatty", "Horror", "Available");
        Library library20 = new Library(20, "Black Clover", "Yuki Tabata", "Magic, Fiction", "Available");
        bookList.add(library1);
        bookList.add(library2);
        bookList.add(library3);
        bookList.add(library4);
        bookList.add(library5);
        bookList.add(library6);
        bookList.add(library7);
        bookList.add(library8);
        bookList.add(library9);
        bookList.add(library10);
        bookList.add(library11);
        bookList.add(library12);
        bookList.add(library13);
        bookList.add(library14);
        bookList.add(library15);
        bookList.add(library16);
        bookList.add(library17);
        bookList.add(library18);
        bookList.add(library19);
        bookList.add(library20);
        BookID bid1 = new BookID(1);
        BookID bid2 = new BookID(2);
        BookID bid3 = new BookID(3);
        BookID bid4 = new BookID(4);
        BookID bid5 = new BookID(5);
        BookID bid6 = new BookID(6);
        BookID bid7 = new BookID(7);
        BookID bid8 = new BookID(8);
        BookID bid9 = new BookID(9);
        BookID bid10 = new BookID(10);
        BookID bid11 = new BookID(11);
        BookID bid12 = new BookID(12);
        BookID bid13 = new BookID(13);
        BookID bid14 = new BookID(14);
        BookID bid15 = new BookID(15);
        BookID bid16 = new BookID(16);
        BookID bid17 = new BookID(17);
        BookID bid18 = new BookID(18);
        BookID bid19 = new BookID(19);
        BookID bid20 = new BookID(20);
        bookID.add(bid1);
        bookID.add(bid2);
        bookID.add(bid3);
        bookID.add(bid4);
        bookID.add(bid5);
        bookID.add(bid6);
        bookID.add(bid7);
        bookID.add(bid8);
        bookID.add(bid9);
        bookID.add(bid10);
        bookID.add(bid11);
        bookID.add(bid12);
        bookID.add(bid13);
        bookID.add(bid14);
        bookID.add(bid15);
        bookID.add(bid16);
        bookID.add(bid17);
        bookID.add(bid18);
        bookID.add(bid19);
        bookID.add(bid20);
    }
    // Search book method
    // Para i search nato mga books individually through entering or input the id

    private static void SearchBookByID(int id) {
        for (Library library : bookList) {
            if (library.getfbid() == id) {
                System.out.println("\n========RESULT========");
                System.out.println("Book ID: " + library.getfbid());
                System.out.println("Book Title: " + library.getbtitle());
                System.out.println("Book Author: " + library.getbauthor());
                System.out.println("Book Genre: " + library.getbgenre());
                System.out.println("Book Status: " + library.getbstatus());
                System.out.println();
                mainfunct();
            }
        }
        mainfunct();
    }
    // Remove book method
    // Para i delete nato ang books or i remove sa listahan

    private static void RemoveBookByID(int id) {
        for (BookID bookid : bookID) {
            for (Library library : bookList) {
                if (bookid.getbid() == id && library.getfbid() == id) {
                    bookID.remove(bookid);
                    bookList.remove(library);
                    System.out.println("Book ID: " + id + " Successfully removed/deleted!");
                    mainfunct();
                }
            }
        }
        mainfunct();
    }
    // Show all book method
    // Para makita nato tanan ang books and the status of the book (Available or Not)

    private static void ShowAllBooks() {
        System.out.println("\n========ALL BOOKS========");
        for (Library library : bookList) {
            System.out.println("\nBook ID: " + library.getfbid());
            System.out.println("Book Title: " + library.getbtitle());
            System.out.println("Book Author: " + library.getbauthor());
            System.out.println("Book Genre: " + library.getbgenre());
            System.out.println("Book Status: " + library.getbstatus());
            System.out.println();
        }
        mainfunct();
    }
    // Borrow book method

    private static void BorrowBookByID(int id) {
        for (BookID bookid : bookID) {
            for (Library library : bookList) {
                if (bookid.getbid() == id && library.getfbid() == id) {
                    bstatus = "Borrowed";
                    library.setbstatus(bstatus);
                    System.out.println("Book ID: " + id + " Successfully borrowed!");
                    mainfunct();
                }
            }
        }
        mainfunct();
    }
    // Return book method

    private static void ReturnBookByID(int id) {
        for (BookID bookid : bookID) {
            for (Library library : bookList) {
                if (bookid.getbid() == id && library.getfbid() == id) {
                    bstatus = "Available";
                    library.setbstatus(bstatus);
                    System.out.println("Book ID: " + id + " Successfully returned!");
                    mainfunct();
                }
            }
        }
        mainfunct();
    }
    // Addnewbook method
    // Kani na method is to input sa mga new book na gusto nato i stored which is wa sya nag exixt
    // daan sa books nato
    // Para mo add tag bago na libro

    private static void AddNewBookToLibrary() {
        String chooses;
        System.out.println("\n===============================");
        System.out.println("-Fill up the information needed-");
        System.out.print("Enter Book ID(int/number only): ");
        rid = in.next();
        try {
            id = Integer.parseInt(rid);
        } catch (Exception e) {
            System.out.println("ERROR! Please input a NUMBER!");
            mainfunct();
        }
        for (BookID bookid : bookID) {
            if (bookid.getbid() == id) {
                System.out.println("ID Taken");
                AddNewBookToLibrary();
            }
        }
        System.out.print("Enter Book Title: ");
        btitle = in.next();
        System.out.print("Enter Book Author: ");
        bauthor = in.next();
        System.out.print("Enter Book Genre: ");
        bgenre = in.next();
        System.out.println("BOOK REGISTERED TO THE LIBRARY!");
        System.out.println();
        bstatus = "Available";
        BookID newbookid = new BookID(id);
        Library newlibrary = new Library(id, btitle, bauthor, bgenre, bstatus);
        AddNewBook(newlibrary);
        bookID.add(newbookid);
        System.out.println("Want to add more\n[1] YES [2] Back to menu");
        System.out.print("INPUT HERE (#/int 1 and 2 only): ");
        chooses = in.next();
        try {
            choose = Integer.parseInt(chooses);
            switch (choose) {
                case 1:
                    AddNewBookToLibrary();
                    break;
                case 2:
                    mainfunct();
                    break;
                default:
                    System.out.println("Enter only the given choices!");
                    mainfunct();
                    break;
            }
        } catch (Exception e) {
            System.out.println("ERROR! Please input a NUMBER!");
            mainfunct();
        }
    }
    // mainfuct method to be called at the MAIN METHOD

    private static void mainfunct() {
        System.out.print("WELCOME TO LIBRARY MANAGEMENT");
        System.out.println("\n===============================");
        System.out.println("[1] Add New Books");
        System.out.println("[2] Show All Books");
        System.out.println("[3] Search Book");
        System.out.println("[4] Remove Book");
        System.out.println("[5] Borrow Book");
        System.out.println("[6] Return Books");
        System.out.println("[7] Exit");
        System.out.println("===============================");
        System.out.print("INPUT HERE (NUMBER ONLY!): ");
        options = in.next();
        try {
            option = Integer.parseInt(options);
        } catch (Exception e) {
            System.out.println("Error! Please read and input a number only!");
            mainfunct();
        }
        switch (option) {
            // Add new book option
            case 1:
                AddNewBookToLibrary();
                break;
            // Show All book option
            case 2:
                ShowAllBooks();
                break;
            // Search book option
            case 3:
                System.out.println("Search Book");
                System.out.print("Enter Book ID (int only): ");
                rid = in.next();
                try {
                    id = Integer.parseInt(rid);
                    for (Library cbook : bookList) {
                        if (cbook.getfbid() == id) {
                            SearchBookByID(id);
                        }
                    }
                    System.out.println("Book not found!");
                } catch (Exception e) {
                    System.out.println("ERROR! Please input a NUMBER!");
                }
                mainfunct();
                break;
            // Remove book option
            case 4:
                System.out.println("Remove Book");
                System.out.print("Enter Book ID (int only): ");
                rid = in.next();
                try {
                    id = Integer.parseInt(rid);
                    for (Library cbook : bookList) {
                        if (cbook.getfbid() == id) {
                            RemoveBookByID(id);
                        }
                    }
                    System.out.println("Book already removed/ not found");
                } catch (Exception e) {
                    System.out.println("ERROR! Please input a NUMBER!");
                }                       
                mainfunct();
                break;
            // Return book option
            case 5:
                System.out.println("Borrow Book");
                System.out.print("Enter Book ID (int only): ");
                rid = in.next();
                try {
                    id = Integer.parseInt(rid);
                    for (Library cbook : bookList) {
                        if (cbook.getfbid() == id) {
                            if (cbook.getbstatus().equals("Available")) {
                                BorrowBookByID(id);
                            } else if (cbook.getbstatus().equals("Borrowed")) {
                                System.out.println("Book is already been borrowed");
                            }
                        }
                    }
                    System.out.println("Book Not found!!");
                } catch (Exception e) {
                    System.out.println("ERROR! Please input a NUMBER!");
                }
                mainfunct();
                break;
            // Borrow book option
            case 6:
                System.out.println("Return Book");
                System.out.print("Enter Book ID (int only): ");
                rid = in.next();
                try {
                    id = Integer.parseInt(rid);
                    for (Library cbook : bookList) {
                        if (cbook.getfbid() == id) {
                            if (cbook.getbstatus().equals("Borrowed")) {
                                ReturnBookByID(id);
                            } else if (cbook.getbstatus().equals("Available")) {
                                System.out.println("Book is already returned");
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println("ERROR! Please input a NUMBER!");
                }
                System.out.println("Book Not found!!");
                mainfunct();
                break;
            // System to exit
            case 7:
                System.out.println("THANK YOU! HAVE A GREAT DAY!");
                System.exit(0);
                break;
            default:
                System.out.println("Enter only the given choices to avoid mistake!");
                mainfunct();
                break;
        }
    }
    // MAIN method dani nato tawagon tanan nahitabo sa system from method, class, or inheritance ba na

    public static void main(String[] args) {
        Existingbooks();
        mainfunct();
    }
}
