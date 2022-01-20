(ns rosalind.problems.iev-test
  (:require
   [clojure.test :refer [deftest testing is]]
   [rosalind.problems.iev :refer [solve-iev]]))


(deftest solve-iev-test
  (testing "solve-iev-sample-test"
    (let [sample (slurp "resources/inputs/rosalind_iev_sample.txt")
          expected 3.5]
      (is (= expected
             (solve-iev sample)))))

  (testing "solve-iprb-test"
    (let [data (slurp "resources/inputs/rosalind_iev.txt")
          expected 159796.0]
      (is (= expected
             (solve-iev data))))))
