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

@Tag("25")
class Record_2760 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2760: FirstName is Shelby")
	void FirstNameOfRecord2760() {
		assertEquals("Shelby", customers.get(2759).getFirstName());
	}

	@Test
	@DisplayName("Record 2760: LastName is Ack")
	void LastNameOfRecord2760() {
		assertEquals("Ack", customers.get(2759).getLastName());
	}

	@Test
	@DisplayName("Record 2760: Company is Crockett Collection")
	void CompanyOfRecord2760() {
		assertEquals("Crockett Collection", customers.get(2759).getCompany());
	}

	@Test
	@DisplayName("Record 2760: Address is 5900 Greene St")
	void AddressOfRecord2760() {
		assertEquals("5900 Greene St", customers.get(2759).getAddress());
	}

	@Test
	@DisplayName("Record 2760: City is Philadelphia")
	void CityOfRecord2760() {
		assertEquals("Philadelphia", customers.get(2759).getCity());
	}

	@Test
	@DisplayName("Record 2760: County is Philadelphia")
	void CountyOfRecord2760() {
		assertEquals("Philadelphia", customers.get(2759).getCounty());
	}

	@Test
	@DisplayName("Record 2760: State is PA")
	void StateOfRecord2760() {
		assertEquals("PA", customers.get(2759).getState());
	}

	@Test
	@DisplayName("Record 2760: ZIP is 19144")
	void ZIPOfRecord2760() {
		assertEquals("19144", customers.get(2759).getZIP());
	}

	@Test
	@DisplayName("Record 2760: Phone is 215-849-3490")
	void PhoneOfRecord2760() {
		assertEquals("215-849-3490", customers.get(2759).getPhone());
	}

	@Test
	@DisplayName("Record 2760: Fax is 215-849-8263")
	void FaxOfRecord2760() {
		assertEquals("215-849-8263", customers.get(2759).getFax());
	}

	@Test
	@DisplayName("Record 2760: Email is shelby@ack.com")
	void EmailOfRecord2760() {
		assertEquals("shelby@ack.com", customers.get(2759).getEmail());
	}

	@Test
	@DisplayName("Record 2760: Web is http://www.shelbyack.com")
	void WebOfRecord2760() {
		assertEquals("http://www.shelbyack.com", customers.get(2759).getWeb());
	}
}
