package com.mateusfaustino.models;

public class MyFavorites {
    public void include(Audio audio){
        System.out.println(audio.getTitle()+ " tem a classificação = "+audio.getClassificacao());
        System.out.println(audio.getTitle()+" tem a reproduções = "+ audio.getTotalReproducoes());
        if(audio.getClassificacao()>=5){

            System.out.println(audio.getTitle()+" é considerado sucesso absoluto de preferido por todos");
        }else{
            System.out.println(audio.getTitle()+" também é o que todos estão curtindo");
        }
    }

}
