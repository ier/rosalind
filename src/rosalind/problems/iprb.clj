(ns rosalind.problems.iprb
  (:require
   [clojure.string :as str]))


(defn- iprb
  [[k m n]]
  (let [p (+ k m n)]
    (/ (+ (* 4 k (- k 1))
          (* 3 m (- m 1))
          (* 4 (+ (* 2 k m)
                  (* 2 k n)
                  (* m n))))
       (* 4 p (- p 1)))))


(defn solve-iprb [s]
  (->> (-> s
           (str/replace "\n" "")
           (str/split #" "))
       (map #(Integer/parseInt %))
       iprb
       double
       (format "%.5f")
       Double/parseDouble))


(solve-iprb (slurp "resources/inputs/rosalind_iprb.txt"))
