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
  (when (> (count xs) min-len)
    (loop [pos 1 s xs len min-len acc []]
      (if (> len (count s))
        (build-result acc)
        (let [str' (subs s 0 len)
              acc' (if (reverse-palindrom? str') (conj acc [pos len]) acc)
              len' (if (or #_(= len (count s)) (= len max-len)) min-len (inc len))
              s' (if (= len max-len) (apply str (rest s)) s)
              pos' (if (= len (count s)) (inc pos) pos)
              _ (prn pos' s' len' acc' str')]
          (recur pos' s' len' acc'))))))


(solve "TATATA" 4 12)


(defn solve-revp
  [s]
  (->> s
       core/cut
       (map core/parse)
       first
       :content
       (#(solve % 4 12))))


(solve-revp (slurp "resources/inputs/rosalind_revp_sample.txt"))
