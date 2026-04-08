#include <iostream>
using namespace std;

int main() {
    string s = "Hello World";

    // Creating a temporary reversed string
  	// and assigning it to the s
    s = string(s.rbegin(), s.rend());
    
  	cout << s;
    return 0;
}