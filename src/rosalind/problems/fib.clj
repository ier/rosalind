(ns rosalind.problems.fib
  (:require
   [clojure.string :as str]))


(defn fib
  [n x]
  (case n
    0 0
    1 1
    (+ (fib (- n 1) x)
       (+ (dec x) (fib (- n 2) x)))))


(defn- solve
  [[k n]]
  (let [months (Integer/parseInt k)
        pairs (Integer/parseInt n)]
    (fib months pairs)))


(defn solve-fib [s]
  (-> s
      (str/replace "\n" "")
      (str/split #" ")
      solve))


(solve-fib (slurp "resources/inputs/rosalind_fib.txt"))
