package com.example.demo_hikari_jdbc_oracle.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Repository
public class SampleRepository {

    private NamedParameterJdbcTemplate template;

    @Autowired
    void getDataSource(DataSource dataSource) {
        template = new NamedParameterJdbcTemplate(dataSource);
    }

    public List<Map<String, Object>> getSampleData() {
        MapSqlParameterSource params = new MapSqlParameterSource();

        String sql = """
                SELECT LOCATIONS.LOCATION_ID, LOCATIONS.STREET_ADDRESS
                  FROM HR.LOCATIONS\s""";

        return template.queryForList(sql, params);
    }


}
