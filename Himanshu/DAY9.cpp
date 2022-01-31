/**
 * this piece of code is the piece of code that people ususally skip this topic
 * There's nothing that can be declared useless,
 * it could be used-less though, but nothing is useless
 * god bless C++
 */

#include <iostream>
#include <climits>
using namespace std;

// Namespace solve naming issue in multifile code
// you get it, i am a GTA FAN
// but i'am peaceful :) i promise
namespace GTA
{
    string SA = "Ah shit here we go again";
    string VC = "Keep Your Friends Close";
    string G5 = "You forget a thousand things every day, pal. Make sure this is one of 'em.";
    string G6 = "__-_- NOT RELEASED YET :( -_-__";
}
int main()
{
    // TYPEDEF
    // now name can be used as a type
    // typedef AKA type defination
    // typedef <defination> <name>
    typedef string name;
    name username = "Himanshu";

    //ENUMS
    // create a new type that can have ONLY limited values
    // used when all possible values are known
    enum response
    {
        Positive,
        Negative
    };
    response got = Positive;

    if (got == Positive)
    {

        cout << "Positive" << endl;
        cout << "and its value would be " << got << " the count" << endl;
    }
    cout << "lets use namespace GTA" << endl;
    cout << "----------------------" << endl;
    cout << "GTA VC: " << GTA::VC << endl;
    cout << "GTA SA: " << GTA::SA << endl;
    cout << "GTA G5: " << GTA::G5 << endl;
    cout << "GTA G6: " << GTA::G6 << endl;
    return (0);
}
