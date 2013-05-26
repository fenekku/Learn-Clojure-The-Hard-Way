(require '[clojure.string :as str])

(def salutation "Good day, sir. Today, I said good day!")
(println (str/replace-first salutation "day" "night"))
(println (str/replace salutation "day" "night"))
; What if we don't want to replace day in 'Today' ?
(println (str/replace salutation #"\sday" " night"))

(def log (format "%d-%02d-%02d :: WARNING :: TYPE 2 ALERT" 2013 2 9))
(def sections (map str/trim (str/split log #"::")))
(println "The list:" sections)
(println "Joining the elements of the list:" (str/join ", " sections))