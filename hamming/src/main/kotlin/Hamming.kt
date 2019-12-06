class Hamming {
  companion object {
    fun compute(firstStrand: String, secondStrand: String) : Int {
      if (firstStrand.length != secondStrand.length) throw IllegalArgumentException("left and right strands must be of equal length.")
      val pairStrands = firstStrand zip secondStrand
      return pairStrands.filter { it.first != it.second }.count()
    }
  }

}
