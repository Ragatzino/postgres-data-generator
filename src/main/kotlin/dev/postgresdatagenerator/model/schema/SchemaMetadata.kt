package dev.postgresdatagenerator.model.schema

import dev.postgresdatagenerator.model.table.TableMetadata
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
data class SchemaMetadata (
        @Id
        var id: String = TODO("initialize me") ,
        var schemaName:String,
        @OneToMany
        var tables:List<TableMetadata>
)
