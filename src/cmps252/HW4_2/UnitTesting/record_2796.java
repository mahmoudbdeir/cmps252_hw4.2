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

@Tag("44")
class Record_2796 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2796: FirstName is Marion")
	void FirstNameOfRecord2796() {
		assertEquals("Marion", customers.get(2795).getFirstName());
	}

	@Test
	@DisplayName("Record 2796: LastName is Crossland")
	void LastNameOfRecord2796() {
		assertEquals("Crossland", customers.get(2795).getLastName());
	}

	@Test
	@DisplayName("Record 2796: Company is Lockwood Litho")
	void CompanyOfRecord2796() {
		assertEquals("Lockwood Litho", customers.get(2795).getCompany());
	}

	@Test
	@DisplayName("Record 2796: Address is 116 County Courthouse Rd")
	void AddressOfRecord2796() {
		assertEquals("116 County Courthouse Rd", customers.get(2795).getAddress());
	}

	@Test
	@DisplayName("Record 2796: City is New Hyde Park")
	void CityOfRecord2796() {
		assertEquals("New Hyde Park", customers.get(2795).getCity());
	}

	@Test
	@DisplayName("Record 2796: County is Nassau")
	void CountyOfRecord2796() {
		assertEquals("Nassau", customers.get(2795).getCounty());
	}

	@Test
	@DisplayName("Record 2796: State is NY")
	void StateOfRecord2796() {
		assertEquals("NY", customers.get(2795).getState());
	}

	@Test
	@DisplayName("Record 2796: ZIP is 11040")
	void ZIPOfRecord2796() {
		assertEquals("11040", customers.get(2795).getZIP());
	}

	@Test
	@DisplayName("Record 2796: Phone is 516-248-2401")
	void PhoneOfRecord2796() {
		assertEquals("516-248-2401", customers.get(2795).getPhone());
	}

	@Test
	@DisplayName("Record 2796: Fax is 516-248-7727")
	void FaxOfRecord2796() {
		assertEquals("516-248-7727", customers.get(2795).getFax());
	}

	@Test
	@DisplayName("Record 2796: Email is marion@crossland.com")
	void EmailOfRecord2796() {
		assertEquals("marion@crossland.com", customers.get(2795).getEmail());
	}

	@Test
	@DisplayName("Record 2796: Web is http://www.marioncrossland.com")
	void WebOfRecord2796() {
		assertEquals("http://www.marioncrossland.com", customers.get(2795).getWeb());
	}
}
