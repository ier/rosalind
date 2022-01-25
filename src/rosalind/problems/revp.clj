(ns rosalind.problems.revp
  (:require
   [clojure.string :as str]
   [rosalind.core :as core]
   [rosalind.problems.revc :as revc]))


(defn- reverse-palindrom?
  [direct]
  (let [reversed (apply str (map #(revc/rev %) (str/reverse direct)))]
    (zero? (compare direct reversed))))


(defn- solve
  [window-size xs]
  (loop [s xs idx window-size acc []]
    (if (< (count s) window-size)
      acc
      (if (or (> idx (count s))
              (> idx 12))
        (recur (apply str (rest s)) window-size acc)
        (let [chunk (subs s 0 idx)
              rev-pal? (reverse-palindrom? chunk)
              acc' (if rev-pal?
                     (conj acc chunk)
                     acc)]
          (prn {:s s :idx idx :acc acc :chunk chunk :rev-pal? rev-pal?})
          (if rev-pal?
            (recur (apply str (rest s)) idx acc')
            (recur s (inc idx) acc')))))))


(defn solve-revp [s]
  (->> s
       core/cut
       (map core/parse)
       first
       :content
       (solve 4)))


(solve-revp (slurp "resources/inputs/rosalind_revp_sample.txt"))
