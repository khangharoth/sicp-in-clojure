(ns sicp.L4-A.util-test
  (:require [clojure.test :refer :all]
            [sicp.L4_A.util :refer :all]))

(deftest atomic?-test
  (is (= false  (atomic? '(+ x x))))
  (is (= true  (atomic? 'x)))
  (is (= true  (atomic? '+))))

(deftest isEmpty?-test
  (is (= false  (isEmpty? '(+ x x))))
  (is (= false  (isEmpty? 'x)))
  (is (= false  (isEmpty? '+)))
  (is (= true   (isEmpty? '()))))

(deftest cadr-test
  (is (= '(+ 1 2)  (cadr '(+ (+ 1 2) ( + 2 3)) )))
  (is (= 'x  (cadr '(+ x ( + 2 3)) ))))


(deftest assq-test
  (def e '((a 1) (b 2) (c 3)))
  (is (= '(a 1) (assq 'a e)))
  (is (= nil (assq 'd e)))
  (is (= '(5 7) (assq 5 '((2 3) (5 7) (11 13)))))
  )


