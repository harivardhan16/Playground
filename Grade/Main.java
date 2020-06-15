#include<iostream>
using namespace std;
class studentdetails
{
  public:
  string name;
  int age;
  char gender;
   studentdetails()
   {
     cout<<"Enter student's basic information:"<<endl;
     cout<<"Name: ";
     cout<<endl;
     cin>>name;
     cout<<"Age: ";
     cout<<endl;
     cin>>age;
     cout<<"Gender: ";
     cout<<endl;
     cin>>gender;
     cout<<endl;
   }
};
class marks:public studentdetails
{
 public:
 int tmarks;
 char grade;
 marks()
 {
 cout<<"Enter student's result information:"<<endl;
 cout<<"Total Marks: ";
 cout<<endl;
 cin>>tmarks;
 cout<<"Grade:"<<endl;
 cin>>grade;
 cout<<"Name: "<<name<<endl;
 cout<<"Age: "<<age<<endl;
 cout<<"Gender: "<<gender<<endl;
 cout<<"Total Marks: "<<tmarks<<endl;
 cout<<"Percentage: "<<(tmarks*100)/500<<endl;
 cout<<"Grade: "<<grade<<endl;
 }
 };

int main()
{
  marks k;
  return 0;
}