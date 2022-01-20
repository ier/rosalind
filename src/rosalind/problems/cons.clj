(ns rosalind.problems.cons
  (:require
   [clojure.string :as str]
   [rosalind.core :as core]))


(defn- solve
  [xs]
  xs)


(defn solve-cons [s]
  (->> s
       core/cut
       (map core/parse)
       solve))


(solve-cons (slurp "resources/inputs/rosalind_cons_sample.txt"))
