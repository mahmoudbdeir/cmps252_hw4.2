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

@Tag("20")
class Record_4562 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4562: FirstName is Octavio")
	void FirstNameOfRecord4562() {
		assertEquals("Octavio", customers.get(4561).getFirstName());
	}

	@Test
	@DisplayName("Record 4562: LastName is Devin")
	void LastNameOfRecord4562() {
		assertEquals("Devin", customers.get(4561).getLastName());
	}

	@Test
	@DisplayName("Record 4562: Company is Family Care Choice And Svc")
	void CompanyOfRecord4562() {
		assertEquals("Family Care Choice And Svc", customers.get(4561).getCompany());
	}

	@Test
	@DisplayName("Record 4562: Address is 525 B St")
	void AddressOfRecord4562() {
		assertEquals("525 B St", customers.get(4561).getAddress());
	}

	@Test
	@DisplayName("Record 4562: City is San Diego")
	void CityOfRecord4562() {
		assertEquals("San Diego", customers.get(4561).getCity());
	}

	@Test
	@DisplayName("Record 4562: County is San Diego")
	void CountyOfRecord4562() {
		assertEquals("San Diego", customers.get(4561).getCounty());
	}

	@Test
	@DisplayName("Record 4562: State is CA")
	void StateOfRecord4562() {
		assertEquals("CA", customers.get(4561).getState());
	}

	@Test
	@DisplayName("Record 4562: ZIP is 92101")
	void ZIPOfRecord4562() {
		assertEquals("92101", customers.get(4561).getZIP());
	}

	@Test
	@DisplayName("Record 4562: Phone is 619-699-4705")
	void PhoneOfRecord4562() {
		assertEquals("619-699-4705", customers.get(4561).getPhone());
	}

	@Test
	@DisplayName("Record 4562: Fax is 619-699-8907")
	void FaxOfRecord4562() {
		assertEquals("619-699-8907", customers.get(4561).getFax());
	}

	@Test
	@DisplayName("Record 4562: Email is octavio@devin.com")
	void EmailOfRecord4562() {
		assertEquals("octavio@devin.com", customers.get(4561).getEmail());
	}

	@Test
	@DisplayName("Record 4562: Web is http://www.octaviodevin.com")
	void WebOfRecord4562() {
		assertEquals("http://www.octaviodevin.com", customers.get(4561).getWeb());
	}
}
