(ns rosalind.problems.revc
  (:require
   [clojure.string :as str]))


(defn rev [c]
  (cond
    (= c \A) \T
    (= c \T) \A
    (= c \C) \G
    (= c \G) \C))

(defn- process [s]
  (loop [input s acc ""]
    (if (seq input)
      (let [reversed (rev (first input))]
        (recur (rest input) (str reversed acc)))
      acc)))


(defn solve-revc [s]
  (-> s
      (str/replace "\n" "")
      process))


(->> "resources/inputs/rosalind_revc.txt"
     slurp
     solve-revc)
