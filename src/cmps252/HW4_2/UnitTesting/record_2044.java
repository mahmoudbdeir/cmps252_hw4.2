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

@Tag("18")
class Record_2044 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2044: FirstName is Wes")
	void FirstNameOfRecord2044() {
		assertEquals("Wes", customers.get(2043).getFirstName());
	}

	@Test
	@DisplayName("Record 2044: LastName is Sigafus")
	void LastNameOfRecord2044() {
		assertEquals("Sigafus", customers.get(2043).getLastName());
	}

	@Test
	@DisplayName("Record 2044: Company is Answer Products Inc")
	void CompanyOfRecord2044() {
		assertEquals("Answer Products Inc", customers.get(2043).getCompany());
	}

	@Test
	@DisplayName("Record 2044: Address is 244 Mercury Cir")
	void AddressOfRecord2044() {
		assertEquals("244 Mercury Cir", customers.get(2043).getAddress());
	}

	@Test
	@DisplayName("Record 2044: City is Pomona")
	void CityOfRecord2044() {
		assertEquals("Pomona", customers.get(2043).getCity());
	}

	@Test
	@DisplayName("Record 2044: County is Los Angeles")
	void CountyOfRecord2044() {
		assertEquals("Los Angeles", customers.get(2043).getCounty());
	}

	@Test
	@DisplayName("Record 2044: State is CA")
	void StateOfRecord2044() {
		assertEquals("CA", customers.get(2043).getState());
	}

	@Test
	@DisplayName("Record 2044: ZIP is 91768")
	void ZIPOfRecord2044() {
		assertEquals("91768", customers.get(2043).getZIP());
	}

	@Test
	@DisplayName("Record 2044: Phone is 909-594-8679")
	void PhoneOfRecord2044() {
		assertEquals("909-594-8679", customers.get(2043).getPhone());
	}

	@Test
	@DisplayName("Record 2044: Fax is 909-594-7791")
	void FaxOfRecord2044() {
		assertEquals("909-594-7791", customers.get(2043).getFax());
	}

	@Test
	@DisplayName("Record 2044: Email is wes@sigafus.com")
	void EmailOfRecord2044() {
		assertEquals("wes@sigafus.com", customers.get(2043).getEmail());
	}

	@Test
	@DisplayName("Record 2044: Web is http://www.wessigafus.com")
	void WebOfRecord2044() {
		assertEquals("http://www.wessigafus.com", customers.get(2043).getWeb());
	}
}
