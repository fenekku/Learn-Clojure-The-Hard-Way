{% import "macros/ork.jinja" as ork with context %}
Exercise 0: The Setup
*********************

This exercise has no code.  It is simply the exercise you complete
to get your computer setup to run Clojure. You should follow these instructions
as exactly as possible.

.. warning::
    If you do not know how to use PowerShell on Windows or the Terminal on OSX or "bash" on Linux then I suggest you go learn that first. Zed Shaw has a quick crash course at http://cli.learncodethehardway.org/ which is free and will teach you the basics of PowerShell and Terminal quickly. Go through that then come back here.

Linux
=====

Linux is a varied operating system with a bunch of different ways to install software.
I'm assuming that if you are running Linux then you know how to install packages so here are your instructions:

#. Use your Linux package manager and install the "gedit" text editor.
#. Make sure you can get to "gedit" easily by putting it in your window
   manager's menu.

   #. Run gedit so we can fix some stupid defaults it has.
   #. Open "Preferences" select the "Editor" tab.
   #. Change "Tab width:" to 4.
   #. Select (make sure a check mark is in) "Insert spaces instead of tabs".
   #. Turn on "Automatic indentation" as well.
   #. Open the "View" tab turn on "Display line numbers".

#. Find your "Terminal" program.  It could be called "Terminal", "GNOME Terminal", "Konsole", or "xterm".
#. Put your Terminal in a location you can get to easily as well.
#. Run your Terminal program.  It won't look like much.

#. In your Terminal program, run "clojure".  You run things in Terminal by just typing their name and hitting RETURN.

   #. If you run "clojure" and it's not there, install it with your package manager. In Ubuntu it looks like this: sudo apt-get install clojure . You will then be prompted to retype the command with the version you want.  *Make sure you install clojure1.4 or above*

#. Hit CTRL-D (\^D) and get out of "clojure". You should be back at a prompt similar
   to what you had before you typed "clojure".  If not find out why.
#. Learn how to make a directory in the Terminal. Search online for help.
#. Learn how to change into a directory in the Terminal.  Again search online.
#. Use your editor to create a file in this directory.  Typically you
   will make the file, "Save" or "Save As...", and pick this directory.
#. Go back to Terminal using just the keyboard to switch windows.  Look it up if you
   can't figure it out.
#. Back in Terminal see if you can list the directory to see your newly created file.
   Search online for how to list a directory.

Linux what you should see
`````````````````````````
::

    $ clojure
    Clojure 1.4.0
    user=>
    ;; EXIT with ^D
    $ mkdir mystuff
    $ cd mystuff
    ;; ... Use gedit here to edit test.txt ...
    $ ls
    test.txt

Warnings For Beginners
======================

You are done with this exercise.  This exercise might be hard for you
depending on your familiarity with your computer.  If it is difficult,
take the time to read and study and get through it, because until you can do
these very basic things you will find it difficult to get much programming done.

If a programmer tells you to use "vim" or "emacs", tell them, "No."  These
editors are for when you are a better programmer.  All you need right now is an
editor that lets you put text into a file.  We will use "gedit",
"TextWrangler", or "Notepad++" (from now on called "the text editor" or "a
text editor") because it is simple and the same on all computers.  Professional
programmers use these text editors so it's good enough for you starting out.

A programmer will eventually tell you to use Mac OSX or Linux.  If the programmer
likes fonts and typography, they'll tell you to get a Mac OSX computer.  If they
like control and have a huge beard, they'll tell you to install Linux.  Again,
use whatever computer you have right now that works.  All you need is "gedit",
a Terminal, and "clojure".

Finally the purpose of this setup is so you can do three things very reliably
while you work on the exercises:

#. *Write* exercises using your text editor, "gedit" on Linux, "TextWrangler" on Mac OSX, "Notepad++" on Windows. Don't copy-paste.
#. *Run* the exercises you wrote.
#. *Fix* them when they are broken.
#. Repeat.

Anything else will only confuse you, so stick to the plan.