package radarr

private[radarr] case class RadarrMovie(title: String, imdbId: Option[String], tmdbId: Option[Long], id: Long)

private[radarr] case class RadarrPagedMovie(
    page: Int,
    pageSize: Int,
    sortKey: String,
    sortDirection: String,
    totalRecords: Int,
    records: List[RadarrMovie]
)
