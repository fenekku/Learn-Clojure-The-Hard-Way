{% import "macros/ork.jinja" as ork with context %}
Exercise 6 : Defining
*********************

To manipulate numbers, lists, vectors and other data we've seen
we want to be able to refer to them. Much of programming is just that:
we name data structures and manipulate them.

This is how to name, or in the Lisp parlance "define", an element:
`(def one 1)`. `one` is now associated with `1`. In Clojure code
`one` evaluates to the number `1`.

To talk about `one`, the entity referring to the number `1`,
Clojure folks have come up with the name `symbol` because it is quite
cumbersome to say "the entity referring to this number 1" all the time.
`one` is a symbol. `def` creates symbols.

For this exercise we will use the repl. Start it up and type each of the
following line followed by enter. No need to type the comments though!

{{ ork.code('code/ex6.clj|pyg') }}

What you should see:

::

    {{ d['code/ex6.clj|clj']|indent(4) }}

That last line might surprise you. This is one of the key aspect of
Lisp languages. Listen closely: everything is constant. Once you have
defined something, unless you redefine it, it won't change value.
You would have to redefine the result to get a symbol evaluating to it.
The reasons for this will be explained later. One of them is concurrency.

I should also make something clear to you now. The "everything is
constant" business is not *entirely* true in Clojure. For what we will
be doing and for most actual real-life situations, the saying holds
(or at least you should make it hold by not using weird mutable things).
We will learn how to deal with these "mutable" things later. For now,
assume everything is "immutable".

Naming Convention
=================

Notice how hyphens (-) instead of underscores (_) or camelcase
(e.g. camelCase) are used when naming a symbol with multiple words.
This is the naming convention in Clojure. Whenever you would use a space
in normal writing use a hyphen in the symbol's name.

