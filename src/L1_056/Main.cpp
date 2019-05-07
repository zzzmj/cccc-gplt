#include<set>
#include<cmath>
#include<iostream>
#include<cstring>
#include<cstdio>
using namespace std;
int main() {
    int n;
    cin >> n;
    string name[105];
    fill(name, name+105, "");
    double sum = 0;
    for (int i = 0; i < n; i++) {
        string v;
        int k;
        cin >> v >> k;
        name[k] = v;
        sum += k;
    }
    
    sum = sum / (2*n);
    
    double min = 1000;
    string res = "";
    for (int i = 0; i < 105; i++) {
        if (name[i] != "") {
            double t = fabs(i - sum);
            if (t < min) {
                res = name[i];
                min = t;
            }
        }
    }
    cout << (int)sum << " " << res;
} 