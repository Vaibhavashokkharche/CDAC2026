#include <iostream>
using namespace std;

int main() {
    int rows;

    cout << "Enter the number of rows: ";
    cin >> rows;

    for (int i = 0; i < rows; i++) {
        // 1. Print leading spaces for triangular alignment
        for (int space = 1; space <= rows - i; space++) {
            cout << "  ";
        }

        int val = 1; // The first value in every row is always 1
        for (int j = 0; j <= i; j++) {
            cout << val << "   ";

            // 2. Calculate the next value in the row based on the current one
            // Formula: val = val * (row - col) / (col + 1)
            val = val * (i - j) / (j + 1);
        }
        cout << endl;
    }

    return 0;
}