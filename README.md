# create-jar-with-maven

### pom.xml

    <build>
        <finalName>ozgurutku</finalName>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <configuration>
                    <archive>
                        <manifest>
                            <mainClass>
                                ozgur.Run
                            </mainClass>
                        </manifest>
                    </archive>
                </configuration>
            </plugin>
        </plugins>
    </build>

### Run 
`mvn package`
and
`java -jar target/ozgurutku.jar`

### Result

- Adana
- Adıyaman
- Afyon
- Ağrı
- Amasya
- Ankara
- Antalya
- Artvin
- Aydın
- Balıkesir
- Bilecik
- Bingöl
- Bitlis
- Bolu
- Burdur
- Bursa
- Çanakkale
- Çankırı
- Çorum
- Denizli
- Diyarbakır
- Edirne
- Elazığ
- Erzincan
- Erzurum
- Eskişehir
- Gaziantep
- Giresun
- Gümüşhane
- Hakkari
- Hatay
- Isparta
- İçel (Mersin)
- İstanbul
- İzmir
- Kars
- Kastamonu
- Kayseri
- Kırklareli
- Kırşehir
- Kocaeli
- Konya
- Kütahya
- Malatya
- Manisa
- Kahramanmaraş
- Mardin
- Muğla
- Muş
- Nevşehir
- Niğde
- Ordu
- Rize
- Sakarya
- Samsun
- Siirt
- Sinop
- Sivas
- Tekirdağ
- Tokat
- Trabzon
- Tunceli
- Şanlıurfa
- Uşak
- Van
- Yozgat
- Zonguldak
- Aksaray
- Bayburt
- Karaman
- Kırıkkale
- Batman
- Şırnak
- Bartın
- Ardahan
- Iğdır
- Yalova
- Karabük
- Kilis
- Osmaniye
- Düzce
