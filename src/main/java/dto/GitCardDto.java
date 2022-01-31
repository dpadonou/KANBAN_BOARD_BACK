package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GitCardDto extends CardDto {
    private String urlIssue;
    private String gitHash;

    public GitCardDto(String libelle, String createdDate, String deadLine, long allocatedTime, String lieu, String url, String note, List<String> personnesEnCharge, String creator, String section, String urlIssue, String gitHash) {
        super(libelle, createdDate, deadLine, allocatedTime, lieu, url, note, personnesEnCharge, creator, section);
        this.urlIssue = urlIssue;
        this.gitHash = gitHash;
    }
}
