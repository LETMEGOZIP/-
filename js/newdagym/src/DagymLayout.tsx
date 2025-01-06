import Card from "./Card";
import  {centerList}  from "./data";

const DagymLayout = () => {
    return (
        <main style={{ width: "100vw" }}>
            <section style={{ width: "100%", maxWidth: "1000px", margin: "0 auto" }}>
                {centerList.map((v) => (
                    <Card
                        key={v.gymName} // Adding a key for each card
                        image={v.gymPhotoSmall}
                        gymName={v.gymName}
                        address={v.address}
                        price={v.price.lowestPrice / (v.price.period || 12)}
                        starRate={v.review.count}
                        reviews={v.review.rate}
                        text={"일일권"}
                        categories={v.tags.join(", ")} // Adding a comma for better readability
                    />
                ))}
            </section>
        </main>
    );
};

export default DagymLayout