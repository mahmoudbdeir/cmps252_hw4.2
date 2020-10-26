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

@Tag("31")
class Record_1148 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1148: FirstName is Jayme")
	void FirstNameOfRecord1148() {
		assertEquals("Jayme", customers.get(1147).getFirstName());
	}

	@Test
	@DisplayName("Record 1148: LastName is Morel")
	void LastNameOfRecord1148() {
		assertEquals("Morel", customers.get(1147).getLastName());
	}

	@Test
	@DisplayName("Record 1148: Company is Jeffrey M Glasser Inc")
	void CompanyOfRecord1148() {
		assertEquals("Jeffrey M Glasser Inc", customers.get(1147).getCompany());
	}

	@Test
	@DisplayName("Record 1148: Address is 225 W Greenfield Ave")
	void AddressOfRecord1148() {
		assertEquals("225 W Greenfield Ave", customers.get(1147).getAddress());
	}

	@Test
	@DisplayName("Record 1148: City is Milwaukee")
	void CityOfRecord1148() {
		assertEquals("Milwaukee", customers.get(1147).getCity());
	}

	@Test
	@DisplayName("Record 1148: County is Milwaukee")
	void CountyOfRecord1148() {
		assertEquals("Milwaukee", customers.get(1147).getCounty());
	}

	@Test
	@DisplayName("Record 1148: State is WI")
	void StateOfRecord1148() {
		assertEquals("WI", customers.get(1147).getState());
	}

	@Test
	@DisplayName("Record 1148: ZIP is 53204")
	void ZIPOfRecord1148() {
		assertEquals("53204", customers.get(1147).getZIP());
	}

	@Test
	@DisplayName("Record 1148: Phone is 414-645-5357")
	void PhoneOfRecord1148() {
		assertEquals("414-645-5357", customers.get(1147).getPhone());
	}

	@Test
	@DisplayName("Record 1148: Fax is 414-645-0988")
	void FaxOfRecord1148() {
		assertEquals("414-645-0988", customers.get(1147).getFax());
	}

	@Test
	@DisplayName("Record 1148: Email is jayme@morel.com")
	void EmailOfRecord1148() {
		assertEquals("jayme@morel.com", customers.get(1147).getEmail());
	}

	@Test
	@DisplayName("Record 1148: Web is http://www.jaymemorel.com")
	void WebOfRecord1148() {
		assertEquals("http://www.jaymemorel.com", customers.get(1147).getWeb());
	}
}
