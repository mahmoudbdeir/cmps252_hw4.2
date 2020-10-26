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

@Tag("35")
class Record_909 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 909: FirstName is Sophie")
	void FirstNameOfRecord909() {
		assertEquals("Sophie", customers.get(908).getFirstName());
	}

	@Test
	@DisplayName("Record 909: LastName is Mancha")
	void LastNameOfRecord909() {
		assertEquals("Mancha", customers.get(908).getLastName());
	}

	@Test
	@DisplayName("Record 909: Company is Phillipe, Rodney Esq")
	void CompanyOfRecord909() {
		assertEquals("Phillipe, Rodney Esq", customers.get(908).getCompany());
	}

	@Test
	@DisplayName("Record 909: Address is 2311 Lowell Rd")
	void AddressOfRecord909() {
		assertEquals("2311 Lowell Rd", customers.get(908).getAddress());
	}

	@Test
	@DisplayName("Record 909: City is Gastonia")
	void CityOfRecord909() {
		assertEquals("Gastonia", customers.get(908).getCity());
	}

	@Test
	@DisplayName("Record 909: County is Gaston")
	void CountyOfRecord909() {
		assertEquals("Gaston", customers.get(908).getCounty());
	}

	@Test
	@DisplayName("Record 909: State is NC")
	void StateOfRecord909() {
		assertEquals("NC", customers.get(908).getState());
	}

	@Test
	@DisplayName("Record 909: ZIP is 28054")
	void ZIPOfRecord909() {
		assertEquals("28054", customers.get(908).getZIP());
	}

	@Test
	@DisplayName("Record 909: Phone is 704-824-9797")
	void PhoneOfRecord909() {
		assertEquals("704-824-9797", customers.get(908).getPhone());
	}

	@Test
	@DisplayName("Record 909: Fax is 704-824-8424")
	void FaxOfRecord909() {
		assertEquals("704-824-8424", customers.get(908).getFax());
	}

	@Test
	@DisplayName("Record 909: Email is sophie@mancha.com")
	void EmailOfRecord909() {
		assertEquals("sophie@mancha.com", customers.get(908).getEmail());
	}

	@Test
	@DisplayName("Record 909: Web is http://www.sophiemancha.com")
	void WebOfRecord909() {
		assertEquals("http://www.sophiemancha.com", customers.get(908).getWeb());
	}
}
