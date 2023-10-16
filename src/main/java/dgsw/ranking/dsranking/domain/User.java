package dgsw.ranking.dsranking.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private String name;

    private String email;

    private String accessToken;

}
