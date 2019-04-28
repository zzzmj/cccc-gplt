#include<cstdio>
#include<set>
#include<map>
#include<iostream>
#include<algorithm>
using namespace std;
int main() {
    int n;
    set<string> s;
    cin >> n;
    for (int i = 0; i < n; i++) {
        string t;
        cin >> t;
        s.insert(t);
    }
    int m;
    cin >> m;
    double sum = 0;
    map<string, int> mp;
    for (int i = 0; i < m; i++) {
        int like;
        string t;
        cin >> t >> like;
        mp[t] = like;
        sum += like;
    }
    bool flag = true;
    double avg = sum / m;
    map<string, int>::iterator it;
    for (it = mp.begin(); it != mp.end(); it++) {
        if (it -> second > avg && s.find(it -> first) == s.end()) {
            cout << it -> first << endl;
            flag = false;
        }
    }
    
    if (flag) {
        printf("Bing Mei You\n");
    }
}