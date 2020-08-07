package dev.postgresdatagenerator.model.column

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class ColumnPossibleValue (
    @Id
    var id: String = TODO("initialize me"),
    var value: String,
    @ManyToOne
    var column: ColumnMetadata
)