package dev.postgresdatagenerator.model.table

import dev.postgresdatagenerator.model.column.ColumnMetadata
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class TableMetadata {
    @Id
    var id: String = TODO("initialize me")
    var tableName:String
    @OneToMany
    var columns : List<ColumnMetadata>
}
