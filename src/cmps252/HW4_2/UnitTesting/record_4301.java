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

@Tag("40")
class Record_4301 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4301: FirstName is Demetrius")
	void FirstNameOfRecord4301() {
		assertEquals("Demetrius", customers.get(4300).getFirstName());
	}

	@Test
	@DisplayName("Record 4301: LastName is Neris")
	void LastNameOfRecord4301() {
		assertEquals("Neris", customers.get(4300).getLastName());
	}

	@Test
	@DisplayName("Record 4301: Company is Michael, Phillip L")
	void CompanyOfRecord4301() {
		assertEquals("Michael, Phillip L", customers.get(4300).getCompany());
	}

	@Test
	@DisplayName("Record 4301: Address is 220090 S 7th St")
	void AddressOfRecord4301() {
		assertEquals("220090 S 7th St", customers.get(4300).getAddress());
	}

	@Test
	@DisplayName("Record 4301: City is Minneapolis")
	void CityOfRecord4301() {
		assertEquals("Minneapolis", customers.get(4300).getCity());
	}

	@Test
	@DisplayName("Record 4301: County is Hennepin")
	void CountyOfRecord4301() {
		assertEquals("Hennepin", customers.get(4300).getCounty());
	}

	@Test
	@DisplayName("Record 4301: State is MN")
	void StateOfRecord4301() {
		assertEquals("MN", customers.get(4300).getState());
	}

	@Test
	@DisplayName("Record 4301: ZIP is 55402")
	void ZIPOfRecord4301() {
		assertEquals("55402", customers.get(4300).getZIP());
	}

	@Test
	@DisplayName("Record 4301: Phone is 612-336-7352")
	void PhoneOfRecord4301() {
		assertEquals("612-336-7352", customers.get(4300).getPhone());
	}

	@Test
	@DisplayName("Record 4301: Fax is 612-336-8456")
	void FaxOfRecord4301() {
		assertEquals("612-336-8456", customers.get(4300).getFax());
	}

	@Test
	@DisplayName("Record 4301: Email is demetrius@neris.com")
	void EmailOfRecord4301() {
		assertEquals("demetrius@neris.com", customers.get(4300).getEmail());
	}

	@Test
	@DisplayName("Record 4301: Web is http://www.demetriusneris.com")
	void WebOfRecord4301() {
		assertEquals("http://www.demetriusneris.com", customers.get(4300).getWeb());
	}
}
