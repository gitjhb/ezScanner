package ezscanner.itjhb.com.dataframework

/**
 * Created by hongbin.jia on 2/28/2017.
 */

enum class EncDocType {
    DOC, BARCODE
}

data class EncDocData(var docId: String = "", var encData: String, var metaData: String = "", var encCardType: String = EncDocType.DOC.name)

data class DocCardMetaData(var cardIndex: Int = 0)

