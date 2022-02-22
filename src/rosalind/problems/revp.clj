(ns rosalind.problems.revp
  (:require
   [clojure.string :as str]
   [rosalind.core :as core]
   [rosalind.problems.revc :as revc]))


(defn- reverse-palindrom?
  [direct]
  (let [reversed (apply str (map #(revc/rev %) (str/reverse direct)))]
    (zero? (compare direct reversed))))


(defn- build-result
  [coll]
  (->> coll
       (map #(str (first %) " " (second %)))
       (interpose "\n")
       (apply str)))


(defn- solve
  [xs min-len max-len]
  (loop [pos 1 s xs len min-len acc []]
    (if (< (count s) min-len)
      (build-result acc)
      (if (or (< (count s) len)
              (> len max-len))
        (recur (inc pos) (apply str (rest s)) min-len acc)
        (if (reverse-palindrom? (subs s 0 len))
          (recur (inc pos) (apply str (rest s)) min-len (conj acc [pos len]))
          (recur pos s (inc len) acc))))))


(defn solve-revp
  [s]
  (->> s
       core/cut
       (map core/parse)
       first
       :content
       (#(solve % 4 12))))


(solve-revp (slurp "resources/inputs/rosalind_revp_sample.txt"))
