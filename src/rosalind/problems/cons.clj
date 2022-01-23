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


(defn- windows
  [s idx]
  (subs s idx (inc idx)))


(defn- foo [idx xs]
  {:idx idx
   :xs (map #(windows % idx) xs)})


(defn- stat
  [s pattern]
  {:s s
   :pattern pattern
   :result (count (re-seq (re-pattern pattern) s))})


(defn- solve
  [xs]
  (let [patterns ["A" "C" "G" "T"]
        idxs (->> xs
                  first
                  count
                  range)
        top (->> idxs
                 (map (fn [idx]
                        (most-frequent
                         (map #(windows % idx) xs))))
                 (apply str))
        stats (map identity patterns)]
    {:top top
     :stats stats
     :dbg (->> idxs
               (map #(foo % xs)))}))


(defn solve-cons [s]
  (->> s
       core/cut
       (map core/parse)
       (map :content)
       solve))


(solve-cons (slurp "resources/inputs/rosalind_cons_sample.txt"))
