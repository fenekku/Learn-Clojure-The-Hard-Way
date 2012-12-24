(println "This is the first element" (first '(1 2 3)))
(println "This is the rest" (rest (list 1 2 3)))
(println "This is the last element" (last (list 1 2 3)))

(println "Same thing is possible on a vector: \n"
		 "First: " (first [1 2 3])
		 "rest: " (rest [1 2 3]) ; What happens to the vector though?
		 "Last: " (last [1 2 3]))

; This works for lists too but is O(n)
(println "Get the nth element (literally): " (nth [ "Bacon" 12 ["Vector"] ] 2 ) )
(println "Another way:" (get [ "Bacon" 12 ["Vector"] ] 2 )) 

(println "Add to the front of a list: " (cons 0 '(1 2 3)))

; Get a value from a map
(println "Dog's name:" (get {:Name "Fido", :breed "Golden Retriever"} :Name)) 
; Also works for vectors

; count can be used on all types of collections. Here is an example
(println "# key/value pairs:" (count {:Name "Fido", :breed "Golden Retriever"})) 

