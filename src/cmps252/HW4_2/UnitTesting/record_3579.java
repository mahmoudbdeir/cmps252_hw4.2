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
class Record_3579 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3579: FirstName is Ernest")
	void FirstNameOfRecord3579() {
		assertEquals("Ernest", customers.get(3578).getFirstName());
	}

	@Test
	@DisplayName("Record 3579: LastName is Coplan")
	void LastNameOfRecord3579() {
		assertEquals("Coplan", customers.get(3578).getLastName());
	}

	@Test
	@DisplayName("Record 3579: Company is Today")
	void CompanyOfRecord3579() {
		assertEquals("Today", customers.get(3578).getCompany());
	}

	@Test
	@DisplayName("Record 3579: Address is 10221 Corkwood Rd")
	void AddressOfRecord3579() {
		assertEquals("10221 Corkwood Rd", customers.get(3578).getAddress());
	}

	@Test
	@DisplayName("Record 3579: City is Dallas")
	void CityOfRecord3579() {
		assertEquals("Dallas", customers.get(3578).getCity());
	}

	@Test
	@DisplayName("Record 3579: County is Dallas")
	void CountyOfRecord3579() {
		assertEquals("Dallas", customers.get(3578).getCounty());
	}

	@Test
	@DisplayName("Record 3579: State is TX")
	void StateOfRecord3579() {
		assertEquals("TX", customers.get(3578).getState());
	}

	@Test
	@DisplayName("Record 3579: ZIP is 75238")
	void ZIPOfRecord3579() {
		assertEquals("75238", customers.get(3578).getZIP());
	}

	@Test
	@DisplayName("Record 3579: Phone is 214-341-7724")
	void PhoneOfRecord3579() {
		assertEquals("214-341-7724", customers.get(3578).getPhone());
	}

	@Test
	@DisplayName("Record 3579: Fax is 214-341-1531")
	void FaxOfRecord3579() {
		assertEquals("214-341-1531", customers.get(3578).getFax());
	}

	@Test
	@DisplayName("Record 3579: Email is ernest@coplan.com")
	void EmailOfRecord3579() {
		assertEquals("ernest@coplan.com", customers.get(3578).getEmail());
	}

	@Test
	@DisplayName("Record 3579: Web is http://www.ernestcoplan.com")
	void WebOfRecord3579() {
		assertEquals("http://www.ernestcoplan.com", customers.get(3578).getWeb());
	}
}
