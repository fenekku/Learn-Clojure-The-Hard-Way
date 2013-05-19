{% import "macros/ork.jinja" as ork with context %}
Exercise 1: Printing
********************

In this exercise we won't use our text editor just yet. We are going to use what is known as a "repl". "repl" stands for **r**\ ead, **e**\ valuate, **p**\ rint, **l**\ oop. It might seem as though I am throwing new terms at you but in fact you've already seen a repl in the previous chapter. It's what showed up when you typed "clojure" in your terminal. Go ahead and summon it again.

Clojure is a bit weird if you have never done any Lisp programming before. Don't worry if you don't even know what that means. In fact, the code might look like a blob of stuff to you. Never fear, we will get there together. Got your repl running? Good.

Lets start with printing something. Try the code below in your repl.
Type the code one line at a time.

{{ ork.code('code/ex1.clj|pyg') }}

Here is the output you will see.

::

    {{ d['code/ex1.clj|clj']|indent(4) }}

This was an important step. Now you know how to run code one line at a time.
This will come in handy.

For the rest of the book we will be passing whole files
to the interpreter though. We will see how this is done in the next chapter.
You know how to run individual pieces of code now. Whenever you want to
figure out what should be returned by your code, don't hesitate to go
back to this interactive mode.