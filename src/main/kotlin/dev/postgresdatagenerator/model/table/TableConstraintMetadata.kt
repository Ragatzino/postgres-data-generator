package dev.postgresdatagenerator.model.table

import dev.postgresdatagenerator.model.column.ConstraintType
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class TableConstraintMetadata {
    @Id
    var id: String = TODO("initialize me")
    var constraintType: ConstraintType
 }