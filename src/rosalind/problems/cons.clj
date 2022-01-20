(ns rosalind.problems.cons
  (:require
   [clojure.string :as str]
   [rosalind.core :as core]
   [clojure.set :refer [map-invert]]))


(defn- most-frequent [xs]
  (val
   (apply
    max-key
    key
    (map-invert (frequencies xs)))))


(defn- solve
  [xs]
  (let [len (count (first xs))
        res (map
             (fn [rng]
               (most-frequent
                (map
                 #(subs % rng (inc rng))
                 xs)))
             (range len))]
    (apply str res)))


(defn solve-cons [s]
  (->> s
       core/cut
       (map core/parse)
       (map :content)
       solve))


(solve-cons (slurp "resources/inputs/rosalind_cons_sample.txt"))


#_(val
 (apply
  max-key
  key
  (map-invert (frequencies '("C" "C" "G" "C" "G" "C" "G")))))