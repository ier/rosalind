(ns rosalind.problems.hamm-test
  (:require
   [clojure.test :refer [deftest testing is]]
   [rosalind.problems.hamm :refer [solve-hamm]]))


(deftest solve-gc-test
  (testing "solve-gc-sample-test"
    (let [sample (slurp "resources/inputs/rosalind_hamm_sample.txt")
          expected 7]
      (is (= expected
             (solve-hamm sample)))))

  (testing "solve-hamm-test"
    (let [data (slurp "resources/inputs/rosalind_hamm.txt")
          expected 494]
      (is (= expected
             (solve-hamm data))))))
