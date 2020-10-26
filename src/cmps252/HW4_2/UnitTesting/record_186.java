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

@Tag("10")
class Record_186 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 186: FirstName is Chuck")
	void FirstNameOfRecord186() {
		assertEquals("Chuck", customers.get(185).getFirstName());
	}

	@Test
	@DisplayName("Record 186: LastName is Bubis")
	void LastNameOfRecord186() {
		assertEquals("Bubis", customers.get(185).getLastName());
	}

	@Test
	@DisplayName("Record 186: Company is Michael J Lunga Pc")
	void CompanyOfRecord186() {
		assertEquals("Michael J Lunga Pc", customers.get(185).getCompany());
	}

	@Test
	@DisplayName("Record 186: Address is 8524 Washington Blvd")
	void AddressOfRecord186() {
		assertEquals("8524 Washington Blvd", customers.get(185).getAddress());
	}

	@Test
	@DisplayName("Record 186: City is Culver City")
	void CityOfRecord186() {
		assertEquals("Culver City", customers.get(185).getCity());
	}

	@Test
	@DisplayName("Record 186: County is Los Angeles")
	void CountyOfRecord186() {
		assertEquals("Los Angeles", customers.get(185).getCounty());
	}

	@Test
	@DisplayName("Record 186: State is CA")
	void StateOfRecord186() {
		assertEquals("CA", customers.get(185).getState());
	}

	@Test
	@DisplayName("Record 186: ZIP is 90232")
	void ZIPOfRecord186() {
		assertEquals("90232", customers.get(185).getZIP());
	}

	@Test
	@DisplayName("Record 186: Phone is 310-837-9075")
	void PhoneOfRecord186() {
		assertEquals("310-837-9075", customers.get(185).getPhone());
	}

	@Test
	@DisplayName("Record 186: Fax is 310-837-5615")
	void FaxOfRecord186() {
		assertEquals("310-837-5615", customers.get(185).getFax());
	}

	@Test
	@DisplayName("Record 186: Email is chuck@bubis.com")
	void EmailOfRecord186() {
		assertEquals("chuck@bubis.com", customers.get(185).getEmail());
	}

	@Test
	@DisplayName("Record 186: Web is http://www.chuckbubis.com")
	void WebOfRecord186() {
		assertEquals("http://www.chuckbubis.com", customers.get(185).getWeb());
	}
}
