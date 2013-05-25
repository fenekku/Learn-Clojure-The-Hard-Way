{% import "macros/ork.jinja" as ork with context %}
Exercise 7 : More Strings
*************************

Since strings are one of the most useful data types, we will cover
some of the cool things you can do with them. This will give you
additional practice with strings.

Strings are mostly used to store and display data that a human being
will eventually read. For instance, when you start your Clojure repl,
a piece of text (a string) appears to inform you which version of
Clojure you are using. Also when you write programs you sometimes
want to know what a particular symbol evaluates to, so you print it
to the screen. What is printed is a string.

Another very important use-case for strings are logs. When you use
a program you might not notice it, but it usually writes some
information on a file in the background to keep track of important
actions that have occurred. If the program crashes, these logs are
like an airplane's black box. They are a written records of what
led to the crash.

All of these examples, should impress upon you the importance of knowing
how to manipulate strings.

Let's discover some of the useful features of strings by examples.
Write a file named `ex7.clj` with the following:

{{ ork.code('code/ex7.clj|pyg') }}

You should see:

::

    {{ d['code/ex7.txt']|indent(4) }}

Homework
========

There is a lot going on in this file.

#. For each line explain what is going on in your own words.
#. Find how to add preceding spaces to strings like we did with 0s
   and numbers.
#. What happens if you don't use `(format ...)` but keep the strings
   and the values that should be placed in them?

