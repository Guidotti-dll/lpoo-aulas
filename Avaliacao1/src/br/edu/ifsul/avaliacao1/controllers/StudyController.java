package br.edu.ifsul.avaliacao1.controllers;

import br.edu.ifsul.avaliacao1.models.Study;

import java.util.*;

public class StudyController {
    public static void main (String[] args){
        Study study1 = new Study();
        System.out.println(study1);

        Study study2 = new Study();
        System.out.println(study2);

        Study study3 = new Study(3,1234567890,"Carlos","Silva","carlos@mail.com");
        System.out.println(study3);

        Study study4 = new Study(4,1237894560,"Vagner", "Souza", "vagner@mai.com");
        System.out.println(study4);

        Study study5 = new Study(1478520369,"Leonardo");
        System.out.println(study5);

        Study study6 = new Study(1632584107, "Gabriel");
        System.out.println(study6);

        study1.setId(1);
        study1.setCpf(1346798520);
        study1.setNome("Lucas");
        study1.setSobrenome("Lima");
        study1.setEmail("lucas@mail.com");

        System.out.println(study1.getId());
        System.out.println(study1.getCpf());
        System.out.println(study1.getNome());
        System.out.println(study1.getSobrenome());
        System.out.println(study1.getEmail());

        study2.setId(2);
        study2.setCpf(1643297580);
        study2.setNome("Juan");
        study2.setSobrenome("Santos");
        study2.setEmail("juan@mail.com");

        System.out.println(study2.getId());
        System.out.println(study2.getCpf());
        System.out.println(study2.getNome());
        System.out.println(study2.getSobrenome());
        System.out.println(study2.getEmail());

        study5.setId(5);
        study6.setId(6);

        List<Study> studyList = new ArrayList<>();
        studyList.add(study1);
        studyList.add(study2);
        studyList.add(study3);
        studyList.add(study4);
        studyList.add(study5);
        studyList.add(study6);

        System.out.println("\nColeção do tipo List\n" + studyList);
        System.out.println();
        System.out.print("Localizando o estudante pela chave de pesquisa [id=5] na coleção do tipo List");
        Study studyFind = studyList.stream().filter(study -> study.getId() == 5).findAny().orElse(null);
        System.out.println(studyFind);

        System.out.println();
        System.out.print("Localizando o estudante pela chave de pesquisa [id=5] na coleção do tipo List");

        System.out.println();
        studyList.sort(Comparator.comparing(Study::getId).reversed());
        System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
        System.out.println(studyList);

        Map<Integer, Study> studyMap = new HashMap<>();
        studyMap.put(study1.getId(), study1);
        studyMap.put(study2.getId(), study2);
        studyMap.put(study3.getId(), study3);
        studyMap.put(study4.getId(), study4);
        studyMap.put(study5.getId(), study5);
        studyMap.put(study6.getId(), study6);

        System.out.println("\nColeção do tipo Map\n" + studyMap);
        System.out.println();
        System.out.print("Localizando o estudante pela chave de pesquisa [id=5] na coleção do tipo Map");
        System.out.println(studyMap.get(5));

        //ordenando a coleçao do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)
    }
}
