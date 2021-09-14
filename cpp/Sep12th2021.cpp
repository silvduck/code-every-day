#include <iostream>
#include <vector>
using namespace std;

// 1. Find the last element of a list
int myLast(vector<int> list) {
  return list[list.size() - 1];
}

int main() {
  vector<int> list = {1,2,3,4};
    cout << myLast(list) << endl;
}
