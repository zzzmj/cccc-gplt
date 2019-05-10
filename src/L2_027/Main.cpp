#include<cstdio>
#include<iostream>
#include<algorithm>
#include<map>
#include<set>
using namespace std;
struct stu {
    string name;
    int score;
};

int cmp (stu a, stu b) {
    if (a.score > b.score) return 1;
    else if (a.score == b.score && a.name < b.name) return 1;
    return 0;
}

int main() {
    int n, g, k;
    stu st[10005];
    cin >> n >> g >> k;
    int sum = 0;
    for (int i = 0; i < n; i++) {
        int score;
        string s;
        cin >> s >> score;
        st[i].name = s;
        st[i].score = score;
        if (score >= g) sum += 50;
        else if (score >= 60) sum += 20;
    }
    sort(st, st+n, cmp);
    cout << sum << endl;
    int i = 0;
    int rank = 1;
    while(rank <= k) {
        int cnt = 1;
        while(i+1 < n && st[i].score == st[i+1].score) {
            cout << rank << " " << st[i].name << " " << st[i].score << endl;
            i++;
            cnt++;
        }
        cout << rank << " " << st[i].name << " " << st[i].score << endl;
        i++;
        rank += cnt;
    }
}