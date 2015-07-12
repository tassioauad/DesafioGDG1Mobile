package br.com.gdgtresrios.centrosulnegocios.model.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.gdgtresrios.centrosulnegocios.model.CategoriaColaborador;
import br.com.gdgtresrios.centrosulnegocios.model.CategoriaEvento;

public class DatabaseConnection extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "centrosulnegocios";
    private static final Integer DATABASE_VERSION = 1;
    private DateFormat mFormatter = new SimpleDateFormat("dd/MM/yyyy");

    private final List<String> createTableList = new ArrayList<>();

    private final List<String> dropTables = new ArrayList<>();

    private String sdateEventoGuto = "15/07/2015";
    private Date dateEventoGuto;
    private String sdateEventoRodrigo  = "16/07/2015";
    private Date dateEventoRodrigo;
    private String sdateEventoBel  = "17/07/2015";
    private Date dateEventoBel;
    private String sdateEventoRey  = "18/07/2015";
    private Date dateEventoRey;
    private String sdateEventoMisturaFina  = "15/07/2015";
    private Date dateEventoMisturaFina;



    public DatabaseConnection(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CategoriaEventoDao.CREATE_TABLE);
        db.execSQL(CategoriaColaboradorDao.CREATE_TABLE);
        db.execSQL(ColaboradorDao.CREATE_TABLE);
        db.execSQL(EventoDao.CREATE_TABLE);
        db.execSQL(ConfiguracaoDao.CREATE_TABLE);

        db.execSQL("INSERT INTO " + CategoriaEventoDao.TABLE_NAME + "(" + CategoriaEventoDao.COLUMN_NOME + ") VALUES('Palestras')");
        db.execSQL("INSERT INTO " + CategoriaEventoDao.TABLE_NAME + "(" + CategoriaEventoDao.COLUMN_NOME + ") VALUES('Shows')");
        db.execSQL("INSERT INTO " + CategoriaEventoDao.TABLE_NAME + "(" + CategoriaEventoDao.COLUMN_NOME + ") VALUES('Workshops')");
        db.execSQL("INSERT INTO " + CategoriaEventoDao.TABLE_NAME + "(" + CategoriaEventoDao.COLUMN_NOME + ") VALUES('Estandes')");

        db.execSQL("INSERT INTO " + CategoriaColaboradorDao.TABLE_NAME + "(" + CategoriaColaboradorDao.COLUMN_NOME + ") VALUES('Informática')");
        db.execSQL("INSERT INTO " + CategoriaColaboradorDao.TABLE_NAME + "(" + CategoriaColaboradorDao.COLUMN_NOME + ") VALUES('Bandas')");
        db.execSQL("INSERT INTO " + CategoriaColaboradorDao.TABLE_NAME + "(" + CategoriaColaboradorDao.COLUMN_NOME + ") VALUES('Comércio')");
        db.execSQL("INSERT INTO " + CategoriaColaboradorDao.TABLE_NAME + "(" + CategoriaColaboradorDao.COLUMN_NOME + ") VALUES('Turismo')");
        db.execSQL("INSERT INTO " + CategoriaColaboradorDao.TABLE_NAME + "(" + CategoriaColaboradorDao.COLUMN_NOME + ") VALUES('Palestrante')");

        db.execSQL("INSERT INTO " + ColaboradorDao.TABLE_NAME + "(" + ColaboradorDao.COLUMN_NOME + ","
                + ColaboradorDao.COLUMN_DESCRICAO + "," + ColaboradorDao.COLUMN_DESCRICAO_DETALHADA
                + "," + ColaboradorDao.COLUMN_PALESTRANTE + "," + ColaboradorDao.COLUMN_EXPOSITOR
                + "," + ColaboradorDao.COLUMN_PATROCINADOR + "," + ColaboradorDao.COLUMN_FK_CATEGORIA_COLABORADOR
                +") VALUES('GUTO ABRANCHES'," +
                "'Âncora do programa Conta Corrente 2ª edição, apresentado pela GloboNews...', " +
                "'Âncora do programa Conta Corrente 2ª edição, apresentado pela GloboNews, passou pelas emissoras CNT e Cultura, além do jornal Folha de São Paulo e a revista Veja.'," +
                " 1, 0, 0, 5)"); // 1

        db.execSQL("INSERT INTO " + ColaboradorDao.TABLE_NAME + "(" + ColaboradorDao.COLUMN_NOME + ","
                + ColaboradorDao.COLUMN_DESCRICAO + "," + ColaboradorDao.COLUMN_DESCRICAO_DETALHADA
                + "," + ColaboradorDao.COLUMN_PALESTRANTE + "," + ColaboradorDao.COLUMN_EXPOSITOR
                + "," + ColaboradorDao.COLUMN_PATROCINADOR + "," + ColaboradorDao.COLUMN_FK_CATEGORIA_COLABORADOR
                +") VALUES('RODRIGO PIMENTEL'," +
                "'Ex-Capitão do BOPE que serviu de inspiração para o Capitão Nascimento...', " +
                "'Ex-Capitão do BOPE, Rodrigo Pimentel, é um dos oficiais que serviu de inspiração para o Capitão Nascimento, interpretado pelo ator Wagner Moura.'," +
                " 1, 0, 0, 5)"); //2

        db.execSQL("INSERT INTO " + ColaboradorDao.TABLE_NAME + "(" + ColaboradorDao.COLUMN_NOME + ","
                + ColaboradorDao.COLUMN_DESCRICAO + "," + ColaboradorDao.COLUMN_DESCRICAO_DETALHADA
                + "," + ColaboradorDao.COLUMN_PALESTRANTE + "," + ColaboradorDao.COLUMN_EXPOSITOR
                + "," + ColaboradorDao.COLUMN_PATROCINADOR + "," + ColaboradorDao.COLUMN_FK_CATEGORIA_COLABORADOR
                +") VALUES('BEL PESCE'," +
                "'Empreendedora, fundadora da FazINOVA  e autora de três livros...', " +
                "'Empreendedora, fundadora da FazINOVA  e autora de três livros: A Menina do Vale, Procuram-se Super Herois e A Menina do Vale 2. Foi considerada uma das “100 pessoas mais influentes do Brasil”, pela Revista Época.'," +
                " 1, 0, 0, 5)"); // 3

        db.execSQL("INSERT INTO " + ColaboradorDao.TABLE_NAME + "(" + ColaboradorDao.COLUMN_NOME + ","
                + ColaboradorDao.COLUMN_DESCRICAO + "," + ColaboradorDao.COLUMN_DESCRICAO_DETALHADA
                + "," + ColaboradorDao.COLUMN_PALESTRANTE + "," + ColaboradorDao.COLUMN_EXPOSITOR
                + "," + ColaboradorDao.COLUMN_PATROCINADOR + "," + ColaboradorDao.COLUMN_FK_CATEGORIA_COLABORADOR
                +") VALUES('DR. ROBERT REY'," +
                "'Conhecido como Dr. Rey é um cirurgião plástico e apresentador brasileiro...', " +
                "'Conhecido como Dr. Rey é um cirurgião plástico e apresentador brasileiro e um dos protagonistas do Dr. 90210 (um reality show exibido nos Estados Unidos pelos canais E! Entertainment e People and Arts.'," +
                " 1, 0, 0, 5)"); // 4

        db.execSQL("INSERT INTO " + ColaboradorDao.TABLE_NAME + "(" + ColaboradorDao.COLUMN_NOME + ","
                + ColaboradorDao.COLUMN_DESCRICAO + "," + ColaboradorDao.COLUMN_DESCRICAO_DETALHADA
                + "," + ColaboradorDao.COLUMN_PALESTRANTE + "," + ColaboradorDao.COLUMN_EXPOSITOR
                + "," + ColaboradorDao.COLUMN_PATROCINADOR + "," + ColaboradorDao.COLUMN_FK_CATEGORIA_COLABORADOR
                +") VALUES('Mistura Fina'," +
                "'MPB...', " +
                "' '," +
                " 0, 0, 0, 2)"); // 5


        try {
            dateEventoGuto = mFormatter.parse(sdateEventoGuto);

            db.execSQL("INSERT INTO " + EventoDao.TABLE_NAME + "(" + EventoDao.COLUMN_NOME + ","
                    + EventoDao.COLUMN_DESCRICAO + "," + EventoDao.COLUMN_DESCRICAO_DETALHADA
                    + "," + EventoDao.COLUMN_DATA_HORA + "," + EventoDao.COLUMN_FK_CATEGORIA_EVENTO
                    + "," + EventoDao.COLUMN_FK_COLABORADOR + "," + EventoDao.COLUMN_DURACAO + ","
                    + EventoDao.COLUMN_LOCAL +") VALUES('Comunicação Eficaz em Tempos de Crise'," +
                    "'Mudança de atitude perante as dificuldades encontradas através da comunicação eficaz.', " +
                    "'Mudança de atitude perante as dificuldades encontradas através da comunicação eficaz; Novas estratégias para aperfeiçoar a comunicação e enfrentar as adversidades no momento de crise; Aperfeiçoar a comunicação com público interno e clientes para obtenção de resultados.'," +
                    dateEventoGuto.getTime() + ", 1, 1, 30, 'Salão Principal')");
        } catch (ParseException e){
            e.printStackTrace();
        }

        try {
            dateEventoRodrigo = mFormatter.parse(sdateEventoRodrigo);

            db.execSQL("INSERT INTO " + EventoDao.TABLE_NAME + "(" + EventoDao.COLUMN_NOME + ","
                    + EventoDao.COLUMN_DESCRICAO + "," + EventoDao.COLUMN_DESCRICAO_DETALHADA
                    + "," + EventoDao.COLUMN_DATA_HORA + "," + EventoDao.COLUMN_FK_CATEGORIA_EVENTO
                    + "," + EventoDao.COLUMN_FK_COLABORADOR + "," + EventoDao.COLUMN_DURACAO + ","
                    + EventoDao.COLUMN_LOCAL + ") VALUES('Construindo uma Tropa de Elite'," +
                    "'...despertar as pessoas para superar os “desafios” do ambiente competitivo de trabalho...', " +
                    "'A palestra tem como objetivo despertar as pessoas para superar os “desafios” do ambiente competitivo de trabalho e para focar a liderança sob o aspecto dos “homens de preto” do BOPE.'," +
                    dateEventoRodrigo.getTime() + ", 1, 2, 30, 'Salão Principal')");
        } catch (ParseException e){
            e.printStackTrace();
        }

        try {
            dateEventoBel = mFormatter.parse(sdateEventoBel);

            db.execSQL("INSERT INTO " + EventoDao.TABLE_NAME + "(" + EventoDao.COLUMN_NOME + ","
                    + EventoDao.COLUMN_DESCRICAO + "," + EventoDao.COLUMN_DESCRICAO_DETALHADA
                    + "," + EventoDao.COLUMN_DATA_HORA + "," + EventoDao.COLUMN_FK_CATEGORIA_EVENTO
                    + "," + EventoDao.COLUMN_FK_COLABORADOR + "," + EventoDao.COLUMN_DURACAO + ","
                    + EventoDao.COLUMN_LOCAL + ") VALUES('Uma Jornada Empreendedora'," +
                    "'Na palestra, Bel Pesce conta, com muita leveza e humor, sua extraordinária trajetória de carreira.', " +
                    "'Na palestra, Bel Pesce conta, com muita leveza e humor, sua extraordinária trajetória de carreira. Cada vitória é cheia de obstáculos, que Bel consegue atravessar, usando atitudes empreendedoras e  ideias inovadoras. Através de várias histórias envolventes, ela mostra como humildade, gentileza, perseverança, e determinação foram fatores importantes para seu sucesso.'," +
                    dateEventoBel.getTime() + ", 1, 3, 30, 'Salão Principal')");
        } catch (ParseException e){
            e.printStackTrace();
        }

        try {
            dateEventoRey = mFormatter.parse(sdateEventoRey);

            db.execSQL("INSERT INTO " + EventoDao.TABLE_NAME + "(" + EventoDao.COLUMN_NOME + ","
                    + EventoDao.COLUMN_DESCRICAO + "," + EventoDao.COLUMN_DESCRICAO_DETALHADA
                    + "," + EventoDao.COLUMN_DATA_HORA + "," + EventoDao.COLUMN_FK_CATEGORIA_EVENTO
                    + "," + EventoDao.COLUMN_FK_COLABORADOR + "," + EventoDao.COLUMN_DURACAO + ","
                    + EventoDao.COLUMN_LOCAL + ") VALUES('Obtendo Sucesso, Cuidando da Saúde, Bem Estar e Beleza'," +
                    "'A palestra tem como foco: motivação, autoestima, beleza, estética, comportamento...', " +
                    "'A palestra tem como foco: motivação, autoestima, beleza, estética, comportamento, nutrição, estilo de vida e cirurgia - A importância de homens e mulheres em estar bem com o corpo e mente, como forma  de obtenção de sucesso na vida pessoal e profissional.'," +
                    dateEventoRey.getTime() + ", 1, 4, 30, 'Salão Principal')");
        } catch (ParseException e){
            e.printStackTrace();
        }

        try {
            dateEventoMisturaFina = mFormatter.parse(sdateEventoMisturaFina);
            db.execSQL("INSERT INTO " + EventoDao.TABLE_NAME + "(" + EventoDao.COLUMN_NOME + ","
                    + EventoDao.COLUMN_DESCRICAO + "," + EventoDao.COLUMN_DESCRICAO_DETALHADA
                    + "," + EventoDao.COLUMN_DATA_HORA + "," + EventoDao.COLUMN_FK_CATEGORIA_EVENTO
                    + "," + EventoDao.COLUMN_FK_COLABORADOR + "," + EventoDao.COLUMN_DURACAO + ","
                    + EventoDao.COLUMN_LOCAL + ") VALUES('Mistura Fina'," +
                    "'MPB', " +
                    "'    '," +
                    dateEventoMisturaFina.getTime() + ", 2, 5, 60, 'Palco MPB')");
        } catch (ParseException e){
            e.printStackTrace();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(CategoriaEventoDao.DROP_TABLE);
        db.execSQL(CategoriaColaboradorDao.DROP_TABLE);
        db.execSQL(ColaboradorDao.DROP_TABLE);
        db.execSQL(EventoDao.DROP_TABLE);
        db.execSQL(ConfiguracaoDao.DROP_TABLE);
        onCreate(db);
    }
}
