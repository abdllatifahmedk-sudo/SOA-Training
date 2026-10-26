package graphql;

import business.UniteEnseignementBusiness;
import com.coxautodev.graphql.tools.GraphQLRootResolver;
import entities.UniteEnseignement;

import java.util.List;

public class QueryResolver implements GraphQLRootResolver {

    public UniteEnseignementBusiness helper;

    public QueryResolver() {
        helper = new UniteEnseignementBusiness();
    }

    public List<UniteEnseignement> allUEs() {
        return helper.getListeUE();
    }

    public UniteEnseignement getUeByCode(int code) {
        return helper.getUEByCode(code);
    }

    public List<UniteEnseignement> getUeBySemestre(int semestre) {
        return helper.getUEBySemestre(semestre);
    }
}