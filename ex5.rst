{% import "macros/ork.jinja" as ork with context %}
Exercise 5 : Operations on Collections
**************************************

Like it is the case for numbers, specific operations can be applied on
collections. Some collections even allow for the same operations to be
applied to them! This is why knowing the difference between each type
of collection is important especially in terms of performance. The short
descriptions of them I gave you in the previous chapter is a decent
starting point to better understand the differences between these
things.

Type this is to practice using the most common collection operations:

{{ ork.code('code/ex5.clj|pyg') }}

What you should see by running `clojure ex5.clj`:

::

    {{ d['code/ex5.txt']|indent(4) }}

Extra credit
============

#. Try different mixes of operations and data types (string, numbers,
   collections) to see which are applicable to which data types.
#. For each collection type, find one other operation that can be
   applied to it.
