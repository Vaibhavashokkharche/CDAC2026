#include <iostream>
using namespace std;
#include <iostream>
using namespace std;

int main() {
    int n = 4; // This is the middle number (the widest point)

    // --- TOP HALF (Rows 1 to 4) ---
    for (int i = 1; i <= n; i++) {
        
        // 1. Print spaces to center the numbers
        for (int j = 1; j <= n - i; j++) {
            cout << " ";
        }

        // 2. Print increasing numbers (e.g., 1, 2, 3)
        for (int j = 1; j <= i; j++) {
            cout << j;
        }

        // 3. Print decreasing numbers (e.g., 2, 1)
        for (int j = i - 1; j >= 1; j--) {
            cout << j;
        }

        // Move to the next line
        cout << endl;
    }

    // --- BOTTOM HALF (Rows 3 down to 1) ---
    for (int i = n - 1; i >= 1; i--) {
        
        // 1. Print spaces
        for (int j = 1; j <= n - i; j++) {
            cout << " ";
        }

        // 2. Print increasing numbers
        for (int j = 1; j <= i; j++) {
            cout << j;
        }

        // 3. Print decreasing numbers
        for (int j = i - 1; j >= 1; j--) {
            cout << j;
        }

        // Move to the next line
        cout << endl;
    }

    return 0;
}
