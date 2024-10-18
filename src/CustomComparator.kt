import Models.Car

class CustomComparator: Comparator<Car> {
    override fun compare(o1: Car?, o2: Car?): Int {
        if (o1?.gosNumber == o2?.gosNumber) {
            return 0
        } else if (o1!!.gosNumber > o2!!.gosNumber) {
            return 1
        } else {
            return -1
        }
    }
}