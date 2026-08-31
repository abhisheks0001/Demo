#include <iostream>
using namespace std;
class Data
{
private:
    int data1, data2;

public:
    void setData(int, int);
    void getData();
};
int main()
{
    int a = 10, b = 20;
    Data object;
    object.setData(a, b);
    object.getData();
    return 0;
}
void Data::setData(int value1, int value2)
{
    data1 = value1;
    data2 = value2;
}
void Data ::getData()
{
    cout << "Data 1: " << data1 << endl;
    cout << "Data 2: " << data2 << endl;
}
