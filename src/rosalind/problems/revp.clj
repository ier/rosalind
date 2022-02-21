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
  [xs min-len max-len]
  (loop [s xs
         idx min-len
         acc []]
    (if (< (count s) min-len)
      acc
      (if (or (> idx (count s))
              (> idx max-len))
        (recur (apply str (rest s)) min-len acc)
        (let [chunk (subs s 0 idx)
              rev-pal? (reverse-palindrom? chunk)
              acc' (if rev-pal?
                     (conj acc {:chunk chunk
                                :pos idx
                                :len (count chunk)})
                     acc)]
          (prn {:s s :idx idx :acc acc :chunk chunk :rev-pal? rev-pal?})
          (if rev-pal?
            (recur (apply str (rest s)) idx acc')
            (recur s (inc idx) acc')))))))


(defn solve-revp
  [s]
  (->> s
       core/cut
       (map core/parse)
       first
       :content
       (#(solve % 4 12))))


(solve-revp (slurp "resources/inputs/rosalind_revp_sample.txt"))
