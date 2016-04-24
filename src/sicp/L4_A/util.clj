(ns sicp.L4_A.util)


(defn atomic? [exp]
  (not (or (list? exp) (seq? exp))))

(defn isEmpty? [exp]
  (and (list? exp) (empty? exp)))

(defn cadr [list]
  (first (rest list)))

(def make-empty-dictionary '())

(defn assq [var dict]
  (cond (= make-empty-dictionary dict) nil
        (= (first (first dict)) var) (first dict)
        :else (assq var (rest dict))))