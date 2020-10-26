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

@Tag("12")
class Record_4659 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4659: FirstName is Joseph")
	void FirstNameOfRecord4659() {
		assertEquals("Joseph", customers.get(4658).getFirstName());
	}

	@Test
	@DisplayName("Record 4659: LastName is Vanschoor")
	void LastNameOfRecord4659() {
		assertEquals("Vanschoor", customers.get(4658).getLastName());
	}

	@Test
	@DisplayName("Record 4659: Company is Mchugh, Jane C")
	void CompanyOfRecord4659() {
		assertEquals("Mchugh, Jane C", customers.get(4658).getCompany());
	}

	@Test
	@DisplayName("Record 4659: Address is 635 Nw Frontage Rd")
	void AddressOfRecord4659() {
		assertEquals("635 Nw Frontage Rd", customers.get(4658).getAddress());
	}

	@Test
	@DisplayName("Record 4659: City is Augusta")
	void CityOfRecord4659() {
		assertEquals("Augusta", customers.get(4658).getCity());
	}

	@Test
	@DisplayName("Record 4659: County is Columbia")
	void CountyOfRecord4659() {
		assertEquals("Columbia", customers.get(4658).getCounty());
	}

	@Test
	@DisplayName("Record 4659: State is GA")
	void StateOfRecord4659() {
		assertEquals("GA", customers.get(4658).getState());
	}

	@Test
	@DisplayName("Record 4659: ZIP is 30907")
	void ZIPOfRecord4659() {
		assertEquals("30907", customers.get(4658).getZIP());
	}

	@Test
	@DisplayName("Record 4659: Phone is 706-863-1423")
	void PhoneOfRecord4659() {
		assertEquals("706-863-1423", customers.get(4658).getPhone());
	}

	@Test
	@DisplayName("Record 4659: Fax is 706-863-3947")
	void FaxOfRecord4659() {
		assertEquals("706-863-3947", customers.get(4658).getFax());
	}

	@Test
	@DisplayName("Record 4659: Email is joseph@vanschoor.com")
	void EmailOfRecord4659() {
		assertEquals("joseph@vanschoor.com", customers.get(4658).getEmail());
	}

	@Test
	@DisplayName("Record 4659: Web is http://www.josephvanschoor.com")
	void WebOfRecord4659() {
		assertEquals("http://www.josephvanschoor.com", customers.get(4658).getWeb());
	}
}
