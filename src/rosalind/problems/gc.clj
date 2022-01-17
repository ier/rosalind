(ns rosalind.problems.gc
  (:require
   [clojure.string :as str]))


(defn- gc [m]
  (let [content (:content m)
        found (filter #(re-find #"G|C" %) (str/split content #""))
        percentage (/ (* (count found) 100) (count content))]
    (float percentage)))


(defn- solve [xs]
  (let [{:keys [title value]}
        (reduce max-key val (map #(assoc % :value (gc %)) xs))]
    (str title "\n" value)))


(defn- parse [s]
  (let [[a b c] (str/split s #"\n")]
    {:title a
     :content (str b c)}))


(defn solve-gc [s]
  (let [dna-strings (-> s str/trim-newline (str/split #">"))
        parsed (->> dna-strings (filter seq) (map parse))]
    (solve parsed)))


(solve-gc (slurp "resources/inputs/rosalind_gc_sample.txt"))