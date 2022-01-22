(ns rosalind.problems.cons
  (:require
   [clojure.set :refer [map-invert]]
   [rosalind.core :as core]))


(defn- most-frequent [xs]
  (val
   (apply
    max-key
    key
    (map-invert (frequencies xs)))))


(defn- solve
  [xs]
  (let [len (count (first xs))
        top (->> (map (fn [rng]
                        (most-frequent
                         (map
                          #(subs % rng (inc rng))
                          xs)))
                      (range len))
                 (apply str))
        stats (map (fn [rng hs]
                     (map
                      #(subs % rng (inc rng))
                      xs))
                   (range len)
                   #{"A" "C" "G" "T"})]
    {:top top
     :stats stats}))


(defn solve-cons [s]
  (->> s
       core/cut
       (map core/parse)
       (map :content)
       solve))


(solve-cons (slurp "resources/inputs/rosalind_cons_sample.txt"))
