// 
// Need to Pass an Test Case and resolve Segmentation Fault
// 

#include <iostream>
#include <bits/stdc++.h>

using namespace std;

struct node {
    int data;
    struct node *next;
};

struct node *head = NULL, *temp;

void insert (int node_data) {
    struct node * newnode = (struct node *)malloc(sizeof(struct node));
    newnode -> data = node_data;
    if (head == NULL) {
        head = newnode;
    }
    else {
        temp = head;
        while (temp != NULL) {
            temp = temp -> next;
        }
        temp = newnode;
        newnode -> next = NULL;
    }
}

int main () {
    int n, k, node_data;
    cin >> n >> k;
    
    if (n < k) {
        cout << -1;
    }

    else {
        for (int i = 0; i < n; i++) {
            cin >> node_data;
            insert (node_data);
        }

        temp = head;
        for (int i = 0; i < n - k + 1; i++) {
            temp = temp -> next;
        }
        cout << temp -> data;
    }

    return 0;    
}
