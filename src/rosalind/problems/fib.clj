(ns rosalind.problems.fib
  (:require
   [clojure.string :as str]))


(defn- fib
  [cycles delta]
  (loop [cntr 1 y 1 a 0]
    #_(prn {:cntr cntr :y y :a a})
    (if (< cntr cycles)
      (let [y' (* a delta)]
        (recur (inc cntr) y' (+ a y)))
      (+ y a))))


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
