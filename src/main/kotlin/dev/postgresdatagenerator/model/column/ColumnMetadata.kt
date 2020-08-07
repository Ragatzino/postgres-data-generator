package dev.postgresdatagenerator.model.column

import java.util.*
import javax.persistence.*

@Entity
class ColumnMetadata {
    @Id
    var id: String = TODO("initialize me")

    val columnName:String
    val columnType:ColumnType
    val columnRule:ColumnRule
    val constraintType:ConstraintType?

    @OneToMany
    val parsedColumnPossibleValues:List<ColumnPossibleValue>

    var modificationDate:Date
    var definitionDate:Date

    @PreUpdate
    fun persistModificationDateOnUpdate(){
        modificationDate=Date()
    }

    @PrePersist
    fun persistDefinitionDateAndModificationDateOnPersist(){
        definitionDate=Date()
        modificationDate=Date()
    }

}

