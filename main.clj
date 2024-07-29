;; hello world
(println "Hello World!")

;; basic math operations
(println "3 + 2 ="(+ 3 2))
(println "4 - 2 ="(- 4 2))
(println "5 * 5 ="(* 5 5))
(println "8 / 2 ="(/ 8 2))
(println "5 mod 2 ="(mod 5 2))

;; functions
(defn hello-word [] (println "hello world"))
(hello-word)

(defn say-hello [name] (println "my name is " name))
(say-hello "derrick")

(defn messenger
  ([] (println "no name to send to"))
  ([name] (println "sending to "name))
)

(messenger)
(messenger "derrick")

(defn write-names [fname surname] (println "hello" fname surname))

(write-names "derrick" "shibero")

(defn hello [greeting & who]
  (println greeting who))

(hello "Hello" "world" "class")

((fn [word] (println "this language is"word)) "clojure")