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

@Tag("11")
class Record_2247 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2247: FirstName is Kerry")
	void FirstNameOfRecord2247() {
		assertEquals("Kerry", customers.get(2246).getFirstName());
	}

	@Test
	@DisplayName("Record 2247: LastName is Selzler")
	void LastNameOfRecord2247() {
		assertEquals("Selzler", customers.get(2246).getLastName());
	}

	@Test
	@DisplayName("Record 2247: Company is Kings Super Markets")
	void CompanyOfRecord2247() {
		assertEquals("Kings Super Markets", customers.get(2246).getCompany());
	}

	@Test
	@DisplayName("Record 2247: Address is 1510 4th St")
	void AddressOfRecord2247() {
		assertEquals("1510 4th St", customers.get(2246).getAddress());
	}

	@Test
	@DisplayName("Record 2247: City is Santa Rosa")
	void CityOfRecord2247() {
		assertEquals("Santa Rosa", customers.get(2246).getCity());
	}

	@Test
	@DisplayName("Record 2247: County is Sonoma")
	void CountyOfRecord2247() {
		assertEquals("Sonoma", customers.get(2246).getCounty());
	}

	@Test
	@DisplayName("Record 2247: State is CA")
	void StateOfRecord2247() {
		assertEquals("CA", customers.get(2246).getState());
	}

	@Test
	@DisplayName("Record 2247: ZIP is 95404")
	void ZIPOfRecord2247() {
		assertEquals("95404", customers.get(2246).getZIP());
	}

	@Test
	@DisplayName("Record 2247: Phone is 707-545-0587")
	void PhoneOfRecord2247() {
		assertEquals("707-545-0587", customers.get(2246).getPhone());
	}

	@Test
	@DisplayName("Record 2247: Fax is 707-545-7312")
	void FaxOfRecord2247() {
		assertEquals("707-545-7312", customers.get(2246).getFax());
	}

	@Test
	@DisplayName("Record 2247: Email is kerry@selzler.com")
	void EmailOfRecord2247() {
		assertEquals("kerry@selzler.com", customers.get(2246).getEmail());
	}

	@Test
	@DisplayName("Record 2247: Web is http://www.kerryselzler.com")
	void WebOfRecord2247() {
		assertEquals("http://www.kerryselzler.com", customers.get(2246).getWeb());
	}
}
