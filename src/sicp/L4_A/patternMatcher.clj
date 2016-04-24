(ns sicp.L4_A.patternMatcher
  (:require [sicp.L4_A.util :refer :all]))



(defn arbitrary-constant? [pattern]
  (if (list? pattern) (= (first pattern) '?c) false))

(defn arbitrary-expression? [pattern]
  (if (list? pattern) (= (first pattern) '?) false))

(defn arbitrary-variable? [pattern]
  (if (list? pattern) (= (first pattern) '?v) false))

(defn constant? [exp] (number? exp))
(defn variable? [exp] (atomic? exp))

(defn variable-name [pattern] (cadr pattern))

(defn lookup [var dictionary]
  (let [v (assq var dictionary)]
    (if (nil? v) var
                 (cadr v))))

(defn evaluate [form dictionary]
  (if (atomic? form)
    (lookup form dictionary)
    (apply (eval (lookup (first form) dictionary))
           (map (fn [v] (lookup v dictionary))
                (rest form)))))

(defn extend-dictionary [pat dat dictionary]
  (let [vname (variable-name pat)]
    (let [v (assq vname dictionary)]
      (cond (nil? v) (cons (list vname dat) dictionary)
            (= (cadr v) dat) dictionary
            :else 'failed

            ))))

(defn match [pattern expression dictionary]
  (cond (and (nil? pattern) (nil? expression)) dictionary
        (and (isEmpty? pattern) (isEmpty? expression)) dictionary
        (= dictionary 'failed) 'failed

        (atomic? pattern) (if
                            (atomic? expression) (if (= pattern expression) dictionary
                                                                            'failed)
                                                 'failed)

        (arbitrary-constant? pattern) (if
                                        (constant? expression) (extend-dictionary pattern expression dictionary)
                                                               'failed)

        (arbitrary-variable? pattern) (if (variable? expression) (extend-dictionary pattern expression dictionary)
                                                                 'failed)

        (arbitrary-expression? pattern) (extend-dictionary pattern expression dictionary)

        (atomic? expression) 'failed

        :else (match (rest pattern)
                     (rest expression)
                     (match (first pattern)
                            (first expression)
                            dictionary))))




