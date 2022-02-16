package dto.batch;

import dto.add.AddGitCardDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BatchGitCardDto {
    List<AddGitCardDto> gitCardList;
}
