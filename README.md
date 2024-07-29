# Introduction to functional programming with clojure
This is an existing branch that I am really existed to try.
## Basics of clojure
We begin by the hello world code
```clojure 
(println "hello world")
```
we can also add some comments
```clojure
;; this is a hello world function
```
### Basic math operations
This includes the following designs
1. Addition 
```clojure 
(+ 1 2)
```
2. Subtraction
```clojure 
(- 2 1)
```
3. Multiplication
```clojure 
(* 5 2)
```
4. Division
```clojure 
(/ 10 2)
```
5. Modulo
```clojure 
(mod 5 3)
```
### functions
1. basic functions with no parameters
```clojure
(defn hello-world [] (println "hello world"))
(hello-world)
```
2. function with a single parameter
```clojure
(defn say-hello [name] (println "hello "name))
(say-hello "derrick")
```
3. function with different arity
```clojure
(defn messenger
  ([] (println "no name to send to"))
  ([name] (println "sending to "name))
)

(messenger)
(messenger "derrick")
```
4. function with many parameters
```clojure
(defn write-names [fname surname] (println "hello" fname surname))

(write-names "derrick" "shibero")
```
5. variadic functions i.e. functions with many variables
```clojure
(defn hello [greeting & who]
  (println greeting who)
)
(hello "Hello" "world" "class")
```
6. anonymous functions
```clojure
((fn [word](println "the programming language is"word)) "clojure")
```
