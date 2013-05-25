(def one 1)
one

(def two (+ one one))
two

; Is two a symbol?
(symbol? two)

; Is 'two a symbol?
(symbol? 'two)

; Search for the Clojure quote or ' operator
; to understand what is going on.
; Part of the explanations can be found in the paragraphs above

; You can redefine a symbol
(def one "one")
one

(def mittens "warm woolen mittens")
(def my-favorite-things '("Bright copper kettles"))
; You can name and refer to anything
(def add-to-list cons)
(add-to-list mittens my-favorite-things)

; Now try this. It might not evaluate to what you expect.
my-favorite-things