(def version "1.3.0")
(def data-1
    ; This is a common log format
    (format "%d-%02d-%02d :: INFO :: Something Happened" 2013 5 23))
; Use format to insert values into strings and format them
(def data-2 "2013-05-25 :: WARNING :: The %s has been achieved")

(println data-1)

; Replace %s by a given string
(println (format data-2 "singularity"))
(println (format data-2 "end of the world as we know it"))

; Concatenate 2 strings visually
(print "Version")
(println version)
; Concatenate 2 strings for real
(def s (str "Version" version))
(println s)