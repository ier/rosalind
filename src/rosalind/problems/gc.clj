(ns rosalind.problems.gc
  (:require
   [clojure.string :as str]))


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


(defn- parse [s]
  (let [[a & rest] (str/split s #"\n")]
    {:title a
     :content (apply str rest)}))


(defn solve-gc [s]
  (let [dna-strings (-> s str/trim-newline (str/split #">"))
        parsed (->> dna-strings (filter seq) (map parse))]
    (solve parsed)))


(solve-gc (slurp "resources/inputs/rosalind_gc.txt"))
