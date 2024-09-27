import { useState, useEffect } from "react";
const URL = "http://localhost:8082/images"

function ServerRequest() {

    const [imagesUrls, setImageUrls] = useState([]);

    useEffect(() => {
        const fetchImages = async () => {
            try {
                const response = await fetch(URL);
                const data = await response.json();
                setImageUrls(data)
                console.log(setImageUrls);
            } catch (error) {
                console.error("Error fetching images", error);
            }
        }
        fetchImages();

    })

    return (
        <div>
            {imagesUrls.length > 0 ? (
                imagesUrls.map((url, index) => (
                    <div key={index}>
                        <img src={url} alt={'Image ${index + 1}'} />
                    </div>
                ))
            ) : (<p>loading images...</p>)
            }
        </div>
    );
}

export default ServerRequest