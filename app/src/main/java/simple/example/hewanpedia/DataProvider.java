package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Buah;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Makanan;
import simple.example.hewanpedia.model.Sayuran;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Buah> initDataKucing(Context ctx) {
        List<Buah> buahs = new ArrayList<>();
        buahs.add(new Buah(ctx.getString(R.string.naga_nama), "",
                ctx.getString(R.string.naga_deskripsi), R.drawable.buahnaga));
        buahs.add(new Buah(ctx.getString(R.string.mangga_nama), "",
                ctx.getString(R.string.mangga_deskripsi), R.drawable.mangga));
        buahs.add(new Buah(ctx.getString(R.string.melon_nama), "",
                ctx.getString(R.string.melon_deskripsi), R.drawable.melon));
        buahs.add(new Buah(ctx.getString(R.string.rambutan_nama), "",
                ctx.getString(R.string.rambutan_deskripsi), R.drawable.rambutan));
        buahs.add(new Buah( ctx.getString(R.string.salak_nama), "",
                ctx.getString(R.string.siam_deskripsi), R.drawable.salak));
        buahs.add(new Buah(ctx.getString(R.string.semangka_nama), "",
                ctx.getString(R.string.semangka_deskripsi), R.drawable.semangka));
        return buahs;
    }

    private static List<Sayuran> initDataAnjing(Context ctx) {
        List<Sayuran> sayurans = new ArrayList<>();
        sayurans.add(new Sayuran(ctx.getString(R.string.daun_nama), "",
                ctx.getString(R.string.daun_deskripsi), R.drawable.daun));
        sayurans.add(new Sayuran(ctx.getString(R.string.batang_nama), " ",
                ctx.getString(R.string.daun_deskripsi), R.drawable.batang));
        sayurans.add(new Sayuran(ctx.getString(R.string.buahh_nama), "",
                ctx.getString(R.string.buahh_deskripsi), R.drawable.buah));
        sayurans.add(new Sayuran(ctx.getString(R.string.jamur_nama), "",
                ctx.getString(R.string.jamur_deskripsi), R.drawable.jamur));
        sayurans.add(new  Sayuran(ctx.getString(R.string.umbi_nama), "",
                ctx.getString(R.string.umbi_deskripsi), R.drawable.umbi));
        sayurans.add(new Sayuran(ctx.getString(R.string.polong_nama), "",
                ctx.getString(R.string.polong_deskripsi), R.drawable.polong));
        return sayurans;
    }

    private static List<Makanan>initDataBuaya(Context ctx) {
        List<Makanan> makanans = new ArrayList<>();
        makanans.add(new Makanan(ctx.getString(R.string.rendang_nama), "",
                ctx.getString(R.string.rendang_deskripsi), R.drawable.rendang));
        makanans.add(new Makanan(ctx.getString(R.string.NasiGoreng_nama), "",
                ctx.getString(R.string.NasiGoreng_deskripsi), R.drawable.nasigoreng));
        makanans.add(new Makanan(ctx.getString(R.string.MieAyam_nama), "",
                ctx.getString(R.string.MieAyam_deskripsi), R.drawable.mieayam));
        makanans.add(new Makanan(ctx.getString(R.string.Angkringan_nama), "",
                ctx.getString(R.string.Angkringan_deskripsi), R.drawable.angkringan));
        makanans.add(new Makanan(ctx.getString(R.string.Sate_nama), "",
                ctx.getString(R.string.Sate_deskripsi), R.drawable.sate));
        makanans.add(new Makanan(ctx.getString(R.string.Bakso_nama), "",
                ctx.getString(R.string.Bakso_deskripsi), R.drawable.bakso));
        return makanans;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataBuaya(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
