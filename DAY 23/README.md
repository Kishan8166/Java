Question:

 In this challenge, we use regular expressions (RegEx) to remove instances of words that are repeated more than once, but retain the first occurrence of any case-insensitive repeated word. For example, the words love and to are repeated in the sentence I love Love to To tO code. Can you complete the code in the editor so it will turn I love Love to To tO code into I love to code?

To solve this challenge, complete the following three lines:

Write a RegEx that will match any repeated word. Complete the second compile argument so that the compiled RegEx is case-insensitive. Write the two necessary arguments for replaceAll such that each repeated word is replaced with the very first instance the word found in the sentence. It must be the exact first occurrence of the word, as the expected output is case-sensitive. Note: This challenge uses a custom checker; you will fail the challenge if you modify anything other than the three locations that the comments direct you to complete. To restore the editor's original stub code, create a new buffer by clicking on the branch icon in the top left of the editor.

Input Format:

The following input is handled for you the given stub code:

The first line contains an integer, , denoting the number of sentences. Each of the n subsequent lines contains a single sentence consisting of English alphabetic letters and whitespace characters.

Constraints:

Each sentence consists of at most 10^4 English alphabetic letters and whitespaces. 1<=n<=100

Output Format

Stub code in the editor prints the sentence modified by the replaceAll line to stdout. The modified string must be a modified version of the initial sentence where all repeat occurrences of each word are removed.

Sample Input

5 Goodbye bye bye world world world Sam went went to to to his business Reya is is the the best player in eye eye game in inthe Hello hello Ab aB Sample Output

Goodbye bye world Sam went to his business Reya is the best player in eye game in inthe Hello Ab

Explanation:

We remove the second occurrence of bye and the second and third occurrences of world from Goodbye bye bye world world world to get Goodbye bye world. We remove the second occurrence of went and the second and third occurrences of to from Sam went went to to to his business to get Sam went to his business. We remove the second occurrence of is, the second occurrence of the, and the second occurrence of eye from Reya is is the the best player in eye eye game to get Reya is the best player in eye game. The sentence in inthe has no repeated words, so we do not modify it. We remove the second occurrence of ab from Hello hello Ab aB to get Hello Ab. It's important to note that our matching is case-insensitive, and we specifically retained the first occurrence of the matched word in our final string. I used this regular expression: "\b(\w+)(?:\W+\1\b)+"

When using this regular expression in Java, we have to "escape" the backslash characters with additional backslashes (as done in the code above).

\w ----> A word character: [a-zA-Z_0-9]
\W ----> A non-word character: [^\w]
\b ----> A word boundary
\1 ----> Matches whatever was matched in the 1st group of parentheses, which in this case is the (\w+)

----> Match whatever it's placed after 1 or more times The \b boundaries are needed for special cases such as "Bob and Andy" (we don't want to match "and" twice). Another special case is "My thesis is great" (we don't want to match "is" twice).
Groups
input = input.replaceAll(m.group(), m.group(1)) The line of code above replaces the entire match with the first group in the match. m.group() is the entire match
m.group(i) is the ith match. So m.group(1) is the 1st match (which is enclosed in the 1st set of parentheses)

The ?: is added to make it a "non-capturing group" (meaning you can't do .group() to get the group), for slightly faster performance.

Test Case 0 
Compiler Message
Success

Input (stdin)
5
1 Goodbye bye bye world world world
2 Sam went went to to to his business
3 Reya is is the the best player in eye eye game
4 in inthe
5 Hello hello Ab aB

Expected Output

1 Goodbye bye world
2 Sam went to his business
3 Reya is the best player in eye game
4 in inthe
5 Hello Ab

Test Case 1

Compiler Message
Success

Input (stdin)

1 5
2 tap taptap For fOr for forfor
3 taptap of kirethe the hte hTe hte
4 tim tamtim tam tam ta tam tam
5 a a a a a a a a a a a a a a a a
6 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

Expected Output

1 tap taptap For forfor
2 taptap of kirethe the hte
3 tim tamtim tam ta tam
4 a
5 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa