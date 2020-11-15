A dequeue is a double-ended queue, in which the items can be added to or removed from the head or the tail. The dequeue APIs are shown in the below code. Your task is to write the implementation of each function.

For simplicity, we will assume all items stored in the dequeue are integers.

Note: Do not modify the main function.

Note: Do not import (or include) any libraries from Java or C++.

Note: All APIs must be O(1)

Hint: use double linked-list implementation.

Input Format

The first line contains the number of queries.

Each of the following lines contains a query (see the sample test cases).

Constraints

It is guaranteed that the number of queries will not exceed

.

It is guaranteed that all test cases will never cause underflow.

Output Format

The output of each querey (if any).

Sample Input 0

11
addFirst 3
addFirst 7
addLast 4
addLast 2
addFirst 1
addLast 9
removeLast
removeLast
removeFirst
removeFirst
isEmpty

Sample Output 0

9
2
1
7
No

Sample Input 1

7
addLast 6
addLast 7
addFirst 8
removeFirst
removeFirst
removeFirst
isEmpty

Sample Output 1

8
6
7
Yes

