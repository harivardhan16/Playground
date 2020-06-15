#include<iostream>
#include<bits/stdc++.h> 

using namespace std;
int main()
{
  float pa;
  float r;
  int y;
  cin>>pa>>r>>y;
   float si=(pa*r*y)/100;
  float ta=pa+si;
  cout<< fixed << setprecision(2)<<si<<endl;
  cout<< fixed << setprecision(2)<< pa+si<<endl;
  cout<<si*2/100<<endl;
  cout<< fixed << setprecision(2)<<pa+si*98/100<<endl;
  return 0;
  //Type your code here.
}