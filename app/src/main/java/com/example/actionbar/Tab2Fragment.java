package com.example.actionbar;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Tab2Fragment extends Fragment implements CompoundButton.OnCheckedChangeListener{

    private ToggleButton BFSword;
    private boolean BFSwordStatus;
    private ToggleButton GiantsBelt;
    private boolean GiantsBeltStatus;
    private ToggleButton Rod;
    private boolean RodStatus;
    private ToggleButton Vest;
    private boolean VestStatus;
    private ToggleButton Bow;
    private boolean BowStatus;
    private ToggleButton Tear;
    private boolean TearStatus;
    private ToggleButton Cloak;
    private boolean CloakStatus;
    private ToggleButton Spat;
    private boolean SpatStatus;

    private ImageView imageView;
    private TextView tv;
    private TextView tv2;

    int counter = 0;
    int maxClicks = 2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout, container, false);
        BFSword =  view.findViewById(R.id.toggleBF);
        GiantsBelt =  view.findViewById(R.id.toggleGB);
        Rod =  view.findViewById(R.id.toggleRod);
        Vest = view.findViewById(R.id.toggleCV);
        Bow = view.findViewById(R.id.toggleBow);
        Tear = view.findViewById(R.id.toggleTear);
        Cloak = view.findViewById(R.id.toggleCloak);
        Spat = view.findViewById(R.id.toggleSpat);

        BFSword.setOnCheckedChangeListener(this);
        GiantsBelt.setOnCheckedChangeListener(this);
        Rod.setOnCheckedChangeListener(this);
        Vest.setOnCheckedChangeListener(this);
        Bow.setOnCheckedChangeListener(this);
        Tear.setOnCheckedChangeListener(this);
        Cloak.setOnCheckedChangeListener(this);
        Spat.setOnCheckedChangeListener(this);

        imageView =  view.findViewById(R.id.combinedItem);
        tv =  view.findViewById(R.id.textView);
        tv2 = view.findViewById(R.id.textView2);

        return view;
    }
    @SuppressLint("SetTextI18n")
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        if(compoundButton == BFSword){
            if(isChecked){//BFSword is Clicked
                counter++;
                BFSwordStatus = true;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.infinityedge));
                tv.setText("Critical Strikes deal +200% damage");
                tv2.setText("Infinity Edge");
                tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                if(GiantsBeltStatus){//clicked and giants belt
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.zeke));
                    tv.setText("At the start of combat, allies within 2.0 hexes in the same row gain +15.0% Attack Speed" +
                            "for the rest of combat");
                    tv2.setText("Zeke's Herald");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (RodStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.hextech));
                    tv.setText("Heal for 33.0% of all damage dealt");
                    tv2.setText("Hextech Gunblade");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (VestStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.guardiansangel));
                    tv.setText("On taking lethal damage instead enter stasis, cleansing negative effects and recovering up" +
                            " to 500.0 Health.");
                    tv2.setText("Guardian Angel");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(BowStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.sworddivine));
                    tv.setText("Each second, the wearer has a 7.0% chance to gain 100% Critical Strike");
                    tv2.setText("Sword of the Divine");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(TearStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.shojin));
                    tv.setText("After casting, wearer gains 15.0% of its max Mana per attack");
                    tv2.setText("Spear of Shojin");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(CloakStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.bloodthirster));
                    tv.setText("Attacks heal for 50.0% of damage");
                    tv2.setText("The Bloodthirster");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(SpatStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.youmuu));
                    tv.setText("Extra AD +20.0\n" +
                            "Wearer is also an Assassin");
                    tv2.setText("Youmuu's Ghostblade");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
            }
            else{
                BFSwordStatus = false;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.tfticon));
                tv.setText("");
                tv2.setText("");
                counter--;
            }
        }
        else if(compoundButton == GiantsBelt){
            if(isChecked){
                counter++;
                GiantsBeltStatus = true;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.warmogs));
                tv.setText("Wearer regenerates 6.0% missing Health per second");
                tv2.setText("Warmog's Armor");
                tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                if(BFSwordStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.zeke));
                    tv.setText("At the start of combat, allies within 2.0 hexes in the same row gain +15.0% Attack Speed" +
                            "for the rest of combat");
                    tv2.setText("Zeke's Herald");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(RodStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.morello));
                    tv.setText("Spells deal burn damage equal to 20.0% of the enemy's maximum health over 10.0s and prevent " +
                            "healing");
                    tv2.setText("Morellonomicon");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(VestStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.redbuff));
                    tv.setText("Attacks deal 20.0% of the enemy's maximum Health as burn damage over" +
                            " 10.0s and prevent healing");
                    tv2.setText("Red Buff");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(BowStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.titanic));
                    tv.setText("Attacks deal 10.0% of the wearer's max Health as splash damage");
                    tv2.setText("Titanic Hydra");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(TearStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.redemption));
                    tv.setText("On crossing below 25.0% Health, heal all nearby allies for 1500.0 Health");
                    tv2.setText("Redemption");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(CloakStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.zephyr));
                    tv.setText("On start of combat, banish an enemy for 5.0 seconds");
                    tv2.setText("Zephyr");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(SpatStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.forzenmallet));
                    tv.setText("Extra Health +200.0\n" +
                            "Wearer is also a Glacial");
                    tv2.setText("Frozen Mallet");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
            }
            else{
                GiantsBeltStatus = false;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.tfticon));
                tv.setText("");
                tv2.setText("");
                counter--;
            }
        }
        else if(compoundButton == Rod){
            if(isChecked){
                counter++;
                RodStatus = true;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.rabadons));
                tv.setText("Wearer's Spell Power stat is amplified by 50.0%");
                tv2.setText("Rabadon's Deathcap");
                tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                if(BFSwordStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.hextech));
                    tv.setText("Heal for 33.0% of all damage dealt");
                    tv2.setText("Hextech Gunblade");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (GiantsBeltStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.morello));
                    tv.setText("Spells deal burn damage equal to 20.0% of the enemy's maximum health over " +
                            "10.0s and prevent healing");
                    tv2.setText("Morellonomicon");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(VestStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.locket));
                    tv.setText("At the start of combat, allies within 2.0 hexes in the same row gain a shield " +
                            "that blocks 250.0 damage.");
                    tv2.setText("Locket of the Iron Solari");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (BowStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.guinsoo));
                    tv.setText("Attacks grant 5.0% Attack Speed. Stacks infinitely");
                    tv2.setText("Guinsoo's Rageblade");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(TearStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.luden));
                    tv.setText("Spells deal 200.0 splash damage on hit to up to 4.0 other enemies.");
                    tv2.setText("Luden's Echo");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(CloakStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ionic));
                    tv.setText("Whenever an enemy casts a spell, they take 125.0 damage");
                    tv2.setText("Ionic Spark");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(SpatStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.yuumi));
                    tv.setText("Extra AP +20.0\n" +
                            "Wearer is also a Sorcerer");
                    tv2.setText("Yuumi");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
            }
            else{
                counter--;
                RodStatus = false;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.tfticon));
                tv.setText("");
                tv2.setText("");
            }
        }
        else if(compoundButton == Vest){
            if(isChecked){
                counter++;
                VestStatus = true;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.thornmail));
                tv.setText("Reflect 100.0% of damage mitigated from attacks");
                tv2.setText("Thornmail");
                tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                if(BFSwordStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.guardiansangel));
                    tv.setText("On taking lethal damage instead enter stasis, cleansing negative effects " +
                            "and recovering up to 500.0 Health.");
                    tv2.setText("Guardian Angel");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (GiantsBeltStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.redbuff));
                    tv.setText("Attacks deal 20.0% of the enemy's maximum Health as burn damage over 10.0s " +
                            "and prevent healing");
                    tv2.setText("Red Buff");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (RodStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.locket));
                    tv.setText("At the start of combat, allies within 2.0 hexes in the same row gain " +
                            "a shield that blocks 250.0 damage.");
                    tv2.setText("Locket of the Iron Solari");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (BowStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.phantom));
                    tv.setText("Wearer dodges all Critical Strikes");
                    tv2.setText("Phantom Dancer");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(TearStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.frozenh));
                    tv.setText("Adjacent enemies lose 25.0% Attack Speed");
                    tv2.setText("Frozen Heart");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(CloakStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.swordbreaker));
                    tv.setText("Attacks have a chance to disarm for 4.0s");
                    tv2.setText("Sword Breaker");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(SpatStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.knightsvow));
                    tv.setText("Extra Armor +20.0\n" +
                            "Wearer is also a Knight");
                    tv2.setText("Knight's Vow");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
            }
            else{
                counter--;
                VestStatus = false;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.tfticon));
                tv.setText("");
                tv2.setText("");
            }
        }
        else if(compoundButton == Bow){
            if(isChecked){
                counter++;
                BowStatus = true;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.rfc));
                tv.setText("Wearer's attacks cannot be dodged. Attack Range is doubled");
                tv2.setText("Rapid Firecannon");
                tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                if(BFSwordStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.sworddivine));
                    tv.setText("Each second, the wearer has a 7.0% chance to gain 100% Critical Strike");
                    tv2.setText("Sword of the Divine");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (GiantsBeltStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.titanic));
                    tv.setText("Attacks deal 10.0% of the wearer's max Health as splash damage");
                    tv2.setText("Titanic Hydra");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (RodStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.guinsoo));
                    tv.setText("Attacks grant 5.0% Attack Speed. Stacks infinitely");
                    tv2.setText("Guinsoo's Rageblade");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (VestStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.phantom));
                    tv.setText("Wearer dodges all Critical Strikes");
                    tv2.setText("Phantom Dancer");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(TearStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.shiv));
                    tv.setText("Every 3rd attack deals 100.0 magical damage to 3.0 enemies.");
                    tv2.setText("Statikk Shiv");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(CloakStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.cursedblade));
                    tv.setText("Attacks on-hit have a low chance to reduce enemy's star level by 1 for" +
                            " the rest of combat");
                    tv2.setText("Cursed Blade");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(SpatStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.bork));
                    tv.setText("Extra AS +20.0\n" +
                            "Wearer is also a Blademaster");
                    tv2.setText("Blade of the Ruined King");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
            }
            else{
                counter--;
                BowStatus = false;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.tfticon));
                tv.setText("");
                tv2.setText("");
            }
        }
        else if(compoundButton == Tear){
            if(isChecked){
                counter++;
                TearStatus = true;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.seraphs));
                tv.setText("Wearer regains 20.0 mana after spellcast");
                tv2.setText("Seraph's Embrace");
                tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                if(BFSwordStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.shojin));
                    tv.setText("After casting, wearer gains 15.0% of its max Mana per attack");
                    tv2.setText("Spear of Shojin");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (GiantsBeltStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.redemption));
                    tv.setText("On crossing below 25.0% Health, heal all nearby allies for 1500.0 Health");
                    tv2.setText("Redemption");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (RodStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.luden));
                    tv.setText("Spells deal 200.0 splash damage on hit to up to 4.0 other enemies.");
                    tv2.setText("Luden's Echo");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (VestStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.frozenh));
                    tv.setText("Adjacent enemies lose 25.0% Attack Speed");
                    tv2.setText("Frozen Heart");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(BowStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.shiv));
                    tv.setText("Every 3rd attack deals 100.0 magical damage to 3.0 enemies.");
                    tv2.setText("Statikk Shiv");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(CloakStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.hush));
                    tv.setText("Attacks on-hit have a chance to silence, preventing the enemy from " +
                            "gaining mana for 4.0s");
                    tv2.setText("Hush");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(SpatStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.darkin));
                    tv.setText("Extra Mana +20.0\n" +
                            "Wearer is also a Demon");
                    tv2.setText("Darkin");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
            }
            else{
                counter--;
                TearStatus = false;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.tfticon));
                tv.setText("");
                tv2.setText("");
            }
        }
        else if(compoundButton == Cloak){
            if(isChecked){
                counter++;
                CloakStatus = true;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.dragonclaw));
                tv.setText("Gain 83.0% resistance to magic damage");
                tv2.setText("Dragon's Claw");
                tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                if(BFSwordStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.bloodthirster));
                    tv.setText("Attacks heal for 50.0% of damage");
                    tv2.setText("The Bloodthirster");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (GiantsBeltStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.zephyr));
                    tv.setText("On start of combat, banish an enemy for 5.0 seconds");
                    tv2.setText("Zephyr");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (RodStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ionic));
                    tv.setText("Whenever an enemy casts a spell, they take 125.0 damage");
                    tv2.setText("Ionic Spark");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (VestStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.swordbreaker));
                    tv.setText("Attacks have a chance to disarm for 4.0s");
                    tv2.setText("Sword Breaker");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(BowStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.cursedblade));
                    tv.setText("Attacks on-hit have a low chance to reduce enemy's star level by 1 " +
                            "for the rest of combat");
                    tv2.setText("Cursed Blade");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(TearStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.hush));
                    tv.setText("Attacks on-hit have a chance to silence, preventing the enemy " +
                            "from gaining mana for 4.0s");
                    tv2.setText("Hush");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(SpatStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.runann));
                    tv.setText("Extra MR +20.0\n" +
                            "Summon a spirit. When you attack, spirits attack other nearby enemies for" +
                            " 75.0% of your Damage");
                    tv2.setText("Runaan's Hurricane");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
            }
            else{
                counter--;
                CloakStatus = false;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.tfticon));
                tv.setText("");
                tv2.setText("");
            }
        }
        else if(compoundButton == Spat){
            if(isChecked){
                counter++;
                SpatStatus = true;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.forceofnature));
                tv.setText("Gain +1.0 team size");
                tv2.setText("Force of Nature");
                tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                if(BFSwordStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.youmuu));
                    tv.setText("Extra AD +20.0\n" +
                            "Wearer is also an Assassin");
                    tv2.setText("Youmuu's Ghostblade");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (GiantsBeltStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.forzenmallet));
                    tv.setText("Extra Health +200.0\n" +
                            "Wearer is also a Glacial");
                    tv2.setText("Frozen Mallet");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (RodStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.yuumi));
                    tv.setText("Extra AP +20.0\n" +
                            "Wearer is also a Sorcerer");
                    tv2.setText("Yuumi");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (VestStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.knightsvow));
                    tv.setText("Extra Armor +20.0\n" +
                            "Wearer is also a Knight");
                    tv2.setText("Knight's Vow");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(BowStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.bork));
                    tv.setText("Extra AS +20.0\n" +
                            "Wearer is also a Blademaster");
                    tv2.setText("Blade of the Ruined King");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if(TearStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.darkin));
                    tv.setText("Extra Mana +20.0\n" +
                            "Wearer is also a Demon");
                    tv2.setText("Darkin");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                else if (CloakStatus){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.runann));
                    tv.setText("Extra MR +20.0\n" +
                            "Summon a spirit. When you attack, spirits attack other nearby enemies for " +
                            "75.0% of your Damage");
                    tv2.setText("Runaan's Hurricane");
                    tv2.setPaintFlags(tv2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
            }
            else{
                counter--;
                SpatStatus = false;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.tfticon));
                tv.setText("");
                tv2.setText("");
            }
        }
        ToggleButton[] arrayButton = {BFSword, GiantsBelt, Rod, Vest, Bow, Tear, Cloak, Spat};
        boolean[] statBool = {BFSwordStatus, GiantsBeltStatus, RodStatus, VestStatus, BowStatus, TearStatus, CloakStatus, SpatStatus};
        if(counter == 2){
            BFSword.setEnabled(false);
            GiantsBelt.setEnabled(false);
            Rod.setEnabled(false);
            Vest.setEnabled(false);
            Bow.setEnabled(false);
            Tear.setEnabled(false);
            Cloak.setEnabled(false);
            Spat.setEnabled(false);
        }
        else{
            BFSword.setEnabled(true);
            GiantsBelt.setEnabled(true);
            Rod.setEnabled(true);
            Vest.setEnabled(true);
            Bow.setEnabled(true);
            Tear.setEnabled(true);
            Cloak.setEnabled(true);
            Spat.setEnabled(true);
        }
        for(int i = 0; i < arrayButton.length; i++){
            if(statBool[i]){
                arrayButton[i].setEnabled(true);
            }
        }
    }
}