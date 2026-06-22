#include <iostream>
#include <string>
#include <limits> // Required for clearing the input buffer
using namespace std;

class Book {
    int bookId;
    string title;
    string author;
    double price;

public:
    // Function to take input from the user
    void input() {
        cout << "Enter Book ID: ";
        cin >> bookId;
        
        // Use cin.ignore() to clear the newline character before reading strings
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
        
        cout << "Enter Title: ";
        getline(cin, title);
        
        cout << "Enter Author: ";
        getline(cin, author);
        
        cout << "Enter Price: ";
        cin >> price;
        cout << "-----------------------" << endl;
    }

    // Function to display book details
    void display() {
        cout << "ID: " << bookId 
             << " | Title: " << title 
             << " | Author: " << author 
             << " | Price: " << price << endl;
    }
};

int main() {
    // Requirement: Create 4 book objects using an array
    Book books[4];

    cout << "--- Enter Details for 4 Books ---" << endl;
    for (int i = 0; i < 4; i++) {
        cout << "Book " << (i + 1) << ":" << endl;
        books[i].input();
    }

    cout << "\n--- Displaying All Books ---" << endl;
    for (int i = 0; i < 4; i++) {
        books[i].display();
    }

    return 0;
}