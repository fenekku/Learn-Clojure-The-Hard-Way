{% import "macros/ork.jinja" as ork with context %}
Why Learning Clojure the Hard Way aka Go Learn Lisp
***************************************************

.. epigraph::

   Go learn Lisp. I hear people who know everything really like Lisp.

    --Zed Shaw

Well, I certainly don't know everything and - wait a second ... that remark was clearly fascetious! Oh well. This book will try to do that - a little. Make you learn Lisp, that is. And by "you" I mean "me". And by Lisp, I mean Clojure.

It used to be, and I don't know if it's still the case, that MIT's introductory
programming class was on Lisp. The teachers used the famous-in-the-circle-of-people-who-know-about-it `wizard book <http://mitpress.mit.edu/sicp/full-text/book/book.html>`_.
I am (much?) younger than that generation unfortunately. At my university, the
introductory programming class was about Java. I feel like
I've missed out on something. And so I decided to write this kind-of book.
It will present functionnal programming through Clojure which is a functionnal
programming language written on top of the Java Virtual Machine. Don't worry
if that sounds weird, I won't say it again.

I will say "Lisp" again though. The Lisp family of languages are functionnal
programming languages that are very similar to each other and take their
root in the work of one John McCarthy. I will try to stick to Clojure, but
forgive me if I sometimes say Lisp instead because most of what you will see
here applies to various other Lisp-like languages too.

This simple book is meant to get you started in the Lisp world. I only
mildly suggest you start off by reading completely "Learn Python the Hard Way"
and/or "Learn C the Hard Way". This book won't actually make any assumption
about you having read those books. If you have suddenly decided to learn how to
program and stumbled on this text by error then you should be able to follow along.
And if you've been programming for years in a language very different from Clojure
than this book should be fine too. The advantage of going through one of these other
books is that it will give you invaluable perspective as you progress through
this book.

The title says it's the hard way to learn Clojure; but that's really because we will be following the same structure as the "Learn X the Hard Way" series. To reiterate what that approach is all about, here is what you will do:

#. Go through each exercise.
#. Type in each sample *exactly*.
#. Make it run.

That's it.

It might turn out hard, but as always stick to it.

This book doesn't pretend that it will teach you life changing things.
What it hopes to do is teach you perspective and a little Lisp
for your own good. This is not a soap box for functionnal programming
greatness. It's a soap box to teach you how to wash yourself with a
different soap.

Larger Perspective
==================

The one thing that separates close-minded individuals and open-minded ones
is perspective. If you are reading this then chances are you want to discover
what the above snarky comment by Zed Shaw was all about. Well, me too.
Without being too preachy-preachy, I will say that you will find in life
that there are things you can't do anything about. But the one thing you
can always do is change your outlook on them. That's what the seemingly
obscure Lisp world will bring you. A little bit of the bigger picture of
the world of programming languages.

Beware though. Once you start on this road you will see a lot of debate
-and let's be frank- religious wars over programming languages. Numerous
pundits will tell you Lisp is the best thing ever, while equally numerous
pundits will villify it and belittle it. Ignore both sides. As far as you
are concerned right now, Lisp is another language period.

With that in mind let's go learn (the hard way) Lisp (Clojure)!

