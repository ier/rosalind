(ns rosalind.problems.iprb-test
  (:require
   [clojure.test :refer [deftest testing is]]
   [rosalind.problems.iprb :refer [solve-iprb]]))


(deftest solve-iprb-test
  (testing "solve-iprb-sample-test"
    (let [sample (slurp "resources/inputs/rosalind_iprb_sample.txt")
          expected 0.78333]
      (is (= expected
             (solve-iprb sample)))))

  (testing "solve-iprb-test"
    (let [data (slurp "resources/inputs/rosalind_iprb.txt")
          expected 0.64189]
      (is (= expected
             (solve-iprb data))))))
