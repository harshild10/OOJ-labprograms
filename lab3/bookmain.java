import java.util.Scanner;
class book{
    String author;
    String title;
    String num_pages;
    String price;

    Scanner sc = new Scanner(System.in);

    void getDetails(){
        System.out.println("author");
        author = sc.next();
        System.out.println("booktitle");
        title = sc.next();
        System.out.println("NUM OF PAGES AND PRICE");
        num_pages = sc.next();
        price = sc.next();
        }


    public String toString(){
        return ("AUTHOR :"+author+"\nBOOK title:"+title+"\nPAGES :"+num_pages+"\nPRICE :"+price);
    }

    book(){
       author ="Sanju";
       title =" Me ";
       num_pages ="2785";
       price = "1900";
    }

    void display(){
        System.out.println("AUTHOR :"+author);
        System.out.println("BOOK title :"+title);
        System.out.println("NUM PAGES :"+num_pages);
        System.out.println("PRICE :"+price);
    }

}



class bookMain{
    public static void main(String ss[]){
        Scanner sc = new Scanner(System.in);
        int n;
        book s1 = new book();
        System.out.println("TO SHOW DEFAULT CONSTRUCTOR\n");
        
        s1.display();
        
        System.out.println("\n\nENTER THE NUMBER OF BOOKS ");
        n = sc.nextInt();
       
        book b[] = new book[n];
        for(int i=0;i<n;i++){
            System.out.println("ENTER DETAILS OF BOOK :"+(i+1));
            b[i] = new book();
            b[i].getDetails();
            
        }

        System.out.println("\n\nALL BOOK DETAILS THAT YOU ENTERED\n");
        
        for(int i=0;i<n;i++){
            System.out.println("\n");
            System.out.println("BOOOK :"+(i+1));
            System.out.println(b[i].toString());
        }

    }
}
