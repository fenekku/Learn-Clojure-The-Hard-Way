{% import "macros/ork.jinja" as ork with context %}
Exercise 3: Math
****************

We usually write code to do operations on data. We want to modify data,
read it, output it, whatever. Multiplication, addition, substraction,
modulo (look that one up if you don't know what it means) and many other such terms make up some of these data operations. They are mathematical operations and thankfully Clojure can do Math (it wouldn't be very interesting if it couldn't now would it?).

Here is how you add two numbers in Clojure:

{{ ork.code('code/ex3-1.clj|pyg') }}

Type the following in a file and see what it does. It might be confusing with the
strange order and the parentheses, but I will explain after you've typed it.

{{ ork.code('code/ex3-2.clj|pyg') }}

What you should see:

::

    {{ d['code/ex3-2.txt']|indent(4) }}

I actually won't talk about the parentheses just yet.

Let's talk a bit about the mathematical notation before we go on though. It's
different than what you are used to in your math class or in other programming
languages. You would usually write `2 + 4` and not `(+ 2 4)`, right? What
you learned in Math class is called *infix* notation. As the name implies it's
notation where the operator is *in-place* as opposed to **prefix notation**
where the operator is *pre-placed* like in Clojure and most other Lisp dialects.
Lisp dialects are just other languages similar to Clojure. From now on we will
only talk about Clojure, but most of what we cover also applies to this
broader family tree from which Clojure is but one of the latest leaves.

This might take some getting used to. It is definitely one of the most seemingly bizarre thing about languages like Clojure. Yet it really makes sense and
the computer can deal with it well.

But here is a trick and a rationale rolled up into one: think about how you talk about these operations. I read `a / b` as "a divided by b". Without getting too much into linguistics you can agree that "a" is emphasized here. Now read `/ a b` out-loud. You should read it as something similar to "divide a by b". Where is the emphasis here? On the "divide" operation. And here it is. Clojure emphasizes the operator over the things being operated on. It's a very action-based language.

So now go back and read the operations above using this trick.
It won't sound so strange anymore.



