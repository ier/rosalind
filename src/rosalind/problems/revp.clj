(ns rosalind.problems.revp
  (:require
   [rosalind.core :as core]))


(defn- solve
  [xs]
  xs)


(defn solve-revp [s]
  (->> s
       core/cut
       (map core/parse)
       first
       :content
       solve))


(solve-revp (slurp "resources/inputs/rosalind_revp_sample.txt"))
