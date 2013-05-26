{% import "macros/ork.jinja" as ork with context %}
Exercise 8 : Even More Strings
******************************

This book is more or less following the pace of the Learn X the Hard Way
series. Less more than more... got that? Since we are covering a
different type of programming language, we will be going quickly
over some of the common ground to programming languages
and instead spend more time on practicing some of the truly
specific/useful aspects of the language. We won't delve much deeper
into the formatting seen before for instance.

That being said, because strings are so prevalent, it is worth seeing
what else can be done with them. Unfortunately we are close to the limit
of what Clojure's core features can do with strings. We now need to
summon more power from another space.

Type the following and I will then explain what is going on:

{{ ork.code('code/ex8.clj|pyg') }}

What you should see:

::

    {{ d['code/ex8.txt']|indent(4) }}

Let's start by the beginning. As I mentioned we needed features not
readily available to manipulate strings like experts. The
`(require '[clojure.string :as str])` expression allows us to do that.
It tells Clojure to load in the current code the `clojure.string` set of
features with the name `str`. From then on, whenever we want to use a
feature available in `clojure.string` we call `str/<name of feature>`.
There are many other feature sets available like `clojure.set` or
`clojure.pprint`.

Ok, "feature set" is not what programmers call `clojure.string`. They
are called *namespaces*. That's because they are literally places where
names are assigned to values. They are the equivalent of Python modules
or Java packages. They are also sometimes called libraries because they
are places full of features.

With that new power in our hands, we can make strings do new things.
The first thing we did was call `str/replace-first`. `replace-first` is
a function that was defined in the `clojure.string` namespace. Don't
worry about the appellation "function" for now. What it does is, as the
name implies, replace in a string the first instance of a string by
another. Notice that `/` is used to separate the namespace
from the symbol.

On the other hand, `str/replace` replaces *all* instances of the string
by another. We mentioned string a lot, but strings are not the only
things being replaced, now are they? What about this strange `#"\sday"`?
Start a repl and type `(type #"\sday")`. You should see:
`java.util.regex.Pattern`. `type` tells us what is the type of the
passed entity. The `regex` in the returned answer tells us it is a
regular expression. Regular expresions are a convenient way to
express how to find things in text. Here, `#"\sday"` specifies to find
the word "day" preceded by an empty space. "Empty space" is what
the `\s` stands for. If you want to learn more about regular expressions
or "regex" for short, you can check out:
http://regex.learncodethehardway.org/ by Zed Shaw (not me).

One last thing. The `map` call simply applies str/trim to each element
of the list returned by `str/split`. I put that there to start making
you used to nested expressions. You will see a lot of those in the Lisp
world.

Homework
========

There was even more stuff going on in this file.

#. For each line, explain what is going on in your own words.
#. What happens if you replace the regex `#"\sday"` by the string
   `" day"`?

