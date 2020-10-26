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
class Record_2446 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2446: FirstName is Jason")
	void FirstNameOfRecord2446() {
		assertEquals("Jason", customers.get(2445).getFirstName());
	}

	@Test
	@DisplayName("Record 2446: LastName is Grell")
	void LastNameOfRecord2446() {
		assertEquals("Grell", customers.get(2445).getLastName());
	}

	@Test
	@DisplayName("Record 2446: Company is Diehl & Clayton")
	void CompanyOfRecord2446() {
		assertEquals("Diehl & Clayton", customers.get(2445).getCompany());
	}

	@Test
	@DisplayName("Record 2446: Address is 1957 Pioneer Rd  #-c")
	void AddressOfRecord2446() {
		assertEquals("1957 Pioneer Rd  #-c", customers.get(2445).getAddress());
	}

	@Test
	@DisplayName("Record 2446: City is Huntingdon Valley")
	void CityOfRecord2446() {
		assertEquals("Huntingdon Valley", customers.get(2445).getCity());
	}

	@Test
	@DisplayName("Record 2446: County is Montgomery")
	void CountyOfRecord2446() {
		assertEquals("Montgomery", customers.get(2445).getCounty());
	}

	@Test
	@DisplayName("Record 2446: State is PA")
	void StateOfRecord2446() {
		assertEquals("PA", customers.get(2445).getState());
	}

	@Test
	@DisplayName("Record 2446: ZIP is 19006")
	void ZIPOfRecord2446() {
		assertEquals("19006", customers.get(2445).getZIP());
	}

	@Test
	@DisplayName("Record 2446: Phone is 215-957-0215")
	void PhoneOfRecord2446() {
		assertEquals("215-957-0215", customers.get(2445).getPhone());
	}

	@Test
	@DisplayName("Record 2446: Fax is 215-957-9132")
	void FaxOfRecord2446() {
		assertEquals("215-957-9132", customers.get(2445).getFax());
	}

	@Test
	@DisplayName("Record 2446: Email is jason@grell.com")
	void EmailOfRecord2446() {
		assertEquals("jason@grell.com", customers.get(2445).getEmail());
	}

	@Test
	@DisplayName("Record 2446: Web is http://www.jasongrell.com")
	void WebOfRecord2446() {
		assertEquals("http://www.jasongrell.com", customers.get(2445).getWeb());
	}
}
