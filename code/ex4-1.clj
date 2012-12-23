; This is a list
(println '(1 2 3))
; This is the same list
(println (list 1 2 3))

; This is a vector
(println [1 2 3])
; This is the same vector
(println (vector 1 2 3))
; And this is too
(println (vec '(1 2 3)))

; This is a set
(println #{"This" "is" "weird"} )
; This too
(println (set ["This" "is" "weird"]) )
; It's just like you've seen in your math class
(println (set [1 2 1 2])) ; Will print #{1 2} 

; This is a map
(println {:key1 "value1", :key2 "value2" } )
; This too
(println (hash-map :key1 "value1" :key2 "value2"))

