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

@Tag("34")
class Record_2873 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2873: FirstName is Cora")
	void FirstNameOfRecord2873() {
		assertEquals("Cora", customers.get(2872).getFirstName());
	}

	@Test
	@DisplayName("Record 2873: LastName is Castonguay")
	void LastNameOfRecord2873() {
		assertEquals("Castonguay", customers.get(2872).getLastName());
	}

	@Test
	@DisplayName("Record 2873: Company is Tremblay Moving & Stge Co Inc")
	void CompanyOfRecord2873() {
		assertEquals("Tremblay Moving & Stge Co Inc", customers.get(2872).getCompany());
	}

	@Test
	@DisplayName("Record 2873: Address is 409 S Main St")
	void AddressOfRecord2873() {
		assertEquals("409 S Main St", customers.get(2872).getAddress());
	}

	@Test
	@DisplayName("Record 2873: City is Monahans")
	void CityOfRecord2873() {
		assertEquals("Monahans", customers.get(2872).getCity());
	}

	@Test
	@DisplayName("Record 2873: County is Ward")
	void CountyOfRecord2873() {
		assertEquals("Ward", customers.get(2872).getCounty());
	}

	@Test
	@DisplayName("Record 2873: State is TX")
	void StateOfRecord2873() {
		assertEquals("TX", customers.get(2872).getState());
	}

	@Test
	@DisplayName("Record 2873: ZIP is 79756")
	void ZIPOfRecord2873() {
		assertEquals("79756", customers.get(2872).getZIP());
	}

	@Test
	@DisplayName("Record 2873: Phone is 432-943-6269")
	void PhoneOfRecord2873() {
		assertEquals("432-943-6269", customers.get(2872).getPhone());
	}

	@Test
	@DisplayName("Record 2873: Fax is 432-943-0001")
	void FaxOfRecord2873() {
		assertEquals("432-943-0001", customers.get(2872).getFax());
	}

	@Test
	@DisplayName("Record 2873: Email is cora@castonguay.com")
	void EmailOfRecord2873() {
		assertEquals("cora@castonguay.com", customers.get(2872).getEmail());
	}

	@Test
	@DisplayName("Record 2873: Web is http://www.coracastonguay.com")
	void WebOfRecord2873() {
		assertEquals("http://www.coracastonguay.com", customers.get(2872).getWeb());
	}
}
