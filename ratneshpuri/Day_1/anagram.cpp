#include <iostream>
using namespace std;

int Length(char A[]){
  int i;
  for(i=0;A[i]!='\0';i++){
  }
  return i;
}

int main() {
  char A[]="medical";
  char B[]="decimal";
  int H[26]={0},i,length_a,length_b;

  length_a=Length(A);
  length_b=Length(B);
  
  if(length_a==length_b){
  for(i=0;A[i]!='\0';i++){
    H[A[i]-97]++;
  }

  for(i=0;B[i]!='\0';i++ ){
    H[B[i]-97]--;
    if(H[B[i]-97]<0){
      cout<<"Not Anagram"<<endl;
      break;
    }
  }
  if(B[i]=='\0'){
    cout<<"Anagram"<<endl;
  }
  }
  else{
    cout<<"Not Anargam"<<endl;
    }
  return 0;
} 
