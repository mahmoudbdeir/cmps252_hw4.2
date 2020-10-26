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

@Tag("12")
class Record_3031 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3031: FirstName is Giovanni")
	void FirstNameOfRecord3031() {
		assertEquals("Giovanni", customers.get(3030).getFirstName());
	}

	@Test
	@DisplayName("Record 3031: LastName is Tongren")
	void LastNameOfRecord3031() {
		assertEquals("Tongren", customers.get(3030).getLastName());
	}

	@Test
	@DisplayName("Record 3031: Company is Mayer, Renee G Esq")
	void CompanyOfRecord3031() {
		assertEquals("Mayer, Renee G Esq", customers.get(3030).getCompany());
	}

	@Test
	@DisplayName("Record 3031: Address is 99 Chandler Ave")
	void AddressOfRecord3031() {
		assertEquals("99 Chandler Ave", customers.get(3030).getAddress());
	}

	@Test
	@DisplayName("Record 3031: City is Staten Island")
	void CityOfRecord3031() {
		assertEquals("Staten Island", customers.get(3030).getCity());
	}

	@Test
	@DisplayName("Record 3031: County is Richmond")
	void CountyOfRecord3031() {
		assertEquals("Richmond", customers.get(3030).getCounty());
	}

	@Test
	@DisplayName("Record 3031: State is NY")
	void StateOfRecord3031() {
		assertEquals("NY", customers.get(3030).getState());
	}

	@Test
	@DisplayName("Record 3031: ZIP is 10314")
	void ZIPOfRecord3031() {
		assertEquals("10314", customers.get(3030).getZIP());
	}

	@Test
	@DisplayName("Record 3031: Phone is 718-442-1046")
	void PhoneOfRecord3031() {
		assertEquals("718-442-1046", customers.get(3030).getPhone());
	}

	@Test
	@DisplayName("Record 3031: Fax is 718-442-7176")
	void FaxOfRecord3031() {
		assertEquals("718-442-7176", customers.get(3030).getFax());
	}

	@Test
	@DisplayName("Record 3031: Email is giovanni@tongren.com")
	void EmailOfRecord3031() {
		assertEquals("giovanni@tongren.com", customers.get(3030).getEmail());
	}

	@Test
	@DisplayName("Record 3031: Web is http://www.giovannitongren.com")
	void WebOfRecord3031() {
		assertEquals("http://www.giovannitongren.com", customers.get(3030).getWeb());
	}
}
