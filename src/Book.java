package WSBManager;

class Book {
	 class Date {
		 
		 private int day, month, year;
		 public	 void setDate(int day, int month, int year) {
			 this.day =  day;
			 this.month = month;
			 this.year = year;
	 		 }
	 	 public String getDate() {
	 			 return (day+"."+month+"."+year);
	 		 }
	 }
	 
	 private String bookName, bookCover, bookType;
	 private int bookIsbn; 
	 private Date bookRelaseDate= new Date();
	 
	 public void setBookName(String bookName) {
		 this.bookName = bookName;
	 	 }
	 public String getBookName() {
			 return bookName;
		 }
	 
	 public void setBookType(String bookType) {
		 this.bookType = bookType;
	 	 }
	 public String getBookType() {
			 return bookType;
		 }
	 
	 public void setBookCover(String bookCover) {   
		 this.bookCover = bookCover;
	 	 }
	 public String getBookCover() {
			 return bookCover;
		 }
	 public void setBookIsbn(int bookIsbn) {   
		 this.bookIsbn = bookIsbn;
	 	 }
	 public int getBookIsbn() {
			 return bookIsbn;
		 }
	 public void setBookRelaseDate(int day, int month, int year) {   
		 bookRelaseDate.setDate(day, month, year);
	 	 }
	 public String getBookRelaseDate() {
			 return bookRelaseDate.getDate();
		 }
	 public String toString(int zamiana) {
		 String zamiana2;
		 zamiana2 = zamiana2+zamiana;
		 return zamiana2;
	 }
}