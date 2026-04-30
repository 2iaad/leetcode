#include <iostream>
#include <stack>
#include <string>
using namespace std;

class Solution {
public:
    bool isValid(string s) {
        if (s.length() % 2 != 0)
            return false;

        char c;
        std::stack<char> stack;

        for (int i = 0; i < s.length(); i++)
        { 
            !stack.empty() ? c = stack.top() : c = '\0';
            if ((c == '(' && s[i] == ')') || (c == '[' && s[i] == ']') || (c == '{' && s[i] == '}'))
                stack.pop();
            else
                stack.push(s[i]);
        }
        return stack.empty();
    }
};

int main() {
    std::string str = "([)]";
    Solution obj = Solution();

    obj.isValid(str) ? std::cout << "true\n" : std::cout << "false\n";
}