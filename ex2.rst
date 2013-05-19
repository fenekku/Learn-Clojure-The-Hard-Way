{% import "macros/ork.jinja" as ork with context %}
Exercise 2: Code files
**********************

To run a whole file of code you simply write `clojure file.clj` where
`file.clj` is a file of clojure code. The `.clj` part indicates that it
is clojure code. Let's try it.

Write the following in `ex2.clj` using your text editor:

{{ ork.code('code/ex2.clj|pyg') }}

Then run the file by typing in your terminal:

::

    clojure ex2.clj

You should see:

::

    $ clojure ex2.clj
    Hello World Again!
    This is useful.
    I don't have to type enter all the time.
    I can group println calls together!
    Yay for printing together!


You can also add comments to your files. They are used to tell you
what something does in English, and they also are used to disable parts
of your program if you need to remove them temporarily. Here's how you
use comments in Clojure:

{{ ork.code('code/ex2-2.clj|pyg') }}

The output:

::

    {{ d['code/ex2-2.txt']|indent(4) }}
