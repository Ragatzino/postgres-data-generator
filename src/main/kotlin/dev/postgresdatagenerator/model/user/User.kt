package dev.postgresdatagenerator.model.user

import dev.postgresdatagenerator.model.schema.SchemaMetadata
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
data class User (
        @Id
        var id: String = TODO("initialize me"),
        var name:String,
        @OneToMany
        var schemas:List<SchemaMetadata>
)