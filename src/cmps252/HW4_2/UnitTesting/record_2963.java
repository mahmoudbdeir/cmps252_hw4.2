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
class Record_2963 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2963: FirstName is Hugh")
	void FirstNameOfRecord2963() {
		assertEquals("Hugh", customers.get(2962).getFirstName());
	}

	@Test
	@DisplayName("Record 2963: LastName is Lupien")
	void LastNameOfRecord2963() {
		assertEquals("Lupien", customers.get(2962).getLastName());
	}

	@Test
	@DisplayName("Record 2963: Company is Dzurilla, William Esq")
	void CompanyOfRecord2963() {
		assertEquals("Dzurilla, William Esq", customers.get(2962).getCompany());
	}

	@Test
	@DisplayName("Record 2963: Address is 1310 Buncombe St")
	void AddressOfRecord2963() {
		assertEquals("1310 Buncombe St", customers.get(2962).getAddress());
	}

	@Test
	@DisplayName("Record 2963: City is Greenville")
	void CityOfRecord2963() {
		assertEquals("Greenville", customers.get(2962).getCity());
	}

	@Test
	@DisplayName("Record 2963: County is Greenville")
	void CountyOfRecord2963() {
		assertEquals("Greenville", customers.get(2962).getCounty());
	}

	@Test
	@DisplayName("Record 2963: State is SC")
	void StateOfRecord2963() {
		assertEquals("SC", customers.get(2962).getState());
	}

	@Test
	@DisplayName("Record 2963: ZIP is 29609")
	void ZIPOfRecord2963() {
		assertEquals("29609", customers.get(2962).getZIP());
	}

	@Test
	@DisplayName("Record 2963: Phone is 864-232-3082")
	void PhoneOfRecord2963() {
		assertEquals("864-232-3082", customers.get(2962).getPhone());
	}

	@Test
	@DisplayName("Record 2963: Fax is 864-232-7579")
	void FaxOfRecord2963() {
		assertEquals("864-232-7579", customers.get(2962).getFax());
	}

	@Test
	@DisplayName("Record 2963: Email is hugh@lupien.com")
	void EmailOfRecord2963() {
		assertEquals("hugh@lupien.com", customers.get(2962).getEmail());
	}

	@Test
	@DisplayName("Record 2963: Web is http://www.hughlupien.com")
	void WebOfRecord2963() {
		assertEquals("http://www.hughlupien.com", customers.get(2962).getWeb());
	}
}
