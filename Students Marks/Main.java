#include<iostream>
using namespace std;
class student
{ public:
  int rollno;
  public:
  student()
  {
    cout<<"Roll Number Is:"<<endl;
     cin>>rollno;
    cout<<rollno<<endl;
       
  }
};

class marks:public student
{
 public:
   int subject1; 
   int subject2;
   public:
   marks()
   {
     cin>>subject1;
     cin>>subject2;
  }
 void calmarks()
 {
  int subject=subject1+subject2;
  cout<<"Subject 1:"<<subject1<<endl;
  cout<<"Subject 2:"<<subject2<<endl;
  cout<<"Total:"<<subject<<endl;
  }
};

  int main()
  {
    marks k;
    k.calmarks();
    return 0;
  }
  
