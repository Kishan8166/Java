Question: You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.

Input Format:

The first line will have an integer n denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.

After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.

Constraints: A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.

1<=n<=100000

1<=Query<=100000

Output Format:

For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number. See sample output for the exact format.

To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or write completely on your own.

Sample Input:

3

uncle sam

99912222

tom

11122222

harry

12299933

uncle sam

uncle tom

harry

Sample Output:

uncle sam=99912222

Not found

harry=12299933

Test Case 0

Input (stdin)

3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

Your Output (stdout)
uncle sam=99912222
Not found
harry=12299933

Expected Output

uncle sam=99912222
Not found
harry=12299933

Test Case 1

Compiler Message
Success
Input (stdin)

100000
unayk lejwm
53561825
ahiff
57272140
frlre cdfxo
28001354
aeccx yrbek
21112785
mlgdk
12405837
iyiyy cfngr
23841264
subnw vrqdp
77688226
vhypd qfbdy
67846211
lcnbh
86026675
lxbjp muhis{-truncated-}

Expected Output

Not found
ipwpa bdefa=14170412
Not found
toykm viqbo=11872347
mooet ebtqt=70658483
fbuba wkkhq=10613664
Not found
ejqxn=77321147
Not found
Not found
Not found
Not found
xgfpx=58118174
Not found
odacd dldrk=73267266
Not found
iakxu gylkc=41875647
Not found
djtel ththc=20278224
Not found{-truncated-}