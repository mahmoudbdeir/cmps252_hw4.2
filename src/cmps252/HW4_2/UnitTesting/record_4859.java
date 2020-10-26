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

@Tag("30")
class Record_4859 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4859: FirstName is Kris")
	void FirstNameOfRecord4859() {
		assertEquals("Kris", customers.get(4858).getFirstName());
	}

	@Test
	@DisplayName("Record 4859: LastName is Doxon")
	void LastNameOfRecord4859() {
		assertEquals("Doxon", customers.get(4858).getLastName());
	}

	@Test
	@DisplayName("Record 4859: Company is Graphic Silk")
	void CompanyOfRecord4859() {
		assertEquals("Graphic Silk", customers.get(4858).getCompany());
	}

	@Test
	@DisplayName("Record 4859: Address is 1300 A Pamalee Dr")
	void AddressOfRecord4859() {
		assertEquals("1300 A Pamalee Dr", customers.get(4858).getAddress());
	}

	@Test
	@DisplayName("Record 4859: City is Fayetteville")
	void CityOfRecord4859() {
		assertEquals("Fayetteville", customers.get(4858).getCity());
	}

	@Test
	@DisplayName("Record 4859: County is Cumberland")
	void CountyOfRecord4859() {
		assertEquals("Cumberland", customers.get(4858).getCounty());
	}

	@Test
	@DisplayName("Record 4859: State is NC")
	void StateOfRecord4859() {
		assertEquals("NC", customers.get(4858).getState());
	}

	@Test
	@DisplayName("Record 4859: ZIP is 28303")
	void ZIPOfRecord4859() {
		assertEquals("28303", customers.get(4858).getZIP());
	}

	@Test
	@DisplayName("Record 4859: Phone is 910-488-8812")
	void PhoneOfRecord4859() {
		assertEquals("910-488-8812", customers.get(4858).getPhone());
	}

	@Test
	@DisplayName("Record 4859: Fax is 910-488-1594")
	void FaxOfRecord4859() {
		assertEquals("910-488-1594", customers.get(4858).getFax());
	}

	@Test
	@DisplayName("Record 4859: Email is kris@doxon.com")
	void EmailOfRecord4859() {
		assertEquals("kris@doxon.com", customers.get(4858).getEmail());
	}

	@Test
	@DisplayName("Record 4859: Web is http://www.krisdoxon.com")
	void WebOfRecord4859() {
		assertEquals("http://www.krisdoxon.com", customers.get(4858).getWeb());
	}
}
