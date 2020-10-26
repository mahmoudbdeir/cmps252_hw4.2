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

@Tag("27")
class Record_3714 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3714: FirstName is Earline")
	void FirstNameOfRecord3714() {
		assertEquals("Earline", customers.get(3713).getFirstName());
	}

	@Test
	@DisplayName("Record 3714: LastName is Reckley")
	void LastNameOfRecord3714() {
		assertEquals("Reckley", customers.get(3713).getLastName());
	}

	@Test
	@DisplayName("Record 3714: Company is Karen, Kyth Esq")
	void CompanyOfRecord3714() {
		assertEquals("Karen, Kyth Esq", customers.get(3713).getCompany());
	}

	@Test
	@DisplayName("Record 3714: Address is 820 S Mcmullen Dr")
	void AddressOfRecord3714() {
		assertEquals("820 S Mcmullen Dr", customers.get(3713).getAddress());
	}

	@Test
	@DisplayName("Record 3714: City is Kankakee")
	void CityOfRecord3714() {
		assertEquals("Kankakee", customers.get(3713).getCity());
	}

	@Test
	@DisplayName("Record 3714: County is Kankakee")
	void CountyOfRecord3714() {
		assertEquals("Kankakee", customers.get(3713).getCounty());
	}

	@Test
	@DisplayName("Record 3714: State is IL")
	void StateOfRecord3714() {
		assertEquals("IL", customers.get(3713).getState());
	}

	@Test
	@DisplayName("Record 3714: ZIP is 60901")
	void ZIPOfRecord3714() {
		assertEquals("60901", customers.get(3713).getZIP());
	}

	@Test
	@DisplayName("Record 3714: Phone is 815-935-8459")
	void PhoneOfRecord3714() {
		assertEquals("815-935-8459", customers.get(3713).getPhone());
	}

	@Test
	@DisplayName("Record 3714: Fax is 815-935-8037")
	void FaxOfRecord3714() {
		assertEquals("815-935-8037", customers.get(3713).getFax());
	}

	@Test
	@DisplayName("Record 3714: Email is earline@reckley.com")
	void EmailOfRecord3714() {
		assertEquals("earline@reckley.com", customers.get(3713).getEmail());
	}

	@Test
	@DisplayName("Record 3714: Web is http://www.earlinereckley.com")
	void WebOfRecord3714() {
		assertEquals("http://www.earlinereckley.com", customers.get(3713).getWeb());
	}
}
