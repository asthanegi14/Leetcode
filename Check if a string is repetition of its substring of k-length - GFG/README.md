# Check if a string is repetition of its substring of k-length
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif">Given a string <strong>S</strong>, check if it is possible to convert it into a string that is the repetition of a substring with <strong>K</strong> characters. To convert, we can replace one substring of length <strong>K</strong>&nbsp;starting at index <strong>i </strong>(zero-based&nbsp;indexing), such that <strong>i</strong> is divisible by <strong>K</strong>, with <strong>K</strong> characters.</span></span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 4, K = 2, S = "bdac"
<strong>Output:</strong> 1
<strong>Explanation</strong>: We can replace either
"bd" with "ac" or "ac" with "bd"
</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>: 
N = 5, K = 2, S = "abcde"
<strong>Output:</strong> 0
<strong>Explanation</strong>: Since N % K != 0, it's not 
possible to convert S into a string which
is a concatanation of a substring with 
length K.</span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>kSubstrConcat()&nbsp;</strong>which takes a string S, its length N and an integer K as inputs and return 1/0 accordingly.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(N).</span></p>

<p><br>
<span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Constraints:</strong></span></span><br>
<span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif">2 &lt;= K&nbsp;&lt; N&nbsp;&lt;= 100000</span></span></p>

<p>&nbsp;</p>
</div>