{% import "macros/ork.jinja" as ork with context %}
Exercise 4: Collections
***********************

You have dealt so far with two important data types: numbers and strings.
The latter is what programmers call a sequence of characters enclosed
in double quotes. You were printing strings out when calling
`(println "Hello World")`. You were evidently operating on numbers
when calling `(+ 25 (/ 30 6))`.

It is now time to look at the four other most important data types in
Clojure: **lists**, **vectors**, **sets** and **maps**.

Type the following:

{{ ork.code('code/ex4-1.clj|pyg') }}

What you should see:

::

    {{ d['code/ex4-1.txt']|indent(4) }}

If you don't see this, make sure you've entered everything exactly as-is.
It works? Ok, let's break it down.

Lists
=====

A list, as its name implies, is just a sequence of elements. You can think of lists as being implemented by a linked list under the hood. If you don't know what linked lists are, they are a simple way of chaining elements. You access an element of the list
by accessing the one before it in the list and then moving on to the element you want to access. This is called **sequential access**. Don't worry about it, it won't be on the quiz.

Vectors
=======

A vector is also a sequence of elements, but it is akin to an array in C or Ruby.
That means they are sequences of elements too, but you don't have to traverse elements
in order to get to the one you want to access. You can access it directly. We will see
how this is done in the next chapter. Vectors are efficient for **random access** (
this is the term used for *direct* access) but not so much for updates.

Sets
====

A set is just like a set in Math: a collection of unique elements. There is no order
in a set apriori (but look carefully, can you find the order Clojure uses?).
Sets are useful for doing set operations and the like. We'll see those soon!

Maps
====

A map is an association of keys with values. They are the equivalent of a dict in Python or a HashMap in Java (humhumhum that's similar to the keyword we used to create one!). If you are not familiar with these languages, then you can think of
maps as a place where you can label things. The label is the key e.g. `:key2`
and the thing is the value e.g. `value2`.

All of these data types can do neat things as we will see in the next chapter.
