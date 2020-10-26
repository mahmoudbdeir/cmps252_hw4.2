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

@Tag("14")
class Record_2256 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2256: FirstName is Jae")
	void FirstNameOfRecord2256() {
		assertEquals("Jae", customers.get(2255).getFirstName());
	}

	@Test
	@DisplayName("Record 2256: LastName is Gatchalian")
	void LastNameOfRecord2256() {
		assertEquals("Gatchalian", customers.get(2255).getLastName());
	}

	@Test
	@DisplayName("Record 2256: Company is Innovative Software Inc")
	void CompanyOfRecord2256() {
		assertEquals("Innovative Software Inc", customers.get(2255).getCompany());
	}

	@Test
	@DisplayName("Record 2256: Address is 617 K St Nw")
	void AddressOfRecord2256() {
		assertEquals("617 K St Nw", customers.get(2255).getAddress());
	}

	@Test
	@DisplayName("Record 2256: City is Washington")
	void CityOfRecord2256() {
		assertEquals("Washington", customers.get(2255).getCity());
	}

	@Test
	@DisplayName("Record 2256: County is District of Columbia")
	void CountyOfRecord2256() {
		assertEquals("District of Columbia", customers.get(2255).getCounty());
	}

	@Test
	@DisplayName("Record 2256: State is DC")
	void StateOfRecord2256() {
		assertEquals("DC", customers.get(2255).getState());
	}

	@Test
	@DisplayName("Record 2256: ZIP is 20001")
	void ZIPOfRecord2256() {
		assertEquals("20001", customers.get(2255).getZIP());
	}

	@Test
	@DisplayName("Record 2256: Phone is 202-789-9595")
	void PhoneOfRecord2256() {
		assertEquals("202-789-9595", customers.get(2255).getPhone());
	}

	@Test
	@DisplayName("Record 2256: Fax is 202-789-3503")
	void FaxOfRecord2256() {
		assertEquals("202-789-3503", customers.get(2255).getFax());
	}

	@Test
	@DisplayName("Record 2256: Email is jae@gatchalian.com")
	void EmailOfRecord2256() {
		assertEquals("jae@gatchalian.com", customers.get(2255).getEmail());
	}

	@Test
	@DisplayName("Record 2256: Web is http://www.jaegatchalian.com")
	void WebOfRecord2256() {
		assertEquals("http://www.jaegatchalian.com", customers.get(2255).getWeb());
	}
}
