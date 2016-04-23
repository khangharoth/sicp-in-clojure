(ns sicp.L4_A.util)


(defn atomic? [exp]
  (not (or (list? exp) (seq? exp))))

(defn isEmpty? [exp]
  (and (list? exp) (empty? exp)))

(defn cadr [list]
  (first (rest list)))