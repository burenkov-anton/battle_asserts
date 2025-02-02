(ns battle-asserts.issues.rect-area
  (:require [clojure.test.check.generators :as gen]))

(def level :elementary)

(def tags ["training" "math"])

(def description
  {:en "Calculate the area of a rectangle given its length and width"
   :ru "Рассчитайте площадь треугольника по переданной длине и ширине."})

(def signature
  {:input  [{:argument-name "width" :type {:name "integer"}}
            {:argument-name "length" :type {:name "integer"}}]
   :output {:type {:name "integer"}}})

(defn arguments-generator []
  (gen/tuple gen/nat gen/nat))

(def test-data
  [{:expected 0 :arguments [0 0]}
   {:expected 2 :arguments [1 2]}
   {:expected 9 :arguments [3 3]}
   {:expected 4096 :arguments [64 64]}
   {:expected 135 :arguments [15 9]}])

(defn solution
  [width length]
  (* width length))
