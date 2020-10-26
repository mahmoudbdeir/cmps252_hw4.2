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
class Record_2598 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2598: FirstName is Oren")
	void FirstNameOfRecord2598() {
		assertEquals("Oren", customers.get(2597).getFirstName());
	}

	@Test
	@DisplayName("Record 2598: LastName is Abalos")
	void LastNameOfRecord2598() {
		assertEquals("Abalos", customers.get(2597).getLastName());
	}

	@Test
	@DisplayName("Record 2598: Company is Formula One Express")
	void CompanyOfRecord2598() {
		assertEquals("Formula One Express", customers.get(2597).getCompany());
	}

	@Test
	@DisplayName("Record 2598: Address is 3927 S Howell Ave")
	void AddressOfRecord2598() {
		assertEquals("3927 S Howell Ave", customers.get(2597).getAddress());
	}

	@Test
	@DisplayName("Record 2598: City is Milwaukee")
	void CityOfRecord2598() {
		assertEquals("Milwaukee", customers.get(2597).getCity());
	}

	@Test
	@DisplayName("Record 2598: County is Milwaukee")
	void CountyOfRecord2598() {
		assertEquals("Milwaukee", customers.get(2597).getCounty());
	}

	@Test
	@DisplayName("Record 2598: State is WI")
	void StateOfRecord2598() {
		assertEquals("WI", customers.get(2597).getState());
	}

	@Test
	@DisplayName("Record 2598: ZIP is 53207")
	void ZIPOfRecord2598() {
		assertEquals("53207", customers.get(2597).getZIP());
	}

	@Test
	@DisplayName("Record 2598: Phone is 414-769-6083")
	void PhoneOfRecord2598() {
		assertEquals("414-769-6083", customers.get(2597).getPhone());
	}

	@Test
	@DisplayName("Record 2598: Fax is 414-769-9988")
	void FaxOfRecord2598() {
		assertEquals("414-769-9988", customers.get(2597).getFax());
	}

	@Test
	@DisplayName("Record 2598: Email is oren@abalos.com")
	void EmailOfRecord2598() {
		assertEquals("oren@abalos.com", customers.get(2597).getEmail());
	}

	@Test
	@DisplayName("Record 2598: Web is http://www.orenabalos.com")
	void WebOfRecord2598() {
		assertEquals("http://www.orenabalos.com", customers.get(2597).getWeb());
	}
}
