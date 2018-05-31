package tokeniser

import opennlp.tools.tokenize.SimpleTokenizer

object WordTokeniser{
  def tokeniseSentence(sentence:String):Seq[String]={
    val tokenizer = SimpleTokenizer.INSTANCE
    tokenizer.tokenize(sentence)
  }
  def computeTfIdf()
}

