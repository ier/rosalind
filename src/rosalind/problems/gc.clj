(ns rosalind.problems.gc
  (:require
   [clojure.string :as str]
   [rosalind.core :as core]))


(defn- gc [m]
  (let [content (:content m)
        found (filter #(re-find #"G|C" %) (str/split content #""))
        percentage (/ (* (count found) 100) (count content))]
    (float percentage)))


(defn- solve
  "https://stackoverflow.com/a/13724986/404022"
  [xs]
  (let [m (map #(assoc % :value (gc %)) xs)
        {:keys [title value]} (apply max-key :value m)]
    (str title " " value "%")))


(defn solve-gc [s]
  (->> s
       core/cut
       (map core/parse)
       solve))


(solve-gc (slurp "resources/inputs/rosalind_gc.txt"))
