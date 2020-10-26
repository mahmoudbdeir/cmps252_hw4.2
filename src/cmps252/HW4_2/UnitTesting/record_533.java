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

@Tag("45")
class Record_533 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 533: FirstName is Wendy")
	void FirstNameOfRecord533() {
		assertEquals("Wendy", customers.get(532).getFirstName());
	}

	@Test
	@DisplayName("Record 533: LastName is Asters")
	void LastNameOfRecord533() {
		assertEquals("Asters", customers.get(532).getLastName());
	}

	@Test
	@DisplayName("Record 533: Company is Hill, G Richard Esq")
	void CompanyOfRecord533() {
		assertEquals("Hill, G Richard Esq", customers.get(532).getCompany());
	}

	@Test
	@DisplayName("Record 533: Address is 24000 Crenshaw Blvd")
	void AddressOfRecord533() {
		assertEquals("24000 Crenshaw Blvd", customers.get(532).getAddress());
	}

	@Test
	@DisplayName("Record 533: City is Torrance")
	void CityOfRecord533() {
		assertEquals("Torrance", customers.get(532).getCity());
	}

	@Test
	@DisplayName("Record 533: County is Los Angeles")
	void CountyOfRecord533() {
		assertEquals("Los Angeles", customers.get(532).getCounty());
	}

	@Test
	@DisplayName("Record 533: State is CA")
	void StateOfRecord533() {
		assertEquals("CA", customers.get(532).getState());
	}

	@Test
	@DisplayName("Record 533: ZIP is 90505")
	void ZIPOfRecord533() {
		assertEquals("90505", customers.get(532).getZIP());
	}

	@Test
	@DisplayName("Record 533: Phone is 310-326-0088")
	void PhoneOfRecord533() {
		assertEquals("310-326-0088", customers.get(532).getPhone());
	}

	@Test
	@DisplayName("Record 533: Fax is 310-326-1731")
	void FaxOfRecord533() {
		assertEquals("310-326-1731", customers.get(532).getFax());
	}

	@Test
	@DisplayName("Record 533: Email is wendy@asters.com")
	void EmailOfRecord533() {
		assertEquals("wendy@asters.com", customers.get(532).getEmail());
	}

	@Test
	@DisplayName("Record 533: Web is http://www.wendyasters.com")
	void WebOfRecord533() {
		assertEquals("http://www.wendyasters.com", customers.get(532).getWeb());
	}
}
