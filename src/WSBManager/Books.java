/*
 * Patryk
 */

package WSBManager;

public class Books {
	public class Zamiana {
		 
		 public int zamianZcharNaInt(int liczba3) {
			 int liczba4 = 0;
			 switch(liczba3) {
			 case 48:
			 {
				liczba4 = 0;
				break;
			 }
			 case 49:
			 {
				liczba4 = 1;
				break;
			 }
			 case 50:
			 {
				liczba4 = 2;
				break;
			 }
			 case 51:
			 {
				liczba4 = 3;
				break;
			 }
			 case 52:
			 {
				liczba4 = 4;
				break;
			 }
			 case 53:
			 {
				liczba4 = 5;
				break;
			 }
			 case 54:
			 {
				liczba4 = 6;
				break;
			 }
			 case 55:
			 {
				liczba4 = 7;
				break;
			 }
			 case 56:
			 {
				liczba4 = 8;
				break;
			 }
			 case 57:
			 {
				liczba4 = 9;
				break;
			 }
				 
			 }
			 return liczba4;
		 }
		 
	 }
	Zamiana p = new Zamiana();
	
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
	 
	 private String bookName, bookCover, bookType, bookIsbn;
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
	 public void setBookIsbn(String bookIsbn) {   
		 this.bookIsbn = bookIsbn;
	 	 }
	 public boolean checkIsbn(String bookIsbnToCheck) {
		 int prefiksEANspr1 = p.zamianZcharNaInt(bookIsbnToCheck.charAt(0));
		 int prefiksEANspr2 = p.zamianZcharNaInt(bookIsbnToCheck.charAt(1));
		 int prefiksEANspr3 = p.zamianZcharNaInt(bookIsbnToCheck.charAt(2));
		 int dlugoscIsbn = bookIsbnToCheck.length();
		 
		 int reszta_z_dzielenia = (p.zamianZcharNaInt(bookIsbnToCheck.charAt(0))*1)+(p.zamianZcharNaInt(bookIsbnToCheck.charAt(1))*3)+(p.zamianZcharNaInt(bookIsbnToCheck.charAt(2))*1)+
				 (p.zamianZcharNaInt(bookIsbnToCheck.charAt(3))*3)+
				 (p.zamianZcharNaInt(bookIsbnToCheck.charAt(4))*1)+
				 (p.zamianZcharNaInt(bookIsbnToCheck.charAt(5))*3)+
				 (p.zamianZcharNaInt(bookIsbnToCheck.charAt(6))*1)+
				 (p.zamianZcharNaInt(bookIsbnToCheck.charAt(7))*3)+
				 (p.zamianZcharNaInt(bookIsbnToCheck.charAt(8))*1)+
				 (p.zamianZcharNaInt(bookIsbnToCheck.charAt(9))*3)+
				 (p.zamianZcharNaInt(bookIsbnToCheck.charAt(10))*1)+
				 (p.zamianZcharNaInt(bookIsbnToCheck.charAt(11))*3);
		 int reszta = reszta_z_dzielenia%10;
		 int znakKontrolny = 10 - reszta;
		 if (znakKontrolny == 10) {
			 znakKontrolny = 0;
		 }
		
		return (dlugoscIsbn == 13 && p.zamianZcharNaInt(bookIsbnToCheck.charAt(12))==znakKontrolny && prefiksEANspr1 == 9 && prefiksEANspr2 == 7 && prefiksEANspr3 == 8 || prefiksEANspr3 == 9);
		
	 }
	
	 public String getBookIsbn() {
			 return bookIsbn;
		 }
	 public void setBookRelaseDate(int day, int month, int year) {   
		 bookRelaseDate.setDate(day, month, year);
	 	 }
	 public String getBookRelaseDate() {
			 return bookRelaseDate.getDate();
		 }
	 @Override
	 public String toString() {
		return bookName+" "+bookCover+" "+bookIsbn+" "+bookType;
	 }
}
