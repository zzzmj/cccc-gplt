#include<set>
#include<iostream>
#include<cstring>
#include<cstdio>
using namespace std;
int s[1005];
int main() {
    string a, b;
    getline(cin, a);
    getline(cin, b);

    int lena = a.length();
    int lenb = b.length();
    for (int i = 0; i < lenb; i++) {
        s[b[i]] = 1;
    }
    
    for (int i = 0; i < lena; i++) {
        if (s[a[i]] == 0) {
            printf("%c", a[i]);
        }
    }
    printf("\n");
} 