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

@Tag("11")
class Record_1019 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1019: FirstName is Wilbur")
	void FirstNameOfRecord1019() {
		assertEquals("Wilbur", customers.get(1018).getFirstName());
	}

	@Test
	@DisplayName("Record 1019: LastName is Steenburg")
	void LastNameOfRecord1019() {
		assertEquals("Steenburg", customers.get(1018).getLastName());
	}

	@Test
	@DisplayName("Record 1019: Company is Trachtman, Daniel D Esq")
	void CompanyOfRecord1019() {
		assertEquals("Trachtman, Daniel D Esq", customers.get(1018).getCompany());
	}

	@Test
	@DisplayName("Record 1019: Address is 177 University Ave")
	void AddressOfRecord1019() {
		assertEquals("177 University Ave", customers.get(1018).getAddress());
	}

	@Test
	@DisplayName("Record 1019: City is Rochester")
	void CityOfRecord1019() {
		assertEquals("Rochester", customers.get(1018).getCity());
	}

	@Test
	@DisplayName("Record 1019: County is Monroe")
	void CountyOfRecord1019() {
		assertEquals("Monroe", customers.get(1018).getCounty());
	}

	@Test
	@DisplayName("Record 1019: State is NY")
	void StateOfRecord1019() {
		assertEquals("NY", customers.get(1018).getState());
	}

	@Test
	@DisplayName("Record 1019: ZIP is 14605")
	void ZIPOfRecord1019() {
		assertEquals("14605", customers.get(1018).getZIP());
	}

	@Test
	@DisplayName("Record 1019: Phone is 585-262-0322")
	void PhoneOfRecord1019() {
		assertEquals("585-262-0322", customers.get(1018).getPhone());
	}

	@Test
	@DisplayName("Record 1019: Fax is 585-262-1379")
	void FaxOfRecord1019() {
		assertEquals("585-262-1379", customers.get(1018).getFax());
	}

	@Test
	@DisplayName("Record 1019: Email is wilbur@steenburg.com")
	void EmailOfRecord1019() {
		assertEquals("wilbur@steenburg.com", customers.get(1018).getEmail());
	}

	@Test
	@DisplayName("Record 1019: Web is http://www.wilbursteenburg.com")
	void WebOfRecord1019() {
		assertEquals("http://www.wilbursteenburg.com", customers.get(1018).getWeb());
	}
}
