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


(defn- window
  [s idx]
  (subs s idx (inc idx)))


(defn i
  [pos lines]
  (map #(window % pos) lines))


(defn- stat-line
  [pattern lines idxs]
  (let [positions (mapv #(i % lines) idxs)]
    (str pattern ": " positions)))


(defn- solve
  [xs]
  (let [idxs (->> xs
                  first
                  count
                  range)
        top (->> idxs
                 (map (fn [idx]
                        (most-frequent
                         (map #(window % idx) xs))))
                 (apply str))
        stats (->> ["A" "C" "G" "T"]
                   (map (fn [p]
                          (stat-line p xs idxs))))]
    {:top top
     :stats stats}))


(defn solve-cons [s]
  (->> s
       core/cut
       (map core/parse)
       (map :content)
       solve))


(solve-cons (slurp "resources/inputs/rosalind_cons_sample.txt"))
