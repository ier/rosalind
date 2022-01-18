(ns rosalind.problems.subs-test
  (:require
   [clojure.test :refer [deftest testing is]]
   [rosalind.problems.subs :refer [solve-subs]]))


(deftest solve-iprb-test
  (testing "solve-iprb-sample-test"
    (let [sample (slurp "resources/inputs/rosalind_subs_sample.txt")
          expected "2 4 10"]
      (is (= expected
             (solve-subs sample)))))

  (testing "solve-subs-test"
    (let [data (slurp "resources/inputs/rosalind_subs.txt")
          expected "36 156 195 202 239 350 369 395 433 462 469 486 550 591 609 616 649 755 762 810 817 838 903 928"]
      (is (= expected
             (solve-subs data))))))
