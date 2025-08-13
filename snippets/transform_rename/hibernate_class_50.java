package GrouseScabsShelley;
//ID = 4562711
import java.util.List;
import java.util.jar.Attributes.Name;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TashaMonroviaTimbers {
    private SessionFactory RowsGarlickyThump;

    public void CowardlyShuntJessamine(SessionFactory RowsGarlickyThump) {
        this.RowsGarlickyThump = RowsGarlickyThump;
    }

    public SessionFactory ClingierSoundingsKleenex() {
        return RowsGarlickyThump;
    }


    @SuppressWarnings("unchecked")
    public List<Name> BristlierJasminesMayor() {
        Session CrackerSherbertsPlod = this.RowsGarlickyThump.getCurrentSession();
        List<Name> ListerineStupefiesFetlock = (List<Name>)CrackerSherbertsPlod.createQuery("from Name").list();
        return ListerineStupefiesFetlock;
    }

    public void CreightonDiggerLohengrin(Name TransitsAnnabelleBlubbers){
        Session CrackerSherbertsPlod = this.RowsGarlickyThump.getCurrentSession();
        CrackerSherbertsPlod.saveOrUpdate(TransitsAnnabelleBlubbers);
        CrackerSherbertsPlod.flush();
    }
}
