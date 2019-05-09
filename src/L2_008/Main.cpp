#include <cstdio>
#include <iostream>
#include <cstring>
#include <vector>
using namespace std;
int main() {
    string s;
    getline(cin, s);
    int len = s.size();
    int max = 1;
    for (int i = 0; i < len; i++) {
        for (int j = i+1; j < len; j++) {
            int left = i, right = j;
            int cnt = 0;
            bool flag = true;
            // 长度的一半
            int q = (j-i+1) / 2; 
            for (int k = i; k <= i+q; k++) {
                if (s[k] != s[j-cnt]) {
                    flag = false;
                }
                cnt++;
            }
            if (flag) {
                if (max < (j-i+1)) {
                    max = j-i+1;
                } 
            }
        }
    }
    printf("%d\n", max);
}