package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("6")
class Record_890 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 890: FirstName is Jonas")
	void FirstNameOfRecord890() {
		assertEquals("Jonas", customers.get(889).getFirstName());
	}

	@Test
	@DisplayName("Record 890: LastName is Deveaux")
	void LastNameOfRecord890() {
		assertEquals("Deveaux", customers.get(889).getLastName());
	}

	@Test
	@DisplayName("Record 890: Company is Carpenter & Chavez Law Offices")
	void CompanyOfRecord890() {
		assertEquals("Carpenter & Chavez Law Offices", customers.get(889).getCompany());
	}

	@Test
	@DisplayName("Record 890: Address is 10710 S La Cienega Blvd")
	void AddressOfRecord890() {
		assertEquals("10710 S La Cienega Blvd", customers.get(889).getAddress());
	}

	@Test
	@DisplayName("Record 890: City is Inglewood")
	void CityOfRecord890() {
		assertEquals("Inglewood", customers.get(889).getCity());
	}

	@Test
	@DisplayName("Record 890: County is Los Angeles")
	void CountyOfRecord890() {
		assertEquals("Los Angeles", customers.get(889).getCounty());
	}

	@Test
	@DisplayName("Record 890: State is CA")
	void StateOfRecord890() {
		assertEquals("CA", customers.get(889).getState());
	}

	@Test
	@DisplayName("Record 890: ZIP is 90304")
	void ZIPOfRecord890() {
		assertEquals("90304", customers.get(889).getZIP());
	}

	@Test
	@DisplayName("Record 890: Phone is 310-649-3305")
	void PhoneOfRecord890() {
		assertEquals("310-649-3305", customers.get(889).getPhone());
	}

	@Test
	@DisplayName("Record 890: Fax is 310-649-0921")
	void FaxOfRecord890() {
		assertEquals("310-649-0921", customers.get(889).getFax());
	}

	@Test
	@DisplayName("Record 890: Email is jonas@deveaux.com")
	void EmailOfRecord890() {
		assertEquals("jonas@deveaux.com", customers.get(889).getEmail());
	}

	@Test
	@DisplayName("Record 890: Web is http://www.jonasdeveaux.com")
	void WebOfRecord890() {
		assertEquals("http://www.jonasdeveaux.com", customers.get(889).getWeb());
	}
}
